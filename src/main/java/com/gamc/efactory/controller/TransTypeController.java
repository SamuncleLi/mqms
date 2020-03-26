package com.gamc.efactory.controller;

import com.alibaba.fastjson.JSONArray;
import com.gamc.efactory.dao.MqmsEngTypeMapper;
import com.gamc.efactory.dao.MqmsTransTypeMapper;
import com.gamc.efactory.model.dataObject.MqmsEngType;
import com.gamc.efactory.model.dataObject.MqmsTransType;
import com.gamc.efactory.util.EasyUIUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by UZI on 2020/3/22.
 */
@RestController
@RequestMapping("transType")
public class TransTypeController {

    @Autowired
    MqmsTransTypeMapper mqmsTransTypeMapper;
    @RequestMapping("listInArray")
    public JSONArray transTypeQuery(){
        MqmsTransType mqmsTransType = new MqmsTransType();
        List<MqmsTransType> list = mqmsTransTypeMapper.queryMqmsTransType(mqmsTransType);
        return EasyUIUtil.formatDataToComboBox(list);
    }
}
