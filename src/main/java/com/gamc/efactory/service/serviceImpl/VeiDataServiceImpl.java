package com.gamc.efactory.service.serviceImpl;

import com.gamc.efactory.controller.ViewController;
import com.gamc.efactory.model.dataObject.User;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.gamc.efactory.dao.*;
import com.gamc.efactory.dao.base.MqmsTranYearDecodeBaseMapper;
import com.gamc.efactory.model.dataObject.MqmsVoucher;
import com.gamc.efactory.model.dataObject.MqmsVoucherRaw;
import com.gamc.efactory.service.VeiDataService;
import com.gamc.efactory.util.ExcelUtil;
import com.gamc.efactory.util.MqmsUtil;
import com.gamc.efactory.util.RangeResultUtil;
import com.gamc.efactory.util.StringUtil;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;

/**
 * Created by Zeho Lee on 2020/1/3.
 */
@Service
public class VeiDataServiceImpl implements VeiDataService {
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
    Logger logger = LoggerFactory.getLogger(VeiDataServiceImpl.class);

    private class ImportCall implements Runnable {
        //构造函数传递参数
        private List<MqmsVoucher> mqmsVoucherList;

        public void setMqmsVoucherList(List<MqmsVoucher> mqmsVoucherList) {
            this.mqmsVoucherList = mqmsVoucherList;
        }

        @Override
        public void run() {

//            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

            for (MqmsVoucher mqmsVoucherRecord : mqmsVoucherList) {

//                mqmsVoucherRecord.setUploader(request.getSession().getAttribute("user").toString());
//                mqmsVoucherRecord.setUploadingTime(df.format(new Date()));

                //接收区间
                Map<String, String> map = new HashMap();
                try {
                    map = MqmsUtil.getWeekDate(mqmsVoucherRecord.getSubmitDate());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                mqmsVoucherRecord.setReceiveTime(map.get("wednesdayDate") + "~" + map.get("ThursdayDate"));
                //车型简码
                mqmsVoucherRecord.setShortCode(mqmsVoucherRecord.getVehicleType().substring(0, 2));
                //机型、车型及变速箱类型
                String vinShortCOde = mqmsVoucherRecord.getVinCode().substring(0, 5);
                mqmsVoucherRecord.setEngType(mqmsVinDecodeMapper.vinDecode(vinShortCOde).getVinEngType());
                mqmsVoucherRecord.setCarModel(mqmsVinDecodeMapper.vinDecode(vinShortCOde).getVinCarType());
//                mqmsVoucherRecord.setTransmissionCodeRe(mqmsVinDecodeMapper.vinDecode(vinShortCOde).getVinTransmShortCode());
                mqmsVoucherRecord.setTranTypeDetail(mqmsVinDecodeMapper.vinDecode(vinShortCOde).getVinTransmType());
                //变速箱机型
                String trsmCode = mqmsVoucherRecord.getTransmissionCode().replace("+", "");
                String trsmType = trsmCode.substring(0, 5);
                String trsmManufacture = trsmCode.substring(5, 10);
                String trsmProYearCode = trsmCode.substring(11, 12);
                String trsmProMonthHex = trsmCode.substring(12, 13);
                String trsmProDay = trsmCode.substring(13, 15);
//                System.out.println(trsmType+trsmManufacture+trsmProYearCode);
                mqmsVoucherRecord.setTransmissionCodeRe(mqmsTranProductionDecodeMapper.selectTranProductionCode(trsmType));
                //变速箱生产厂家
                mqmsVoucherRecord.setTransmissionManufacturer(mqmsTranManufacturesDecodeMapper.selectTranManufacture(trsmManufacture));
                //变速箱生产日期
                String trsmProMonth = Integer.toString(Integer.parseInt(trsmProMonthHex, 16), 10);
                if (trsmProMonth.length() < 2) {
                    trsmProMonth = "0" + trsmProMonth;
                }
                System.out.println(trsmProMonth);
                String trsmProYear = mqmsTranYearDecodeMapper.selectTranProYear(trsmProYearCode);
                System.out.println(trsmProYear);
                mqmsVoucherRecord.setTransmissionProductionData(trsmProYear + "-" + trsmProMonth + "-" + trsmProDay);
                //变速箱生产至确认经过月
                int proFailureMonths = 0;
                try {
//                    System.out.println(mqmsVoucherRecord.getTransmissionProductionData());
//                    System.out.println(mqmsVoucherRecord.getConfirmDate());
                    proFailureMonths = MqmsUtil.getMonth(mqmsVoucherRecord.getTransmissionProductionData(), mqmsVoucherRecord.getConfirmDate());
//                    System.out.println(proFailureMonths);

                } catch (Exception e) {
                    e.printStackTrace();
                }
                mqmsVoucherRecord.setTransmissionComfirmTime(Integer.toString(proFailureMonths));
                //销售至故障经过月
                int salesFailureMonths = 0;
                try {
                    salesFailureMonths = MqmsUtil.getMonth(mqmsVoucherRecord.getSalesDate(), mqmsVoucherRecord.getFailureDate());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //下线至故障经过月
                int offlineFailureMonths = 0;
                try {
                    offlineFailureMonths = MqmsUtil.getMonth(mqmsVoucherRecord.getOfflineDate(), mqmsVoucherRecord.getConfirmDate());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                mqmsVoucherRecord.setSalesFailureTime(salesFailureMonths);
                mqmsVoucherRecord.setOfflineFailureTime(offlineFailureMonths);
                //里程区间
                try {
                    mqmsVoucherRecord.setMileageDistribution(RangeResultUtil.rangeResult(mqmsVoucherRecord.getMileage(), 5000, 100000));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                String[] dateTime = mqmsVoucherRecord.getFailureDate().split("-");
                //故障发生年
                mqmsVoucherRecord.setFailureYear(dateTime[0]);
                //故障发生月
                mqmsVoucherRecord.setFailureMonth(dateTime[1]);
                //故障代码
                mqmsVoucherRecord.setFaultCodeClassification(mqmsFaultDecodeMapper.selectFaultCode(mqmsVoucherRecord.getPartsAndSymptom()));
                String voucherCode = mqmsVoucherRecord.getVoucherCode();
                int cnt = mqmsVoucherMapper.selectByVoucherCode(voucherCode);
                if (cnt == 0) {
                    mqmsVoucherMapper.insertMqmsVoucher(mqmsVoucherRecord);
                } else {
                    mqmsVoucherMapper.updateMqmsVoucher(mqmsVoucherRecord);
                }
            }

        }
    }

    public boolean batchImport(String fileName, MultipartFile file) {
        try {
            if (fileName.endsWith(".xlsx") || fileName.endsWith(".xls")) {
                List<MqmsVoucherRaw> mqmsVoucherRawList = new ArrayList<>();
                List<MqmsVoucher> mqmsVoucherList = new ArrayList<>();
                // 说明是xlsx文件,不过这里最好限制一下
                List<List<String>> result = ExcelUtil.importXlsx(file.getInputStream());
                //第0行为表头
                for (int i = 1; i < result.size(); i++) {
                    List<String> rowData = result.get(i);

                    //利用反射遍历对属性赋值
                    MqmsVoucherRaw mqmsVoucherRaw = new MqmsVoucherRaw();
                    Class cls = mqmsVoucherRaw.getClass();
                    Field[] fields = cls.getDeclaredFields();
                    for (int j = 2; j < fields.length; j++) {
                        Field f = fields[j];
                        f.setAccessible(true);
                        if (f.getType().equals(String.class)) {
                            f.set(mqmsVoucherRaw, rowData.get(j - 2));
                        } else if (f.getType().equals(BigDecimal.class)) {
                            if (StringUtil.isEmpty(rowData.get(j - 2))) {
                                f.set(mqmsVoucherRaw, new BigDecimal(0.0));
                            } else {
                                f.set(mqmsVoucherRaw, new BigDecimal(Double.parseDouble(rowData.get(j - 2))));
                            }
                        } else if (f.getType().equals(Integer.class)) {
                            //来自前面的坑，EXCEL导出整数变成字符多了小数点，例2838(Int),2838.0(String)
                            String str = rowData.get(j - 2);
                            System.out.println(str);
                            if (str.contains(".")) {
                                int indexOf = str.indexOf(".");
                                str = str.substring(0, indexOf);
                            }
                            f.set(mqmsVoucherRaw, Integer.parseInt(str));
                        }
                    }

                    mqmsVoucherRawList.add(mqmsVoucherRaw);

                    //开新线程解析
                    //相同属性复制，避免重复性Get/Set
                    MqmsVoucher mqmsVoucher = new MqmsVoucher();
                    BeanUtils.copyProperties(mqmsVoucherRaw, mqmsVoucher);
                    mqmsVoucherList.add(mqmsVoucher);
                    //销售至故障经过月
//                    int salesFailureMonths= MqmsUtil.getMonth(mqmsVoucher.getSalesDate(),mqmsVoucher.getFailureDate());
                    //下线至故障经过月
//                    int offlineFailureMonths=MqmsUtil.getMonth(mqmsVoucher.getOfflineDate(),mqmsVoucher.getConfirmDate());
//                    mqmsVoucher.setSalesFailureTime(salesFailureMonths);
//                    mqmsVoucher.setOfflineFailureTime(offlineFailureMonths);
                    //里程区间
//                    mqmsVoucher.setMileageDistribution(RangeResultUtil.rangeResult(mqmsVoucher.getMileage(),5000,100000));
//                    String[] dateTime=mqmsVoucher.getFailureDate().split("-");
                    //故障发生年
//                    mqmsVoucher.setFailureYear(dateTime[0]);
                    //故障发生月
//                    mqmsVoucher.setFailureMonth(dateTime[1]);
//                    Map<String, String> map = new HashMap();
//                    map=MqmsUtil.getWeekDate(mqmsVoucher.getSubmitDate());
//                    //接收区间
//                    mqmsVoucher.setReceiveTime(map.get("wednesdayDate")+"~"+map.get("ThursdayDate"));
                    //车型

                    //发动机号

                    //发动机生产日期

                    //变速箱机型
//                    String trsmCode=mqmsVoucher.getTransmissionCode().replace("+","");
//                    String trsmType=trsmCode.substring(0,5);
//                    String trsmManufacture=trsmCode.substring(5,10);
//                    String trsmProYearCode=trsmCode.substring(11,12);
//                    String trsmProMonthHex=trsmCode.substring(12,13);
//
//                    String trsmProDay=trsmCode.substring(13,15);
//                    System.out.println(trsmType+trsmManufacture+trsmProYearCode);
//                    mqmsVoucher.setTransmissionCodeRe(mqmsTranProductionDecodeMapper.selectTranProductionCode(trsmType));
                    //变速箱生产厂家
//                    mqmsVoucher.setTransmissionManufacturer(mqmsTranManufacturesDecodeMapper.selectTranManufacture(trsmManufacture));
                    //变速箱生产日期
//                    String trsmProMonth=Integer.toString(Integer.parseInt(trsmProMonthHex,16),10);
//                    if(trsmProMonth.length()<2){
//                        trsmProMonth="0"+trsmProMonth;
//                    }
//                    System.out.println(trsmProMonth);
//                    String trsmProYear=mqmsTranYearDecodeMapper.selectTranProYear(trsmProYearCode);
//                    System.out.println(trsmProYear);
//                    mqmsVoucher.setTransmissionProductionData(trsmProYear+"-"+trsmProMonth+"-"+trsmProDay);
                    //变速箱生产至确认经过月
//                    int proFailureMonths=MqmsUtil.getMonth(mqmsVoucher.getTransmissionProductionData(),mqmsVoucher.getConfirmDate());
//                    mqmsVoucher.setTransmissionComfirmTime(Integer.toString(proFailureMonths));
                }


                for (MqmsVoucherRaw mqmsVoucherRawRecord : mqmsVoucherRawList) {
                    String voucherCode = mqmsVoucherRawRecord.getVoucherCode();
                    int cnt = mqmsVoucherRawMapper.selectByVoucherCode(voucherCode);
                    if (cnt == 0) {
                        mqmsVoucherRawMapper.insertMqmsVoucherRaw(mqmsVoucherRawRecord);
                    } else {
                        mqmsVoucherRawMapper.updateMqmsVoucherRaw(mqmsVoucherRawRecord);
                        System.out.println(" 更新 " + mqmsVoucherRawRecord);
                    }
                    ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("sendEmailImmediately-pool-%d").build();
                    ExecutorService executorService = new ThreadPoolExecutor(2, 4, 1000, TimeUnit.MILLISECONDS, new SynchronousQueue<Runnable>(), threadFactory, new ThreadPoolExecutor.AbortPolicy());
                    //使用线程池
                    ImportCall importCall = new ImportCall();
                    executorService.execute(importCall);
                    //构造函数传参
                    importCall.setMqmsVoucherList(mqmsVoucherList);


//                for(MqmsVoucher mqmsVoucherRecord:mqmsVoucherList){
//                    String qualityFeedbackCode=mqmsVoucherRecord.getQualityFeedbackCode();
//                    int cnt = mqmsVoucherMapper.selectByQualityFeedbackCode(qualityFeedbackCode);
//                    if (cnt == 0) {
//                        mqmsVoucherMapper.insertMqmsVoucher(mqmsVoucherRecord);
//                        System.out.println(" 插入 "+mqmsVoucherRecord);
//                    } else {
//                        mqmsVoucherMapper.updateByQualityFeedbackCode(mqmsVoucherRecord);
//                        System.out.println(" 更新 "+mqmsVoucherRecord);
//                    }
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}