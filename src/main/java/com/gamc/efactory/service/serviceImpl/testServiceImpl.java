package com.gamc.efactory.service.serviceImpl;

import com.gamc.efactory.dao.MqmsSalesMapper;
import com.gamc.efactory.dao.MqmsSalesRawMapper;
import com.gamc.efactory.model.dataObject.MqmsSales;
import com.gamc.efactory.model.dataObject.MqmsSalesRaw;
import com.gamc.efactory.service.TestService;
import com.gamc.efactory.util.BigExcelReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ExecutionException;

/**
 * Created by UZI on 2020/3/5.
 */
@Service
public class testServiceImpl implements TestService {
    @Autowired
    private MqmsSalesRawMapper mqmsSalesRawMapper;
    @Autowired
    private MqmsSalesMapper mqmsSalesMapper;
    Logger logger = LoggerFactory.getLogger(testServiceImpl.class);
    @Transactional
    public int addBlackLists(String file) throws ExecutionException, InterruptedException {
        try {
            System.out.println("5555555555555555555555555555555");
            BigExcelReader bigExcelReader = new BigExcelReader(file) {
                @Override
                public void outputAllRow(List<String[]> lists) throws IllegalAccessException {


                    List<List<Object>> lists1 = new LinkedList<>();
                    //执行保存
                    for(String[] row : lists){
                        Map<String, Object> map = new HashMap<String, Object>();
                        //map.put("", row);
                        List<Object> list2 = new ArrayList<>();
//                        System.out.print("[");
                        for(String cell : row){
//                            System.out.print(cell+",");
                            list2.add(cell);
                        }

                        lists1.add(list2);
                        //list2= new ArrayList<Object>();

//                        System.out.println("]");
                    }
                    saveAll(lists1);
                }
            };
            // 执行解析
            bigExcelReader.parse();
            //File files = new File(file);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return 1;

    }


    private void saveAll(List<List<Object>> lists) throws IllegalAccessException {
        if(lists.size() > 0){

            System.out.println(lists.size());
            List<MqmsSalesRaw> mqmsSalesRawList = new ArrayList<>();
            for (int i = 1; i < lists.size(); i++) {
//                System.out.println("222222222222222222222222222");
                List<Object> rowData = lists.get(i);
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

                        f.set(mqmsSalesRaw, new BigDecimal(rowData.get(j - 2).toString()));
                    } else if (f.getType().equals(Integer.class)) {
                        //来自前面的坑，EXCEL导出整数变成字符多了小数点，例2838(Int),2838.0(String
                        String str = rowData.get(j - 2).toString();
                        if (str.contains(".")) {
                            int indexOf = str.indexOf(".");
                            str = str.substring(0, indexOf);
                        }
                        f.set(mqmsSalesRaw, Integer.parseInt(str));
                    }

                }
                mqmsSalesRawList.add(mqmsSalesRaw);
            }
            for (MqmsSalesRaw mqmsSalesRawRecord : mqmsSalesRawList) {

                String vinCode=mqmsSalesRawRecord.getVinCode();
                if (vinCode!=null) {
                    int cnt = mqmsSalesRawMapper.selectByVinCode(vinCode);
                    if (cnt == 0) {
                        mqmsSalesRawMapper.insertMqmsSalesRaw(mqmsSalesRawRecord);
                    } else {
                        mqmsSalesRawMapper.updateByVinCode(mqmsSalesRawRecord);
//                        System.out.println(" 更新 "+mqmsSalesRawRecord);
                    }
                }
                else{
                    continue;
                }
            }
        }

    }


}
