package com.gamc.efactory.service.serviceImpl;

import com.gamc.efactory.dao.*;
import com.gamc.efactory.model.dataObject.*;
import com.gamc.efactory.service.ProductionService;
import com.gamc.efactory.util.AttDateUtil;
import com.gamc.efactory.util.ExcelUtil;
import com.gamc.efactory.util.RangeResultUtil;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * Created by Jian Wang on 2020/1/5.
 */
@Service
public class ProductionServiceImpl implements ProductionService {
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
        public void setMqmsProductionList(List<MqmsProduction> mqmsProductionList)
        {
            this.mqmsProductionList = mqmsProductionList;
        }
        @Override
        public void run() {

            for (MqmsProduction mqmsProductionRecord : mqmsProductionList) {
                //短码
                String vinShortCOde=mqmsProductionRecord.getVin().substring(0,5);
                mqmsProductionRecord.setShortCode(vinShortCOde);
                //机型
                MqmsVinDecode mqmsVinDecode=new MqmsVinDecode();
                mqmsVinDecode=mqmsVinDecodeMapper.vinDecode(vinShortCOde);
                mqmsProductionRecord.setEngType(mqmsVinDecode.getVinEngType());
                //系列
                mqmsProductionRecord.setSerialCode(mqmsVinDecode.getVinSeries());
                //车型简码
                mqmsProductionRecord.setCarShortCode(vinShortCOde.substring(3,5));
                //车型
                mqmsProductionRecord.setCarModel(mqmsVinDecode.getVinCarType());
                //内部车型代号
                mqmsProductionRecord.setCarSimpleCode(mqmsVinDecode.getVinCarType());
                //销售年/月

                if (mqmsSalesMapper.selectVinCodeCount(mqmsProductionRecord.getVin())!=0){
                    MqmsSales mqmsSales=mqmsSalesMapper.selectByVinCode(mqmsProductionRecord.getVin());
                    mqmsProductionRecord.setProductionYear(mqmsSales.getSalesYear());
                    mqmsProductionRecord.setProductionMonth(mqmsSales.getSalesMonth());
                }
                else
                {
                    mqmsProductionRecord.setProductionYear("");
                    mqmsProductionRecord.setProductionMonth("");
                }

                //变速箱短码
                mqmsProductionRecord.setTransmissionShortCode(mqmsProductionRecord.getVin().substring(6,7));
                //变速箱简码
                String trsmCode=mqmsProductionRecord.getTransmissionCode().replace("+","");

                String trsmType=trsmCode.substring(0,5);
                mqmsProductionRecord.setTransmissionSimpleCode(trsmType);
                //变速箱类型
                mqmsProductionRecord.setTransmissionType(mqmsTranProductionDecodeMapper.selectTranProductionCode(trsmType));
                //插入操作
                mqmsProductionMapper.insertMqmsProduction(mqmsProductionRecord);

                    }
            }
        }
    public boolean batchImport(String fileName, MultipartFile file) {
        try {
            if (fileName.endsWith(".xlsx")) {
                List<MqmsProductionRaw> mqmsProductionRawList = new ArrayList<>();
                List<MqmsProduction> mqmsProductionList = new ArrayList<>();
                // 说明是xlsx文件,不过这里最好限制一下
                List<List<String>> result = ExcelUtil.importXlsx(file.getInputStream());
                //第0行为表头
                for (int i = 1; i < result.size(); i++) {
                    List<String> rowData = result.get(i);

                    //利用反射遍历对属性赋值
                    MqmsProductionRaw mqmsProductionRaw = new MqmsProductionRaw();
                    Class cls = mqmsProductionRaw.getClass();
                    Field[] fields = cls.getDeclaredFields();
                    for (int j = 2; j < fields.length; j++) {
                        Field f = fields[j];
                        f.setAccessible(true);
                        if (f.getType().equals(String.class)) {
                            f.set(mqmsProductionRaw, rowData.get(j - 2));
                        } else if (f.getType().equals(BigDecimal.class)) {

                            f.set(mqmsProductionRaw, new BigDecimal(rowData.get(j - 2)));
                        } else if (f.getType().equals(Integer.class)) {
                            //来自前面的坑，EXCEL导出整数变成字符多了小数点，例2838(Int),2838.0(String
                            String str = rowData.get(j - 2);
                            if (str.contains(".")) {
                                int indexOf = str.indexOf(".");
                                str = str.substring(0, indexOf);
                            }
                            f.set(mqmsProductionRaw, Integer.parseInt(str));
                        }
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
                for (MqmsProductionRaw mqmsProductionRawRecord : mqmsProductionRawList) {
//                    String vin = mqmsProductionRawRecord.getVin();
//                    int cnt = mqmsProductionRawMapper.selectByVin(vin);
//                    System.out.println(cnt);
//                    if (cnt == 0) {
                        mqmsProductionRawMapper.insertMqmsProductionRaw(mqmsProductionRawRecord);
                        System.out.println(" 插入 " + mqmsProductionRawRecord);
//                    } else {
//                        mqmsProductionRawMapper.updateByVin(mqmsProductionRawRecord);
//                        System.out.println(" 更新 " + mqmsProductionRawRecord);
//                    }
                }
                ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("sendEmailImmediately-pool-%d").build();
                ExecutorService executorService = new ThreadPoolExecutor(2, 4, 1000, TimeUnit.MILLISECONDS, new SynchronousQueue<Runnable>(),threadFactory,new ThreadPoolExecutor.AbortPolicy());
                //使用线程池
                ImportCall importCall = new ImportCall();
                executorService.execute(importCall);
                //构造函数传参
                importCall.setMqmsProductionList(mqmsProductionList);

            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}

