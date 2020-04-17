package com.gamc.efactory.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gamc.efactory.dao.DictMapper;
import com.gamc.efactory.model.dataObject.Dict;
import com.gamc.efactory.util.EasyUIUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zeho Lee on 2019/7/24.
 * 字典项的控制器
 */
@RestController
@RequestMapping("/dict")
public class DictController {
    @Autowired
    DictMapper dictMapper;

    
    @RequestMapping(value = "/list")
    public JSONObject listDict(Dict dict, @RequestParam(value = "page",required = false)String page, @RequestParam(value = "rows", required = false)String rows){
        //TODO 条件查询
        int total = dictMapper.countDict(dict);
        JSONObject result = new JSONObject();
        if(page != null && rows != null){
            PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(rows));
        }

        return EasyUIUtil.formatDataToDatagird(dictMapper.queryDict(dict), total);
    }

    @RequestMapping(value = "/listInArray")
    public JSONArray listDictInArray(Dict dict, @RequestParam(value = "page",required = false)String page, @RequestParam(value = "rows", required = false)String rows){
        //TODO 条件查询
        int total = dictMapper.countDict(dict);
        JSONObject result = new JSONObject();
        if(page != null && rows != null){
            PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(rows));
        }
        return EasyUIUtil.formatDataToComboBox(dictMapper.queryDict(dict));
    }
}
