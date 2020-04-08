package com.gamc.efactory.controller;

import com.alibaba.fastjson.JSONArray;
import com.gamc.efactory.dao.MqmsCarTypeInforMapper;
import com.gamc.efactory.model.dataObject.MqmsCarTypeInfor;
import com.gamc.efactory.util.EasyUIUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

/**
 * Created by UZI on 2020/4/6.
 */

@RestController
@RequestMapping("listInArray")
public class CarTypeInforController {
    @Autowired
    MqmsCarTypeInforMapper mqmsCarTypeInforMapper;
    @RequestMapping("carType")
    public JSONArray carTypeQuery() {
        MqmsCarTypeInfor mqmsCarTypeInfor=new MqmsCarTypeInfor();
        List<MqmsCarTypeInfor>  list = mqmsCarTypeInforMapper.searchCarTypeInfor(mqmsCarTypeInfor);
        return EasyUIUtil.formatDataToComboBox(list);
    }

    @RequestMapping(value = "/carInfor", method = RequestMethod.POST)
    @ResponseBody
    public JSONArray carInforQuery(HttpServletRequest request) {
        String carType=request.getParameter("carType");
//        System.out.println(carType+"qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
        List<MqmsCarTypeInfor>  list = mqmsCarTypeInforMapper.searchCarDetailInfor(carType);
        return EasyUIUtil.formatDataToComboBox(list);
    }
}
