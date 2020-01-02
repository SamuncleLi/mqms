package com.gamc.efactory.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gamc.efactory.dao.HistoryStorageMapper;
import com.gamc.efactory.dao.StorageTargetMapper;
import com.gamc.efactory.model.dataObject.HistoryStorage;
import com.gamc.efactory.model.dataObject.StorageTarget;
import com.gamc.efactory.util.AttDateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Zeho Lee on 2019/9/6.
 * 专用于图表分析的控制器
 * 几个问题
 * 1.结算时间是什么时候，例如7月库存金额按7月1日算还是按7月31日算,是否需要制作定时器每天计算库存，如果每天计算库存万一关机了怎么办
 * 2.结算后是否锁定
 *
 */
@RestController
@RequestMapping(value = "analysis")
public class AnalysisController {
    @Autowired
    StorageTargetMapper storageTargetMapper;
    @Autowired
    HistoryStorageMapper historyStorageMapper;
    /**
     * @描述 库存金额堆叠柱状图
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2019/9/6
     * @参变量
     * @返回
     * @抛出异常
    */
    @RequestMapping(value="money_amount_stack")
    public JSONObject moneyAmountStack(@RequestParam(value = "yearAndMonth")String yearAndMonth){
        JSONObject result = new JSONObject();
        String year = yearAndMonth.split("-")[0];
        String month = yearAndMonth.split("-")[1];

        //获取往月库存金额（按种类）
        HistoryStorage historyStorage = new HistoryStorage();
        historyStorage.setYear(year);
        List<HistoryStorage> historyStorageList =  historyStorageMapper.queryHistoryStorage(historyStorage);

        //组合成前端需要的数据
        //获取所有分类
        HashSet<String> materialTypeSet = new HashSet<>();
        for(HistoryStorage his:historyStorageList){
            materialTypeSet.add(his.getMaterialType());
        }
        result.put("legend", materialTypeSet);
        //获取x坐标轴值
        List<String> xAxisList = new ArrayList<>();
        xAxisList.add(year+"年财务目标");
        xAxisList.add(year+"年内控目标");
        for(int i=1;i<=Integer.parseInt(month,10);i++){
            xAxisList.add(i + "月实际");
        }
        result.put("xAxis", xAxisList);

        //财务目标、内控目标、各月数据
        List<BigDecimal> monthlyStorageOfAllType = new ArrayList<>(Integer.parseInt(month,10)+2);
        for(int i=0;i<Integer.parseInt(month,10)+2;i++){
            monthlyStorageOfAllType.add(new BigDecimal("0.0"));
        }

        //按类别获取数据
        List<List<BigDecimal>> monthlyStorage = new ArrayList<>();

        //获取各类别数据
        for(String materialType:materialTypeSet){
            //先获取总目标
            List<BigDecimal> allDataOfMaterialType = new ArrayList<>();
            //获取财务库存金额目标
            StorageTarget storageTargetOfMaterialType = new StorageTarget();
            storageTargetOfMaterialType.setYear(year);
            storageTargetOfMaterialType.setMaterialType(materialType);
            storageTargetOfMaterialType.setType("财务");
            BigDecimal financeTargetOfMaterialType = storageTargetMapper.queryStorageTargetLimit1(storageTargetOfMaterialType).getAmountTarget();
            monthlyStorageOfAllType.set(0, monthlyStorageOfAllType.get(0).add(financeTargetOfMaterialType));
            //获取内控目标
            storageTargetOfMaterialType.setType("内控");
            BigDecimal insideTargetOfMaterialType = storageTargetMapper.queryStorageTargetLimit1(storageTargetOfMaterialType).getAmountTarget();
            allDataOfMaterialType.add(financeTargetOfMaterialType);
            allDataOfMaterialType.add(insideTargetOfMaterialType);
            monthlyStorageOfAllType.set(1, monthlyStorageOfAllType.get(1).add(insideTargetOfMaterialType));

            //获取分月库存
            for(int i=1;i<=Integer.parseInt(month,10);i++){
                HistoryStorage example = new HistoryStorage();
                example.setYear(year);
                example.setMonth(AttDateUtil.formatMonth(i));
                example.setMaterialType(materialType);
                allDataOfMaterialType.add(historyStorageMapper.queryHistoryStorageLimit1(example).getMoneyAmount());
                //monthlyStorageOfAllType中的第三个数开始为各月数据
                monthlyStorageOfAllType.set(i+1, monthlyStorageOfAllType.get(i+1).add(historyStorageMapper.queryHistoryStorageLimit1(example).getMoneyAmount()));
            }
            monthlyStorage.add(allDataOfMaterialType);
        }
        //根据月份的不同数据呈现格式亦有不同，这个需要前端做，后端不管如何就只返回今年的所有数据
        //金额低于一定值不显示，这个也是前端做
        result.put("serie", monthlyStorage);
        result.put("allTypeSerie", monthlyStorageOfAllType);
        return result;
    }

    /**
     * @描述 库存金额比例图
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2019/9/6
     * @参变量
     * @返回
     * @抛出异常
    */
    @RequestMapping(value = "money_amount_pie")
    public JSONObject moneyAmountPie(@RequestParam(value = "yearAndMonth")String yearAndMonth){
        JSONObject result = new JSONObject();
        //获取本月库存金额(按种类)
        String year = yearAndMonth.split("-")[0];
        String month = yearAndMonth.split("-")[1];

        //获取往月库存金额（按种类）
        HistoryStorage historyStorage = new HistoryStorage();
        historyStorage.setYear(year);
        historyStorage.setMonth(month);
        List<HistoryStorage> historyStorageList =  historyStorageMapper.queryHistoryStorage(historyStorage);

        //组合成前端需要的数据
        //获取所有分类
        HashSet<String> materialTypeSet = new HashSet<>();
        for(HistoryStorage his:historyStorageList){
            materialTypeSet.add(his.getMaterialType());
        }
        result.put("legend", materialTypeSet);

//        //先获取总目标
//        List<BigDecimal> allDataOfMaterialType = new ArrayList<>();
//        //获取各类别数据
//        for(String materialType:materialTypeSet){
//            HistoryStorage example = new HistoryStorage();
//            example.setYear(year);
//            example.setMonth(month);
//            example.setMaterialType(materialType);
//            allDataOfMaterialType.add(historyStorageMapper.queryHistoryStorageLimit1(example).getMoneyAmount());
//        }
        result.put("data",historyStorageList);
        //获取该月各种类物料的数量
        return result;
    }

    /**
     * @描述 获取库存增加的物料类别
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2019/9/6
     * @参变量
     * @返回
     * @抛出异常
    */
    @RequestMapping(value = "storage_rise_stack")
    public JSONObject storageRiseStack(@RequestParam(value = "yearAndMonth")String yearAndMonth){
        JSONObject result = new JSONObject();
        //获取对比上月库存增加了的物料种类

        return result;
    }

    /**
     * @描述 获取库存减少的物料类别
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2019/9/6
     * @参变量
     * @返回
     * @抛出异常
    */
    @RequestMapping(value = "storage_descend_stack")
    public JSONObject storageDescendStack(@RequestParam(value = "yearAndMonth")String yearAndMonth){
        JSONObject result = new JSONObject();
        //获取对比上月库存减少了的物料种类

        return result;
    }
}
