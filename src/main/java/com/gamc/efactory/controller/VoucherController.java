package com.gamc.efactory.controller;

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

    @RequestMapping("/multiFilter")
    public JSONObject multiFilter(int page, int rows, String condition){
        String table = "voucher";
        return multiFilterService.multiFilterQuery(table,condition,page,rows);
    }
}
