package com.gamc.efactory.service.serviceImpl;


import com.gamc.efactory.dao.*;

import com.gamc.efactory.model.dataObject.*;
import com.gamc.efactory.service.SalesService;
import com.gamc.efactory.service.SalesService20191220;
import com.gamc.efactory.util.ExcelUtil;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.*;

/**
 * Created by Jian Wang on 2020/1/5.
 */
@Service
public class SalesServiceImpl20191220 implements SalesService20191220 {
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
    Logger logger = LoggerFactory.getLogger(SalesServiceImpl20191220.class);
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
                if (mqmsProductionMapper.selectByVin(mqmsSalesRecord.getVinCode())!=0) {
                    String mtoc = mqmsProductionMapper.selectInforByVin(mqmsSalesRecord.getVinCode()).getMtoc();
                    mqmsSalesRecord.setMtoc(mtoc);
                }
                else{
                    mqmsSalesRecord.setMtoc("");
                }
                //区域
                mqmsSalesRecord.setSalesArea(mqmsSalesPointMapper.selectSalesPointInfor(mqmsSalesRecord.getDealerCode()));
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
                String trsmCode="";
                if (!Objects.equals(mqmsSalesRecord.getTransmissionCode(), null)) {
                    if (Objects.equals(mqmsSalesRecord.getTransmissionCode().substring(0, 1), "+")) {
                        trsmCode = mqmsSalesRecord.getTransmissionCode().replace("+", "");
                    } else {
                        trsmCode = mqmsSalesRecord.getTransmissionCode();
                    }
                    String trsmType = trsmCode.substring(0, 5);

                mqmsSalesRecord.setTranType(mqmsTranProductionDecodeMapper.selectTranProductionCode(trsmType));
                }
                else{
                    mqmsSalesRecord.setTranType("");
                }
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
    public boolean batchImport(String fileName, MultipartFile file ,HttpSession session) {
        try {
            if ((fileName.endsWith(".xlsx")||fileName.endsWith(".xls"))) {
                List<MqmsSalesRaw> mqmsSalesRawList = new ArrayList<>();
                List<MqmsSales> mqmsSalesList= new ArrayList<>();
                User user=(User)session.getAttribute("user");
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
                // 说明是xlsx文件,不过这里最好限制一下
                List<List<String>> result = ExcelUtil.importXlsx(file.getInputStream());
                //第0行为表头
                for (int i = 1; i < (result != null ? result.size() : 0); i++) {
                    List<String> rowData = result.get(i);

                    //利用反射遍历对属性赋值
                    MqmsSalesRaw mqmsSalesRaw = new MqmsSalesRaw();
                    Class cls = mqmsSalesRaw.getClass();
                    Field[] fields = cls.getDeclaredFields();
                    for (int j = 2; j < fields.length-3; j++) {
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

