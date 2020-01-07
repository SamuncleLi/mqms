package com.gamc.efactory.service.serviceImpl;


import com.gamc.efactory.dao.SalesRawMapper;
import com.gamc.efactory.dao.salesMapper;
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
    private salesMapper salesMapper;
    @Autowired
    private SalesRawMapper salesRawMapper;
    Logger logger = LoggerFactory.getLogger(SalesServiceImpl.class);

    public boolean batchImport(String fileName, MultipartFile file) {
        try {
            if (fileName.endsWith(".xlsx")) {
                List<sales> salesList = new ArrayList<>();
                List<SalesRaw> salesRawList= new ArrayList<>();
                // 说明是xlsx文件,不过这里最好限制一下
                List<List<String>> result = ExcelUtil.importXlsx(file.getInputStream());
                //第0行为表头
                for (int i = 1; i < result.size(); i++) {
                    List<String> rowData = result.get(i);

                    //利用反射遍历对属性赋值
                    sales sales = new sales();
                    Class cls = sales.getClass();
                    Field[] fields = cls.getDeclaredFields();
                    for (int j = 2; j < fields.length; j++) {
                        Field f = fields[j];
                        f.setAccessible(true);
                        if (f.getType().equals(String.class)) {
                            f.set(sales, rowData.get(j - 2));
                        } else if (f.getType().equals(BigDecimal.class)) {

                            f.set(sales, new BigDecimal(rowData.get(j - 2)));
                        } else if (f.getType().equals(Integer.class)) {
                            //来自前面的坑，EXCEL导出整数变成字符多了小数点，例2838(Int),2838.0(String
                            String str = rowData.get(j - 2);
                            if (str.contains(".")) {
                                int indexOf = str.indexOf(".");
                                str = str.substring(0, indexOf);
                            }
                            f.set(sales, Integer.parseInt(str));
                        }
                    }
                    salesList.add(sales);
                    //相同属性复制，避免重复性Get/Set
                    SalesRaw salesRaw = new SalesRaw();
                    BeanUtils.copyProperties(sales, salesRaw);
                    String factoryCode="";
                    if(salesRaw.getVinCode().length()<=3)
                    {
                        factoryCode=salesRaw.getVinCode().toString();
                    }
                    else {
                        factoryCode = salesRaw.getVinCode().substring(0, 3);
                    }
                    salesRaw.setFactoryCode(factoryCode);
                    String[] dateTime=salesRaw.getSecondPinDate().split("-");
                    salesRaw.setSalesYear(dateTime[0]);
                    salesRaw.setSalesMonth(dateTime[1]);
                    salesRawList.add(salesRaw);

                }
                for (sales salesRecord : salesList) {
                    salesMapper.insertsales(salesRecord);
                }
                    for (SalesRaw salesRawRecord : salesRawList) {
                        salesRawMapper.insertSalesRaw(salesRawRecord);
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

