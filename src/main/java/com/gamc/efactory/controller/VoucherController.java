package com.gamc.efactory.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gamc.efactory.service.MultiFilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zeho Lee on 2020/1/6.
 */
@RestController
@RequestMapping("/voucher")
public class VoucherController {
    @Autowired
    MultiFilterService multiFilterService;

    @RequestMapping("/columnNameAndComment")
    public JSONArray getColumnNameAndComment(@RequestParam("table")String table){
        //数据库名
        String schema = "mqms";
        return multiFilterService.columnNameAndCommentQuery(schema, table);
    }

    @RequestMapping("/list")
    public JSONObject multiFilter(@RequestParam(required = false)String page, @RequestParam(required = false) String rows,@RequestParam(required = false) String condition){
        String table = "mqms_voucher";
        String orderByColumn = "voucher_id";
        return multiFilterService.multiFilterQuery(table,condition,page,rows, orderByColumn);
    }

    /**
     * @描述 判断是否已经开启了不良追踪
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2020/2/4
     * @参变量
     * @返回
     * @抛出异常
    */
    @RequestMapping("/checkTrack")
    public JSONObject checkTrack(@RequestParam(value = "voucherIds") String voucherIds){
        JSONObject result = new JSONObject();
        return result;
    }

}
