package com.gamc.efactory.service.serviceImpl;

import com.gamc.efactory.dao.*;
import com.gamc.efactory.model.dataObject.*;
import com.gamc.efactory.service.ProductionService;
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
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;

/**
 * Created by Jian Wang on 2020/1/5.
 */
@Service
public class ProductionServiceImpl implements ProductionService {

    private ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("sendEmailImmediately-pool-%d").build();
    private ExecutorService executorService = new ThreadPoolExecutor(16, 24, 1000, TimeUnit.MILLISECONDS, new SynchronousQueue<Runnable>(), threadFactory, new ThreadPoolExecutor.AbortPolicy());
    @Autowired
    private MqmsProductionRawMapper mqmsProductionRawMapper;
    @Autowired
    private MqmsProductionMapper mqmsProductionMapper;
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
    private MqmsSalesMapper mqmsSalesMapper;
    Logger logger = LoggerFactory.getLogger(ProductionServiceImpl.class);
    private class ImportCall implements Runnable {
        //构造函数传递参数
        private List<MqmsProduction> mqmsProductionList;

        public void setMqmsProductionList(List<MqmsProduction> mqmsProductionList) {
            this.mqmsProductionList = mqmsProductionList;
        }

        @Override
        public void run() {

            for (MqmsProduction mqmsProductionRecord : mqmsProductionList) {
                //短码
                String vinShortCOde = mqmsProductionRecord.getVin().substring(0, 5);
                mqmsProductionRecord.setShortCode(vinShortCOde);
                //地域

                //机型
                MqmsVinDecode mqmsVinDecode = mqmsVinDecodeMapper.vinDecode(vinShortCOde);
                if (mqmsVinDecode.getVinEngType()!=null) {
                    mqmsProductionRecord.setEngType(mqmsVinDecode.getVinEngType());
                }
                else {
                    mqmsProductionRecord.setEngType("");
                }
                //系列
                if (mqmsVinDecode.getVinSeries()!=null) {
                    mqmsProductionRecord.setSerialCode(mqmsVinDecode.getVinSeries());
                }
                //车型简码
                mqmsProductionRecord.setCarShortCode(vinShortCOde.substring(3, 5));
                //车型
                if (mqmsVinDecode.getVinCarType()!=null) {
                    mqmsProductionRecord.setCarModel(mqmsVinDecode.getVinCarType());
                }
                else{
                    mqmsProductionRecord.setCarModel("");

                }
                //内部车型代号
                if(mqmsVinDecode.getVinCarType()!=null) {
                    mqmsProductionRecord.setCarSimpleCode(mqmsVinDecode.getVinCarType());
                }
                else{
                    mqmsProductionRecord.setCarSimpleCode("");
                }
                //销售年/月

                if (mqmsSalesMapper.selectVinCodeCount(mqmsProductionRecord.getVin())!= 0) {
                    MqmsSales mqmsSales = mqmsSalesMapper.selectByVinCode(mqmsProductionRecord.getVin());
                    mqmsProductionRecord.setProductionYear(mqmsSales.getSalesYear());
                    mqmsProductionRecord.setProductionMonth(mqmsSales.getSalesMonth());
                    mqmsProductionRecord.setDistrictName(mqmsSales.getSalesArea());
                } else {
                    mqmsProductionRecord.setProductionYear("");
                    mqmsProductionRecord.setProductionMonth("");
                    mqmsProductionRecord.setDistrictName("");
                }

                //变速箱短码
                mqmsProductionRecord.setTransmissionShortCode(mqmsProductionRecord.getVin().substring(6, 7));
                //变速箱简码
                String trsmCode = mqmsProductionRecord.getTransmissionCode().replace("+", "");
                String trsmType = trsmCode.substring(0, 5);
                mqmsProductionRecord.setTransmissionSimpleCode(trsmType);
                //变速箱类型
                mqmsProductionRecord.setTransmissionType(mqmsTranProductionDecodeMapper.selectTranProductionCode(trsmType));
                //插入操作
                String vin = mqmsProductionRecord.getVin();
                int cnt = mqmsProductionMapper.selectByVin(vin);
                if (cnt == 0) {
                    mqmsProductionMapper.insertMqmsProduction(mqmsProductionRecord);

                } else {
                    mqmsProductionMapper.updateByVin(mqmsProductionRecord);
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
//            System.out.println("0000000000000000000000000000000000000000000000");


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return 1;
    }
    private void saveAll(List<List<Object>> lists, HttpServletRequest request) throws IllegalAccessException {
        try {
            if (lists.size() > 0) {

//            System.out.println(lists.size());
                List<MqmsProductionRaw> mqmsProductionRawList = new ArrayList<>();
                List<MqmsProduction> mqmsProductionList = new ArrayList<>();
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
                User user = (User) request.getSession().getAttribute("user");
                for (int i = 1; i < lists.size(); i++) {
//                System.out.println("222222222222222222222222222");
                    List<Object> rowData = lists.get(i);
                    //利用反射遍历对属性赋值
                    MqmsProductionRaw mqmsProductionRaw = new MqmsProductionRaw();
                    Class cls = mqmsProductionRaw.getClass();
                    Field[] fields = cls.getDeclaredFields();
                    for (int j = 2; j < fields.length - 3; j++) {
                        Field f = fields[j];
                        f.setAccessible(true);
                        if (f.getType().equals(String.class)) {
                            f.set(mqmsProductionRaw, rowData.get(j - 2));
                        } else if (f.getType().equals(BigDecimal.class)) {

                            f.set(mqmsProductionRaw, new BigDecimal(rowData.get(j - 2).toString()));
                        } else if (f.getType().equals(Integer.class)) {
                            //来自前面的坑，EXCEL导出整数变成字符多了小数点，例2838(Int),2838.0(String
                            String str = rowData.get(j - 2).toString();
                            if (str.contains(".")) {
                                int indexOf = str.indexOf(".");
                                str = str.substring(0, indexOf);
                            }
                            f.set(mqmsProductionRaw, Integer.parseInt(str));
                        }
                        mqmsProductionRaw.setApplierId(user.getUserId());
                        mqmsProductionRaw.setApplierName(user.getUserName());
                        mqmsProductionRaw.setApplyTime(df.format(new Date()));
                    }
                    mqmsProductionRawList.add(mqmsProductionRaw);
                    //相同属性复制
                    MqmsProduction mqmsProduction = new MqmsProduction();
                    BeanUtils.copyProperties(mqmsProductionRaw, mqmsProduction);
//                    String shortCode = "";
//                    if (mqmsProduction.getVin().length() <= 5) {
//                        shortCode = mqmsProduction.getVin().toString();
//                    } else {
//                        shortCode = mqmsProduction.getVin().substring(0, 5);
//                    }
//                    mqmsProduction.setShortCode(shortCode);
                    mqmsProductionList.add(mqmsProduction);

                }

                ImportCall importCall = new ImportCall();
                executorService.execute(importCall);
                //构造函数传参
                importCall.setMqmsProductionList(mqmsProductionList);
                for (MqmsProductionRaw mqmsProductionRawRecord : mqmsProductionRawList) {
                    String vin = mqmsProductionRawRecord.getVin();
                    int cnt = mqmsProductionRawMapper.selectByVin(vin);
                    if (cnt == 0) {
                        mqmsProductionRawMapper.insertMqmsProductionRaw(mqmsProductionRawRecord);
//                        System.out.println(" 插入 " + mqmsProductionRawRecord);
                    } else {
                        mqmsProductionRawMapper.updateByVin(mqmsProductionRawRecord);
//                        System.out.println(" 更新 " + mqmsProductionRawRecord);
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}

