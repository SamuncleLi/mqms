package com.gamc.efactory.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gamc.efactory.dao.*;
import com.gamc.efactory.dao.base.*;
import com.gamc.efactory.model.dataObject.*;
import com.gamc.efactory.service.MultiFilterService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.awt.font.FontRenderContext;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by UZI on 2020/3/3.
 */
@RestController
@RequestMapping("/decode")
public class DecodeController {
    @Autowired
    MqmsSalesPointBaseMapper mqmsSalesPointBaseMapper;
    @Autowired
    MqmsSalesPointMapper mqmsSalesPointMapper;
    @Autowired
    MqmsFaultDecodeBaseMapper mqmsFaultDecodeBaseMapper;
    @Autowired
    MqmsFaultDecodeMapper mqmsFaultDecodeMapper;
    @Autowired
    MqmsVinDecodeBaseMapper mqmsVinDecodeBaseMapper;
    @Autowired
    MqmsVinDecodeMapper mqmsVinDecodeMapper;
    @Autowired
    MqmsTranProductionDecodeMapper mqmsTranProductionDecodeMapper;
    @Autowired
    MqmsTranProductionDecodeBaseMapper mqmsTranProductionDecodeBaseMapper;
    @Autowired
    MqmsTranManufacturesDecodeMapper mqmsTranManufacturesDecodeMapper;
    @Autowired
    MqmsTranManufacturesDecodeBaseMapper mqmsTranManufacturesDecodeBaseMapper;
    @Autowired
    MqmsTranYearDecodeBaseMapper mqmsTranYearDecodeBaseMapper;
    @Autowired
    MqmsTranYearDecodeMapper mqmsTranYearDecodeMapper;
    @Autowired
    MultiFilterService multiFilterService;

    @RequestMapping("/vin")
    public JSONObject vinDecode(@RequestParam(required = false) String page, @RequestParam(required = false) String rows, @RequestParam(required = false) String condition) {
        String table = "mqms_vin_decode";
        String orderByColumn = "id";
        return multiFilterService.multiFilterQuery(table, condition, page, rows, orderByColumn);
    }

    @RequestMapping("/salesPoint")
    public JSONObject salesPointDecode(@RequestParam(required = false) String page, @RequestParam(required = false) String rows, @RequestParam(required = false) String condition) {
        String table = "mqms_sales_point";
        String orderByColumn = "id";
        System.out.println(multiFilterService.multiFilterQuery(table, condition, page, rows, orderByColumn));
        return multiFilterService.multiFilterQuery(table, condition, page, rows, orderByColumn);
    }

    @RequestMapping("/transManu")
    public JSONObject transCodeDecode(@RequestParam(required = false) String page, @RequestParam(required = false) String rows, @RequestParam(required = false) String condition) {
        String table = "mqms_tran_manufactures_decode";
        String orderByColumn = "id";
        return multiFilterService.multiFilterQuery(table, condition, page, rows, orderByColumn);
    }

    @RequestMapping("/transType")
    public JSONObject transTypeDecode(@RequestParam(required = false) String page, @RequestParam(required = false) String rows, @RequestParam(required = false) String condition) {
        String table = "mqms_tran_production_decode";
        String orderByColumn = "id";
        return multiFilterService.multiFilterQuery(table, condition, page, rows, orderByColumn);
    }

    @RequestMapping("/transYear")
    public JSONObject transYearDecode(@RequestParam(required = false) String page, @RequestParam(required = false) String rows, @RequestParam(required = false) String condition) {
        String table = "mqms_tran_year_decode";
        String orderByColumn = "id";
        return multiFilterService.multiFilterQuery(table, condition, page, rows, orderByColumn);
    }

    @RequestMapping("/faultCode")
    public JSONObject faultCodeDecode(@RequestParam(required = false) String page, @RequestParam(required = false) String rows, @RequestParam(required = false) String condition) {
        String table = "mqms_fault_decode";
        String orderByColumn = "id";
        return multiFilterService.multiFilterQuery(table, condition, page, rows, orderByColumn);
    }

    /**
     * 销售点信息修改
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/salesPointRevise")
    public String salesPointRevise(HttpServletRequest request) throws IOException {
        String id = request.getParameter("id");
        String salesPointName = request.getParameter("sales_point_name");
        String salesPointArea = request.getParameter("sales_point_area");
        String salesPointCode = request.getParameter("sales_point_code");
        MqmsSalesPoint mqmsSalesPoint = new MqmsSalesPoint();
        mqmsSalesPoint.setSalesPointArea(salesPointArea);
        mqmsSalesPoint.setSalesPointCode(salesPointCode);
        mqmsSalesPoint.setSalesPointName(salesPointName);
        if (id.equals("默认值")) {
            mqmsSalesPointBaseMapper.insertMqmsSalesPoint(mqmsSalesPoint);
        } else {
            mqmsSalesPoint.setId(Integer.parseInt(id));
            mqmsSalesPointBaseMapper.updateMqmsSalesPoint(mqmsSalesPoint);
        }
        return "数据操作成功";
    }

    /**
     * 销售点信息删除
     * @param ids
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/salesPointDelete", method = RequestMethod.POST)
    @ResponseBody
    public String salesPointDelete(String[] ids) throws IOException {
        for (String id : ids) {
            mqmsSalesPointMapper.deleteSalesPointById(id);
        }
        return "数据删除成功";
    }

    /**
     * 销售点信息查询
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/salesPointInfor", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject salesPointInfor(HttpServletRequest request) throws IOException {
        JSONArray jsonArray = new JSONArray();
        JSONObject result = new JSONObject();
        String salesPointName = request.getParameter("salesPointName");
        String salesPointArea = request.getParameter("salesPointArea");
        String salesPointCode = request.getParameter("salesPointCode");
        List<HashMap<String, String>> list = mqmsSalesPointMapper.searchSalesPointInfor(salesPointName, salesPointArea, salesPointCode);
        System.out.println(list);
        for(HashMap obj:list){
            JSONObject jsonObject = JSONObject.parseObject(JSON.toJSONString(obj));
            jsonArray.add(jsonObject);
        }
        result.put("total",list.size());
        result.put("rows", jsonArray);
        System.out.println(result);
//        result=jsonArray.getJSONObject(0);
        return result;
    }

    /**
     * 故障代码修改
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/faultCodeRevise")
    public String faultCodeRevise(HttpServletRequest request) throws IOException {
        String id = request.getParameter("id");
        String faultPartCode = request.getParameter("fault_part_code");
        String faultPartName = request.getParameter("fault_part_name");
        String faultSymptomPhoeno = request.getParameter("fault_symptom_phoeno");
        String faultSymptomCode = request.getParameter("fault_symptom_code");
        MqmsFaultDecode mqmsFaultDecode = new MqmsFaultDecode();
        mqmsFaultDecode.setFaultPartCode(faultPartCode);
        mqmsFaultDecode.setFaultPartName(faultPartName);
        mqmsFaultDecode.setFaultSymptomCode(faultSymptomCode);
        mqmsFaultDecode.setFaultSymptomPhoeno(faultSymptomPhoeno);
        if (id.equals("默认值")) {
            mqmsFaultDecodeBaseMapper.insertMqmsFaultDecode(mqmsFaultDecode);
        } else {
            mqmsFaultDecode.setId(Integer.parseInt(id));
            mqmsFaultDecodeBaseMapper.updateMqmsFaultDecode(mqmsFaultDecode);
        }
        return "数据操作成功";
    }

    /**
     * 故障代码删除
     * @param ids
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/faultCodeDelete", method = RequestMethod.POST)
    @ResponseBody
    public String faultCodeDelete(String[] ids) throws IOException {
        for (String id : ids) {
            mqmsFaultDecodeMapper.deleteFaultCodeById(id);
        }
        return "数据删除成功";
    }

    /**
     * 故障代码查询
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/faultCodeInfor", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject faultCodeInfor(HttpServletRequest request) throws IOException {

        JSONArray jsonArray = new JSONArray();
        JSONObject result = new JSONObject();
        String faultPartCode = request.getParameter("faultPartCode");
        String faultPartName = request.getParameter("faultPartName");
        String faultSymptomPhoeno = request.getParameter("faultSymptomPhoeno");
        String faultSymptomCode = request.getParameter("faultSymptomCode");
        List<HashMap<String, String>> list = mqmsFaultDecodeMapper.searchFaultCodeInfor(faultPartCode, faultPartName, faultSymptomPhoeno,faultSymptomCode);
//        System.out.println(list);
        for(HashMap obj:list){
            JSONObject jsonObject = JSONObject.parseObject(JSON.toJSONString(obj));
            jsonArray.add(jsonObject);
        }
        result.put("total",list.size());
        result.put("rows", jsonArray);
//        System.out.println(result);
        return result;
    }

    /**
     * VIN码修改
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/vinRevise")
    public String vinRevise(HttpServletRequest request) throws IOException {
        String id = request.getParameter("id");
        String vinShortCode = request.getParameter("vin_short_code");
        String vinSimCode = request.getParameter("vin_sim_code");
        String vinEngType = request.getParameter("vin_eng_type");
        String vinSeries = request.getParameter("vin_series");
        String vinEngShortCode = request.getParameter("vin_eng_short_code");
        String vinTransmShortCode = request.getParameter("vin_transm_short_code");
        String vinCarShortCode = request.getParameter("vin_car_short_code");
        String vinCarType = request.getParameter("vin_car_type");
        String vinTransmType = request.getParameter("vin_transm_type");

        MqmsVinDecode mqmsVinDecode = new MqmsVinDecode();
        mqmsVinDecode.setVinCarShortCode(vinShortCode);
        mqmsVinDecode.setVinSimCode(vinSimCode);
        mqmsVinDecode.setVinEngType(vinEngType);
        mqmsVinDecode.setVinSeries(vinSeries);
        mqmsVinDecode.setVinEngShortCode(vinEngShortCode);
        mqmsVinDecode.setVinTransmShortCode(vinTransmShortCode);
        mqmsVinDecode.setVinCarShortCode(vinCarShortCode);
        mqmsVinDecode.setVinCarType(vinCarType);
        mqmsVinDecode.setVinTransmType(vinTransmType);
        if (id.equals("默认值")) {
            mqmsVinDecodeBaseMapper.insertMqmsVinDecode(mqmsVinDecode);
        } else {
            mqmsVinDecode.setId(Integer.parseInt(id));
            mqmsVinDecodeBaseMapper.updateMqmsVinDecode(mqmsVinDecode);
        }
        return "数据操作成功";
    }

    /**
     * VIN删除
     * @param ids
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/vinDelete", method = RequestMethod.POST)
    @ResponseBody
    public String vinDelete(String[] ids) throws IOException {
        for (String id : ids) {
           mqmsVinDecodeMapper.deleteVinById(id);
        }
        return "数据删除成功";
    }

    /**
     * VIN码信息查询
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/vinInfor", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject vinInfor(HttpServletRequest request) throws IOException {

        JSONArray jsonArray = new JSONArray();
        JSONObject result = new JSONObject();
        String vinShortCode = request.getParameter("vinShortCode");
        String vinSimCode = request.getParameter("vinSimCode");
        String vinEngType = request.getParameter("vinEngType");
        String vinSeries = request.getParameter("vinSeries");
        System.out.println(vinSeries);
        String vinEngShortCode = request.getParameter("vinEngShortCode");
        String vinTransmShortCode = request.getParameter("vinTransmShortCode");
        String vinCarShortCode = request.getParameter("vinCarShortCode");
        String vinCarType = request.getParameter("vinCarType");
        String vinTransmType = request.getParameter("vinTransmType");
        List<HashMap<String, String>> list = mqmsVinDecodeMapper.searchVinInfor(
                vinShortCode,
                vinSimCode,
                vinEngType,
                vinSeries,
                vinEngShortCode,
                vinTransmShortCode,
                vinCarShortCode,
                vinCarType,
                vinTransmType);
        for(HashMap obj:list){
            JSONObject jsonObject = JSONObject.parseObject(JSON.toJSONString(obj));
            jsonArray.add(jsonObject);
        }
        result.put("total",list.size());
        result.put("rows", jsonArray);
        System.out.println(result);
        return result;
    }

    /**
     * 变速箱类型信息修改
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/transTypeRevise")
    public String transTypeRevise(HttpServletRequest request) throws IOException {
        String id = request.getParameter("id");
        String tranProModel = request.getParameter("tran_pro_model");
        String tranShortCode = request.getParameter("tran_shortCode");
        MqmsTranProductionDecode mqmsTranProductionDecode=new MqmsTranProductionDecode();
        mqmsTranProductionDecode.setTranProModel(tranProModel);
        mqmsTranProductionDecode.setTranShortCode(tranShortCode);

        if (id.equals("默认值")) {
            mqmsTranProductionDecodeBaseMapper.insertMqmsTranProductionDecode(mqmsTranProductionDecode);
        } else {
            mqmsTranProductionDecode.setId(Integer.parseInt(id));
            mqmsTranProductionDecodeBaseMapper.updateMqmsTranProductionDecode(mqmsTranProductionDecode);
        }
        return "数据操作成功";
    }

    /**
     * 变速箱类型信息删除
     * @param ids
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/transTypeDelete", method = RequestMethod.POST)
    @ResponseBody
    public String transTypeDelete(String[] ids) throws IOException {
        for (String id : ids) {
            mqmsTranProductionDecodeMapper.deleteTransTypeById(id);
        }
        return "数据删除成功";
    }

    /**
     * 变速箱类型信息查询
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/transTypeInfor", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject transTypeInfor(HttpServletRequest request) throws IOException {

        JSONArray jsonArray = new JSONArray();
        JSONObject result = new JSONObject();
        String tranProModel = request.getParameter("tranProModel");
        String tranShortCode = request.getParameter("tranShortCode");

        List<HashMap<String, String>> list = mqmsTranProductionDecodeMapper.searchTransTypeInfor(
                tranProModel,
                tranShortCode);
        for(HashMap obj:list){
            JSONObject jsonObject = JSONObject.parseObject(JSON.toJSONString(obj));
            jsonArray.add(jsonObject);
        }
        result.put("total",list.size());
        result.put("rows", jsonArray);
        return result;
    }

    /**
     * 变速箱厂家信息修改
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/transManuRevise")
    public String transManuRevise(HttpServletRequest request) throws IOException {
        String id = request.getParameter("id");
        String tranManufactureModel = request.getParameter("tran_manufacture_model");
        String tranManufacture = request.getParameter("tran_manufacture");
        MqmsTranManufacturesDecode mqmsTranManufacturesDecode=new MqmsTranManufacturesDecode();
        mqmsTranManufacturesDecode.setTranManufactureModel(tranManufactureModel);
        mqmsTranManufacturesDecode.setTranManufacture(tranManufacture);

        if (id.equals("默认值")) {
            mqmsTranManufacturesDecodeBaseMapper.insertMqmsTranManufacturesDecode(mqmsTranManufacturesDecode);
        } else {
            mqmsTranManufacturesDecode.setId(Integer.parseInt(id));
            mqmsTranManufacturesDecodeBaseMapper.updateMqmsTranManufacturesDecode(mqmsTranManufacturesDecode);
        }
        return "数据操作成功";
    }

    /**
     * 变速箱厂家信息删除
     * @param ids
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/transManuDelete", method = RequestMethod.POST)
    @ResponseBody
    public String transManuDelete(String[] ids) throws IOException {
        for (String id : ids) {
            mqmsTranManufacturesDecodeMapper.deleteTransManuById(id);
        }
        return "数据删除成功";
    }

    /**
     * 变速箱年份信息修改
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/transYearRevise")
    public String transYearRevise(HttpServletRequest request) throws IOException {
        String id = request.getParameter("id");
        String tranProYearCode = request.getParameter("tran_pro_year_code");
        String tranProYear = request.getParameter("tran_pro_year");
        MqmsTranYearDecode mqmsTranYearDecode=new MqmsTranYearDecode();
        mqmsTranYearDecode.setTranProYearCode(tranProYearCode);
        mqmsTranYearDecode.setTranProYear(tranProYear);

        if (id.equals("默认值")) {
            mqmsTranYearDecodeBaseMapper.insertMqmsTranYearDecode(mqmsTranYearDecode);
        } else {
            mqmsTranYearDecode.setId(Integer.parseInt(id));
            mqmsTranYearDecodeBaseMapper.updateMqmsTranYearDecode(mqmsTranYearDecode);
        }
        return "数据操作成功";
    }

    /**
     * 变速箱年份信息删除
     * @param ids
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/transYearDelete", method = RequestMethod.POST)
    @ResponseBody
    public String transYearDelete(String[] ids) throws IOException {
        for (String id : ids) {
           mqmsTranYearDecodeMapper.deleteTransYearById(id);
        }
        return "数据删除成功";
    }
}
