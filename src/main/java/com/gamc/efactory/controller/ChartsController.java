package com.gamc.efactory.controller;

import com.alibaba.fastjson.JSONArray;
import com.gamc.efactory.dao.DictMapper;
import com.gamc.efactory.dao.MqmsSalesMapper;
import com.gamc.efactory.dao.MqmsVoucherMapper;
import com.gamc.efactory.util.MqmsUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by Zeho Lee on 2020/1/8.
 * 图表
 */
@RestController
@RequestMapping("charts")
public class ChartsController {
    /**
     * @描述 计算发动机不良率
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2020/1/9
     * @参变量
     * @返回
     * @抛出异常
    */
    @Autowired
    MqmsVoucherMapper mqmsVoucherMapper;
    @Autowired
    MqmsSalesMapper mqmsSalesMapper;
    @RequestMapping("engineFailureRate")
    public String[][] calculateEngineFailureRate(@RequestParam String yearAndMonth, @RequestParam String timeSpan, @RequestParam String engTypes) {
//        System.out.println(yearAndMonth + timeSpan + engType);

        String[] engTypeAssemble = engTypes.split(",");
//        System.out.println(engTypeAssemble.length);
        String[][] strArray=new String[engTypeAssemble.length+1][Integer.parseInt(timeSpan)+1];
        strArray[0][0]="机型";
        for (int j = 0; j < Integer.parseInt(timeSpan); j++) {
            for (int i = 0; i < engTypeAssemble.length; i++) {
                int thisEngtypeCount = mqmsVoucherMapper.selectEngTypeCount(engTypeAssemble[i], yearAndMonth);
//                System.out.println(thisEngtypeCount);
                int secondPinData = mqmsSalesMapper.selectSecondSalesCount(engTypeAssemble[i], yearAndMonth);
//                System.out.println(secondPinData);
                float unqualifiedRate = (float) thisEngtypeCount / secondPinData;
                DecimalFormat df = new DecimalFormat("0.00");//格式化小数
                String strUnqualifiedRate = df.format(unqualifiedRate * 100);//返回一个String类型的两位小数
                System.out.println(strUnqualifiedRate);
                strArray[0][j+1]=yearAndMonth;
                strArray[i+1][0]=engTypeAssemble[i];
                strArray[i+1][j+1]=strUnqualifiedRate;

            }
            yearAndMonth= MqmsUnit.getDateInfor("yyyy-MM",yearAndMonth,1);
//            System.out.println(yearAndMonth);
//            String[][] strArray = {{"机型", "2012-01", "2012-02", "2012-03", "2012-04", "2012-05", "2012-06"},
//                    {"151", "41.1", "30.4", "65.1", "53.3", "83.8", "98.7"},
//                    {"153", "86.5", "92.1", "85.7", "83.1", "73.4", "55.1"},
//                    {"131", "24.1", "67.2", "79.5", "86.4", "65.2", "82.5"},
//                    {"204", "55.2", "67.1", "69.2", "72.4", "53.9", "39.1"}};

    }
        return strArray;
}

    /**
     * @描述 计算变速箱不良率
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2020/1/9
     * @参变量
     * @返回
     * @抛出异常
    */
    @RequestMapping("transmissionFailureRate")
    public String[][] calculateTransmissionFailureRate(@RequestParam String yearAndMonth, @RequestParam String timeSpan, @RequestParam String engTypes){
        String[][] array = {{"机型", "2012", "2013", "2014", "2015", "2016", "2017"},
                {"151", "41.1", "30.4", "65.1", "53.3", "83.8", "98.7"},
                {"153", "86.5", "92.1", "85.7", "83.1", "73.4", "55.1"},
                {"131", "24.1", "67.2", "79.5", "86.4", "65.2", "82.5"},
                {"204", "55.2", "67.1", "69.2", "72.4", "53.9", "39.1"}};
        return array;
    }
    /**
     * @描述 单台索赔
     * @编写人
     * @邮箱
     * @日期 2020/1/12
     * @参变量
     * @返回
     * @抛出异常
     */
    @RequestMapping("singleClaimRate")
    public String[][] calculateSingleClaimRate(@RequestParam String yearAndMonth, @RequestParam String timeSpan, @RequestParam String engTypes){
        String[] engTypeAssemble = engTypes.split(",");
        String[][] strArray=new String[engTypeAssemble.length+1][Integer.parseInt(timeSpan)+1];
        strArray[0][0]="机型";
        BigDecimal singleClaimTotalCost;
        int ClaimTotalCost=0;
        int secondPinData=0;
        yearAndMonth= MqmsUnit.getDateInfor("yyyy-MM",yearAndMonth,-Integer.parseInt(timeSpan));
        System.out.println(yearAndMonth);
        for (int j = 0; j < Integer.parseInt(timeSpan); j++) {
            for (int i = 0; i < engTypeAssemble.length; i++) {
                singleClaimTotalCost = mqmsVoucherMapper.selectTotalCost(engTypeAssemble[i], yearAndMonth);
                System.out.println(singleClaimTotalCost);
                ClaimTotalCost=singleClaimTotalCost.intValue()+ClaimTotalCost;
//                System.out.println(thisEngtypeCount);
                 secondPinData = mqmsSalesMapper.selectSecondSalesCount(engTypeAssemble[i], yearAndMonth)+secondPinData;
//                System.out.println(secondPinData);
                float unqualifiedRate = (float) ClaimTotalCost / secondPinData;
                DecimalFormat df = new DecimalFormat("0.00");//格式化小数
                String strUnqualifiedRate = df.format(unqualifiedRate * 100);//返回一个String类型的两位小数
                System.out.println(strUnqualifiedRate);
                strArray[0][j+1]=yearAndMonth;
                strArray[i+1][0]=engTypeAssemble[i];
                strArray[i+1][j+1]=strUnqualifiedRate;

            }
            yearAndMonth= MqmsUnit.getDateInfor("yyyy-MM",yearAndMonth,1);


        }
        System.out.println(strArray);
        return strArray;
    }
}
