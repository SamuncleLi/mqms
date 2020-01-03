package com.gamc.efactory.service.serviceImpl;

import com.gamc.efactory.controller.WarehousingController;
import com.gamc.efactory.model.dataObject.VoucherRaw;
import com.gamc.efactory.service.VeiDataService;
import com.gamc.efactory.util.ExcelUtil;
import com.sun.xml.internal.ws.developer.Serialization;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Zeho Lee on 2020/1/3.
 */
@Service
public class VeiDataServiceImpl implements VeiDataService {
    Logger logger = LoggerFactory.getLogger(VeiDataServiceImpl.class);
    public boolean batchImport(String fileName, MultipartFile file){
        try{
            if (fileName.endsWith(".xlsx")) {
                // 说明是xlsx文件,不过这里最好限制一下
                List<List<String>> result = ExcelUtil.importXlsx(file.getInputStream());
                //第0行为表头
                for (int i=1; i<result.size();i++ ){
                    List<String> rowData = result.get(i);

                    //利用反射遍历对属性赋值
                    VoucherRaw voucherRaw = new VoucherRaw();
                    Class cls = voucherRaw.getClass();
                    Field[] fields = cls.getDeclaredFields();
                    for(int j=0;j<fields.length;j++){
                        Field f = fields[j];
                        f.setAccessible(true);
                        if(f.getType().equals(String.class)){
                            f.set(voucherRaw, rowData.get(j-2));
                        }
                        else if(f.getType().equals(BigDecimal.class)){
                            f.set(voucherRaw, new BigDecimal(rowData.get(j-2)));
                        }
                        System.out.println("属性名:" + f.getName() + " 属性值:" + f.get(voucherRaw));
                    }
                }

            }
            return true;
        }
        catch (Exception e){
            return false;
        }

    }
}
