package com.gamc.efactory.controller;

import com.gamc.efactory.dao.MqmsCarTypeInforMapper;
import com.gamc.efactory.dao.MqmsFailureReportMapper;
import com.gamc.efactory.dao.MqmsSalesMapper;
import com.gamc.efactory.dao.MqmsVoucherMapper;
import com.gamc.efactory.model.dataObject.MqmsCarTypeInfor;
import com.gamc.efactory.model.dataObject.MqmsVoucher;
import com.gamc.efactory.model.viewObject.FailureTop10;
import com.gamc.efactory.model.viewObject.TransmissionProportion;
import com.gamc.efactory.util.MqmsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

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
    @Autowired
    MqmsFailureReportMapper mqmsFailureReportMapper;
    @Autowired
    MqmsCarTypeInforMapper mqmsCarTypeInforMapper;
    /**
     * @描述 计算发动机不良率
     * @编写人 Jian Wang
     * @邮箱 798846080@qq.com
     * @日期 2020/3/3
     * @参变量
     * @返回
     * @抛出异常
     */
    @RequestMapping("engineFailureRate")
    public String[][] calculateEngineFailureRate(@RequestParam String yearAndMonth, @RequestParam String timeSpan, @RequestParam String engType, @RequestParam int monthType){
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
                String beginData=MqmsUtil.getDateInfor("yyyy-MM",yearAndMonthBegin,-monthType+1);
                String endData=MqmsUtil.getDateInfor("yyyy-MM",beginData,+monthType);
                thisEngtypeCount = mqmsVoucherMapper.selectClaimCount(engTypeAssemble[i], beginData,endData);
                secondPinData = mqmsSalesMapper.selectSecondSalesCount(engTypeAssemble[i], beginData,endData);
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
//                System.out.println(strUnqualifiedRate);
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
     * @编写人 Jian Wang
     * @邮箱 798846080@qq.com
     * @日期 2020/3/3
     * @参变量
     * @返回
     * @抛出异常
     */
    @RequestMapping("transmissionFailureRate")
    public String[][] calculateTransmissionFailureRate(@RequestParam String yearAndMonth, @RequestParam String timeSpan, @RequestParam String transType,@RequestParam int monthType){
        //分离机型
        String[] engTypeAssemble = transType.split(",");
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
                String beginData=MqmsUtil.getDateInfor("yyyy-MM",yearAndMonthBegin,-monthType+1);
                String endData=MqmsUtil.getDateInfor("yyyy-MM",beginData,monthType);
                thisEngtypeCount = mqmsVoucherMapper.selectTransClaimCount(engTypeAssemble[i], beginData,endData);
                secondPinData = mqmsSalesMapper.selectTranSecondSalesCount(engTypeAssemble[i], beginData,endData);
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
//                System.out.println(strUnqualifiedRate);
                strArray[i+1][j+1]=strUnqualifiedRate;
                //月份推移
                yearAndMonthBegin= MqmsUtil.getDateInfor("yyyy-MM",yearAndMonthBegin,1);
            }
            strArray[i+1][0]=engTypeAssemble[i];
        }
        return strArray;
    }
    /**
     * @描述 计算累计不良率
     * @编写人 Jian Wang
     * @邮箱 798846080@qq.com
     * @日期 2020/4/3
     * @参变量
     * @返回
     * @抛出异常
     */
    @RequestMapping("carMutilFailureRate")
    public String[][] calculateCarMutilFailureRate(@RequestParam String carType, @RequestParam String carInfor) throws Exception {
        String manufactureDate=carInfor.substring(0,7);
        String[] allManuDate=mqmsCarTypeInforMapper.searchNextDate(carType);
        String nextDate="";
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");//设置日期格式

        if (!Objects.equals(manufactureDate, allManuDate[0])&&allManuDate.length>1){
            for(int j=1;j<allManuDate.length;j++){
                if (Objects.equals(allManuDate[j], manufactureDate)){
                    nextDate=allManuDate[j-1];
                }
            }
        }
        else{
            nextDate=df.format(new Date());
//            System.out.println(nextDate+"1222221111111111111111111111111113");
        }
        int monthNum=MqmsUtil.getMonth(manufactureDate,nextDate);
        //创建二维数组
        String[][] strArray=new String[2][monthNum+1];
        strArray[0][0]="月份";
        strArray[1][0]="累计不良率";
//        for (int i = 0; i < monthNum; i++) {
//            //单机型初始化信息
//            String yearAndMonthBegin= MqmsUtil.getDateInfor("yyyy-MM",yearAndMonth,-Integer.parseInt(timeSpan)+1);
        int thisEngtypeCount=0;
        int secondPinData=0;
        float unqualifiedRate=0;
//            //单机型循环叠加计算不良率
        String beginData=manufactureDate;
        for (int i = 0; i < monthNum; i++) {

            String endData=MqmsUtil.getDateInfor("yyyy-MM",beginData,i+1);
            thisEngtypeCount = mqmsVoucherMapper.selectCarMutilMount(carType, beginData,endData);
            secondPinData = mqmsSalesMapper.selectCarMutilSalesCount(carType, beginData,endData,nextDate);
            strArray[0][i+1]=Integer.toString(i+1);
            if(secondPinData==0)
            {
                unqualifiedRate=0;
            }
            else{
                unqualifiedRate=(float) thisEngtypeCount / secondPinData;
            }
            DecimalFormat dlf = new DecimalFormat("0.00");//格式化小数
            String strUnqualifiedRate = dlf.format(unqualifiedRate * 100);//返回一个String类型的两位小数
            strArray[1][i+1]=strUnqualifiedRate;
        }
        return strArray;
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
    public String[][] calOfflineFailureTime(@RequestParam String yearAndMonth, @RequestParam(required = false) String engType){
        //计算横坐标
        String[] xAxis = {"售出时间", "0-6","7-12","13-24","25-36","36+"};
        String[][] array = new String[2][xAxis.length];
        array[0] = xAxis;
        array[1][0] = "台数";

        //时间推移，分为0-6个月，7-12个月，13-24个月，24-36个月，大于36个月
        String timeSymbol6 = MqmsUtil.getDateInfor("yyyy-MM",yearAndMonth,-6);
        String timeSymbol12 = MqmsUtil.getDateInfor("yyyy-MM",yearAndMonth,-12);
        String timeSymbol24 = MqmsUtil.getDateInfor("yyyy-MM",yearAndMonth,-24);
        String timeSymbol36 = MqmsUtil.getDateInfor("yyyy-MM",yearAndMonth,-36);
        String timeSymbol1000 = MqmsUtil.getDateInfor("yyyy-MM",yearAndMonth,-1000);

        array[1][1] = String.valueOf(mqmsVoucherMapper.salesFailureTimeBetween(engType, timeSymbol6, yearAndMonth));
        array[1][2] = String.valueOf(mqmsVoucherMapper.salesFailureTimeBetween(engType, timeSymbol12, yearAndMonth));
        array[1][3] = String.valueOf(mqmsVoucherMapper.salesFailureTimeBetween(engType, timeSymbol24, yearAndMonth));
        array[1][4] = String.valueOf(mqmsVoucherMapper.salesFailureTimeBetween(engType, timeSymbol36, yearAndMonth));
        array[1][5] = String.valueOf(mqmsVoucherMapper.salesFailureTimeBetween(engType, timeSymbol1000, yearAndMonth));

        return array;
    }
    /**
     * @描述 计算故障发动机的售出时间分布
     * @编写人 Jian Wang
     * @邮箱
     * @日期 2020/3/19
     * @参变量
     * @返回
     * @抛出异常
     */
    @RequestMapping("/trans/salesFailureTime")
    public String[][] caltransOfflineFailureTime(@RequestParam String yearAndMonth, @RequestParam(required = false) String transType){
        //计算横坐标
//        System.out.println("11111111111111111111111111111111");
        String[] xAxis = {"售出时间", "0-6","7-12","13-24","25-36","36+"};
        String[][] array = new String[2][xAxis.length];
        array[0] = xAxis;
        array[1][0] = "台数";

        //时间推移，分为0-6个月，7-12个月，13-24个月，24-36个月，大于36个月
        String timeSymbol6 = MqmsUtil.getDateInfor("yyyy-MM",yearAndMonth,-6);
        String timeSymbol12 = MqmsUtil.getDateInfor("yyyy-MM",yearAndMonth,-12);
        String timeSymbol24 = MqmsUtil.getDateInfor("yyyy-MM",yearAndMonth,-24);
        String timeSymbol36 = MqmsUtil.getDateInfor("yyyy-MM",yearAndMonth,-36);
        String timeSymbol1000 = MqmsUtil.getDateInfor("yyyy-MM",yearAndMonth,-1000);

        array[1][1] = String.valueOf(mqmsVoucherMapper.salesTransFailureTimeBetween(transType, timeSymbol6, yearAndMonth));
        array[1][2] = String.valueOf(mqmsVoucherMapper.salesTransFailureTimeBetween(transType, timeSymbol12,  yearAndMonth));
        array[1][3] = String.valueOf(mqmsVoucherMapper.salesTransFailureTimeBetween(transType, timeSymbol24, yearAndMonth));
        array[1][4] = String.valueOf(mqmsVoucherMapper.salesTransFailureTimeBetween(transType, timeSymbol36, yearAndMonth));
        array[1][5] = String.valueOf(mqmsVoucherMapper.salesTransFailureTimeBetween(transType, timeSymbol1000, yearAndMonth));

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
     * 变速箱10大问题点
     * @param mqmsVoucher
     * @return
     */
    @RequestMapping("/trans/failureTop10")
    public String[][] transFailureTop10(MqmsVoucher mqmsVoucher){

        List<FailureTop10> list = mqmsVoucherMapper.transFailureTop10(mqmsVoucher);

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
    @RequestMapping("/eng/reportedFailure")
    public String[][] reportedFailure(@RequestParam String yearAndMonth, @RequestParam String timeSpan, @RequestParam String engType){
        //获取起始月
        String yearAndMonthBegin= MqmsUtil.getDateInfor("yyyy-MM",yearAndMonth,-Integer.parseInt(timeSpan)+1);
        String[][] strArray = new String[2][Integer.parseInt(timeSpan)+1];
        //题头初始化
        strArray[0][0] = "月份";
        strArray[1][0] = "台数";
        //单机型循环叠加计算不良率
        for (int j = 0; j < Integer.parseInt(timeSpan); j++) {
            strArray[0][j+1]=yearAndMonthBegin;

            //获取每个月的市场报告的索赔发动机
            strArray[1][j+1]=String.valueOf(mqmsFailureReportMapper.countByMonth(engType, yearAndMonthBegin));
            //月份推移
            yearAndMonthBegin= MqmsUtil.getDateInfor("yyyy-MM",yearAndMonthBegin,1);
        }

        return strArray;
    }
    @RequestMapping("engineFailureRateMutil")
    public String[][] calculateEngineFailureRateMutil(@RequestParam String yearAndMonth, @RequestParam String timeSpan, @RequestParam String engType){
        //机型
        String engTypeAssemble = engType;
        int[] monthType={6,12,24,36};
        //创建二维数组
        String[][] strArray=new String[monthType.length+1][Integer.parseInt(timeSpan)+1];
        strArray[0][0]="日期";
        for (int i = 0; i < monthType.length; i++) {
            //单机型初始化信息
            String yearAndMonthBegin= MqmsUtil.getDateInfor("yyyy-MM",yearAndMonth,-Integer.parseInt(timeSpan)+1);
            int thisEngtypeCount=0;
            int secondPinData=0;
            float unqualifiedRate=0;
            //单机型循环叠加计算不良率
            for (int j = 0; j < Integer.parseInt(timeSpan); j++) {
                String beginData=MqmsUtil.getDateInfor("yyyy-MM",yearAndMonthBegin,-monthType[i]+1);
                String endData=MqmsUtil.getDateInfor("yyyy-MM",beginData,+monthType[i]);
                thisEngtypeCount = mqmsVoucherMapper.selectClaimCount(engTypeAssemble, beginData,endData);
                secondPinData = mqmsSalesMapper.selectSecondSalesCount(engTypeAssemble, beginData,endData);
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
//                System.out.println(strUnqualifiedRate);
                strArray[i+1][j+1]=strUnqualifiedRate;
                //月份推移
                yearAndMonthBegin= MqmsUtil.getDateInfor("yyyy-MM",yearAndMonthBegin,1);
            }
            strArray[i+1][0]=Integer.toString(monthType[i])+"个月";
        }
        return strArray;
    }
    @RequestMapping("transFailureRateMutil")
    public String[][] calculatetransFailureRateMutil(@RequestParam String yearAndMonth, @RequestParam String timeSpan, @RequestParam String transType){
        //机型
        String engTypeAssemble = transType;
        int[] monthType={6,12,24,36};
        //创建二维数组
        String[][] strArray=new String[monthType.length+1][Integer.parseInt(timeSpan)+1];
        strArray[0][0]="日期";
        for (int i = 0; i < monthType.length; i++) {
            //单机型初始化信息
            String yearAndMonthBegin= MqmsUtil.getDateInfor("yyyy-MM",yearAndMonth,-Integer.parseInt(timeSpan)+1);
            int thisEngtypeCount=0;
            int secondPinData=0;
            float unqualifiedRate=0;
            //单机型循环叠加计算不良率

            for (int j = 0; j < Integer.parseInt(timeSpan); j++) {
                String beginData=MqmsUtil.getDateInfor("yyyy-MM",yearAndMonthBegin,-monthType[i]+1);
                String endData=MqmsUtil.getDateInfor("yyyy-MM",beginData,monthType[i]);
                thisEngtypeCount = mqmsVoucherMapper.selectTransClaimCount(engTypeAssemble, beginData,endData);
                secondPinData = mqmsSalesMapper.selectTranSecondSalesCount(engTypeAssemble, beginData,endData);
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
//                System.out.println(strUnqualifiedRate);
                strArray[i+1][j+1]=strUnqualifiedRate;
                //月份推移
                yearAndMonthBegin= MqmsUtil.getDateInfor("yyyy-MM",yearAndMonthBegin,1);
            }
            strArray[i+1][0]=Integer.toString(monthType[i])+"个月";
        }
        return strArray;
    }
}
