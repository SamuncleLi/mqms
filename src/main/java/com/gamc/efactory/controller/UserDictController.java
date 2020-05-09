package com.gamc.efactory.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gamc.efactory.dao.DictMapper;
import com.gamc.efactory.dao.MqmsUserDictMapper;
import com.gamc.efactory.model.dataObject.Dict;
import com.gamc.efactory.model.dataObject.MqmsUserDict;
import com.gamc.efactory.util.EasyUIUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zehao on 2020/4/14.
 */
@RestController
@RequestMapping("/user_dict")
public class UserDictController {
    @Autowired
    MqmsUserDictMapper mqmsUserDictMapper;

    @RequestMapping(value = "/list")
    public JSONObject listMqmsUserDict(MqmsUserDict mqmsUserDict, @RequestParam(value = "page",required = false)String page, @RequestParam(value = "rows", required = false)String rows){
        //TODO 条件查询
        int total = mqmsUserDictMapper.countMqmsUserDict(mqmsUserDict);
        JSONObject result = new JSONObject();
        if(page != null && rows != null){
            PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(rows));
        }

        return EasyUIUtil.formatDataToDatagird(mqmsUserDictMapper.queryMqmsUserDict(mqmsUserDict), total);
    }

    @RequestMapping(value = "/listInArray")
    public JSONArray listMqmsUserDictInArray(MqmsUserDict mqmsUserDict, @RequestParam(value = "page",required = false)String page, @RequestParam(value = "rows", required = false)String rows){
        //TODO 条件查询
        int total = mqmsUserDictMapper.countMqmsUserDict(mqmsUserDict);
        JSONObject result = new JSONObject();
        if(page != null && rows != null){
            PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(rows));
        }
        return EasyUIUtil.formatDataToComboBox(mqmsUserDictMapper.queryMqmsUserDict(mqmsUserDict));
    }
}
