package com.gamc.efactory.service.serviceImpl;


import com.gamc.efactory.dao.*;
import com.gamc.efactory.model.dataObject.MqmsSales;
import com.gamc.efactory.model.dataObject.MqmsSalesRaw;
import com.gamc.efactory.model.dataObject.MqmsVinDecode;
import com.gamc.efactory.model.dataObject.User;
import com.gamc.efactory.service.SalesService;
import com.gamc.efactory.util.BigExcelReader;
import com.gamc.efactory.util.ExcelUtil;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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
 * Created by Jian Wang on 2020/1/5.
 */
@Service
public class SalesServiceImpl implements SalesService {
    @Autowired
    private MqmsSalesRawMapper mqmsSalesRawMapper;
    @Autowired
    private MqmsSalesMapper mqmsSalesMapper;
    @Autowired
    private MqmsTranProductionDecodeMapper mqmsTranProductionDecodeMapper;
    @Autowired
    private MqmsTranManufacturesDecodeMapper mqmsTranManufacturesDecodeMapper;
    @Autowired
    private MqmsTranYearDecodeMapper mqmsTranYearDecodeMapper;
    @Autowired
    private MqmsVinDecodeMapper mqmsVinDecodeMapper;
    @Autowired
    private MqmsSalesPointMapper mqmsSalesPointMapper;
    @Autowired
    private MqmsProductionMapper mqmsProductionMapper;
    Logger logger = LoggerFactory.getLogger(SalesServiceImpl.class);

    private class ImportCall implements Runnable {
        //构造函数传递参数
        private List<MqmsSales> mqmsSalesList;

        void setMqmsSalesList(List<MqmsSales> mqmsSalesList) {
            this.mqmsSalesList = mqmsSalesList;
        }

        @Override
        public void run() {

            for (MqmsSales mqmsSalesRecord : mqmsSalesList) {
                //mtoc码
                if (mqmsProductionMapper.selectByVin(mqmsSalesRecord.getVinCode()) != 0) {
                    String mtoc = mqmsProductionMapper.selectInforByVin(mqmsSalesRecord.getVinCode()).getMtoc();
                    mqmsSalesRecord.setMtoc(mtoc);
                } else {
                    mqmsSalesRecord.setMtoc("");
                }
                //区域
                mqmsSalesRecord.setSalesArea(mqmsSalesPointMapper.selectSalesPointInfor(mqmsSalesRecord.getDealerCode()));

                //销售年
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Calendar c = Calendar.getInstance();
                if (mqmsSalesRecord.getSecondPinDate()!=null) {
                    String secondSalesDate = mqmsSalesRecord.getSecondPinDate();
                    System.out.println(secondSalesDate);
                    try {
                        c.setTime(sdf.parse(secondSalesDate));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    int secondSalesYear = c.get(Calendar.YEAR);
                    int secondSalesMonth = c.get(Calendar.MONTH);
                    mqmsSalesRecord.setSalesYear(Integer.toString(secondSalesYear));
                    //销售月
                    mqmsSalesRecord.setSalesMonth(Integer.toString(secondSalesMonth));
                }
                else{
                    mqmsSalesRecord.setSalesYear("");
                    mqmsSalesRecord.setSalesMonth("");
                }

                //变速箱类型
                String trsmCode = "";
                if (!Objects.equals(mqmsSalesRecord.getTransmissionCode(), null)) {
                    if (Objects.equals(mqmsSalesRecord.getTransmissionCode().substring(0, 1), "+")) {
                        trsmCode = mqmsSalesRecord.getTransmissionCode().replace("+", "");
                    } else {
                        trsmCode = mqmsSalesRecord.getTransmissionCode();
                    }
                    String trsmType = trsmCode.substring(0, 5);

                    mqmsSalesRecord.setTranType(mqmsTranProductionDecodeMapper.selectTranProductionCode(trsmType));
                } else {
                    mqmsSalesRecord.setTranType("");
                }
                //变速箱系列

                String vinCode = mqmsSalesRecord.getVinCode();
                if (vinCode != null) {
                    //变速箱短码
                    mqmsSalesRecord.setTranShortCode(mqmsSalesRecord.getVinCode().substring(6, 7));
                    //机型
                    String vinShortCOde = vinCode.substring(0, 5);
                    MqmsVinDecode mqmsVinDecode = mqmsVinDecodeMapper.vinDecode(vinShortCOde);
                    mqmsSalesRecord.setEngType(mqmsVinDecode.getVinEngType());
                    //系列
                    mqmsSalesRecord.setEngSeries(mqmsVinDecode.getVinSeries());
                    //车型简码
                    mqmsSalesRecord.setCarShortCode(vinShortCOde.substring(3, 5));
                    //车型
                    mqmsSalesRecord.setCarModel(mqmsVinDecode.getVinCarType());
                    //内部车型号
                    mqmsSalesRecord.setCarModelCode(mqmsVinDecode.getVinCarType());
                    int cnt = mqmsSalesMapper.selectVinCodeCount(vinCode);
                    if (cnt == 0) {
                        mqmsSalesMapper.insertMqmsSales(mqmsSalesRecord);
                    } else {
                        mqmsSalesMapper.updateByVinCode(mqmsSalesRecord);
//                        System.out.println(" 更新 "+mqmsSalesRawRecord);
                    }
                }
            }
        }
    }

    @Transactional
    public int addBlackLists(String file, HttpServletRequest request) throws ExecutionException, InterruptedException {
        try {
//            System.out.println("5555555555555555555555555555555");
            BigExcelReader bigExcelReader = new BigExcelReader(file) {
                @Override
                public void outputAllRow(List<String[]> lists) throws IllegalAccessException {


                    List<List<Object>> lists1 = new LinkedList<>();
                    //执行保存
                    for (String[] row : lists) {
                        Map<String, Object> map = new HashMap<String, Object>();
                        //map.put("", row);
                        List<Object> list2 = new ArrayList<>();
//                        System.out.print("[");
                        for (String cell : row) {
//                            System.out.print(cell+",");
                            list2.add(cell);
                        }

                        lists1.add(list2);
                        //list2= new ArrayList<Object>();

//                        System.out.println("]");
                    }
                    saveAll(lists1, request);
                }
            };
            // 执行解析
            bigExcelReader.parse();
            //File files = new File(file);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return 1;

    }


    private void saveAll(List<List<Object>> lists, HttpServletRequest request) throws IllegalAccessException {
        try {
            if (lists.size() > 0) {

//            System.out.println(lists.size());
                List<MqmsSalesRaw> mqmsSalesRawList = new ArrayList<>();
                List<MqmsSales> mqmsSalesList = new ArrayList<>();
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
                User user = (User) request.getSession().getAttribute("user");
                for (int i = 1; i < lists.size(); i++) {
//                System.out.println("222222222222222222222222222");
                    List<Object> rowData = lists.get(i);
                    //利用反射遍历对属性赋值
                    MqmsSalesRaw mqmsSalesRaw = new MqmsSalesRaw();
                    Class cls = mqmsSalesRaw.getClass();
                    Field[] fields = cls.getDeclaredFields();
                    for (int j = 2; j < fields.length - 3; j++) {
                        Field f = fields[j];
                        f.setAccessible(true);
                        if (f.getType().equals(String.class)) {
                            f.set(mqmsSalesRaw, rowData.get(j - 2));
                        } else if (f.getType().equals(BigDecimal.class)) {

                            f.set(mqmsSalesRaw, new BigDecimal(rowData.get(j - 2).toString()));
                        } else if (f.getType().equals(Integer.class)) {
                            //来自前面的坑，EXCEL导出整数变成字符多了小数点，例2838(Int),2838.0(String
                            String str = rowData.get(j - 2).toString();
                            if (str.contains(".")) {
                                int indexOf = str.indexOf(".");
                                str = str.substring(0, indexOf);
                            }
                            f.set(mqmsSalesRaw, Integer.parseInt(str));
                        }
                        mqmsSalesRaw.setApplierId(user.getUserId());
                        mqmsSalesRaw.setApplierName(user.getUserName());
                        mqmsSalesRaw.setApplyTime(df.format(new Date()));

                    }
                    mqmsSalesRawList.add(mqmsSalesRaw);
                    //相同属性复制
                    MqmsSales mqmsSales = new MqmsSales();
                    BeanUtils.copyProperties(mqmsSalesRaw, mqmsSales);
                    mqmsSalesList.add(mqmsSales);
                }

                ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("sendEmailImmediately-pool-%d").build();
                ExecutorService executorService = new ThreadPoolExecutor(2, 4, 1000, TimeUnit.MILLISECONDS, new SynchronousQueue<Runnable>(),threadFactory,new ThreadPoolExecutor.AbortPolicy());
                //使用线程池
                ImportCall importCall = new ImportCall();
                importCall.setMqmsSalesList(mqmsSalesList);
                executorService.execute(importCall);
                System.out.println("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
                //构造函数传参


                for (MqmsSalesRaw mqmsSalesRawRecord : mqmsSalesRawList) {

                    String vinCode = mqmsSalesRawRecord.getVinCode();
                    if (vinCode != null) {
                        int cnt = mqmsSalesRawMapper.selectByVinCode(vinCode);
                        if (cnt == 0) {
                            mqmsSalesRawMapper.insertMqmsSalesRaw(mqmsSalesRawRecord);
                        } else {
                            mqmsSalesRawMapper.updateByVinCode(mqmsSalesRawRecord);
//                        System.out.println(" 更新 "+mqmsSalesRawRecord);
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
