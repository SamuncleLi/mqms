package com.gamc.efactory.service.serviceImpl;

import ch.qos.logback.core.joran.spi.ElementSelector;
import com.gamc.efactory.model.dataObject.*;
import com.gamc.efactory.util.*;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.gamc.efactory.dao.*;
import com.gamc.efactory.service.VeiDataService;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;

/**
 * VEI数据导入实现类
 * 时间：2020/04/08
 * 更新：王健
 */
@Service
public class VeiDataServiceImpl implements VeiDataService {

    private ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("sendEmailImmediately-pool-%d").build();
    private ExecutorService executorService = new ThreadPoolExecutor(8, 16, 100, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(40), threadFactory, new ThreadPoolExecutor.AbortPolicy());
    @Autowired
    private MqmsVoucherRawMapper mqmsVoucherRawMapper;
    @Autowired
    private MqmsVoucherMapper mqmsVoucherMapper;
    @Autowired
    private MqmsTranProductionDecodeMapper mqmsTranProductionDecodeMapper;
    @Autowired
    private MqmsTranManufacturesDecodeMapper mqmsTranManufacturesDecodeMapper;
    @Autowired
    private MqmsTranYearDecodeMapper mqmsTranYearDecodeMapper;
    @Autowired
    private MqmsVinDecodeMapper mqmsVinDecodeMapper;
    @Autowired
    private MqmsFaultDecodeMapper mqmsFaultDecodeMapper;
    @Autowired
    private MqmsSalesPointMapper mqmsSalesPointMapper;

    //    Logger logger = LoggerFactory.getLogger(VeiDataServiceImpl.class);
    private class ImportCall implements Runnable {
        //构造函数传递参数
        private List<MqmsVoucher> mqmsVoucherList;

        void setMqmsVoucherList(List<MqmsVoucher> mqmsVoucherList) {
            this.mqmsVoucherList = mqmsVoucherList;
        }
        @Override
        public void run() {
            for (MqmsVoucher mqmsVoucherRecord : mqmsVoucherList) {
                //接收区间
                if (!Objects.equals(mqmsVoucherRecord.getSubmitDate(), "")) {
                    Map map = new HashMap<String, Object>();
                    try {
                        map = MqmsUtil.getWeekDate(mqmsVoucherRecord.getSubmitDate());
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    mqmsVoucherRecord.setReceiveTime(map.get("wednesdayDate") + "~" + map.get("ThursdayDate"));
                } else {
                    mqmsVoucherRecord.setReceiveTime("");
                }
                //车型简码
                if (StringUtil.isNotEmpty(mqmsVoucherRecord.getVehicleType())&&mqmsVoucherRecord.getVehicleType().length()>2){
                    mqmsVoucherRecord.setShortCode(mqmsVoucherRecord.getVehicleType().substring(0, 2));
                }
                else
                {
                    mqmsVoucherRecord.setShortCode("");
                }
                //暂时通过VIN码获取机型、车型及变速箱类型
                if(mqmsVoucherRecord.getVinCode()!=null&&mqmsVoucherRecord.getVinCode().length()>5) {
                    String vinShortCode = mqmsVoucherRecord.getVinCode().substring(0, 5);
                    if (mqmsVinDecodeMapper.vinDecode(vinShortCode) != null) {
                        String engtype = mqmsVinDecodeMapper.vinDecode(vinShortCode).getVinEngType();
                        mqmsVoucherRecord.setEngType(engtype);
                        String carModel = mqmsVinDecodeMapper.vinDecode(vinShortCode).getVinCarType();
                        mqmsVoucherRecord.setCarModel(carModel);
                        String engSeries = mqmsVinDecodeMapper.vinDecode(vinShortCode).getVinSeries();
                        mqmsVoucherRecord.setEndSeries(engSeries);
                    }
                    else{
                        mqmsVoucherRecord.setEngType("");
                        mqmsVoucherRecord.setCarModel("");
                        mqmsVoucherRecord.setEndSeries("");
                    }
                    String transShortCode = mqmsVoucherRecord.getVinCode().substring(6,7);
                    mqmsVoucherRecord.setTransmissionShortCode(transShortCode);

                }
                else{
                    mqmsVoucherRecord.setEngType("");
                    mqmsVoucherRecord.setCarModel("");
                }

                String trsmCode="";
                //变速箱机型
                if (StringUtil.isNotEmpty(mqmsVoucherRecord.getTransmissionCode())&&mqmsVoucherRecord.getTransmissionCode().length()>15) {
                    trsmCode = mqmsVoucherRecord.getTransmissionCode().replace("+", "");
                    String trsmType = trsmCode.substring(0, 5);
                    String trsmManufacture = trsmCode.substring(5, 10);
                    String trsmProYearCode = trsmCode.substring(11, 12);
                    String trsmProMonthHex = trsmCode.substring(12, 13);
                    String trsmProDay = trsmCode.substring(13, 15);
                    String trsmProMonth="";
                    //暂定不通过vin码查询变速箱类型
//                    mqmsVoucherRecord.setTranTypeDetail(mqmsVinDecodeMapper.vinDecode(vinShortCOde).getVinTransmType());
                    //通过变速箱号查询变速箱类型
//                    System.out.println(trsmType);
                    mqmsVoucherRecord.setTransmissionTypeRe(mqmsTranProductionDecodeMapper.selectTranProductionCode(trsmType));
                    //变速箱类型
                    mqmsVoucherRecord.setTranTypeDetail(mqmsTranProductionDecodeMapper.selectTranType(trsmType));
                    //变速箱生产厂家
                    mqmsVoucherRecord.setTransmissionManufacturer(mqmsTranManufacturesDecodeMapper.selectTranManufacture(trsmManufacture));
                    //变速箱生产日期
                    if (trsmProMonthHex.matches("^[1-9A-C]")) {
                        trsmProMonth = Integer.toString(Integer.parseInt(trsmProMonthHex, 16), 10);

                        if (trsmProMonth.length() < 2) {
                            trsmProMonth = "0" + trsmProMonth;
                        }
                        if (StringUtil.isNotEmpty(trsmProYearCode)&& trsmProYearCode.matches("^[A-Z]+$")) {
                            String trsmProYear = mqmsTranYearDecodeMapper.selectTranProYear(trsmProYearCode);
                            mqmsVoucherRecord.setTransmissionProductionData(trsmProYear + "-" + trsmProMonth + "-" + trsmProDay);
                            //变速箱生产至确认经过月
                            int proFailureMonths = 0;
                            if (mqmsVoucherRecord.getFailureDate() != null) {
                                try {

                                    proFailureMonths = MqmsUtil.getMonth(mqmsVoucherRecord.getTransmissionProductionData(), mqmsVoucherRecord.getFailureDate());
                                } catch (Exception e) {
                                    System.out.println(trsmCode);
                                    e.printStackTrace();
                                }
                                mqmsVoucherRecord.setTransmissionComfirmTime(Integer.toString(proFailureMonths));
                            }
                            else {
                                mqmsVoucherRecord.setTransmissionComfirmTime("");
                            }
                        }
                        else{
                            System.out.println(trsmCode);
                            mqmsVoucherRecord.setTransmissionComfirmTime("");

                        }

                    }
                    else{
                        System.out.println(trsmCode);
                    }
                }
                else{
                    System.out.println(trsmCode);
                }
                //下线至故障经过月
                int offlineFailureMonths = 0;
                if (mqmsVoucherRecord.getOfflineDate()!= null && mqmsVoucherRecord.getFailureDate()!= null) {
                    try {
                        offlineFailureMonths = MqmsUtil.getMonth(mqmsVoucherRecord.getOfflineDate(), mqmsVoucherRecord.getFailureDate());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    mqmsVoucherRecord.setOfflineFailureTime(offlineFailureMonths);
                }

                //里程区间
                if (mqmsVoucherRecord.getMileage() != null) {
                    try {
                        mqmsVoucherRecord.setMileageDistribution(RangeResultUtil.rangeResult(mqmsVoucherRecord.getMileage(), 5000, 100000));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    mqmsVoucherRecord.setMileageDistribution(null);
                }
                if (mqmsVoucherRecord.getFailureDate() != null) {
                    String[] dateTime = mqmsVoucherRecord.getFailureDate().split("-");
                    //故障发生年
                    mqmsVoucherRecord.setFailureYear(dateTime[0]);
                    //故障发生月
                    mqmsVoucherRecord.setFailureMonth(dateTime[1]);
                } else {
                    //故障发生年
                    mqmsVoucherRecord.setFailureYear("");
                    //故障发生月
                    mqmsVoucherRecord.setFailureMonth("");
                }
                //故障代码
                if (mqmsVoucherRecord.getEngArrange()!=null) {
                    String engArrange=mqmsVoucherRecord.getEngArrange();

                    if (mqmsFaultDecodeMapper.selectFaultCode(engArrange)!=null){
                        String faultCode=mqmsFaultDecodeMapper.selectFaultCode(engArrange);
                        mqmsVoucherRecord.setFaultCodeClassification(faultCode) ;
                    }
                    else{
                        mqmsVoucherRecord.setFaultCodeClassification("");
                    }
                }
                else
                {
                    mqmsVoucherRecord.setFaultCodeClassification("");
                }


                String dealerName=mqmsVoucherRecord.getDealerName();
                if (dealerName!=null) {
                    if (mqmsSalesPointMapper.selectSalesArea(dealerName)!=null){
                        String salesArea=mqmsSalesPointMapper.selectSalesArea(dealerName);
                        mqmsVoucherRecord.setSalesArea(salesArea);

                    }
                }
                String voucherCode = mqmsVoucherRecord.getVoucherCode();
                if (voucherCode != null) {
                    int cnt = mqmsVoucherMapper.selectByVoucherCode(voucherCode);
                    if (cnt == 0) {
                        mqmsVoucherMapper.insertMqmsVoucher(mqmsVoucherRecord);
                    } else {
                        mqmsVoucherMapper.updateMqmsVoucherByVoucherCode(mqmsVoucherRecord);
                    }
                }
            }

        }
    }

    @Transactional
    public int addLists(String file, HttpServletRequest request) throws ExecutionException, InterruptedException {
        try {
            BigExcelReader bigExcelReader = new BigExcelReader(file) {
                @Override
                public void outputAllRow(List<String[]> lists) throws IllegalAccessException {


                    List<List<Object>> lists1 = new LinkedList<>();
                    //执行保存
                    for (String[] row : lists) {
//                        Map<String, Object> map = new HashMap<String, Object>();
                        //map.put("", row);
                        List<Object> list2 = new ArrayList<>();
//                        System.out.print("[");
                        Collections.addAll(list2, row);
                        lists1.add(list2);
                        //list2= new ArrayList<Object>();
//                        System.out.println("]");
                    }
                    saveAll(lists1, request);
                }
            };
            // 执行解析
            bigExcelReader.parse();
            //通过任务量（即开启线程数）与任务完成数量对比，判断全部子线程是否已经结束
            boolean allThreadsIsDone = ((ThreadPoolExecutor) executorService).getTaskCount()==((ThreadPoolExecutor) executorService).getCompletedTaskCount();
//                if(allThreadsIsDone){
//                   //处理内容
//                }
            while (!allThreadsIsDone){
                allThreadsIsDone = ((ThreadPoolExecutor) executorService).getTaskCount()==((ThreadPoolExecutor) executorService).getCompletedTaskCount();
//                    if(allThreadsIsDone){
//                            //处理内容
//                    }
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return 1;
    }

    private void saveAll(List<List<Object>> lists, HttpServletRequest request) throws IllegalAccessException {
        try {
           if (lists.size() > 0) {
                List<MqmsVoucherRaw> mqmsVoucherRawList = new ArrayList<>();
                List<MqmsVoucher> mqmsVoucherList = new ArrayList<>();
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
                User user = (User) request.getSession().getAttribute("user");
                for (int i = 1; i < lists.size(); i++) {
                    List<Object> rowData = lists.get(i);
                    //利用反射遍历对属性赋值
                    MqmsVoucherRaw mqmsVoucherRaw = new MqmsVoucherRaw();
                    Class cls = mqmsVoucherRaw.getClass();
                    Field[] fields = cls.getDeclaredFields();
                    for (int j = 2; j < fields.length - 3; j++) {
                        Field f = fields[j];
                        f.setAccessible(true);
                        if (f.getType().equals(String.class)) {
                            if (rowData.get(j - 2) != null) {
                                f.set(mqmsVoucherRaw, rowData.get(j - 2));
                            } else {
                                f.set(mqmsVoucherRaw, null);
                            }
                        } else if (f.getType().equals(BigDecimal.class)) {
                            if (rowData.get(j - 2) != null) {
                                if (StringUtil.isEmpty(rowData.get(j - 2).toString())) {
                                    f.set(mqmsVoucherRaw, new BigDecimal(0.0));
                                } else {
//                                    System.out.println("'" + f.getName() + "'" + "'" + j + "'");
                                    f.set(mqmsVoucherRaw, new BigDecimal(Double.parseDouble(rowData.get(j - 2).toString())));

                                }

                            } else {
                                f.set(mqmsVoucherRaw, null);
                            }
                        } else if (f.getType().equals(Integer.class)) {
                            //来自前面的坑，EXCEL导出整数变成字符多了小数点，例2838(Int),2838.0(String)
                            if (rowData.get(j - 2) != null) {
                                String str = rowData.get(j - 2).toString();
//                                System.out.println(str + "'" + f.getName() + "'" + "'" + j + "'");
                                if (str.contains(".")) {
                                    int indexOf = str.indexOf(".");
                                    str = str.substring(0, indexOf);
                                }
                                f.set(mqmsVoucherRaw, Integer.parseInt(str));
                            } else {
                                f.set(mqmsVoucherRaw, null);
                            }
                        }
                        mqmsVoucherRaw.setApplierId(user.getUserId());
                        mqmsVoucherRaw.setApplierName(user.getUserName());
                        mqmsVoucherRaw.setApplyTime(df.format(new Date()));
                    }
                    mqmsVoucherRawList.add(mqmsVoucherRaw);
                    //相同属性复制，避免重复性Get/Set
                    MqmsVoucher mqmsVoucher = new MqmsVoucher();
                    BeanUtils.copyProperties(mqmsVoucherRaw, mqmsVoucher);
                    mqmsVoucherList.add(mqmsVoucher);
                }

                //使用线程池
                ImportCall importCall = new ImportCall();
                ImportCallRaw importCallRaw = new ImportCallRaw();

                //构造函数传参
                importCall.setMqmsVoucherList(mqmsVoucherList);
                importCallRaw.setMqmsVoucherRawList(mqmsVoucherRawList);
                //线程开启
                executorService.execute(importCall);
                executorService.execute(importCallRaw);
            }
            boolean allThreadsIsUse=(((ThreadPoolExecutor) executorService).getTaskCount()-((ThreadPoolExecutor) executorService).getCompletedTaskCount())<((ThreadPoolExecutor)executorService).getMaximumPoolSize();

            while (!allThreadsIsUse) {
                allThreadsIsUse=(((ThreadPoolExecutor) executorService).getTaskCount()-((ThreadPoolExecutor) executorService).getCompletedTaskCount())<((ThreadPoolExecutor) executorService).getMaximumPoolSize();
//                System.out.println(((ThreadPoolExecutor) executorService).getTaskCount());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private class ImportCallRaw implements Runnable {
        //构造函数传递参数
        private List<MqmsVoucherRaw> mqmsVoucherRawList;

        public void setMqmsVoucherRawList(List<MqmsVoucherRaw> mqmsVoucherRawList) {
            this.mqmsVoucherRawList = mqmsVoucherRawList;
        }
        @Override
        public void run() {
            for (MqmsVoucherRaw mqmsVoucherRawRecord : mqmsVoucherRawList) {
                String voucherCode = mqmsVoucherRawRecord.getVoucherCode();
                if (voucherCode != null) {
                    int cnt = mqmsVoucherRawMapper.selectByVoucherCode(voucherCode);
                    if (cnt == 0) {
                        mqmsVoucherRawMapper.insertMqmsVoucherRaw(mqmsVoucherRawRecord);
                    } else {
                        mqmsVoucherRawMapper.updateMqmsVoucherRawByVoucherCode(mqmsVoucherRawRecord);
                    }
                }
            }

        }
    }
}