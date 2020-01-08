package com.gamc.efactory.service.serviceImpl;


import com.gamc.efactory.dao.MqmsSalesMapper;
import com.gamc.efactory.dao.MqmsSalesRawMapper;
import com.gamc.efactory.dao.SalesRawMapper;
import com.gamc.efactory.dao.salesMapper;
import com.gamc.efactory.model.dataObject.MqmsSales;
import com.gamc.efactory.model.dataObject.MqmsSalesRaw;
import com.gamc.efactory.model.dataObject.SalesRaw;
import com.gamc.efactory.model.dataObject.sales;
import com.gamc.efactory.service.SalesService;
import com.gamc.efactory.util.ExcelUtil;
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

/**
 * Created by Jian Wang on 2020/1/5.
 */
@Service
public class SalesServiceImpl implements SalesService {
    @Autowired
    private MqmsSalesRawMapper mqmsSalesRawMapper;
    @Autowired
    private MqmsSalesMapper mqmsSalesMapper;
    Logger logger = LoggerFactory.getLogger(SalesServiceImpl.class);

    public boolean batchImport(String fileName, MultipartFile file) {
        try {
            if (fileName.endsWith(".xlsx")) {
                List<MqmsSalesRaw> mqmsSalesRawList = new ArrayList<>();
                List<MqmsSales> mqmsSalesList= new ArrayList<>();
                // 说明是xlsx文件,不过这里最好限制一下
                List<List<String>> result = ExcelUtil.importXlsx(file.getInputStream());
                //第0行为表头
                for (int i = 1; i < result.size(); i++) {
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
                    String factoryCode="";
                    if(mqmsSales.getVinCode().length()<=3)
                    {
                        factoryCode=mqmsSales.getVinCode().toString();
                    }
                    else {
                        factoryCode = mqmsSales.getVinCode().substring(0, 3);
                    }
                    mqmsSales.setFactoryCode(factoryCode);
                    String[] dateTime=mqmsSales.getSecondPinDate().split("-");
                    mqmsSales.setSalesYear(dateTime[0]);
                    mqmsSales.setSalesMonth(dateTime[1]);
                    mqmsSalesList.add(mqmsSales);

                }
                for (MqmsSalesRaw mqmsSalesRawRecord : mqmsSalesRawList) {
                    mqmsSalesRawMapper.insertMqmsSalesRaw(mqmsSalesRawRecord);
                }
                    for (MqmsSales mqmsSalesRecord : mqmsSalesList) {
                        mqmsSalesMapper.insertMqmsSales(mqmsSalesRecord);
                    }
                }
                return true;
            }
        catch(Exception e){
                e.printStackTrace();
                return false;
            }

        }
    }

