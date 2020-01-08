<%--
  Created by IntelliJ IDEA.
  User: Zeho Lee
  Date: 2018/8/8
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <script type="text/javascript" src="jquery-easyui-1.5.5.4/jquery.min.js"></script>
    <script type="text/javascript" src="jquery-easyui-1.5.5.4/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="jquery-easyui-1.5.5.4/locale/easyui-lang-zh_CN.js"></script>
    <link rel="stylesheet" href="jquery-easyui-1.5.5.4/themes/default/easyui.css" type="text/css"/>
    <link rel="stylesheet" href="jquery-easyui-1.5.5.4/themes/icon.css" type="text/css"/>
    <script type="text/javascript" src="static/echart/echarts.js"></script>
    <script type="text/javascript" src="js/jquery.json.min.js"></script>

    <link rel="stylesheet" type="text/css" href="handsontable-master/dist/handsontable.full.min.css">
    <%--<link rel="stylesheet" type="text/css" href="https://handsontable.com/static/css/main.css">--%>
    <script type="text/javascript" src="handsontable-master/dist/handsontable.full.js"></script>
    <script type="text/javascript" src="handsontable-master/dist/languages/all.js"></script>

    <title>考勤统计图</title>
    <style>
        table {
            cellspacing:0 ;
            *border-collapse: collapse; /* IE7 and lower */
            border-spacing: 0;
            width: 100%;
        }
        .bordered tr:hover {
            background: #fbf8e9;
            -o-transition: all 0.1s ease-in-out;
            -webkit-transition: all 0.1s ease-in-out;
            -moz-transition: all 0.1s ease-in-out;
            -ms-transition: all 0.1s ease-in-out;
            transition: all 0.1s ease-in-out;
        }

        .bordered th {
            padding: 7px;
            text-align: center;
            cellspacing:0;
        }

        .bordered td{
            padding: 7px;
            text-align: center;
            cellspacing:0;
        }


        .bordered th {

            background-image: -webkit-gradient(linear, left top, left bottom, from(#ebf3fc), to(#dce9f9));
            background-image: -webkit-linear-gradient(top, #ebf3fc, #dce9f9);
            background-image:    -moz-linear-gradient(top, #ebf3fc, #dce9f9);
            background-image:     -ms-linear-gradient(top, #ebf3fc, #dce9f9);
            background-image:      -o-linear-gradient(top, #ebf3fc, #dce9f9);
            background-image:         linear-gradient(top, #ebf3fc, #dce9f9);
        }
        .bordered td:first-child, .bordered th:first-child {
            border-left: none;
        }



        .bordered  tr:nth-of-type(2n){background:#FFFFFF;cursor: pointer;}
        .bordered  tr:nth-of-type(2n+1){background:#F7FAFC;cursor: pointer;}

        .bordered  tbody tr:hover{  background: #fbf8e9;
            -o-transition: all 0.1s ease-in-out;
            -webkit-transition: all 0.1s ease-in-out;
            -moz-transition: all 0.1s ease-in-out;
            -ms-transition: all 0.1s ease-in-out;
            transition: all 0.1s ease-in-out;
        }


    </style>

    <script type="text/javascript">
        var mixedBarAndLine_requestTotalLong;
        var mixedBarAndLine_overtimeModifiedLong;
        var stackedBar_department;
        var pie_overtimeType;
        var stackedBar_overtimeType;

        var mixedBarAndLine_requestTotalLong_m;
//        var mixedBarAndLine_overtimeModifiedLong_m;
        var stackedBar_department_m;
        var pie_overtimeType_m;
        var stackedBar_overtimeType_m;

        var top10_m;
        var top10_w = new Array();

        var screenHeight = window.screen.height;
        var screenWidth = window.screen.width;

        var hot1 = true;

        $(function () {
            //获取选项框选项
            $("#viewSelect").combobox("reload","liselectoptions?action=list&dict_type=viewSelect");

            mixedBarAndLine_requestTotalLong = echarts.init(document.getElementById('mixedBarAndLine_requestTotalLong'));
            mixedBarAndLine_overtimeModifiedLong = echarts.init(document.getElementById('mixedBarAndLine_overtimeModifiedLong'));
            stackedBar_department = echarts.init(document.getElementById('stackedBar_department'));
            pie_overtimeType = echarts.init(document.getElementById('pie_overtimeType'));
            stackedBar_overtimeType = echarts.init(document.getElementById('stackedBar_overtimeType'));

            var monthDate,monthDate2;
            var lastDay;
            $('#yearAndMonth').datebox({
                onShowPanel : function() {// 显示日趋选择对象后再触发弹出月份层的事件，初始化时没有生成月份层
                    span.trigger('click'); // 触发click事件弹出月份层
                    if (!tds)
                        setTimeout(function() {// 延时触发获取月份对象，因为上面的事件触发和对象生成有时间间隔
                            tds = p.find('div.calendar-menu-month-inner td');
                            tds.click(function(e) {
                                e.stopPropagation(); // 禁止冒泡执行easyui给月份绑定的事件
                                var year = /\d{4}/.exec(span.html())[0]// 得到年份
                                    , month = parseInt($(this).attr('abbr'), 10) + 1; // 月份
                                $('#yearAndMonth').datebox('hidePanel')// 隐藏日期对象
                                .datebox('setValue', year + '-' + month); // 设置日期的值
                            });
                        }, 0);
                },
                parser : function(s) {// 配置parser，返回选择的日期
                    if (!s)
                        return new Date();
                    var arr = s.split('-');
                    return new Date(parseInt(arr[0], 10), parseInt(arr[1], 10) - 1, 1);
                },
                formatter : function(d) {
                    var month = d.getMonth();
                    if(month<10){
                        month = "0"+month;
                    }
                    if (d.getMonth() == 0) {
                        return d.getFullYear()-1 + '-' + 12;
                    } else {
                        return d.getFullYear() + '-' + month;
                    }
                }// 配置formatter，只返回年月
            });
            var p = $('#yearAndMonth').datebox('panel'), // 日期选择对象
                tds = false, // 日期选择对象中月份
                span = p.find('span.calendar-text'); // 显示月份层的触发控件
            //初始化年月选择器
            var date = new Date();
            var stryear = date.getFullYear();
            var strmonth = date.getMonth() + 2;
            var strYM = stryear + '-' + (strmonth.toString().length < 2 ? '0' + strmonth : strmonth);
            $('#yearAndMonth').datebox('setValue', strYM);

            $('#yearAndMonth_top10').datebox({
                onShowPanel : function() {// 显示日趋选择对象后再触发弹出月份层的事件，初始化时没有生成月份层
                    span.trigger('click'); // 触发click事件弹出月份层
                    if (!tds)
                        setTimeout(function() {// 延时触发获取月份对象，因为上面的事件触发和对象生成有时间间隔
                            tds = p.find('div.calendar-menu-month-inner td');
                            tds.click(function(e) {
                                e.stopPropagation(); // 禁止冒泡执行easyui给月份绑定的事件
                                var year = /\d{4}/.exec(span.html())[0]// 得到年份
                                    , month = parseInt($(this).attr('abbr'), 10) + 1; // 月份
                                $('#yearAndMonth_top10').datebox('hidePanel')// 隐藏日期对象
                                    .datebox('setValue', year + '-' + month); // 设置日期的值
                            });
                        }, 0);
                },
                parser : function(s) {// 配置parser，返回选择的日期
                    if (!s)
                        return new Date();
                    var arr = s.split('-');
                    return new Date(parseInt(arr[0], 10), parseInt(arr[1], 10) - 1, 1);
                },
                formatter : function(d) {
                    var month = d.getMonth();
                    if(month<10){
                        month = "0"+month;
                    }
                    if (d.getMonth() == 0) {
                        return d.getFullYear()-1 + '-' + 12;
                    } else {
                        return d.getFullYear() + '-' + month;
                    }
                }// 配置formatter，只返回年月
            });
            var p = $('#yearAndMonth_top10').datebox('panel'), // 日期选择对象
                tds = false, // 日期选择对象中月份
                span = p.find('span.calendar-text'); // 显示月份层的触发控件
            //初始化年月选择器
            var date = new Date();
            var stryear = date.getFullYear();
            var strmonth = date.getMonth() + 2;
            var strYM = stryear + '-' + (strmonth.toString().length < 2 ? '0' + strmonth : strmonth);
            $('#yearAndMonth_top10').datebox('setValue', strYM);

            option1 = {
                title : {
                    text: '总加班工时推移表',
                    subtext: 'GAC',
                    x:'left',
                    textStyle: {
                        fontSize: screenWidth/100
                    }
                },
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'cross',
                        crossStyle: {
                            color: '#999'
                        }
                    }
                },
                toolbox: {
                    feature: {
                        dataView: {show: true, readOnly: false},
                        restore: {show: true},
                        saveAsImage: {show: true}
                    }
                },
                legend: {
                    data:['月度目标','加班总工时','本月累计']
                },
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                xAxis: [
                    {
                        type: 'category',
//                        data: ['第一周',"第二周",'第三周','第四周','第五周'],
                        axisPointer: {
                            type: 'shadow'
                        }
                    }
                ],
                yAxis: [
                    {
                        type: 'value',
                        name: '小时',
                        min: 0,
                        max: 25000,
                        interval: 5000,
                        axisLabel: {
                            formatter: '{value} h'
                        }
                    }
                ],
                series: [
                    {
                        name:'月度目标',
                        type:'line',
                    },
                    {
                        name:'加班总工时',
                        type:'bar',
                    },
                    {
                        name:'本月累计',
                        type:'line',
                    }
                ]
            };

            option2 = {
                title : {
                    text: '加班实绩工时推移表',
                    subtext: 'GAC',
                    x:'left',
                    textStyle: {
                        fontSize: screenWidth/100
                    }
                },
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'cross',
                        crossStyle: {
                            color: '#999'
                        }
                    }
                },
                toolbox: {
                    feature: {
                        dataView: {show: true, readOnly: false},
                        restore: {show: true},
                        saveAsImage: {show: true}
                    }
                },
                legend: {
                    data:['月度目标','加班实绩','本月累计']
                },
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                xAxis: [
                    {
                        type: 'category',
//                        data: ['第一周',"第二周",'第三周','第四周','第五周'],
                        axisPointer: {
                            type: 'shadow'
                        }
                    }
                ],
                yAxis: [
                    {
                        type: 'value',
                        name: '小时',
                        min: 0,
                        max: 25000,
                        interval: 5000,
                        axisLabel: {
                            formatter: '{value} h'
                        }
                    }
                ],
                series: [
                    {
                        name:'月度目标',
                        type:'line',
                    },
                    {
                        name:'加班实绩',
                        type:'bar',
                    },
                    {
                        name:'本月累计',
                        type:'line',
                    }
                ]
            };

            option4 = {
                title : {
                    text: '加班原因',
                    subtext: 'GAC',
                    x:'left',
                    textStyle: {
                        fontSize: screenWidth/100
                    }
                },
                tooltip : {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient: 'vertical',
                    left: 'right',
                    data: ['事务','设备维修跟进','公司安排生产','本部安排生产','日常维护']
                },
                series : [
                    {
                        name: '加班原因',
                        type: 'pie',
                        radius : '60%',
                        center: ['40%', '50%'],
                        data:[
                            {value:335, name:'事务'},
                            {value:310, name:'设备维修跟进'},
                            {value:234, name:'公司安排生产'},
                            {value:135, name:'本部安排生产'},
                            {value:1548, name:'日常维护'}
                        ],
                        itemStyle: {
                            normal : {
                                label : {
                                    show : false   //隐藏标示文字
                                },
                                labelLine : {
                                    show : false   //隐藏标示线
                                }
                            },
                            emphasis: {
                                shadowBlur: 10,
                                shadowOffsetX: 0,
                                shadowColor: 'rgba(0, 0, 0, 0.5)'
                            }
                        }
                    }
                ]
            };

            mixedBarAndLine_requestTotalLong.setOption(option1);
            mixedBarAndLine_overtimeModifiedLong.setOption(option2);
            pie_overtimeType.setOption(option4);

            $('#tab_analysis').tabs({
                broder: false,
                onSelect: function (title) {
                    if (title=="月加班分析") {
                        display_overtime_monthly();
                    }else if (title=="出勤分析") {
                        //display_attendance();
                    }else if (title=="加班前十") {
                        display_overtime_top10();
                    }
                }
            });
        });

        function display_overtime_monthly() {
            //定义月度计划表格
            var data1 =  new Array(3);
            for(var i = 0;i < data1.length; i++){
                data1[i] = new Array(13);
            }

            var date1 = new Date();
            data1[0][0] = date1.getFullYear();
            data1[1][0] = "年度目标";
            data1[2][0] = "月度目标";
            for(var i = 1;i<=12;i++){
                data1[0][i] = i+"月"
            }

            var
                container1_m = document.getElementById('container1_m');

            if(hot1 == true) {
                hot1 = new Handsontable(container1_m, {
                    data: data1,
                    manualRowResize: true,
                    manualColumnResize: true,
                    colWidths: function (index) {
                        if (index == 0) {
                            return screenWidth / 15;
                        }
                        else {
                            return screenWidth / 20;
                        }
                    },
                    rowHeights: screenHeight / 35,
                    //                stretchH: 'all',
                    contextMenu: [
                        "row_above",
                        "row_below",
                        "col_left",
                        "col_right",
                        "---------",
                        "remove_row",
                        "remove_col",
                        "---------",
                        "alignment",
                        "copy",
                        "cut",
                        "mergeCells",
                        "exportFile"
                    ],
                    language: 'zh-CN',
                    minSpareRows: 0,
                    className: "htCenter htMiddle",
                });
            }

            mixedBarAndLine_requestTotalLong_m = echarts.init(document.getElementById("mixedBarAndLine_requestTotalLong_m"));
//            mixedBarAndLine_overtimeModifiedLong_m = echarts.init(document.getElementById("mixedBarAndLine_overtimeModifiedLong_m"));
            stackedBar_department_m = echarts.init(document.getElementById("stackedBar_department_m"));
            stackedBar_overtimeType_m = echarts.init(document.getElementById("stackedBar_overtimeType_m"));
            pie_overtimeType_m = echarts.init(document.getElementById("pie_overtimeType_m"));

            option1_m = {
                title : {
                    text: '总加班工时推移表',
                    subtext: 'GAC',
                    x:'left',
                    textStyle: {
                        fontSize: screenWidth/100
                    }
                },
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'cross',
                        crossStyle: {
                            color: '#999'
                        }
                    }
                },
                toolbox: {
                    feature: {
                        dataView: {show: true, readOnly: false},
                        restore: {show: true},
                        saveAsImage: {show: true}
                    }
                },
                legend: {
                    data:['月度目标','年度目标', '加班总时长','加班费实绩','本年累计']
                },
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                xAxis: [
                    {
                        type: 'category',
//                        data: ['第一周',"第二周",'第三周','第四周','第五周'],
                        axisPointer: {
                            type: 'shadow'
                        }
                    }
                ],
                yAxis: [
                    {
                        type: 'value',
                        name: '小时',
                        min: 0,
                        max: 25000,
                        interval: 5000,
                        axisLabel: {
                            formatter: '{value} h'
                        }
                    }
                ],
                series: [
                    {
                        name:'月度目标',
                        type:'line',
                    },
                    {
                        name:'加班总工时',
                        type:'bar',
                    },
                    {
                        name:'本月累计',
                        type:'line',
                    }
                ]
            };

            mixedBarAndLine_requestTotalLong_m.setOption(option1_m);
        }

        function display_overtime_top10(){
            top10_m = echarts.init(document.getElementById("top10_m"));
        }

        function analysis() {
            mixedBarAndLine_requestTotalLong.showLoading();    //数据加载完之前先显示一段简单的loading动画
            mixedBarAndLine_overtimeModifiedLong.showLoading();
            stackedBar_department.showLoading();
            stackedBar_overtimeType.showLoading();
            pie_overtimeType.showLoading();

            var c1_names=[];    //类别数组（实际用来盛放X轴坐标值）
            var c1_monthlyTarget=[];    //月度目标数组（实际用来盛放Y坐标值）
            var c1_requestTotalLong=[];
            var c1_requestTotalLongAccumulation=[];

            var c2_names=[];    //类别数组（实际用来盛放X轴坐标值）
            var c2_monthlyTarget=[];    //月度目标数组（实际用来盛放Y坐标值）
            var c2_overtimeModifiedLong=[];
            var c2_overtimeModifiedLongAccumulation=[];

            var c3_department=[];
            var c3_names=[];
            var c3_departmentValue=[];

            var c5_overtimeType=[];
            var c5_names=[];
            var c5_requestTotalLong_OTtype=[];
            
            var c4_overtimeType=[];
            var c4_requestTotalLong_OTtype=[];

            //按周分析
            if($('#viewSelect').val()=='周') {
                $.ajax({
                    type: "post",
                    async: true,            //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
                    url: "licharts?action=att_week",    //请求发送到TestServlet处
                    data: {
                        yearAndMonth: $('#yearAndMonth').datebox('getText'),
                        viewSelect: $('#viewSelect').val(),
                        monthlyTarget: $('#monthlyTarge').val()
                    },
                    dataType: "json",        //返回数据形式为json
                    success: function (result) {
                        //请求成功时执行该函数内容，result即为服务器返回的json对象
                        var Ymax = $('#monthlyTarge').val();
                        if (result) {
                            for (var i = 0; i < result.c1_names.length; i++) {
                                c1_names.push(result.c1_names[i]);    //挨个取出类别并填入类别数组
                            }
                            for (var i = 0; i < result.c1_monthlyTarget.length; i++) {
                                c1_monthlyTarget.push(result.c1_monthlyTarget[i]);    //挨个取出月度目标并填入销量数组
                            }
                            for (var i = 0; i < result.c1_requestTotalLong.length; i++) {
                                c1_requestTotalLong.push(result.c1_requestTotalLong[i]);    //挨个取出月度目标并填入销量数组
                            }
                            for (var i = 0; i < result.c1_requestTotalLongAccumulation.length; i++) {
                                c1_requestTotalLongAccumulation.push(result.c1_requestTotalLongAccumulation[i]);    //挨个取出月度目标并填入销量数组
                                Ymax = Math.max(Ymax, result.c1_requestTotalLongAccumulation[i]);
                            }
                            mixedBarAndLine_requestTotalLong.hideLoading();    //隐藏加载动画
                            mixedBarAndLine_requestTotalLong.setOption({//加载数据图表
                                title : {
                                    text: '总加班工时推移表',
                                    subtext: 'GAC',
                                    x:'left',
                                    textStyle: {
                                        fontSize: screenWidth/100
                                    }
                                },
                                tooltip: {
                                    trigger: 'axis',
                                    axisPointer: {
                                        type: 'cross',
                                        crossStyle: {
                                            color: '#999'
                                        }
                                    }
                                },
                                toolbox: {
                                    feature: {
                                        dataView: {show: true, readOnly: false},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                legend: {
                                    data:['月度目标','加班总时长','本月累计']
                                },
                                grid: {
                                    left: '3%',
                                    right: '4%',
                                    bottom: '3%',
                                    containLabel: true
                                },
                                xAxis: {
                                    data: c1_names
                                },
                                yAxis: {
                                    type: 'value',
                                    name: '小时',
                                    min: 0,
                                    max: Ymax,
                                    interval: parseInt(Ymax / 5000) * 500,
                                    axisLabel: {
                                        formatter: '{value} h'
                                    },
                                },
                                series: [
                                    {
                                        // 根据名字对应到相应的系列
                                        name: '月度目标',
                                        data: c1_monthlyTarget,
                                        itemStyle: {normal: {label: {show: true,position:'top',textStyle: {fontSize:screenWidth/100}}}}
                                    },
                                    {
                                        name: '加班总时长',
                                        data: c1_requestTotalLong,
                                        itemStyle: {normal: {label: {show: true,position:'top',textStyle: {fontSize:screenWidth/100}}}}
                                    },
                                    {
                                        name: '本月累计',
                                        data: c1_requestTotalLongAccumulation,
                                        itemStyle: {normal: {label: {show: true,position:'top',textStyle: {fontSize:screenWidth/100}}}}
                                    }
                                ]
                            });
                            
                            for (var i = 0; i < result.c2_names.length; i++) {
                                c2_names.push(result.c2_names[i]);    //挨个取出类别并填入类别数组
                            }
                            for (var i = 0; i < result.c2_monthlyTarget.length; i++) {
                                c2_monthlyTarget.push(result.c2_monthlyTarget[i]);    //挨个取出月度目标并填入销量数组
                            }
                            for (var i = 0; i < result.c2_overtimeModifiedLong.length; i++) {
                                c2_overtimeModifiedLong.push(result.c2_overtimeModifiedLong[i]);    //挨个取出月度目标并填入销量数组
                            }
                            for (var i = 0; i < result.c2_overtimeModifiedLongAccumulation.length; i++) {
                                c2_overtimeModifiedLongAccumulation.push(result.c2_overtimeModifiedLongAccumulation[i]);    //挨个取出月度目标并填入销量数组
                                Ymax = Math.max(Ymax, result.c2_overtimeModifiedLongAccumulation[i]);
                            }
                            mixedBarAndLine_overtimeModifiedLong.hideLoading();    //隐藏加载动画
                            mixedBarAndLine_overtimeModifiedLong.setOption({        //加载数据图表
                                title : {
                                    text: '加班实绩工时推移表',
                                    subtext: 'GAC',
                                    x:'left',
                                    textStyle: {
                                        fontSize: screenWidth/100
                                    }
                                },
                                tooltip: {
                                    trigger: 'axis',
                                    axisPointer: {
                                        type: 'cross',
                                        crossStyle: {
                                            color: '#999'
                                        }
                                    }
                                },
                                toolbox: {
                                    feature: {
                                        dataView: {show: true, readOnly: false},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                legend: {
                                    data:['月度目标','加班实绩','本月累计']
                                },
                                grid: {
                                    left: '3%',
                                    right: '4%',
                                    bottom: '3%',
                                    containLabel: true
                                },
                                xAxis: {
                                    data: c2_names
                                },
                                yAxis: {
                                    type: 'value',
                                    name: '小时',
                                    min: 0,
                                    max: Ymax,
                                    interval: parseInt(Ymax / 5000) * 500,
                                    axisLabel: {
                                        formatter: '{value} h'
                                    },
                                },
                                series: [
                                    {
                                        // 根据名字对应到相应的系列
                                        name: '月度目标',
                                        data: c2_monthlyTarget,
                                        itemStyle: {normal: {label: {show: true,position:'top',textStyle: {fontSize:screenWidth/100}}}}
                                    },
                                    {
                                        name: '加班实绩',
                                        data: c2_overtimeModifiedLong,
                                        itemStyle: {normal: {label: {show: true,position:'top',textStyle: {fontSize:screenWidth/100}}}}
                                    },
                                    {
                                        name: '本月累计',
                                        data: c2_overtimeModifiedLongAccumulation,
                                        itemStyle: {normal: {label: {show: true,position:'top',textStyle: {fontSize:screenWidth/100}}}}
                                    }
                                ]
                            });

                            for (var i = 0; i < result.c3_department.length; i++) {
                                c3_department.push(result.c3_department[i]);    //legend值
                            }
                            for (var i = 0; i < result.c3_names.length; i++) {
                                c3_names.push(result.c3_names[i]);    //x轴
                            }
                            for (var i = 0; i < result.c3_departmentValue.length; i++) {
                                c3_departmentValue.push(result.c3_departmentValue[i]);    //各科加班数
                            }

                            var c3_serie=[];
                            for(var i = 0; i < result.c3_department.length; i++){
                                var item={
                                    name:c3_department[i],
                                    type:'bar',
                                    barWidth:screenWidth/15,
                                    stack:'加班总工时',
                                    data:c3_departmentValue[i],
                                }
                                c3_serie.push(item);
                            }

                            stackedBar_department.hideLoading();    //隐藏加载动画
                            stackedBar_department.setOption({
                                title : {
                                    text: '各科室总加班工时',
                                    subtext: 'GAC',
                                    x:'left',
                                    textStyle: {
                                        fontSize: screenWidth/100
                                    }
                                },
                                tooltip : {
                                    trigger: 'axis',
                                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                                        type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                                    }
                                },
                                toolbox: {
                                    feature: {
                                        dataView: {show: true, readOnly: false},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                legend: {
                                    type:'scroll',
                                    left: screenWidth/12,
                                    right:screenWidth/12,
                                    itemGap: 5,
                                    textStyle: {fontSize:screenWidth/120},
                                    data:c3_department
                                },
                                grid: {
                                    left: '3%',
                                    right: '4%',
                                    bottom: '3%',
                                    containLabel: true
                                },
                                xAxis : [
                                    {
                                        type : 'category',
                                        data : c3_names
                                    }
                                ],
                                yAxis : [
                                    {
                                        type : 'value'
                                    }
                                ],
                                series:c3_serie
                            });

                            for (var i = 0; i < result.c5_overtimeType.length; i++) {
                                c5_overtimeType.push(result.c5_overtimeType[i]);    //legend值
                            }
                            for (var i = 0; i < result.c5_names.length; i++) {
                                c5_names.push(result.c5_names[i]);    //x轴
                            }
                            for (var i = 0; i < result.c5_requestTotalLong_OTtype.length; i++) {
                                c5_requestTotalLong_OTtype.push(result.c5_requestTotalLong_OTtype[i]);    //各科加班数
                            }

                            var c5_serie=[];
                            for(var i = 0; i < result.c5_overtimeType.length; i++){
                                var item={
                                    name:c5_overtimeType[i],
                                    type:'bar',
                                    barWidth:screenWidth/25,
                                    stack:'加班总工时',
                                    data:c5_requestTotalLong_OTtype[i]
                                }
                                c5_serie.push(item);
                            }

                            stackedBar_overtimeType.hideLoading();    //隐藏加载动画
                            stackedBar_overtimeType.setOption({
                                title : {
                                    text: '加班原因',
                                    subtext: 'GAC',
                                    x:'left',
                                    textStyle: {
                                        fontSize: screenWidth/100
                                    }
                                },
                                tooltip : {
                                    trigger: 'axis',
                                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                                        type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                                    }
                                },
                                toolbox: {
                                    feature: {
                                        dataView: {show: true, readOnly: false},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                legend: {
                                    type:'scroll',
                                    left: screenWidth/12,
                                    right:screenWidth/12,
                                    itemGap: 5,
                                    textStyle: {fontSize:screenWidth/120},
                                    data:c5_overtimeType
                                },
                                grid: {
                                    left: '3%',
                                    right: '4%',
                                    bottom: '3%',
                                    containLabel: true
                                },
                                xAxis : [
                                    {
                                        type : 'category',
                                        data : c5_names
                                    }
                                ],
                                yAxis : [
                                    {
                                        type : 'value'
                                    }
                                ],
                                series:c5_serie
                            });

                            for (var i = 0; i < result.c4_overtimeType.length; i++) {
                                c4_overtimeType.push(result.c4_overtimeType[i]);    //legend值
                            }
                            for (var i = 0; i < result.c4_requestTotalLong_OTtype.length; i++) {
                                c4_requestTotalLong_OTtype.push(result.c4_requestTotalLong_OTtype[i]);    //各科加班数
                            }
                            var c4_serie=[];
                            for(var i = 0; i < result.c4_overtimeType.length; i++){
                                var item={
                                    value:c4_requestTotalLong_OTtype[i],
                                    name:c4_overtimeType[i],
                                }
                                c4_serie.push(item);
                            }
                            pie_overtimeType.hideLoading();
                            pie_overtimeType.setOption ({
                                title : {
                                    text: '上'+$('#viewSelect').val()+'加班原因',
                                    subtext: 'GAC',
                                    x:'left',
                                    textStyle: {
                                        fontSize: screenWidth/100
                                    }
                                },
                                tooltip : {
                                    trigger: 'item',
                                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                                },
                                legend: {
                                    type:'scroll',
                                    orient: 'vertical',
                                    left: 'right',
                                    data: c4_overtimeType
                                },
                                series : [
                                    {
                                        name: '加班原因',
                                        type: 'pie',
                                        radius : '70%',
                                        center: ['40%', '50%'],
                                        data:c4_serie,
                                        itemStyle: {
                                            normal : {
                                                label : {
                                                    show : false   //隐藏标示文字
                                                },
                                                labelLine : {
                                                    show : false   //隐藏标示线
                                                }
                                            },
                                            emphasis: {
                                                shadowBlur: 10,
                                                shadowOffsetX: 0,
                                                shadowColor: 'rgba(0, 0, 0, 0.5)'
                                            }
                                        }
                                    }
                                ]
                            });
                        }
                    },
                    error: function (errorMsg) {
                        //请求失败时执行该函数
                        alert("图表请求数据失败!");
                        mixedBarAndLine_requestTotalLong.hideLoading();
                    }
                })
            }
            //按月度分析,与按周分析仅需要操作dom隐藏显示
            else if($('#viewSelect').val()=='月'){
                $.ajax({
                    type: "post",
                    async: true,            //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
                    url: "licharts?action=att_week",    //请求发送到TestServlet处
                    data: {
                        yearAndMonth: $('#yearAndMonth').datebox('getText'),
                        viewSelect: $('#viewSelect').val(),
                        monthlyTarget: $('#monthlyTarge').val()
                    },
                    dataType: "json",        //返回数据形式为json
                    success: function (result) {
                        //请求成功时执行该函数内容，result即为服务器返回的json对象
                        var Ymax = $('#monthlyTarge').val();
                        if (result) {
                            for (var i = 0; i < result.c1_names.length; i++) {
                                c1_names.push(result.c1_names[i]);    //挨个取出类别并填入类别数组
                            }
                            for (var i = 0; i < result.c1_monthlyTarget.length; i++) {
                                c1_monthlyTarget.push(result.c1_monthlyTarget[i]);    //挨个取出月度目标并填入销量数组
                            }
                            for (var i = 0; i < result.c1_requestTotalLong.length; i++) {
                                c1_requestTotalLong.push(result.c1_requestTotalLong[i]);    //挨个取出月度目标并填入销量数组
                            }
                            for (var i = 0; i < result.c1_requestTotalLongAccumulation.length; i++) {
                                c1_requestTotalLongAccumulation.push(result.c1_requestTotalLongAccumulation[i]);    //挨个取出月度目标并填入销量数组
                                Ymax = Math.max(Ymax, result.c1_requestTotalLongAccumulation[i]);
                            }
                            mixedBarAndLine_requestTotalLong.hideLoading();    //隐藏加载动画
                            mixedBarAndLine_requestTotalLong.setOption({//加载数据图表
                                title : {
                                    text: '总加班工时推移表',
                                    subtext: 'GAC',
                                    x:'left',
                                    textStyle: {
                                        fontSize: screenWidth/100
                                    }
                                },
                                tooltip: {
                                    trigger: 'axis',
                                    axisPointer: {
                                        type: 'cross',
                                        crossStyle: {
                                            color: '#999'
                                        }
                                    }
                                },
                                toolbox: {
                                    feature: {
                                        dataView: {show: true, readOnly: false},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                legend: {
                                    data:['月度目标','加班总时长','本月累计']
                                },
                                grid: {
                                    left: '3%',
                                    right: '4%',
                                    bottom: '3%',
                                    containLabel: true
                                },
                                xAxis: {
                                    data: c1_names
                                },
                                yAxis: {
                                    type: 'value',
                                    name: '小时',
                                    min: 0,
                                    max: Ymax,
                                    interval: parseInt(Ymax / 5000) * 500,
                                    axisLabel: {
                                        formatter: '{value} h'
                                    },
                                },
                                series: [
                                    {
                                        // 根据名字对应到相应的系列
                                        name: '月度目标',
                                        data: c1_monthlyTarget
                                    },
                                    {
                                        name: '加班总时长',
                                        data: c1_requestTotalLong
                                    },
                                    {
                                        name: '本月累计',
                                        data: c1_requestTotalLongAccumulation
                                    }
                                ]
                            });

                            for (var i = 0; i < result.c2_names.length; i++) {
                                c2_names.push(result.c2_names[i]);    //挨个取出类别并填入类别数组
                            }
                            for (var i = 0; i < result.c2_monthlyTarget.length; i++) {
                                c2_monthlyTarget.push(result.c2_monthlyTarget[i]);    //挨个取出月度目标并填入销量数组
                            }
                            for (var i = 0; i < result.c2_overtimeModifiedLong.length; i++) {
                                c2_overtimeModifiedLong.push(result.c2_overtimeModifiedLong[i]);    //挨个取出月度目标并填入销量数组
                            }
                            for (var i = 0; i < result.c2_overtimeModifiedLongAccumulation.length; i++) {
                                c2_overtimeModifiedLongAccumulation.push(result.c2_overtimeModifiedLongAccumulation[i]);    //挨个取出月度目标并填入销量数组
                                Ymax = Math.max(Ymax, result.c2_overtimeModifiedLongAccumulation[i]);
                            }
                            mixedBarAndLine_overtimeModifiedLong.hideLoading();    //隐藏加载动画
                            mixedBarAndLine_overtimeModifiedLong.setOption({        //加载数据图表
                                title : {
                                    text: '加班实绩工时推移表',
                                    subtext: 'GAC',
                                    x:'left',
                                    textStyle: {
                                        fontSize: screenWidth/100
                                    }
                                },
                                tooltip: {
                                    trigger: 'axis',
                                    axisPointer: {
                                        type: 'cross',
                                        crossStyle: {
                                            color: '#999'
                                        }
                                    }
                                },
                                toolbox: {
                                    feature: {
                                        dataView: {show: true, readOnly: false},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                legend: {
                                    data:['月度目标','加班实绩','本月累计']
                                },
                                grid: {
                                    left: '3%',
                                    right: '4%',
                                    bottom: '3%',
                                    containLabel: true
                                },
                                xAxis: {
                                    data: c2_names
                                },
                                yAxis: {
                                    type: 'value',
                                    name: '小时',
                                    min: 0,
                                    max: Ymax,
                                    interval: parseInt(Ymax / 5000) * 500,
                                    axisLabel: {
                                        formatter: '{value} h'
                                    },
                                },
                                series: [
                                    {
                                        // 根据名字对应到相应的系列
                                        name: '月度目标',
                                        data: c2_monthlyTarget
                                    },
                                    {
                                        name: '加班实绩',
                                        data: c2_overtimeModifiedLong
                                    },
                                    {
                                        name: '本月累计',
                                        data: c2_overtimeModifiedLongAccumulation
                                    }
                                ]
                            });

                            for (var i = 0; i < result.c3_department.length; i++) {
                                c3_department.push(result.c3_department[i]);    //legend值
                            }
                            for (var i = 0; i < result.c3_names.length; i++) {
                                c3_names.push(result.c3_names[i]);    //x轴
                            }
                            for (var i = 0; i < result.c3_departmentValue.length; i++) {
                                c3_departmentValue.push(result.c3_departmentValue[i]);    //各科加班数
                            }

                            var c3_serie=[];
                            for(var i = 0; i < result.c3_department.length; i++){
                                var item={
                                    name:c3_department[i],
                                    type:'bar',
                                    barWidth:screenWidth/15,
                                    stack:'加班总工时',
                                    data:c3_departmentValue[i]
                                }
                                c3_serie.push(item);
                            }

                            stackedBar_department.hideLoading();    //隐藏加载动画
                            stackedBar_department.setOption({
                                title : {
                                    text: '各科室总加班工时',
                                    subtext: 'GAC',
                                    x:'left',
                                    textStyle: {
                                        fontSize: screenWidth/100
                                    }
                                },
                                tooltip : {
                                    trigger: 'axis',
                                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                                        type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                                    }
                                },
                                toolbox: {
                                    feature: {
                                        dataView: {show: true, readOnly: false},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                legend: {
                                    type:'scroll',
                                    left: screenWidth/12,
                                    right:screenWidth/12,
                                    itemGap: 5,
                                    textStyle: {fontSize:screenWidth/120},
                                    data:c3_department
                                },
                                grid: {
                                    left: '3%',
                                    right: '4%',
                                    bottom: '3%',
                                    containLabel: true
                                },
                                xAxis : [
                                    {
                                        type : 'category',
                                        data : c3_names
                                    }
                                ],
                                yAxis : [
                                    {
                                        type : 'value'
                                    }
                                ],
                                series:c3_serie
                            });

                            for (var i = 0; i < result.c5_overtimeType.length; i++) {
                                c5_overtimeType.push(result.c5_overtimeType[i]);    //legend值
                            }
                            for (var i = 0; i < result.c5_names.length; i++) {
                                c5_names.push(result.c5_names[i]);    //x轴
                            }
                            for (var i = 0; i < result.c5_requestTotalLong_OTtype.length; i++) {
                                c5_requestTotalLong_OTtype.push(result.c5_requestTotalLong_OTtype[i]);    //各科加班数
                            }

                            var c5_serie=[];
                            for(var i = 0; i < result.c5_overtimeType.length; i++){
                                var item={
                                    name:c5_overtimeType[i],
                                    type:'bar',
                                    barWidth:screenWidth/25,
                                    stack:'加班总工时',
                                    data:c5_requestTotalLong_OTtype[i]
                                }
                                c5_serie.push(item);
                            }

                            stackedBar_overtimeType.hideLoading();    //隐藏加载动画
                            stackedBar_overtimeType.setOption({
                                title : {
                                    text: '加班原因',
                                    subtext: 'GAC',
                                    x:'left',
                                    textStyle: {
                                        fontSize: screenWidth/100
                                    }
                                },
                                tooltip : {
                                    trigger: 'axis',
                                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                                        type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                                    }
                                },
                                toolbox: {
                                    feature: {
                                        dataView: {show: true, readOnly: false},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                legend: {
                                    type:'scroll',
                                    left: screenWidth/12,
                                    right:screenWidth/12,
                                    itemGap: 5,
                                    textStyle: {fontSize:screenWidth/120},
                                    data:c5_overtimeType
                                },
                                grid: {
                                    left: '3%',
                                    right: '4%',
                                    bottom: '3%',
                                    containLabel: true
                                },
                                xAxis : [
                                    {
                                        type : 'category',
                                        data : c5_names
                                    }
                                ],
                                yAxis : [
                                    {
                                        type : 'value'
                                    }
                                ],
                                series:c5_serie
                            });

                            for (var i = 0; i < result.c4_overtimeType.length; i++) {
                                c4_overtimeType.push(result.c4_overtimeType[i]);    //legend值
                            }
                            for (var i = 0; i < result.c4_requestTotalLong_OTtype.length; i++) {
                                c4_requestTotalLong_OTtype.push(result.c4_requestTotalLong_OTtype[i]);    //各科加班数
                            }
                            var c4_serie=[];
                            for(var i = 0; i < result.c4_overtimeType.length; i++){
                                var item={
                                    value:c4_requestTotalLong_OTtype[i],
                                    name:c4_overtimeType[i]
                                }
                                c4_serie.push(item);
                            }
                            pie_overtimeType.hideLoading();
                            pie_overtimeType.setOption ({
                                title : {
                                    text: '上'+$('#viewSelect').val()+'加班原因',
                                    subtext: 'GAC',
                                    x:'left',
                                    textStyle: {
                                        fontSize: screenWidth/100
                                    }
                                },
                                tooltip : {
                                    trigger: 'item',
                                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                                },
                                legend: {
                                    type:'scroll',
                                    orient: 'vertical',
                                    left: 'right',
                                    data: c4_overtimeType
                                },
                                series : [
                                    {
                                        name: '加班原因',
                                        type: 'pie',
                                        radius : '70%',
                                        center: ['40%', '50%'],
                                        data:c4_serie,
                                        itemStyle: {
                                            normal : {
                                                label : {
                                                    show : false   //隐藏标示文字
                                                },
                                                labelLine : {
                                                    show : false   //隐藏标示线
                                                }
                                            },
                                            emphasis: {
                                                shadowBlur: 10,
                                                shadowOffsetX: 0,
                                                shadowColor: 'rgba(0, 0, 0, 0.5)'
                                            }
                                        }
                                    }
                                ]
                            });
                        }
                    },
                    error: function (errorMsg) {
                        //请求失败时执行该函数
                        alert("图表请求数据失败!");
                        mixedBarAndLine_requestTotalLong.hideLoading();
                    }
                })
            }
//            //按年度分析
//            else if($('#viewSelect').val()=='年'){
//
//            }
        }

        //月度分析，周月只有很小的区别，主要是月度分析多了年度计划一项参数
        function analysis_m() {
            mixedBarAndLine_requestTotalLong_m.showLoading();    //数据加载完之前先显示一段简单的loading动画
//            mixedBarAndLine_overtimeModifiedLong_m.showLoading();
            stackedBar_department_m.showLoading();
            stackedBar_overtimeType_m.showLoading();
            pie_overtimeType_m.showLoading();

            var c1_names = [];    //类别数组（实际用来盛放X轴坐标值）
            var c1_monthlyTarget = [];    //月度目标数组（实际用来盛放Y坐标值）
            var c1_requestTotalLong = [];
            var c1_requestTotalLongAccumulation = [];
            var c1_yearlyTarget = [];

            var c2_names = [];    //类别数组（实际用来盛放X轴坐标值）
            var c2_monthlyTarget = [];    //月度目标数组（实际用来盛放Y坐标值）
            var c2_overtimeModifiedLong = [];
            var c2_overtimeModifiedLongAccumulation = [];

            var c3_department = [];
            var c3_names = [];
            var c3_departmentValue = [];

            var c5_overtimeType = [];
            var c5_names = [];
            var c5_requestTotalLong_OTtype = [];

            var c4_overtimeType = [];
            var c4_requestTotalLong_OTtype = [];

            $.ajax({
                type: "post",
                async: true,            //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
                url: "licharts?action=att_month",    //请求发送到TestServlet处
                data: {
                    yearAndMonth: JSON.stringify(hot1.getDataAtRow(0)),
                    viewSelect: $('#viewSelect_m').val(),
                    monthlyTarget_m: JSON.stringify(hot1.getDataAtRow(2)),
                    yearlyTarget_m: JSON.stringify(hot1.getDataAtRow(1))
                },
                dataType: "json",        //返回数据形式为json
                success: function (result) {
                    //请求成功时执行该函数内容，result即为服务器返回的json对象
                    var Ymax = hot1.getDataAtCell(2,2);
                    for(var i=0;i < 12;i++){
                        Ymax = Math.max(Ymax, hot1.getDataAtCell(1,i+1));
                        Ymax = Math.max(Ymax, hot1.getDataAtCell(2,i+1));
                    }

                    if (result) {
                        for (var i = 0; i < result.c1_names.length; i++) {
                            c1_names.push(result.c1_names[i]);
                        }
                        for (var i = 0; i < result.c1_monthlyTarget.length; i++) {
                            c1_monthlyTarget.push(result.c1_monthlyTarget[i]);
                        }
                        for (var i=0; i < result.c1_yearlyTarget.length;i++){
                            c1_yearlyTarget.push(result.c1_yearlyTarget[i]);
                        }
                        for (var i = 0; i < result.c1_requestTotalLong.length; i++) {
                            c1_requestTotalLong.push(result.c1_requestTotalLong[i]);
                        }
                        for (var i = 0; i < result.c2_overtimeModifiedLong.length; i++) {
                            c2_overtimeModifiedLong.push(result.c2_overtimeModifiedLong[i]);
                        }
                        for (var i = 0; i < result.c1_requestTotalLongAccumulation.length; i++) {
                            c1_requestTotalLongAccumulation.push(result.c1_requestTotalLongAccumulation[i]);
                        }
                        mixedBarAndLine_requestTotalLong_m.hideLoading();    //隐藏加载动画
                        mixedBarAndLine_requestTotalLong_m.setOption({//加载数据图表
                            title : {
                                text: '总加班工时推移表',
                                subtext: 'GAC',
                                x:'left',
                                textStyle: {
                                    fontSize: screenWidth/100
                                }
                            },
                            tooltip: {
                                trigger: 'axis',
                                axisPointer: {
                                    type: 'cross',
                                    crossStyle: {
                                        color: '#999'
                                    }
                                }
                            },
                            toolbox: {
                                feature: {
                                    dataView: {show: true, readOnly: false},
                                    restore: {show: true},
                                    saveAsImage: {show: true}
                                }
                            },
                            legend: {
                                data:['月度目标','年度目标', '加班总时长','加班费实绩','本年累计']
                            },
                            grid: {
                                left: '3%',
                                right: '4%',
                                bottom: '3%',
                                containLabel: true
                            },
                            xAxis: {
                                data: c1_names
                            },
                            yAxis: {
                                type: 'value',
                                name: '小时',
                                min: 0,
                                max: Ymax,
                                interval: parseInt(Ymax / 5000) * 500,
                                axisLabel: {
                                    formatter: '{value} h'
                                },
                            },
                            series: [
                                {
                                    // 根据名字对应到相应的系列
                                    name: '月度目标',
                                    type: 'bar',
                                    data: c1_monthlyTarget,
                                    itemStyle: {normal: {label: {show: true,position:'top',textStyle: {fontSize:screenWidth/100}}}}
                                },
                                {
                                    name: '年度目标',
                                    type: 'bar',
                                    data: c1_yearlyTarget,
                                    itemStyle: {normal: {label: {show: true,position:'top',textStyle: {fontSize:screenWidth/100}}}}
                                },
                                {
                                    name: '加班总时长',
                                    type: 'bar',
                                    data: c1_requestTotalLong,
                                    itemStyle: {normal: {label: {show: true,position:'top',textStyle: {fontSize:screenWidth/100}}}}
                                },
                                {
                                    name: '加班费实绩',
                                    type: 'bar',
                                    data: c2_overtimeModifiedLong,
                                    itemStyle: {normal: {label: {show: true,position:'top',textStyle: {fontSize:screenWidth/100}}}}
                                },
                                {
                                    name: '本年累计',
                                    type: 'line',
                                    data: c1_requestTotalLongAccumulation,
                                    itemStyle: {normal: {label: {show: true,position:'top',textStyle: {fontSize:screenWidth/100}}}}
                                }],

                        });

                        for (var i = 0; i < result.c3_department.length; i++) {
                            c3_department.push(result.c3_department[i]);    //legend值
                        }
                        for (var i = 0; i < result.c3_names.length; i++) {
                            c3_names.push(result.c3_names[i]);    //x轴
                        }
                        for (var i = 0; i < result.c3_departmentValue.length; i++) {
                            c3_departmentValue.push(result.c3_departmentValue[i]);    //各科加班数
                        }

                        var c3_serie=[];
                        for(var i = 0; i < result.c3_department.length; i++){
                            var item={
                                name:c3_department[i],
                                type:'bar',
                                barWidth:screenWidth/40,
                                stack:'加班总工时',
                                data:c3_departmentValue[i]
                            }
                            c3_serie.push(item);
                        }

                        stackedBar_department_m.hideLoading();    //隐藏加载动画
                        stackedBar_department_m.setOption({
                            title : {
                                text: '各科室总加班工时',
                                subtext: 'GAC',
                                x:'left',
                                textStyle: {
                                    fontSize: screenWidth/100
                                }
                            },
                            tooltip : {
                                trigger: 'axis',
                                axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                                    type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                                }
                            },
                            toolbox: {
                                feature: {
                                    dataView: {show: true, readOnly: false},
                                    restore: {show: true},
                                    saveAsImage: {show: true}
                                }
                            },
                            legend: {
                                type:'scroll',
                                left: screenWidth/12,
                                right:screenWidth/12,
                                itemGap: 5,
                                textStyle: {fontSize:screenWidth/120},
                                data:c3_department
                            },
                            grid: {
                                left: '3%',
                                right: '4%',
                                bottom: '3%',
                                containLabel: true
                            },
                            xAxis : [
                                {
                                    type : 'category',
                                    data : c3_names
                                }
                            ],
                            yAxis : [
                                {
                                    type : 'value'
                                }
                            ],
                            series:c3_serie
                        });

                        for (var i = 0; i < result.c5_overtimeType.length; i++) {
                            c5_overtimeType.push(result.c5_overtimeType[i]);    //legend值
                        }
                        for (var i = 0; i < result.c5_names.length; i++) {
                            c5_names.push(result.c5_names[i]);    //x轴
                        }
                        for (var i = 0; i < result.c5_requestTotalLong_OTtype.length; i++) {
                            c5_requestTotalLong_OTtype.push(result.c5_requestTotalLong_OTtype[i]);    //各科加班数
                        }

                        var c5_serie=[];
                        for(var i = 0; i < result.c5_overtimeType.length; i++){
                            var item={
                                name:c5_overtimeType[i],
                                type:'bar',
                                barWidth:screenWidth/50,
                                stack:'加班总工时',
                                data:c5_requestTotalLong_OTtype[i]
                            }
                            c5_serie.push(item);
                        }

                        stackedBar_overtimeType_m.hideLoading();    //隐藏加载动画
                        stackedBar_overtimeType_m.setOption({
                            title : {
                                text: '加班原因',
                                subtext: 'GAC',
                                x:'left',
                                textStyle: {
                                    fontSize: screenWidth/100
                                }
                            },
                            tooltip : {
                                trigger: 'axis',
                                axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                                    type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                                }
                            },
                            toolbox: {
                                feature: {
                                    dataView: {show: true, readOnly: false},
                                    restore: {show: true},
                                    saveAsImage: {show: true}
                                }
                            },
                            legend: {
                                type:'scroll',
                                left: screenWidth/12,
                                right:screenWidth/12,
                                itemGap: 5,
                                textStyle: {fontSize:screenWidth/120},
                                data:c5_overtimeType
                            },
                            grid: {
                                left: '3%',
                                right: '4%',
                                bottom: '3%',
                                containLabel: true
                            },
                            xAxis : [
                                {
                                    type : 'category',
                                    data : c5_names
                                }
                            ],
                            yAxis : [
                                {
                                    type : 'value'
                                }
                            ],
                            series:c5_serie
                        });

                        for (var i = 0; i < result.c4_overtimeType.length; i++) {
                            c4_overtimeType.push(result.c4_overtimeType[i]);    //legend值
                        }
                        for (var i = 0; i < result.c4_requestTotalLong_OTtype.length; i++) {
                            c4_requestTotalLong_OTtype.push(result.c4_requestTotalLong_OTtype[i]);    //各科加班数
                        }
                        var c4_data=[];
                        for(var i = 0; i < result.c4_overtimeType.length; i++){
                            var item={
                                value:c4_requestTotalLong_OTtype[i],
                                name:c4_overtimeType[i]
                            }
                            c4_data.push(item);
                        }
                        pie_overtimeType_m.hideLoading();
                        pie_overtimeType_m.setOption ({
                            title : {
                                text: '上'+$('#viewSelect_m').val()+'加班原因',
                                subtext: 'GAC',
                                x:'left',
                                textStyle: {
                                    fontSize: screenWidth/100
                                }
                            },
                            tooltip : {
                                trigger: 'item',
                                formatter: "{a} <br/>{b} : {c} ({d}%)"
                            },
                            legend: {
                                type:'scroll',
                                orient: 'vertical',
                                left: 'right',
                                data: c4_overtimeType
                            },
                            series : [
                                {
                                    name: '加班原因',
                                    type: 'pie',
                                    radius : '70%',
                                    center: ['40%', '50%'],
                                    data:c4_data,
                                    label: {
                                        normal: {
                                            textStyle: {
                                                color: 'rgba(255, 255, 255, 0.3)'
                                            }
                                        }
                                    },
                                    labelLine: {
                                        normal: {
                                            lineStyle: {
                                                color: 'rgba(255, 255, 255, 0.3)'
                                            },
                                            smooth: 0.2,
                                            length: 10,
                                            length2: 20
                                        }
                                    },
                                    itemStyle: {
                                        normal : {
                                            label : {
                                                show : false   //隐藏标示文字
                                            },
                                            labelLine : {
                                                show : false   //隐藏标示线
                                            }
                                        },
                                        emphasis: {
                                            shadowBlur: 10,
                                            shadowOffsetX: 0,
                                            shadowColor: 'rgba(0, 0, 0, 0.5)'
                                        }
                                    }
                                }
                            ]
                        });
                    }
                },
                error: function (errorMsg) {
                    //请求失败时执行该函数
                    alert("图表请求数据失败!");
                    mixedBarAndLine_requestTotalLong_m.hideLoading();
                    stackedBar_overtimeType_m.hideLoading();
                    stackedBar_department_m.hideLoading();
                    pie_overtimeType_m.hideLoading();
                }
            })
        }

        function analysis_top10() {
            $.ajax({
                type: "post",
                async: true,            //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
                url: "licharts?action=att_top10",    //请求发送到TestServlet处
                data: {
                    yearAndMonth_top10:$("#yearAndMonth_top10").val(),
                    minOvertime_m:$('#minOvertime_m').val(),
                    minOvertime_w:$('#minOvertime_w').val(),
                    topNum:$('#topNum').val()
                },
                dataType: "json",        //返回数据形式为json
                success: function (result) {
                    var newdiv = document.createElement("div");
                    newdiv.id = "top10_m_chart";
                    document.getElementById("top10_m").appendChild(newdiv);
                    document.getElementById("top10_m_chart").style.height = "400px";
                    top10_m = echarts.init(document.getElementById("top10_m_chart"));
                    var top10_m_names = [];
                    var top10_m_total = [];
                    var top10_m_department = [];
                    var top10_serie=[];

                    var weekNums = result.weekNums;

                    var top10_w_names = new Array();
                    var top10_w_total = new Array();

                    for(var i=0;i<weekNums;i++){
                        top10_w_names[i] = new Array();
                    }

                    for(var i=0;i<result.top10_m.length;i++){
                        top10_m_names.push(result.top10_m[i].menberName + "\n" + result.top10_m[i].department);
                        top10_m_total.push(result.top10_m[i].total);
                        var item={
                            name:top10_m_names[i],
                            type:'bar',
                            data:[1],
                            itemStyle: {normal: {label: {show: true,position:'top',textStyle: {fontSize:screenWidth/100}}}}
                        }
                        top10_serie.push(item);
                    }

                    var option_top10 ={
                        title: {
                            text: '月加班前十',
                            subtext: 'GAC',
                            x: 'left',
                            textStyle: {
                                fontSize: screenWidth / 100
                            }
                        },
                        tooltip: {
                            trigger: 'axis',
                            axisPointer: {            // 坐标轴指示器，坐标轴触发有效
                                type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                            }
                        },
                        toolbox: {
                            feature: {
                                dataView: {
                                    show: true,
                                    readOnly: false,

                                },
                                restore: {show: true},
                                saveAsImage: {show: true}
                            }
                        },
                        legend: {
                            type: 'scroll',
                            left: screenWidth / 12,
                            right: screenWidth / 12,
                            itemGap: 5,
                            textStyle: {fontSize: screenWidth / 120},
                            data: top10_m_names
                        },
                        grid: {
                            left: '3%',
                            right: '4%',
                            bottom: '3%',
                            containLabel: true
                        },
                        xAxis: [
                            {
                                type: 'category',
                                data: top10_m_names
                            }
                        ],
                        yAxis: [
                            {
                                type: 'value'
                            }
                        ],
                        series: [
                            {
                                type:'bar',
                                data:top10_m_total,
                                itemStyle: {normal: {label: {show: true,position:'top',textStyle: {fontSize:screenWidth/100}}}}
                            }
                        ]
                    };
                    top10_m.setOption(option_top10);


                    //月加班前十表格
                    var newDetailDiv_m = document.createElement("div");
                    newDetailDiv_m.id = "top10_m_detail";
                    document.getElementById("top10_m").appendChild(newDetailDiv_m);
//                    document.getElementById("top10_m").style.height = "400px";
                    var
                        container_m = document.getElementById('top10_m_detail'),
                        hot_m,data_m;
                    data_m = new Array(result.top10_m.length);

                    for(var i = 0;i < data_m.length; i++){
                        data_m[i] = new Array(7);
                        if(result.top10_m[i] !=null) {
                            data_m[i][0] = result.top10_m[i].menberName;
                            data_m[i][1] = result.top10_m[i].department;
                            data_m[i][2] = result.top10_m_overtimeType[i];
                            data_m[i][5] = result.top10_m[i].overtimeProject;
                        }
                    }
                    console.log(data);

                    hot_m = new Handsontable(container_m, {
                        data: data_m,
                        startRows: 31,
                        startCols: 31,
                        manualRowResize: true,
                        manualColumnResize: true,
                        colWidths:function (index) {
                            if(index==2 || index ==5){
                                return 100;
                            }
                            else{
                                return 40;
                            }
                        },
                        colHeaders: [
                            '姓名',
                            '科室',
                            '加班项目',
                            '调休日期',
                            '调休时数',
                            '超加班工时原因',
                            '班组',
                        ],
                        rowHeights: 20,
                        stretchH: 'all',
                        contextMenu:[
                            "row_above",
                            "row_below",
                            "col_left",
                            "col_right",
                            "---------",
                            "remove_row",
                            "remove_col",
                            "---------",
                            "alignment",
                            "copy",
                            "cut",
                            "mergeCells",
                            "exportFile"
                        ],
                        language:'zh-CN',
                        minSpareRows: 0,
                        className: "htCenter htMiddle",
                        exportFile: true
                    });

                    for(var i=0;i<weekNums;i++){
                        var newdiv = document.createElement("div");
                        newdiv.id = "top10_w"+i;
                        document.getElementById("top10_w").appendChild(newdiv);
                        document.getElementById("top10_w"+i).style.height = "400px";
                        top10_w[i] =  echarts.init(document.getElementById("top10_w"+i));
                        top10_w_names[i] = result.top10_w_names[i];
                        top10_w_total[i] = result.top10_w_total[i];
                        top10_w[i].setOption({
                            title: {
                                text: '第'+(i+1)+'周加班前十',
                                subtext: 'GAC',
                                x: 'left',
                                textStyle: {
                                    fontSize: screenWidth / 100
                                }
                            },
                            tooltip: {
                                trigger: 'axis',
                                axisPointer: {            // 坐标轴指示器，坐标轴触发有效
                                    type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                                }
                            },
                            toolbox: {
                                feature: {
                                    dataView: {show: true, readOnly: false},
                                    restore: {show: true},
                                    saveAsImage: {show: true}
                                }
                            },
                            legend: {
                                type: 'scroll',
                                left: screenWidth / 12,
                                right: screenWidth / 12,
                                itemGap: 5,
                                textStyle: {fontSize: screenWidth / 120},
                                data: top10_w_names[i]
                            },
                            grid: {
                                left: '3%',
                                right: '4%',
                                bottom: '3%',
                                containLabel: true
                            },
                            xAxis: [
                                {
                                    type: 'category',
                                    nameGap: '1',
                                    data: top10_w_names[i],
                                    axisLabel: {
                                        interval:0,
                                        margin:2,
                                        textStyle: {
                                            fontSize:'10',
                                        }
                                    }
                                }
                            ],
                            yAxis: [
                                {
                                    type: 'value'
                                }
                            ],
                            series: [
                                {
                                    type:'bar',
                                    data:top10_w_total[i],
                                    itemStyle: {normal: {label: {show: true,position:'top',textStyle: {fontSize:screenWidth/100}}}}
                                }
                            ]
                        })

                        var newDetailDiv = document.createElement("div");
                        newDetailDiv.id = "top10_w_detail"+i;
                        document.getElementById("top10_w").appendChild(newDetailDiv);
                        //document.getElementById("top10_w_detail"+i).style.height = "400px";
                        var
                            container = document.getElementById('top10_w_detail'+i),
                            hot,data;
                        data = new Array(result.top10_w_names[i].length);

                        for(var j = 0;j < data.length; j++){
                            data[j] = new Array(7);
                            if(result.top10_w_names[i][j] !=null) {
                                data[j][0] = result.top10_w_names[i][j].split("\n")[0];
                                data[j][1] = result.top10_w_names[i][j].split("\n")[1];
                                data[j][2] = result.top10_w_overtimeType[i][j];
                                data[j][5] = result.top10_w_overtimeReason[i][j]
                            }
                        }

                        hot = new Handsontable(container, {
                            data: data,
                            startRows: 31,
                            startCols: 31,
                            manualRowResize: true,
                            manualColumnResize: true,
                            colWidths:function (index) {
                                if(index==2 || index ==5){
                                    return 100;
                                }
                                else{
                                    return 40;
                                }
                            },
                            colHeaders: [
                                '姓名',
                                '科室',
                                '加班项目',
                                '调休日期',
                                '调休时数',
                                '超加班工时原因',
                                '班组',
                            ],
                            rowHeights: 20,
                            stretchH: 'all',
                            contextMenu:[
                                "row_above",
                                "row_below",
                                "col_left",
                                "col_right",
                                "---------",
                                "remove_row",
                                "remove_col",
                                "---------",
                                "alignment",
                                "copy",
                                "cut",
                                "mergeCells",
                                "exportFile"
                            ],
                            language:'zh-CN',
                            minSpareRows: 0,
                            className: "htCenter htMiddle",
                            exportFile: true
                        });
                    }
                },
                error: function (errorMsg) {
                    //请求失败时执行该函数
                    alert("图表请求数据失败!");
                }
            })
        }


    </script>
</head>
<body>
    <div id="tab_analysis" class="easyui-tabs" style="width:100%;height:100%" fit="true">
        <div id="tab_overtime" title="周加班分析" style="padding:0px" >
            <div id="tb" style="width: 100%;height:7%;float:left">
                视图选择：<input class="easyui-combobox" width="200px" id="viewSelect" name="viewSelect" data-options="
                    valueField: 'dict_name',
                    textField: 'dict_name',
                    ">&nbsp;
                时间：<input class="easyui-datebox" width="200px" id="yearAndMonth" name="yearAndMonth">
                月度计划：<input class="easyui-validatebox" width="200px" id="monthlyTarge" name="monthlyTarge">小时
                <a id="asy" href="javascript:analysis()" class="easyui-linkbutton" data-options="iconCls:'icon-search'">分析</a> &nbsp;
                <%--<a id="export" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">导出</a>--%>
            </div>
            <div id="mixedBarAndLine_requestTotalLong" style="width: 50%;height:50%;float:left"></div>
            <div id="mixedBarAndLine_overtimeModifiedLong" style="width:50%;height:50%;float:left;"></div>
            <div id="stackedBar_department" style="width:100%;height:40%;float:left;"></div>
            <div id="pie_overtimeType" style="width:40%;height:40%;float:left;"></div>
            <div id="stackedBar_overtimeType" style="width:60%;height:40%;float:left;"></div>
        </div>

        <div id="tab_overtime_m" title="月加班分析" style="width:100%;height:100%" fit="true">
            <div id="tb_m" style="width: 100%;height:5%;float:left">
                视图选择：<input class="easyui-validatebox" style="width: 30px" id="viewSelect_m" name="viewSelect_m" value="月" readonly="readonly">&nbsp;
                <a id="asy_m" href="javascript:analysis_m()" class="easyui-linkbutton" data-options="iconCls:'icon-search'">分析</a> &nbsp;
                <%--<a id="export_m" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">导出</a>--%>
            </div>
            <div id="container1_m" style="width: 95%;height:14%;float:left;margin-left: 2%"></div>

            <div id="mixedBarAndLine_requestTotalLong_m" style="width:100%;height:42%;float:left"></div>
            <%--<div id="mixedBarAndLine_overtimeModifiedLong_m" style="width:50%;height:44%;float:left;"></div>--%>
            <div id="stackedBar_department_m" style="width:100%;height:39%;float:left;"></div>
            <div id="pie_overtimeType_m" style="width:40%;height:39%;float:left;"></div>
            <div id="stackedBar_overtimeType_m" style="width:60%;height:39%;float:left;"></div>
        </div>

        <%--<div id="tab_attendance" title="出勤分析" style="padding:0px">--%>

        <%--</div>--%>
        <div id="tab_top10" title="加班前十" style="width:100%;height:100%;padding:0px">
            <div id="tb_top10" style="width: 100%;height:6%;float:left">
                月阈值设定：<input class="easyui-validatebox"  id="minOvertime_m" name="minOvertime_m" value="60" style="width:10%;">
                周阈值设定：<input class="easyui-validatebox"  id="minOvertime_w" name="minOvertime_w" value="19.5" style="width:10%;">
                选取人数：<input class="easyui-validatebox" style="width:10%;" id="topNum" name="topNum" value="10">
                时间：<input class="easyui-datebox" style="width:15%;" id="yearAndMonth_top10" name="yearAndMonth_top10">
            <a id="asy_top10" href="javascript:analysis_top10()" class="easyui-linkbutton" data-options="iconCls:'icon-search'">分析</a> &nbsp;
            </div>
            <div id="top10_m" style="width:100%;float:left"></div>
            <div id="top10_w" style="width:100%;float:left"></div>
        </div>
    </div>
</body>
</html>
