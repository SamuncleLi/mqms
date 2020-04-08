package com.gamc.efactory.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gamc.efactory.dao.MqmsFailureTrackMapper;
import com.gamc.efactory.model.dataObject.MqmsFailureTrack;
import com.gamc.efactory.service.MultiFilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;

/**
 * Created by Zeho Lee on 2020/1/6.
 */
@RestController
@RequestMapping("/market")
public class MarketBulletinController {
    @Autowired
    MultiFilterService multiFilterService;
//    @Autowired
//    MqmsFailureTrackMapper mqmsFailureTrackMapper;

    @RequestMapping("/columnNameAndComment")
    public JSONArray getColumnNameAndComment(@RequestParam("table")String table){
        //数据库名
        String schema = "mqms";
        return multiFilterService.columnNameAndCommentQuery(schema, table);
    }

    @RequestMapping("/list")
    public JSONObject multiFilter(@RequestParam(required = false)String page, @RequestParam(required = false) String rows,@RequestParam(required = false) String condition){
        String table = "mqms_market_bulletin";
        String orderByColumn = "market_bulletin_id";
        return multiFilterService.multiFilterQuery(table,condition,page,rows, orderByColumn);
    }

//    /**
//     * @描述 判断是否已经开启了不良追踪
//     * @编写人 Zeho Lee
//     * @邮箱 lizeh@gacmotor.com
//     * @日期 2020/2/4
//     * @参变量
//     * @返回
//     * @抛出异常
//    */
//    @RequestMapping("/checkTrack")
//    public JSONObject checkTrack(@RequestParam(value = "voucherCodes") String voucherCodes){
//        JSONObject result = new JSONObject();
//        String[] voucherCodeList = voucherCodes.split(",");
//        //判断是否全部在不良追踪表（通过数量对比）
//        List<MqmsFailureTrack> failureChecks = mqmsFailureTrackMapper.checkTrack(voucherCodes);
//        if(failureChecks.size() == voucherCodeList.length){
//            result.put("success", "allFalse");
//        }
//        else if(failureChecks.size() !=0){
//            result.put("success", "false");
//        }
//        else{
//            result.put("success", "true");
//        }
//        //挑选出不在failureTrack表中的数据
//        HashSet<String> voucherCodeSet = new HashSet<>();
//        for(String voucherCode:voucherCodeList){
//            voucherCodeSet.add(voucherCode);
//        }
//        for(MqmsFailureTrack failureTrack:failureChecks){
//            voucherCodeSet.remove(failureTrack);
//        }
//        result.put("voucherCodeSet", voucherCodeSet);
//
//        return result;
//    }
}
