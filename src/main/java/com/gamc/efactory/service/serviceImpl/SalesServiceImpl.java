package com.gamc.efactory.service.serviceImpl;


import com.gamc.efactory.dao.*;

import com.gamc.efactory.model.dataObject.MqmsProduction;
import com.gamc.efactory.model.dataObject.MqmsSales;
import com.gamc.efactory.model.dataObject.MqmsSalesRaw;
import com.gamc.efactory.model.dataObject.MqmsVinDecode;
import com.gamc.efactory.service.SalesService;
import com.gamc.efactory.util.ExcelUtil;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
    private MqmsFaultDecodeMapper mqmsFaultDecodeMapper;
    @Autowired
    private MqmsProductionMapper mqmsProductionMapper;
    Logger logger = LoggerFactory.getLogger(SalesServiceImpl.class);
    private class ImportCall implements Runnable {
        //构造函数传递参数
        private List<MqmsSales> mqmsSalesList;

        public void setMqmsSalesList(List<MqmsSales> mqmsSalesList) {
            this.mqmsSalesList = mqmsSalesList;
        }

        @Override
        public void run() {

            for (MqmsSales mqmsSalesRecord : mqmsSalesList) {
                //mtoc码
                String mtoc = mqmsProductionMapper.selectInforByVin(mqmsSalesRecord.getVinCode()).getMtoc();
                mqmsSalesRecord.setMtoc(mtoc);

                //机型
                String vinShortCOde = mqmsSalesRecord.getVinCode().substring(0, 5);
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
                //销售年
                String[] dateTime = mqmsSalesRecord.getSecondPinDate().split("-");
                mqmsSalesRecord.setSalesYear(dateTime[0]);
                //销售月
                mqmsSalesRecord.setSalesMonth(dateTime[1]);
                //变速箱短码
                mqmsSalesRecord.setTranShortCode(mqmsSalesRecord.getVinCode().substring(6, 7));
                //变速箱类型
                String trsmCode = mqmsSalesRecord.getTransmissionCode().replace("+", "");
                String trsmType = trsmCode.substring(0, 5);
                mqmsSalesRecord.setTranType(mqmsTranProductionDecodeMapper.selectTranProductionCode(trsmType));
                //变速箱系列

                String vinCode = mqmsSalesRecord.getVinCode();
                int cnt = mqmsSalesMapper.selectVinCodeCount(vinCode);
                if (cnt == 0) {
                    mqmsSalesMapper.insertMqmsSales(mqmsSalesRecord);

                } else {
                    mqmsSalesMapper.updateByVinCode(mqmsSalesRecord);
                }
            }
        }
    }
        public boolean batchImport(String fileName, MultipartFile file) {
            try {
                if (fileName.endsWith(".xlsx")) {
                    List<MqmsSalesRaw> mqmsSalesRawList = new ArrayList<>();
                    List<MqmsSales> mqmsSalesList= new ArrayList<>();
                    // 说明是xlsx文件,不过这里最好限制一下
                    List<List<String>> result = ExcelUtil.importXlsx(file.getInputStream());
                    //第0行为表头

                    for (int i = 1; i < (result != null ? result.size() : 0); i++) {
                        List<String> rowData = result.get(i);

                        //利用反射遍历对属性赋值
                        MqmsSalesRaw mqmsSalesRaw = new MqmsSalesRaw();
                        Class cls = mqmsSalesRaw.getClass();
                        Field[] fields = cls.getDeclaredFields();
                        for (int j = 2; j < fields.length; j++) {
                            Field f = fields[j];
                            f.setAccessible(true);
                            if (f.getType().equals(String.class)) {
                                f.set(mqmsSalesRaw, rowData.get(j - 2));
                            } else if (f.getType().equals(BigDecimal.class)) {

                                f.set(mqmsSalesRaw, new BigDecimal(rowData.get(j - 2)));
                            } else if (f.getType().equals(Integer.class)) {
                                //来自前面的坑，EXCEL导出整数变成字符多了小数点，例2838(Int),2838.0(String
                                String str = rowData.get(j - 2);
                                if (str.contains(".")) {
                                    int indexOf = str.indexOf(".");
                                    str = str.substring(0, indexOf);
                                }
                                f.set(mqmsSalesRaw, Integer.parseInt(str));
                            }
                        }
                        mqmsSalesRawList.add(mqmsSalesRaw);
                        //相同属性复制
                        MqmsSales mqmsSales = new MqmsSales();
                        BeanUtils.copyProperties(mqmsSalesRaw, mqmsSales);
                        mqmsSalesList.add(mqmsSales);

                    }
                    for (MqmsSalesRaw mqmsSalesRawRecord : mqmsSalesRawList) {

                        String vinCode=mqmsSalesRawRecord.getVinCode();
                        int cnt = mqmsSalesRawMapper.selectByVinCode(vinCode);
                        if (cnt == 0) {
                            mqmsSalesRawMapper.insertMqmsSalesRaw(mqmsSalesRawRecord);
//                        System.out.println(" 插入 "+mqmsSalesRawRecord);
                        } else {
                            mqmsSalesRawMapper.updateByVinCode(mqmsSalesRawRecord);
//                        System.out.println(" 更新 "+mqmsSalesRawRecord);
                        }
                    }


                    ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("sendEmailImmediately-pool-%d").build();
                    ExecutorService executorService = new ThreadPoolExecutor(2, 4, 1000, TimeUnit.MILLISECONDS, new SynchronousQueue<Runnable>(),threadFactory,new ThreadPoolExecutor.AbortPolicy());
                    //使用线程池
                    ImportCall importCall = new ImportCall();
                    executorService.execute(importCall);
                    //构造函数传参
                    importCall.setMqmsSalesList(mqmsSalesList);
                }
                return true;
            }
            catch(Exception e){
                e.printStackTrace();
                return false;
            }

        }
    }

