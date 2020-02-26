package com.gamc.efactory.controller;

import com.gamc.efactory.dao.MqmsSalesMapper;
import com.gamc.efactory.dao.MqmsVoucherMapper;
import com.gamc.efactory.model.dataObject.MqmsVoucher;
import com.gamc.efactory.model.viewObject.FailureTop10;
import com.gamc.efactory.model.viewObject.TransmissionProportion;
import com.gamc.efactory.util.MqmsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;
import java.util.List;

/**
 * Created by Zeho Lee on 2020/1/8.
 * 图表
 */
@RestController
@RequestMapping("/charts")
public class ChartsController {
    @Autowired
    MqmsVoucherMapper mqmsVoucherMapper;
    @Autowired
    MqmsSalesMapper mqmsSalesMapper;
    /**
     * @描述 计算发动机不良率
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2020/1/9
     * @参变量
     * @返回
     * @抛出异常
    */
    @RequestMapping("engineFailureRate")
    public String[][] calculateEngineFailureRate(@RequestParam String yearAndMonth, @RequestParam String timeSpan, @RequestParam String engType){
        //分离机型
        String[] engTypeAssemble = engType.split(",");
        //创建二维数组
        String[][] strArray=new String[engTypeAssemble.length+1][Integer.parseInt(timeSpan)+1];
        strArray[0][0]="机型";
        for (int i = 0; i < engTypeAssemble.length; i++) {
            //单机型初始化信息
            String yearAndMonthBegin= MqmsUtil.getDateInfor("yyyy-MM",yearAndMonth,-Integer.parseInt(timeSpan)+1);
            int thisEngtypeCount=0;
            int secondPinData=0;
            float unqualifiedRate=0;
            //单机型循环叠加计算不良率
            for (int j = 0; j < Integer.parseInt(timeSpan); j++) {
                thisEngtypeCount = mqmsVoucherMapper.selectEngTypeCount(engTypeAssemble[i], yearAndMonthBegin)+thisEngtypeCount;
                secondPinData = mqmsSalesMapper.selectSecondSalesCount(engTypeAssemble[i], yearAndMonthBegin)+secondPinData;
                strArray[0][j+1]=yearAndMonthBegin;
                if(secondPinData==0)
                {
                    unqualifiedRate=0;
                }
                else{
                    unqualifiedRate=(float) thisEngtypeCount / secondPinData;
                }
                DecimalFormat df = new DecimalFormat("0.00");//格式化小数
                String strUnqualifiedRate = df.format(unqualifiedRate * 100);//返回一个String类型的两位小数
                System.out.println(strUnqualifiedRate);
                strArray[i+1][j+1]=strUnqualifiedRate;
                //月份推移
                yearAndMonthBegin= MqmsUtil.getDateInfor("yyyy-MM",yearAndMonthBegin,1);
            }
            strArray[i+1][0]=engTypeAssemble[i];
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
    public String[][] calculateTransmissionFailureRate(@RequestParam String yearAndMonth, @RequestParam String timeSpan, @RequestParam String engType){
        String[][] array = {{"机型", "2012", "2013", "2014", "2015", "2016", "2017"},
                {"151", "41.1", "30.4", "65.1", "53.3", "83.8", "98.7"},
                {"153", "86.5", "92.1", "85.7", "83.1", "73.4", "55.1"},
                {"131", "24.1", "67.2", "79.5", "86.4", "65.2", "82.5"},
                {"204", "55.2", "67.1", "69.2", "72.4", "53.9", "39.1"}};
        return array;
    }

    /**
     * @描述 计算发动机的搭配的各种变速箱的数量
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2020/1/13
     * @参变量
     * @返回
     * @抛出异常
    */
    @RequestMapping("/eng/tranPie")
    public String[][] calTransmissionProportion(MqmsVoucher mqmsVoucher){
        String[] engType = {"变速箱类型", "数量"};

        //计算该种发动机机型的不同变速箱数量
        List<TransmissionProportion> list = mqmsVoucherMapper.calTransmissionProportion(mqmsVoucher);

        String[][] array = new String[list.size()+1][2];
        array[0] = engType;
        for(int i=0;i<list.size();i++){
            array[i+1][0] = list.get(i).getTransmissionCodeRe();
            array[i+1][1] = String.valueOf(list.get(i).getNumber());
        }
        return array;
    }

    /**
     * @描述 计算故障发动机的售出时间分布
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2020/1/13
     * @参变量
     * @返回
     * @抛出异常
     */
    @RequestMapping("/eng/salesFailureTime")
    public String[][] calOfflineFailureTime(@RequestParam String yearAndMonth, @RequestParam int timeSpan, @RequestParam(required = false) String engType){
        //计算横坐标
        String[] xAxis = {};
        String[][] array = new String[2][xAxis.length + 1];
        array[0][0] = "售出时间";
        array[1][0] = "台数";
        for(int i=0;i<xAxis.length;i++){
            //计算数量
//            MqmsVoucher mqmsVoucher = MqmsVoucher.QueryBuild().engType(engType).rightFuzzySalesDate();
//            List<MqmsVoucher> list = mqmsVoucherMapper.queryMqmsVoucher(mqmsVoucher);
        }
        return array;
    }

    /**
     * @描述 计算6个月，12个月，24个月，36个月的索赔金额
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2020/1/13
     * @参变量
     * @返回
     * @抛出异常
    */
    @RequestMapping("/eng/calClaimIndenity")
    public String[][] calClaimIndenity(){
        String[][] array = {{}};
        return array;
    }

    /**
     * @描述 数量前10的故障
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2020/1/13
     * @参变量
     * @返回
     * @抛出异常
    */
    @RequestMapping("/eng/failureTop10")
    public String[][] failureTop10(MqmsVoucher mqmsVoucher){
        //计算该种发动机机型的不同变速箱数量
        List<FailureTop10> list = mqmsVoucherMapper.failureTop10(mqmsVoucher);

        //1,2,3行分别为ENG整理条目，各条目的数量，累计不良率
        String[][] array = new String[3][list.size()+1];
        //该eng整理下的vei总数
        int total = mqmsVoucherMapper.queryMqmsVoucher(mqmsVoucher).size();
        int sum = 0;
        array[0][0] = "ENG整理";
        array[1][0] = "汇总";
        array[2][0] = "累计不良率";
        for(int i=0;i<list.size();i++){
            array[0][i+1] = list.get(i).getEngArrange();
            sum += list.get(i).getNumber();
            array[1][i+1] = String.valueOf(list.get(i).getNumber());
            array[2][i+1] = String.valueOf(sum * 100.0 / total) + "%";
        }
        return array;
    }

    /**
     * @描述 索赔发动机（上了市场报告的）数量
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2020/1/13
     * @参变量
     * @返回
     * @抛出异常
    */
    public String[][] reportedFailure(){
        String[][] array = {{}};
        return array;
    }
}
