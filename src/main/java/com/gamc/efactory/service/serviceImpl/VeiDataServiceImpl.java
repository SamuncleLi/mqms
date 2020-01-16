package com.gamc.efactory.service.serviceImpl;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.gamc.efactory.dao.MqmsVoucherMapper;
import com.gamc.efactory.dao.MqmsVoucherRawMapper;
import com.gamc.efactory.model.dataObject.MqmsVoucher;
import com.gamc.efactory.model.dataObject.MqmsVoucherRaw;
import com.gamc.efactory.service.VeiDataService;
import com.gamc.efactory.util.AttDateUtil;
import com.gamc.efactory.util.ExcelUtil;
import com.gamc.efactory.util.MqmsUnit;
import com.gamc.efactory.util.RangeResultUtil;
import com.sun.xml.internal.ws.developer.Serialization;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zeho Lee on 2020/1/3.
 */
@Service
public class VeiDataServiceImpl implements VeiDataService {
    @Autowired
    private MqmsVoucherRawMapper mqmsVoucherRawMapper;
    @Autowired
    private MqmsVoucherMapper mqmsVoucherMapper;
    Logger logger = LoggerFactory.getLogger(VeiDataServiceImpl.class);
    public boolean batchImport(String fileName, MultipartFile file){
        try{
            if (fileName.endsWith(".xlsx")) {
                List<MqmsVoucherRaw> mqmsVoucherRawList = new ArrayList<>();
                List<MqmsVoucher> mqmsVoucherList = new ArrayList<>();
                // 说明是xlsx文件,不过这里最好限制一下
                List<List<String>> result = ExcelUtil.importXlsx(file.getInputStream());
                //第0行为表头
                for (int i=1; i<result.size();i++ ){
                    List<String> rowData = result.get(i);

                    //利用反射遍历对属性赋值
                    MqmsVoucherRaw mqmsVoucherRaw = new MqmsVoucherRaw();
                    Class cls = mqmsVoucherRaw.getClass();
                    Field[] fields = cls.getDeclaredFields();
                    for(int j=2;j<fields.length;j++){
                        Field f = fields[j];
                        f.setAccessible(true);
                        if(f.getType().equals(String.class)){
                            f.set(mqmsVoucherRaw, rowData.get(j-2));
                        }
                        else if(f.getType().equals(BigDecimal.class)){

                            f.set(mqmsVoucherRaw, new BigDecimal(rowData.get(j-2)));
                        }
                        else if(f.getType().equals(Integer.class)){
                            //来自前面的坑，EXCEL导出整数变成字符多了小数点，例2838(Int),2838.0(String)
                            String str=rowData.get(j-2);
                            if(str.contains(".")) {
                                int indexOf = str.indexOf(".");
                                str = str.substring(0, indexOf);
                            }
                            f.set(mqmsVoucherRaw, Integer.parseInt(str));
//                            System.out.println("属性名:" + f.getName() + " 属性值:" + f.get(mqmsVoucherRaw));
                        }
                    }
                    mqmsVoucherRawList.add(mqmsVoucherRaw);
                    //相同属性复制，避免重复性Get/Set
                    MqmsVoucher mqmsVoucher = new MqmsVoucher();
                    BeanUtils.copyProperties(mqmsVoucherRaw,mqmsVoucher);

                    int salesFailureMonths= MqmsUnit.getMonth(mqmsVoucher.getSalesDate(),mqmsVoucher.getFailureDate());
                    int offlineFailureMonths=MqmsUnit.getMonth(mqmsVoucher.getOfflineDate(),mqmsVoucher.getConfirmDate());
                    mqmsVoucher.setSalesFailureTime(salesFailureMonths);
                    mqmsVoucher.setOfflineFailureTime(offlineFailureMonths);
                    mqmsVoucher.setMileageDistribution(RangeResultUtil.rangeResult(mqmsVoucher.getMileage(),5000,100000));
                    String[] dateTime=mqmsVoucher.getFailureDate().split("-");
                    mqmsVoucher.setFailureYear(dateTime[0]);
                    mqmsVoucher.setFailureMonth(dateTime[1]);
                    Map<String, String> map = new HashMap();
                    map=MqmsUnit.getWeekDate(mqmsVoucher.getUpdateTime());
                    mqmsVoucher.setUpdateTime(map.get("weekBegin")+"~"+map.get("weekBegin"));
                    mqmsVoucherList.add(mqmsVoucher);

                }
                    for(MqmsVoucherRaw mqmsVoucherRawRecord:mqmsVoucherRawList){
                    mqmsVoucherRawMapper.insertMqmsVoucherRaw(mqmsVoucherRawRecord);
                }
                for(MqmsVoucher mqmsVoucherRecord:mqmsVoucherList){
                    mqmsVoucherMapper.insertMqmsVoucher(mqmsVoucherRecord);
                }


            }
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }
}
