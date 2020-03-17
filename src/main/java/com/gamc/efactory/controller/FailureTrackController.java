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

/**
 * Created by Zeho Lee on 2020/3/11.
 */
@RestController
@RequestMapping("/failure_track")
public class FailureTrackController {
    @Autowired
    MultiFilterService multiFilterService;
    @Autowired
    MqmsFailureTrackMapper mqmsFailureTrackMapper;

    @RequestMapping("/columnNameAndComment")
    public JSONArray getColumnNameAndComment(@RequestParam("table")String table){
        //数据库名
        String schema = "mqms";
        return multiFilterService.columnNameAndCommentQuery(schema, table);
    }

    @RequestMapping("/add")
    public JSONObject addFailureAnalysis(@RequestParam String voucherCodes, MqmsFailureTrack mqmsFailureTrack){
        String[] voucherCodeArray = voucherCodes.split(",");
        JSONObject result = new JSONObject();
        int count = 0;
        for(String voucherCode:voucherCodeArray){
            mqmsFailureTrack.setVoucherCode(voucherCode);
            mqmsFailureTrackMapper.insertMqmsFailureTrack(mqmsFailureTrack);
            count ++;
        }
        if(count == voucherCodeArray.length){
            result.put("success", true);
        }
        else {
            result.put("success", false);
        }
        return result;
    }

    @RequestMapping("/list")
    public JSONObject multiFilter(@RequestParam(required = false)String page, @RequestParam(required = false) String rows,@RequestParam(required = false) String condition){
        String table = "mqms_failure_track";
        String orderByColumn = "failure_track_id";
        return multiFilterService.multiFilterQuery(table,condition,page,rows, orderByColumn);
    }
}
