package com.gamc.efactory.controller;

import com.alibaba.fastjson.JSONArray;
import com.gamc.efactory.dao.FinancialCenterMapper;
import com.gamc.efactory.model.dataObject.FinancialCenter;
import com.gamc.efactory.util.EasyUIUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zeho Lee on 2019/8/6.
 */
@RestController
public class FinancialCenterController {
    @Autowired
    FinancialCenterMapper financialCenterMapper;

    @RequestMapping(value = "/financialCenter/listInArray")
    public JSONArray listInArray(){
        FinancialCenter financialCenter = new FinancialCenter();
        return EasyUIUtil.formatDataToComboBox(financialCenterMapper.queryFinancialCenter(financialCenter));
    }
}
