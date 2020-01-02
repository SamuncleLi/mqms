package com.gamc.efactory.controller;

import com.alibaba.fastjson.JSONArray;
import com.gamc.efactory.dao.OrderCheckerMapper;
import com.gamc.efactory.model.dataObject.OrderChecker;
import com.gamc.efactory.util.EasyUIUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zeho Lee on 2019/8/6.
 */
@RestController
public class OrderCheckerController {
    @Autowired
    OrderCheckerMapper orderCheckerMapper;

    @RequestMapping(value = "/orderChecker/listInArray")
    public JSONArray listInArray(OrderChecker orderChecker){
        return EasyUIUtil.formatDataToComboBox(orderCheckerMapper.queryOrderChecker(orderChecker));
    }
}
