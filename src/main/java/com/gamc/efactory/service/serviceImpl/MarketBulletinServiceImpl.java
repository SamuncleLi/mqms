package com.gamc.efactory.service.serviceImpl;

import com.gamc.efactory.dao.*;
import com.gamc.efactory.model.dataObject.*;
import com.gamc.efactory.service.MarketBulletinService;
import com.gamc.efactory.util.BigExcelReader;
import com.gamc.efactory.util.StringUtil;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;

/**
 * Created by Zeho Lee on 2020/1/3.
 */
@Service
public class MarketBulletinServiceImpl implements MarketBulletinService {


    private ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("sendEmailImmediately-pool-%d").build();
    private ExecutorService executorService = new ThreadPoolExecutor(8, 20, 100, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(50), threadFactory, new ThreadPoolExecutor.AbortPolicy());
    //    int threadacCount=;
    @Autowired
    private MqmsMarketBulletinMapper mqmsMarketBulletinMapper;
    @Autowired
    private MqmsVinDecodeMapper mqmsVinDecodeMapper;
    @Autowired
    private MqmsSalesMapper mqmsSalesMapper;
    @Autowired
    private MqmsProductionMapper mqmsProductionMapper;

    Logger logger = LoggerFactory.getLogger(MarketBulletinServiceImpl.class);
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
            boolean allThreadsIsDone = ((ThreadPoolExecutor) executorService).getTaskCount()==((ThreadPoolExecutor) executorService).getCompletedTaskCount();
//                if(allThreadsIsDone){
//                   //处理内容
//                }
            while (!allThreadsIsDone) {
                allThreadsIsDone = ((ThreadPoolExecutor) executorService).getTaskCount() == ((ThreadPoolExecutor) executorService).getCompletedTaskCount();
//                    if(allThreadsIsDone){
//
// 处理内容
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//        System.out.println(((ThreadPoolExecutor)executorService).getActiveCount()+"cccccccccccccccccccccccc");
        return 1;
    }

    private void saveAll(List<List<Object>> lists, HttpServletRequest request) throws IllegalAccessException {
        try {

//            int threadacCount=((ThreadPoolExecutor)executorService).getActiveCount();
            if (lists.size() > 0&&((ThreadPoolExecutor)executorService).getActiveCount()<80) {
                List<MqmsMarketBulletin> mqmsMarketBulletinList = new ArrayList<>();
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
                User user = (User) request.getSession().getAttribute("user");
                for (int i = 1; i < lists.size(); i++) {
                    List<Object> rowData = lists.get(i);
                    //利用反射遍历对属性赋值
                    MqmsMarketBulletin mqmsMarketBulletin = new MqmsMarketBulletin();
                    Class cls = mqmsMarketBulletin.getClass();
                    Field[] fields = cls.getDeclaredFields();
                    for (int j = 2; j < fields.length - 3; j++) {
                        Field f = fields[j];
                        f.setAccessible(true);
                        if (f.getType().equals(String.class)) {
                            if (rowData.get(j - 2) != null) {
                                f.set(mqmsMarketBulletin, rowData.get(j - 2));
                            } else {
                                f.set(mqmsMarketBulletin, null);
                            }
                        } else if (f.getType().equals(BigDecimal.class)) {
                            if (rowData.get(j - 2) != null) {
                                if (StringUtil.isEmpty(rowData.get(j - 2).toString())) {
                                    f.set(mqmsMarketBulletin, new BigDecimal(0.0));
                                } else {
                                    f.set(mqmsMarketBulletin, new BigDecimal(Double.parseDouble(rowData.get(j - 2).toString())));
                                }
                            } else {
                                f.set(mqmsMarketBulletin, null);
                            }
                        } else if (f.getType().equals(Integer.class)) {
                            //来自前面的坑，EXCEL导出整数变成字符多了小数点，例2838(Int),2838.0(String)
                            if (rowData.get(j - 2) != null) {
                                String str = rowData.get(j - 2).toString();
                                if (str.contains(".")) {
                                    int indexOf = str.indexOf(".");
                                    str = str.substring(0, indexOf);
                                }
//                                System.out.println(rowData.get(j - 2));
//                                System.out.println(str);
//                                System.out.println(f.getName());
                                f.set(mqmsMarketBulletin, Integer.parseInt(str));
                            } else {
                                f.set(mqmsMarketBulletin, null);
                            }
                        }
                        mqmsMarketBulletin.setApplierId(user.getUserId());
                        mqmsMarketBulletin.setApplierName(user.getUserName());
                        mqmsMarketBulletin.setApplyTime(df.format(new Date()));
                    }

                    mqmsMarketBulletinList.add(mqmsMarketBulletin);
                }

                //使用线程池
                ImportCall importCall = new ImportCall();
                //构造函数传参
                importCall.setMqmsMarketBulletinList(mqmsMarketBulletinList);
                executorService.execute(importCall);
//                System.out.println(((ThreadPoolExecutor)executorService).getActiveCount()+"aaaaaaaaaaaaaaaaaaaaaaa");
            }

            boolean allThreadsIsUse=((ThreadPoolExecutor) executorService).getActiveCount()<((ThreadPoolExecutor) executorService).getMaximumPoolSize()-1;
            while (!allThreadsIsUse) {
                allThreadsIsUse=((ThreadPoolExecutor) executorService).getActiveCount()<((ThreadPoolExecutor) executorService).getMaximumPoolSize()-1;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private class ImportCall implements Runnable {
        //构造函数传递参数
        private List<MqmsMarketBulletin> mqmsMarketBulletinList;

        public void setMqmsMarketBulletinList(List<MqmsMarketBulletin> mqmsMarketBulletinList) {
            this.mqmsMarketBulletinList = mqmsMarketBulletinList;
        }
        //构造函数,传递session


        @Override
        public void run() {
            for (MqmsMarketBulletin mqmsMarketBulletinRecord : mqmsMarketBulletinList) {


                if (mqmsMarketBulletinRecord.getVinCode() != null) {
                    //发动机号
                    if (mqmsProductionMapper.selectInforByVin(mqmsMarketBulletinRecord.getVinCode())!=null){
                        String engType=mqmsProductionMapper.selectInforByVin(mqmsMarketBulletinRecord.getVinCode()).getEgtypeCode();
                        mqmsMarketBulletinRecord.setEngType(engType);
                    }
                    //生产日期
                    if(mqmsProductionMapper.selectInforByVin(mqmsMarketBulletinRecord.getVinCode())!=null){
                        String manufactureDate=mqmsProductionMapper.selectInforByVin(mqmsMarketBulletinRecord.getVinCode()).getPassTime();
                        mqmsMarketBulletinRecord.setManufactureDate(manufactureDate);
                    }

                    //销售日期
                    if(mqmsSalesMapper.selectByVinCode(mqmsMarketBulletinRecord.getVinCode())!=null){
                        String salesDate=mqmsSalesMapper.selectByVinCode(mqmsMarketBulletinRecord.getVinCode()).getSecondPinDate();
                        mqmsMarketBulletinRecord.setSalesDate(salesDate);
                    }
                    //短码
                    mqmsMarketBulletinRecord.setShortCode(mqmsMarketBulletinRecord.getVinCode().substring(3,5));
                    //变速箱类别
                    mqmsMarketBulletinRecord.setTransCategory(mqmsMarketBulletinRecord.getVinCode().substring(6,7));
                    //机型、车型及变速箱类型
                    String vinShortCode = mqmsMarketBulletinRecord.getVinCode().substring(0, 5);
                    if(mqmsVinDecodeMapper.vinDecode(vinShortCode)!=null){
                        mqmsMarketBulletinRecord.setEngType(mqmsVinDecodeMapper.vinDecode(vinShortCode).getVinEngType());
                        mqmsMarketBulletinRecord.setCarModel(mqmsVinDecodeMapper.vinDecode(vinShortCode).getVinCarType());
                        mqmsMarketBulletinRecord.setTransType(mqmsVinDecodeMapper.vinDecode(vinShortCode).getVinTransmType());
                    }
                }


                mqmsMarketBulletinMapper.insertMqmsMarketBulletin(mqmsMarketBulletinRecord);
            }
//            System.out.println(((ThreadPoolExecutor)executorService).getActiveCount()+"bbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        }
    }
}