package com.gamc.efactory.controller;

import com.alibaba.fastjson.JSONArray;
import com.gamc.efactory.dao.EngTypeMapper;
import com.gamc.efactory.model.dataObject.EngType;
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
    EngTypeMapper engTypeMapper;
    @RequestMapping("listInArray")
    public JSONArray engTypeQuery(){
        EngType engType = new EngType();
        List<EngType> list = engTypeMapper.queryEngType(engType);
        return EasyUIUtil.formatDataToComboBox(list);
    }
}
