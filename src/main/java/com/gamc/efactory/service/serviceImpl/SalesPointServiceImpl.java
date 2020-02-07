package com.gamc.efactory.service.serviceImpl;


import com.gamc.efactory.dao.MqmsSalesPointMapper;
import com.gamc.efactory.model.dataObject.MqmsSalesPoint;
import com.gamc.efactory.service.SalesPointService;
import com.gamc.efactory.util.ExcelUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class SalesPointServiceImpl implements SalesPointService {

    @Autowired
    private MqmsSalesPointMapper mqmsSalesPointMapper;
    Logger logger = LoggerFactory.getLogger(SalesPointServiceImpl.class);

    public boolean batchImport(String fileName, MultipartFile file) {
        try {
            if (fileName.endsWith(".xlsx")) {
                List<MqmsSalesPoint> mqmsSalesPointList= new ArrayList<>();
                // 说明是xlsx文件,不过这里最好限制一下
                List<List<String>> result = ExcelUtil.importXlsx(file.getInputStream());
                System.out.println(result);
                if (result == null) {
//                    System.out.println("88888888888888888888888888888888");
                    return false;
                }
                //第0行为表头
                for (int i = 1; i < result.size(); i++) {
                    List<String> rowData = result.get(i);
                    System.out.println(rowData);
                    //利用反射遍历对属性赋值
                    MqmsSalesPoint mqmsSalesPoint = new MqmsSalesPoint();
                    Class cls = mqmsSalesPoint.getClass();
                    Field[] fields = cls.getDeclaredFields();
//                    System.out.println(fields.length+"111111111111111111");
                    for (int j = 2; j < fields.length; j++) {
                        Field f = fields[j];
                        f.setAccessible(true);
                        if (f.getType().equals(String.class)) {
                            f.set(mqmsSalesPoint, rowData.get(j - 2));
                        } else if (f.getType().equals(BigDecimal.class)) {

                            f.set(mqmsSalesPoint, new BigDecimal(rowData.get(j - 2)));
                        } else if (f.getType().equals(Integer.class)) {
                            //来自前面的坑，EXCEL导出整数变成字符多了小数点，例2838(Int),2838.0(String
                            String str = rowData.get(j - 2);
                            if (str.contains(".")) {
                                int indexOf = str.indexOf(".");
                                str = str.substring(0, indexOf);
                            }
                            f.set(mqmsSalesPoint, Integer.parseInt(str));
                        }
                    }
                    mqmsSalesPointList.add(mqmsSalesPoint);
                    //相同属性复制



                }
                for (MqmsSalesPoint mqmsSalesPointRecord : mqmsSalesPointList) {
                    mqmsSalesPointMapper.insertMqmsSalesPoint(mqmsSalesPointRecord);
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

