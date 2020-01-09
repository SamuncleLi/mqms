package com.gamc.efactory.controller;

import com.alibaba.fastjson.JSONArray;
import com.gamc.efactory.dao.MqmsEngTypeMapper;
import com.gamc.efactory.model.dataObject.MqmsEngType;
import com.gamc.efactory.util.EasyUIUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Zeho Lee on 2020/1/8.
 */
@RestController
@RequestMapping("engType")
public class EngTypeController {
    @Autowired
    MqmsEngTypeMapper mqmsEngTypeMapper;
    @RequestMapping("listInArray")
    public JSONArray engTypeQuery(){
        MqmsEngType mqmsEngType = new MqmsEngType();
        List<MqmsEngType> list = mqmsEngTypeMapper.queryMqmsEngType(mqmsEngType);
        return EasyUIUtil.formatDataToComboBox(list);
    }
}
