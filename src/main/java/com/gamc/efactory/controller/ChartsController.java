package com.gamc.efactory.controller;

import com.alibaba.fastjson.JSONArray;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping("engineFailureRate")
    public String[][] calculateEngineFailureRate(@RequestParam String yearAndMonth, @RequestParam String timeSpan, @RequestParam String engType){
        System.out.println(yearAndMonth + timeSpan + engType);
        String[][] array = {{"机型", "2012-01", "2012-02", "2012-03", "2012-04", "2012-05", "2012-06"},
                    {"151", "41.1", "30.4", "65.1", "53.3", "83.8", "98.7"},
                    {"153", "86.5", "92.1", "85.7", "83.1", "73.4", "55.1"},
                    {"131", "24.1", "67.2", "79.5", "86.4", "65.2", "82.5"},
                    {"204", "55.2", "67.1", "69.2", "72.4", "53.9", "39.1"}};
        return array;
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
}
