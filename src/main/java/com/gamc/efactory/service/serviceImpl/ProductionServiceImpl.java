package com.gamc.efactory.service.serviceImpl;

import com.gamc.efactory.dao.*;
import com.gamc.efactory.model.dataObject.*;
import com.gamc.efactory.service.ProductionService;
import com.gamc.efactory.service.VeiDataService;
import com.gamc.efactory.util.AttDateUtil;
import com.gamc.efactory.util.ExcelUtil;
import com.gamc.efactory.util.RangeResultUtil;
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

/**
 * Created by Jian Wang on 2020/1/5.
 */
@Service
public class ProductionServiceImpl implements ProductionService {
    @Autowired
    private MqmsProductionRawMapper mqmsProductionRawMapper;
    @Autowired
    private MqmsProductionMapper mqmsProductionMapper;
    Logger logger = LoggerFactory.getLogger(ProductionServiceImpl.class);

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
                    String shortCode="";
                    if(mqmsProduction.getVin().length()<=5)
                    {
                        shortCode=mqmsProduction.getVin().toString();
                    }
                    else {
                        shortCode = mqmsProduction.getVin().substring(0, 5);
                    }
                    mqmsProduction.setShortCode(shortCode);
                    mqmsProductionList.add(mqmsProduction);

                }
                for (MqmsProductionRaw mqmsProductionRawRecord : mqmsProductionRawList) {
                    mqmsProductionRawMapper.insertMqmsProductionRaw(mqmsProductionRawRecord);
                }
                    for (MqmsProduction mqmsProductionRecord : mqmsProductionList) {
                        mqmsProductionMapper.insertMqmsProduction(mqmsProductionRecord);
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

