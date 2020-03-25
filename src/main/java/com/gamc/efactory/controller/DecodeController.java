package com.gamc.efactory.controller;

import com.alibaba.fastjson.JSONObject;
import com.gamc.efactory.service.MultiFilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by UZI on 2020/3/3.
 */
@RestController
@RequestMapping("/decode")
public class DecodeController {
    @Autowired
    MultiFilterService multiFilterService;
        @RequestMapping("/vin")
        public JSONObject vinDecode(@RequestParam(required = false)String page, @RequestParam(required = false) String rows, @RequestParam(required = false) String condition){
            String table = "mqms_vin_decode";
            String orderByColumn = "id";
            return multiFilterService.multiFilterQuery(table,condition,page,rows, orderByColumn);
        }
    @RequestMapping("/salesPoint")
    public JSONObject salesPointDecode(@RequestParam(required = false)String page, @RequestParam(required = false) String rows, @RequestParam(required = false) String condition){
        String table = "mqms_sales_point";
        String orderByColumn = "id";
        return multiFilterService.multiFilterQuery(table,condition,page,rows, orderByColumn);
    }
    @RequestMapping("/transManu")
    public JSONObject transCodeDecode(@RequestParam(required = false)String page, @RequestParam(required = false) String rows, @RequestParam(required = false) String condition){
        String table = "mqms_tran_manufactures_decode";
        String orderByColumn = "id";
        return multiFilterService.multiFilterQuery(table,condition,page,rows, orderByColumn);
    }
    @RequestMapping("/transType")
    public JSONObject transTypeDecode(@RequestParam(required = false)String page, @RequestParam(required = false) String rows, @RequestParam(required = false) String condition){
        String table = "mqms_tran_production_decode";
        String orderByColumn = "id";
        return multiFilterService.multiFilterQuery(table,condition,page,rows, orderByColumn);
    }
    @RequestMapping("/transYear")
    public JSONObject transYearDecode(@RequestParam(required = false)String page, @RequestParam(required = false) String rows, @RequestParam(required = false) String condition){
        String table = "mqms_tran_year_decode";
        String orderByColumn = "id";
        return multiFilterService.multiFilterQuery(table,condition,page,rows, orderByColumn);
    }
    @RequestMapping("/faultCode")
    public JSONObject faultCodeDecode(@RequestParam(required = false)String page, @RequestParam(required = false) String rows, @RequestParam(required = false) String condition){
        String table = "mqms_fault_decode";
        String orderByColumn = "id";
        return multiFilterService.multiFilterQuery(table,condition,page,rows, orderByColumn);
    }
}
