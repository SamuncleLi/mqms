package com.gamc.efactory.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gamc.efactory.config.Config;
import com.gamc.efactory.config.TaskName;
import com.gamc.efactory.dao.MqmsFailureTrackMapper;
import com.gamc.efactory.dao.UserMapper;
import com.gamc.efactory.model.dataObject.*;
import com.gamc.efactory.service.FailureTrackService;
import com.gamc.efactory.service.HttpService;
import com.gamc.efactory.service.MultiFilterService;
import com.gamc.efactory.service.serviceImpl.UserService;
import com.gamc.efactory.util.AttDateUtil;
import com.gamc.efactory.util.AttHttpRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zeho Lee on 2020/2/18.
 */
@RestController
@RequestMapping("/failure_track")
public class FailureTrackController {
    @Autowired
    MultiFilterService multiFilterService;
    @Autowired
    MqmsFailureTrackMapper mqmsFailureTrackMapper;
    @Autowired
    HttpService httpService;
    @Autowired
    FailureTrackService failureTrackService;
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/columnNameAndComment")
    public JSONArray getColumnNameAndComment(@RequestParam("table")String table){
        //数据库名
        String schema = "mqms";
        return multiFilterService.columnNameAndCommentQuery(schema, table);
    }

    @RequestMapping("/add")
    public JSONObject addFailureAnalysis(@RequestParam String voucherCodes, MqmsFailureTrack mqmsFailureTrack){
        String[] voucherCodeArray = voucherCodes.split(",");
        JSONObject result = new JSONObject();
        int count = 0;
        for(String voucherCode:voucherCodeArray){
            mqmsFailureTrack.setVoucherCode(voucherCode);
            mqmsFailureTrackMapper.insertMqmsFailureTrack(mqmsFailureTrack);
            count ++;
        }
        if(count == voucherCodeArray.length){
            result.put("success", true);
        }
        else {
            result.put("success", false);
        }
        return result;
    }

    @RequestMapping("/list")
    public JSONObject multiFilter(@RequestParam(required = false)String page, @RequestParam(required = false) String rows,@RequestParam(required = false) String condition){
        String table = "mqms_failure_track";
        String orderByColumn = "failure_track_id";
        return multiFilterService.multiFilterQuery(table,condition,page,rows, orderByColumn);
    }

    /**
     * @描述 快递到达信息和快递单号
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2020/3/12
     * @参变量
     * @返回
     * @抛出异常
    */
    @RequestMapping("/delivery_confirm")
    public JSONObject deliveryConfirm(@RequestParam("failureTrackIds")String failureTrackIds, @RequestParam("deliveryReceivedDate")String deliveryReceivedDate, @RequestParam("deliveryCode")String deliveryCode){
        String[] failureTrackIdArray = failureTrackIds.split(",");
        JSONObject result = new JSONObject();
        int count = 0;
        int[] failureTrackInt = new int[failureTrackIdArray.length];
        for(int i=0;i<failureTrackIdArray.length;i++){
            failureTrackInt[i] = Integer.parseInt(failureTrackIdArray[i]);
        }
        for(int i=0;i<failureTrackInt.length;i++){
            MqmsFailureTrack mqmsFailureTrack = new MqmsFailureTrack();
            mqmsFailureTrack.setFailureTrackId(failureTrackInt[i]);
            mqmsFailureTrack.setDeliveryReceivedDate(deliveryReceivedDate);
            mqmsFailureTrack.setDeliveryCode(deliveryCode);
            count += mqmsFailureTrackMapper.updateMqmsFailureTrack(mqmsFailureTrack);
        }
        if(count == failureTrackInt.length){
            result.put("success", "true");
        }
        else{
            result.put("success", "false");
        }
        return result;
    }

    /**
     * @描述 提交到流程系统
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2020/3/13
     * @参变量
     * @返回
     * @抛出异常
    */
    @RequestMapping("/submit_to_process")
    @Transactional
    public JSONObject submitToProcess(@RequestParam String failureTrackIds){
        //TODO 防止重复提交
        JSONObject result = new JSONObject();
        String[] failureTrackIdArray = failureTrackIds.split(",");
        int count = 0;
        int[] failureTrackInt = new int[failureTrackIdArray.length];
        for(int i=0;i<failureTrackIdArray.length;i++){
            failureTrackInt[i] = Integer.parseInt(failureTrackIdArray[i]);
        }
        try {
            for(int i=0;i<failureTrackInt.length;i++){
                JSONObject jsonObject = new JSONObject();
                JSONObject variables=new JSONObject();
                JSONArray shrIds=new JSONArray();
                variables.put("arrayVariables",shrIds);
                JSONObject proCK=new JSONObject();
                proCK.put("scpzdd",1732);
                proCK.put("zxdd",1732);
                proCK.put("xzjxks",1732);
                variables.put("processChecker",proCK);
                JSONObject condition = new JSONObject();
                condition.put("zxsy","y");
                variables.put("condition", condition);
                jsonObject.put("variables", variables.toString());
                jsonObject.put("processName","market_quality");
                jsonObject.put("userId",1279);
                jsonObject.put("userName","ss");
                jsonObject.put("applyTime",AttDateUtil.getNow("standard"));
                jsonObject.put("formName","design_imp_account_auth");
                jsonObject.put("formId",1);
                jsonObject.put("simpleReason","simple");
                jsonObject.put("processInstTitle","活动表单");
                jsonObject.put("form_data_url","http://localhost:8086/mqms/failure_track/form_data?failureTrackId=" + String.valueOf(failureTrackInt[i]));

                String url="http://localhost:8081/process/SAO/build";

                JSONObject returnJson = AttHttpRequestUtil.httpPost(url, jsonObject, false);

                //TODO 更新sao_id 3/24
                MqmsFailureTrack failureTrack = new MqmsFailureTrack();
                failureTrack.setFailureTrackId(failureTrackInt[i]);
                failureTrack.setSaoId(returnJson.getLong("SAOId"));
                mqmsFailureTrackMapper.updateMqmsFailureTrack(failureTrack);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println(".......................test.......................");
            return result;
        }
    }

    /**
     * @描述 外观检查
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2020/3/13
     * @参变量
     * @返回
     * @抛出异常
    */
    @RequestMapping("/appearance_check")
    public JSONObject appearanceCheck(SimpleApplicationObject simpleApplicationObject, MqmsFailureTrack mqmsFailureTrack, @RequestParam("file") List<MultipartFile> file){
        JSONObject result = new JSONObject();
        String appendix = mqmsFailureTrack.getAppendix();

        //向流程系统提交同意的申请
        Map map = new HashMap();
        map = JSONObject.parseObject(JSONObject.toJSONString(simpleApplicationObject), Map.class);
        map.put("auditorInfo", "agree");
        map.put("auditorComment", "同意");
        map.put("variablesName", "variables");
        JSONObject variable = new JSONObject();
        JSONObject condition = new JSONObject();
        condition.put("xyjx", "y");
        variable.put("condition", condition);
        
        JSONArray arrayVariables = new JSONArray();
        JSONObject departmentVariable1 = new JSONObject();
        JSONObject departmentCondition1 = new JSONObject();
        JSONObject departmentProcessChecker1 = new JSONObject();
        departmentCondition1.put("yxz", "n");
        departmentProcessChecker1.put("ck", 1732);
        departmentProcessChecker1.put("gcsjx", 1279);
        departmentProcessChecker1.put("kz", 1732);
        departmentVariable1.put("processChecker", departmentProcessChecker1);
        departmentVariable1.put("condition", departmentCondition1);

        JSONObject departmentVariable2 = new JSONObject();
        JSONObject departmentCondition2 = new JSONObject();
        JSONObject departmentProcessChecker2 = new JSONObject();
        departmentCondition2.put("yxz", "n");
        departmentProcessChecker2.put("ck", 1279);
        departmentProcessChecker2.put("gcsjx", 1732);
        departmentProcessChecker2.put("kz", 1279);
        departmentVariable2.put("processChecker", departmentProcessChecker2);
        departmentVariable2.put("condition", departmentCondition2);

        arrayVariables.add(departmentVariable1);
        arrayVariables.add(departmentVariable2);
        
        variable.put("arrayVariables", arrayVariables);
        
        JSONObject processChecker = new JSONObject();
        processChecker.put("scpzxz", 1279);
        processChecker.put("scpzkz", 1732);
        processChecker.put("gd", 1732);
        variable.put("processChecker", processChecker);
        map.put("variables", variable.toJSONString());
        JSONObject returnJson = httpService.postInJSON(Config.processSystem.getVarName()+"/SAO/audit/team3fvariables", map, JSONObject.class);

        //保存文件, 文件名为 审核者姓名+文件名
        try{
            int userId = simpleApplicationObject.getAssigneeId();
            User user = userMapper.queryUserLimit1(userId);
            mqmsFailureTrack = failureTrackService.fileUpload(file, simpleApplicationObject, user, mqmsFailureTrack, appendix);
            mqmsFailureTrackMapper.updateMqmsFailureTrack(mqmsFailureTrack);
        }
        catch (Exception e){
            e.printStackTrace();
        }


        return returnJson;
    }

    @RequestMapping("/form_data")
    /**
     * @描述 获取审核表单信息
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2020/3/16
     * @参变量[simpleApplicationObjectData]
     * @返回 com.alibaba.fastjson.JSONObject
     * @抛出异常
    */
    public String getFormData(@RequestParam(value = "failureTrackId")int failureTrackId , @RequestBody JSONObject simpleApplicationObjectData) throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();

        ProcessForm processForm = new ProcessForm();
        MqmsFailureTrack mqmsFailureTrack = new MqmsFailureTrack();
        mqmsFailureTrack.setFailureTrackId(failureTrackId);
        mqmsFailureTrack = mqmsFailureTrackMapper.queryMqmsFailureTrackLimit1(mqmsFailureTrack);
        //获取基础信息
        ProcessForm.DataDisplayGroup basicInfo = failureTrackService.getBasicInfo(mqmsFailureTrack.getVoucherCode());

//            ProcessForm.DataDisplaySingle single3 = new ProcessForm.DataDisplaySingle();
//            single3.setTitle("图片");
//            single3.setType("image");
//            single3.setContent("http://192.168.100.250:8081/test/generic/web/20191216-000001-before1");
//            single3.setCol(1);
//            single3.setRow(2);
//            ProcessForm.DataDisplaySingle single4 = new ProcessForm.DataDisplaySingle();
//            single4.setTitle("文件");
//            single4.setType("file");
//            single4.setContent("https://downpack.baidu.com/litebaiduboxapp_AndroidPhone_1020164i.apk");
//            single4.setCol(3);
//            single4.setRow(2);

        processForm.addNormalData(basicInfo);

        if("市场品质担当".equals(simpleApplicationObjectData.getString("taskName"))){
            String structure2 = "[[1, 1, 1, 1], [4]]";
            ProcessForm.SubmitFormGroup submitFormGroup = new ProcessForm.SubmitFormGroup();
            ProcessForm.SubmitFormSingle submitFormSingle1 = new ProcessForm.SubmitFormSingle();
            submitFormSingle1.setType("textbox");
            submitFormSingle1.setTitle("外观情况");
            submitFormSingle1.setName("appearance");
            submitFormSingle1.setInput_id("appearance");
            submitFormSingle1.setRow(1);
            submitFormSingle1.setCol(1);
            ProcessForm.SubmitFormSingle submitFormSingle2 = new ProcessForm.SubmitFormSingle();
            submitFormSingle2.setType("combobox-multi");
            submitFormSingle2.setTitle("是否装车");
            submitFormSingle2.setName("carTestSymbol");
            submitFormSingle2.setInput_id("carTestSymbol");
            submitFormSingle2.setRow(1);
            submitFormSingle2.setCol(2);
            submitFormSingle2.setData_url("/static/test.json");
            submitFormSingle2.addOption("是","y");
            submitFormSingle2.addOption("否","n");
            ProcessForm.SubmitFormSingle submitFormSingle4 = new ProcessForm.SubmitFormSingle();
            submitFormSingle4.setType("filebox");
            submitFormSingle4.setTitle("上传附件");
            submitFormSingle4.setName("file");
            submitFormSingle4.setInput_id("file");
            submitFormSingle4.setRow(2);
            submitFormSingle4.setCol(1);
//            ProcessForm.SubmitFormSingle submitFormSingle3 = new ProcessForm.SubmitFormSingle();
//            submitFormSingle3.setType("filebox");
//            submitFormSingle3.setTitle("图片上传");
//            submitFormSingle3.setName("img");
//            submitFormSingle3.setInput_id("img");
//            submitFormSingle3.setRow(1);
//            submitFormSingle3.setCol(3);
//            ProcessForm.SubmitFormSingle submitFormSingle4 = new ProcessForm.SubmitFormSingle();
//            submitFormSingle4.setType("img");
//            submitFormSingle4.setTitle("图片预览");
//            submitFormSingle4.setName("img");
//            submitFormSingle4.setInput_id("img");
//            submitFormSingle4.setRow(2);
//            submitFormSingle4.setCol(1);
//            submitFormSingle4.setLines(4);
            submitFormGroup.addSubmitSingle(submitFormSingle1);
            submitFormGroup.addSubmitSingle(submitFormSingle2);
//            submitFormGroup.addSubmitSingle(submitFormSingle3);
            submitFormGroup.addSubmitSingle(submitFormSingle4);
            List<List<Integer>> mStructure2 = null;

            mStructure2 = objectMapper.readValue(structure2.toString(), List.class);

            submitFormGroup.setStructure(mStructure2);
            processForm.setSubmitForm(submitFormGroup);
            ProcessForm.SubmitButton submitButton = new ProcessForm.SubmitButton();

            submitButton.setName("提交");
            submitButton.setUrl("http://127.0.0.1:8086/mqms/failure_track/appearance_check?failureTrackId=" + String.valueOf(mqmsFailureTrack.getFailureTrackId()));
            processForm.addSubmitButton(submitButton);
        }
        else if("再现担当".equals(simpleApplicationObjectData.getString("taskName"))){
            ProcessForm.DataDisplayGroup previousInfo = failureTrackService.getPreviousInfo(failureTrackId);
            processForm.addNormalData(previousInfo);
            ProcessForm.DataDisplayGroup appendixInfo = failureTrackService.getAppendixInfo(failureTrackId);
            processForm.addNormalData(appendixInfo);

            String structure2 = "[[1, 3], [1,3], [4]]";
            ProcessForm.SubmitFormGroup submitFormGroup = new ProcessForm.SubmitFormGroup();

            ProcessForm.SubmitFormSingle submitFormSingle1 = new ProcessForm.SubmitFormSingle();
            submitFormSingle1.setType("datebox");
            submitFormSingle1.setTitle("再现时间");
            submitFormSingle1.setName("failureReappearDate");
            submitFormSingle1.setInput_id("failureReappearDate");
            submitFormSingle1.setRow(1);
            submitFormSingle1.setCol(1);
            ProcessForm.SubmitFormSingle submitFormSingle2 = new ProcessForm.SubmitFormSingle();
            submitFormSingle2.setType("textbox");
            submitFormSingle2.setTitle("再现工况");
            submitFormSingle2.setName("failureReappearSituation");
            submitFormSingle2.setInput_id("failureReappearSituation");
            submitFormSingle2.setRow(1);
            submitFormSingle2.setCol(2);
            ProcessForm.SubmitFormSingle submitFormSingle5 = new ProcessForm.SubmitFormSingle();
            submitFormSingle5.setType("datebox");
            submitFormSingle5.setTitle("装车时间");
            submitFormSingle5.setName("reloadDate");
            submitFormSingle5.setInput_id("reloadDate");
            submitFormSingle5.setRow(2);
            submitFormSingle5.setCol(1);
            ProcessForm.SubmitFormSingle submitFormSingle3 = new ProcessForm.SubmitFormSingle();
            submitFormSingle3.setType("textbox");
            submitFormSingle3.setTitle("再现结果");
            submitFormSingle3.setName("failureReappearResult");
            submitFormSingle3.setInput_id("failureReappearResult");
            submitFormSingle3.setRow(2);
            submitFormSingle3.setCol(2);
            ProcessForm.SubmitFormSingle submitFormSingle4 = new ProcessForm.SubmitFormSingle();
            submitFormSingle4.setType("filebox");
            submitFormSingle4.setTitle("上传附件");
            submitFormSingle4.setName("file");
            submitFormSingle4.setInput_id("file");
            submitFormSingle4.setRow(3);
            submitFormSingle4.setCol(1);
            submitFormGroup.addSubmitSingle(submitFormSingle1);
            submitFormGroup.addSubmitSingle(submitFormSingle2);
            submitFormGroup.addSubmitSingle(submitFormSingle3);
            submitFormGroup.addSubmitSingle(submitFormSingle4);
            submitFormGroup.addSubmitSingle(submitFormSingle5);
            List<List<Integer>> mStructure2 = null;

            mStructure2 = objectMapper.readValue(structure2.toString(), List.class);

            submitFormGroup.setStructure(mStructure2);
            processForm.setSubmitForm(submitFormGroup);
            ProcessForm.SubmitButton submitButton = new ProcessForm.SubmitButton();

            submitButton.setName("提交");
            submitButton.setUrl("http://127.0.0.1:8086/mqms/failure_track/failure_reappear?failureTrackId=" + String.valueOf(mqmsFailureTrack.getFailureTrackId()));
            processForm.addSubmitButton(submitButton);
        }
        else if("选择解析科室".equals(simpleApplicationObjectData.getString("taskName"))){
            String structure2 = "[[1,3]]";
            ProcessForm.SubmitFormGroup submitFormGroup = new ProcessForm.SubmitFormGroup();
            ProcessForm.SubmitFormSingle submitFormSingle1 = new ProcessForm.SubmitFormSingle();
            submitFormSingle1.setType("combobox");
            submitFormSingle1.setTitle("是否解析");
            submitFormSingle1.setName("xyjx");
            submitFormSingle1.setInput_id("xyjx");
            submitFormSingle1.setRow(1);
            submitFormSingle1.setCol(1);
            submitFormSingle1.addOption("是", "y");
            submitFormSingle1.addOption("否", "n");
            ProcessForm.SubmitFormSingle submitFormSingle2 = new ProcessForm.SubmitFormSingle();
            submitFormSingle2.setType("combobox-multi");
            submitFormSingle2.setTitle("解析科室");
            submitFormSingle2.setName("analysisDepartments");
            submitFormSingle2.setInput_id("analysisDepartments");
            submitFormSingle2.setRow(1);
            submitFormSingle2.setCol(2);
            //TODO 动态加载科室 3/26
            submitFormSingle2.addOption("设备科", "sbk");
            submitFormSingle2.addOption("生产技术科", "scjsk");
            submitFormGroup.addSubmitSingle(submitFormSingle1);
            submitFormGroup.addSubmitSingle(submitFormSingle2);
            List<List<Integer>> mStructure2 = null;

            mStructure2 = objectMapper.readValue(structure2.toString(), List.class);

            submitFormGroup.setStructure(mStructure2);
            processForm.setSubmitForm(submitFormGroup);
            ProcessForm.SubmitButton submitButton = new ProcessForm.SubmitButton();

            submitButton.setName("提交");
            submitButton.setUrl("http://127.0.0.1:8086/mqms/failure_track/choose_department?failureTrackId=" + String.valueOf(mqmsFailureTrack.getFailureTrackId()));
            processForm.addSubmitButton(submitButton);
        }
        else if("窗口".equals(simpleApplicationObjectData.getString("taskName"))){
            ProcessForm.DataDisplayGroup failureTrackInfo = failureTrackService.getPreviousInfo(failureTrackId);
            processForm.addNormalData(failureTrackInfo);
            ProcessForm.DataDisplayGroup appendixInfo = failureTrackService.getAppendixInfo(failureTrackId);
            processForm.addNormalData(appendixInfo);

            String structure2 = "[[2,2]]";
            ProcessForm.SubmitFormGroup submitFormGroup = new ProcessForm.SubmitFormGroup();
            ProcessForm.SubmitFormSingle submitFormSingle1 = new ProcessForm.SubmitFormSingle();
            submitFormSingle1.setType("combobox-multi");
            submitFormSingle1.setTitle("选择解析人");
            submitFormSingle1.setName("gcsjx");
            submitFormSingle1.setInput_id("gcsjx");
            submitFormSingle1.setRow(1);
            submitFormSingle1.setCol(1);
            //TODO 根据flag获取可选工程师 3/26
            submitFormSingle1.addOption("张三", "张三");
            submitFormSingle1.addOption("李四", "李四");
            ProcessForm.SubmitFormSingle submitFormSingle2 = new ProcessForm.SubmitFormSingle();
            submitFormSingle2.setType("textbox");
            submitFormSingle2.setTitle("备注");
            submitFormSingle2.setName("desc");
            submitFormSingle2.setInput_id("desc");
            submitFormSingle2.setRow(1);
            submitFormSingle2.setCol(3);
            submitFormGroup.addSubmitSingle(submitFormSingle1);
            submitFormGroup.addSubmitSingle(submitFormSingle2);
            List<List<Integer>> mStructure2 = null;

            mStructure2 = objectMapper.readValue(structure2.toString(), List.class);

            submitFormGroup.setStructure(mStructure2);
            processForm.setSubmitForm(submitFormGroup);
            ProcessForm.SubmitButton submitButton = new ProcessForm.SubmitButton();

            submitButton.setName("提交");
            submitButton.setUrl("http://127.0.0.1:8086/mqms/failure_track/choose_engineer?failureTrackId=" + String.valueOf(mqmsFailureTrack.getFailureTrackId()));
            processForm.addSubmitButton(submitButton);
        }
        else if("工程师解析".equals(simpleApplicationObjectData.getString("taskName"))){
            ProcessForm.DataDisplayGroup previousInfo = failureTrackService.getPreviousInfo(failureTrackId);
            processForm.addNormalData(previousInfo);
            ProcessForm.DataDisplayGroup appendixInfo = failureTrackService.getAppendixInfo(failureTrackId);
            processForm.addNormalData(appendixInfo);

            String structure2 = "[[4],[4],[3,1],[4]]";
            ProcessForm.SubmitFormGroup submitFormGroup = new ProcessForm.SubmitFormGroup();
            ProcessForm.SubmitFormSingle submitFormSingle1 = new ProcessForm.SubmitFormSingle();
            submitFormSingle1.setType("textbox");
            submitFormSingle1.setTitle("要因分析");
            submitFormSingle1.setName("mainReason");
            submitFormSingle1.setInput_id("mainReason");
            submitFormSingle1.setRow(1);
            submitFormSingle1.setCol(1);
            submitFormSingle1.setLines(3);

            ProcessForm.SubmitFormSingle submitFormSingle2 = new ProcessForm.SubmitFormSingle();
            submitFormSingle2.setType("textbox");
            submitFormSingle2.setTitle("流出分析");
            submitFormSingle2.setName("outflowReason");
            submitFormSingle2.setInput_id("outflowReason");
            submitFormSingle2.setRow(2);
            submitFormSingle2.setCol(1);
            submitFormSingle2.setLines(3);
            ProcessForm.SubmitFormSingle submitFormSingle3 = new ProcessForm.SubmitFormSingle();
            submitFormSingle3.setType("filebox");
            submitFormSingle3.setTitle("上传附件");
            submitFormSingle3.setName("appendix");
            submitFormSingle3.setInput_id("appendix");
            submitFormSingle3.setRow(3);
            submitFormSingle3.setCol(1);
            Map attr3 = new HashMap();
            attr3.put("data-options", "buttonText:'选择文件'");
            attr3.put("multiple", "true");
            submitFormSingle3.setAttr(attr3);
            ProcessForm.SubmitFormSingle submitFormSingle4 = new ProcessForm.SubmitFormSingle();
            submitFormSingle4.setType("datebox");
            submitFormSingle4.setTitle("对策实施时间");
            submitFormSingle4.setName("solution_date");
            submitFormSingle4.setInput_id("solution_date");
            submitFormSingle4.setRow(3);
            submitFormSingle4.setCol(4);
            ProcessForm.SubmitFormSingle submitFormSingle5 = new ProcessForm.SubmitFormSingle();
            submitFormSingle5.setType("textbox");
            submitFormSingle5.setTitle("对策");
            submitFormSingle5.setName("solution");
            submitFormSingle5.setInput_id("solution");
            submitFormSingle5.setRow(4);
            submitFormSingle5.setCol(1);
            submitFormSingle5.setLines(3);

            submitFormGroup.addSubmitSingle(submitFormSingle1);
            submitFormGroup.addSubmitSingle(submitFormSingle2);
            submitFormGroup.addSubmitSingle(submitFormSingle3);
            submitFormGroup.addSubmitSingle(submitFormSingle4);
            submitFormGroup.addSubmitSingle(submitFormSingle5);
            List<List<Integer>> mStructure2 = null;

            mStructure2 = objectMapper.readValue(structure2.toString(), List.class);

            submitFormGroup.setStructure(mStructure2);
            processForm.setSubmitForm(submitFormGroup);
            ProcessForm.SubmitButton submitButton = new ProcessForm.SubmitButton();

            submitButton.setName("提交");
            submitButton.setUrl("http://127.0.0.1:8086/mqms/failure_track/engineer_analysis?failureTrackId=" + String.valueOf(mqmsFailureTrack.getFailureTrackId()));
            processForm.addSubmitButton(submitButton);
        }
        else if("系长".equals(simpleApplicationObjectData.getString("taskName"))){
            ProcessForm.DataDisplayGroup previousInfo = failureTrackService.getPreviousInfo(failureTrackId);
            processForm.addNormalData(previousInfo);
            ProcessForm.DataDisplayGroup appendixInfo = failureTrackService.getAppendixInfo(failureTrackId);
            processForm.addNormalData(appendixInfo);

            //TODO 查询本科室工程师的解析数据 3/25
            ProcessForm.DataDisplayGroup engineerInfo = failureTrackService.getEngineerInfo(failureTrackId, simpleApplicationObjectData.getString("flag"));

            String structure2 = "[[4]]";
            ProcessForm.SubmitFormGroup submitFormGroup = new ProcessForm.SubmitFormGroup();
            ProcessForm.SubmitFormSingle submitFormSingle1 = new ProcessForm.SubmitFormSingle();
            submitFormSingle1.setType("textbox");
            submitFormSingle1.setTitle("评论");
            submitFormSingle1.setName("comment");
            submitFormSingle1.setInput_id("comment");
            submitFormSingle1.setRow(1);
            submitFormSingle1.setCol(1);
            submitFormSingle1.setLines(3);
            submitFormGroup.addSubmitSingle(submitFormSingle1);
            List<List<Integer>> mStructure2 = null;
            mStructure2 = objectMapper.readValue(structure2.toString(), List.class);

            submitFormGroup.setStructure(mStructure2);

            ProcessForm.SubmitButton submitButton = new ProcessForm.SubmitButton();

            submitButton.setName("提交");
            submitButton.setUrl("http://127.0.0.1:8086/mqms/failure_track/section_analysis?failureTrackId=" + String.valueOf(mqmsFailureTrack.getFailureTrackId()));
            processForm.addSubmitButton(submitButton);
        }
        else if("科长".equals(simpleApplicationObjectData.getString("taskName"))){
            String structure2 = "[[4]]";
            ProcessForm.SubmitFormGroup submitFormGroup = new ProcessForm.SubmitFormGroup();
            ProcessForm.SubmitFormSingle submitFormSingle1 = new ProcessForm.SubmitFormSingle();
            submitFormSingle1.setType("textbox");
            submitFormSingle1.setTitle("评论");
            submitFormSingle1.setName("comment");
            submitFormSingle1.setInput_id("comment");
            submitFormSingle1.setRow(1);
            submitFormSingle1.setCol(1);
            submitFormSingle1.setLines(3);
            submitFormGroup.addSubmitSingle(submitFormSingle1);
            List<List<Integer>> mStructure2 = null;
            mStructure2 = objectMapper.readValue(structure2.toString(), List.class);

            ProcessForm.SubmitButton submitButton = new ProcessForm.SubmitButton();

            submitButton.setName("提交");
            submitButton.setUrl("http://127.0.0.1:8086/mqms/failure_track/department_analysis?failureTrackId=" + String.valueOf(mqmsFailureTrack.getFailureTrackId()));
            processForm.addSubmitButton(submitButton);
        }
        else if("总结".equals(simpleApplicationObjectData.getString("taskName"))){
            String structure2 = "[[4]]";
            ProcessForm.SubmitFormGroup submitFormGroup = new ProcessForm.SubmitFormGroup();
            ProcessForm.SubmitFormSingle submitFormSingle1 = new ProcessForm.SubmitFormSingle();
            submitFormSingle1.setType("textbox");
            submitFormSingle1.setTitle("评论");
            submitFormSingle1.setName("comment");
            submitFormSingle1.setInput_id("comment");
            submitFormSingle1.setRow(1);
            submitFormSingle1.setCol(1);
            submitFormSingle1.setLines(3);
            submitFormGroup.addSubmitSingle(submitFormSingle1);
            List<List<Integer>> mStructure2 = null;
            mStructure2 = objectMapper.readValue(structure2.toString(), List.class);

            ProcessForm.SubmitButton submitButton = new ProcessForm.SubmitButton();

            submitButton.setName("同意");
            submitButton.setUrl("http://127.0.0.1:8086/mqms/failure_track/summary?failureTrackId=" + String.valueOf(mqmsFailureTrack.getFailureTrackId()));
            processForm.addSubmitButton(submitButton);

            ProcessForm.SubmitButton rejectButton = new ProcessForm.SubmitButton();
            rejectButton.setName("驳回");
            rejectButton.setUrl("http://127.0.0.1:8086/mqms/failure_track/summary?failureTrackId=" + String.valueOf(mqmsFailureTrack.getFailureTrackId()));
            processForm.addSubmitButton(rejectButton);
        }
        else if("市场品质系长审核".equals(simpleApplicationObjectData.getString("taskName"))){
            String structure2 = "[[4]]";
            ProcessForm.SubmitFormGroup submitFormGroup = new ProcessForm.SubmitFormGroup();
            ProcessForm.SubmitFormSingle submitFormSingle1 = new ProcessForm.SubmitFormSingle();
            submitFormSingle1.setType("textbox");
            submitFormSingle1.setTitle("评论");
            submitFormSingle1.setName("comment");
            submitFormSingle1.setInput_id("comment");
            submitFormSingle1.setRow(1);
            submitFormSingle1.setCol(1);
            submitFormSingle1.setLines(3);
            submitFormGroup.addSubmitSingle(submitFormSingle1);
            List<List<Integer>> mStructure2 = null;
            mStructure2 = objectMapper.readValue(structure2.toString(), List.class);

            ProcessForm.SubmitButton submitButton = new ProcessForm.SubmitButton();

            submitButton.setName("提交");
            submitButton.setUrl("http://127.0.0.1:8086/mqms/failure_track/quality_section?failureTrackId=" + String.valueOf(mqmsFailureTrack.getFailureTrackId()));
            processForm.addSubmitButton(submitButton);
        }
        else if("市场品质科长审核".equals(simpleApplicationObjectData.getString("taskName"))){
            String structure2 = "[[4]]";
            ProcessForm.SubmitFormGroup submitFormGroup = new ProcessForm.SubmitFormGroup();
            ProcessForm.SubmitFormSingle submitFormSingle1 = new ProcessForm.SubmitFormSingle();
            submitFormSingle1.setType("textbox");
            submitFormSingle1.setTitle("评论");
            submitFormSingle1.setName("comment");
            submitFormSingle1.setInput_id("comment");
            submitFormSingle1.setRow(1);
            submitFormSingle1.setCol(1);
            submitFormSingle1.setLines(3);
            submitFormGroup.addSubmitSingle(submitFormSingle1);
            List<List<Integer>> mStructure2 = null;
            mStructure2 = objectMapper.readValue(structure2.toString(), List.class);

            ProcessForm.SubmitButton submitButton = new ProcessForm.SubmitButton();

            submitButton.setName("提交");
            submitButton.setUrl("http://127.0.0.1:8086/mqms/failure_track/quality_department?failureTrackId=" + String.valueOf(mqmsFailureTrack.getFailureTrackId()));
            processForm.addSubmitButton(submitButton);
        }
        String str=objectMapper.writeValueAsString(processForm);

        return str;
    }

    @RequestMapping("/failure_reappear")
    public JSONObject failureReappear(SimpleApplicationObject simpleApplicationObject,MqmsFailureTrack mqmsFailureTrack, @RequestParam("file") List<MultipartFile> file){
        //根据SAOID更新并获取最新mqmsFailureTrack
        mqmsFailureTrack.UpdateBuild().where(mqmsFailureTrack.ConditionBuild().saoIdList(simpleApplicationObject.getSimpleApplicationObjectId()));
        mqmsFailureTrackMapper.updateMqmsFailureTrack(mqmsFailureTrack);
        mqmsFailureTrack = mqmsFailureTrackMapper.queryMqmsFailureTrackLimit1(mqmsFailureTrack);

        //保存文件, 文件名为 审核者姓名+文件名
        try{
            int userId = simpleApplicationObject.getAssigneeId();
            User user = userMapper.queryUserLimit1(userId);
            mqmsFailureTrack = failureTrackService.fileUpload(file, simpleApplicationObject, user, mqmsFailureTrack, mqmsFailureTrack.getAppendix());
            mqmsFailureTrackMapper.updateMqmsFailureTrack(mqmsFailureTrack);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        //向流程系统提交同意的申请
        Map map = new HashMap();
        map = JSONObject.parseObject(JSONObject.toJSONString(simpleApplicationObject), Map.class);
        map.put("auditorInfo", "agree");
        map.put("auditorComment", "同意");
        JSONObject returnJson = httpService.postInJSON(Config.processSystem.getVarName()+"/SAO/audit/team3fvariables", map, JSONObject.class);
        return returnJson;
    }

    @RequestMapping("/choose_department")
    public JSONObject chooseDepartment(SimpleApplicationObject simpleApplicationObject, MqmsFailureTrack mqmsFailureTrack){
        String[] departmentArray = mqmsFailureTrack.getAnalysisDepartments()
                .split(",");
        //更新科室
        mqmsFailureTrackMapper.update(mqmsFailureTrack.UpdateBuild().where(mqmsFailureTrack.ConditionBuild().saoIdList(simpleApplicationObject.getSimpleApplicationObjectId())).build());
        System.out.println(mqmsFailureTrack.getAnalysisDepartments());

//        //后台查询这些科室的窗口，并新建分析数据 3/25解决
//        for (int i=0;i<departmentArray.length;i++){
//            MqmsFailureAnalysis mqmsFailureAnalysis = new MqmsFailureAnalysis();
//            mqmsFailureAnalysis.setFailureAnalystDepartment();
//            mqmsFailureAnalysis.setSaoId();
//            mqmsFailureAnalysis.setTaskId();
//
//            //设置窗口姓名，id
//            mqmsFailureAnalysis.setFailureAnalystId();
//            mqmsFailureAnalysis.setFailureAnalystName();
//            mqmsFailureAnalysis.setFailureAnalystComment();
//        }


        //向流程系统提交同意的申请
        Map map = new HashMap();
        map = JSONObject.parseObject(JSONObject.toJSONString(simpleApplicationObject), Map.class);
        map.put("auditorInfo", "agree");
        map.put("auditorComment", "同意");
        JSONObject returnJson = httpService.postInJSON(Config.processSystem.getVarName()+"/SAO/audit/team3fvariables", map, JSONObject.class);
        return returnJson;
    }

    @RequestMapping("/choose_engineer")
    public JSONObject chooseEngineer(SimpleApplicationObject simpleApplicationObject, @RequestParam("flag")String flag ,@RequestParam("")){
        MqmsFailureAnalysis mqmsFailureAnalysis = new MqmsFailureAnalysis();
        mqmsFailureAnalysis.setFailureAnalystId(simpleApplicationObject.getAssigneeId());
        User user = userMapper.queryUserLimit1(simpleApplicationObject.getAssigneeId());
        mqmsFailureAnalysis.setFailureAnalystName(user.getUserName());
        mqmsFailureAnalysis.setFailureAnalystDepartment(user.getDepartment());
        mqmsFailureAnalysis.setSaoId(simpleApplicationObject.getSimpleApplicationObjectId());
        mqmsFailureAnalysis.setTaskId(simpleApplicationObject.getTaskId());
        mqmsFailureAnalysis.setTaskName(simpleApplicationObject.getTaskName());
        mqmsFailureAnalysis.setFlag(flag);

        //将截至日期，选择的工程师等合在一起
//        mqmsFailureAnalysis.setFailureAnalystComment();

        //向流程系统提交同意的申请
        Map map = new HashMap();
        map = JSONObject.parseObject(JSONObject.toJSONString(simpleApplicationObject), Map.class);
        map.put("auditorInfo", "agree");
        map.put("auditorComment", "同意");
        map.put("variablesName", "arrayVariable");
        JSONObject variable = new JSONObject();

        JSONArray arrayVariables = new JSONArray();
        JSONObject departmentVariable1 = new JSONObject();
        JSONObject departmentProcessChecker1 = new JSONObject();
        departmentProcessChecker1.put("gcsjx", 1279);
        departmentVariable1.put("processChecker", departmentProcessChecker1);

        JSONObject departmentVariable2 = new JSONObject();
        JSONObject departmentProcessChecker2 = new JSONObject();
        departmentProcessChecker2.put("gcsjx", 1278);
        departmentVariable2.put("processChecker", departmentProcessChecker2);

        arrayVariables.add(departmentVariable1);
        arrayVariables.add(departmentVariable2);

        variable.put("arrayVariables", arrayVariables);

        map.put("variables", variable.toJSONString());
        JSONObject returnJson = httpService.postInJSON(Config.processSystem.getVarName()+"/SAO/audit/team3fvariables", map, JSONObject.class);
        returnJson.put("success", "true");
        return returnJson;
    }

    /**
     * @描述 工程师解析
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2020/3/19
     * @参变量
     * @返回
     * @抛出异常
    */
    @RequestMapping("/engineer_analysis")
    public JSONObject engineerAnalysis(SimpleApplicationObject simpleApplicationObject, MqmsFailureTrack mqmsFailureTrack){
        //向流程系统提交同意的申请
        Map map = new HashMap();
        map = JSONObject.parseObject(JSONObject.toJSONString(simpleApplicationObject), Map.class);
        map.put("auditorInfo", "agree");
        map.put("auditorComment", "同意");

        //TODO 业务系统更新 3/25

        JSONObject returnJson = httpService.postInJSON(Config.processSystem.getVarName()+"/SAO/audit/team3fvariables", map, JSONObject.class);
        returnJson.put("success", "true");
        return returnJson;
    }

    @RequestMapping("/department_analysis")
    public JSONObject departmentAnalysis(SimpleApplicationObject simpleApplicationObject, MqmsFailureTrack mqmsFailureTrack){
        //向流程系统提交同意的申请
        Map map = new HashMap();
        map = JSONObject.parseObject(JSONObject.toJSONString(simpleApplicationObject), Map.class);
        map.put("auditorInfo", "agree");
        map.put("auditorComment", "同意");

        //TODO 业务系统更新 3/25

        JSONObject returnJson = httpService.postInJSON(Config.processSystem.getVarName()+"/SAO/audit/team3fvariables", map, JSONObject.class);
        returnJson.put("success", "true");
        return returnJson;
    }

    @RequestMapping("/summary")
    public JSONObject summary(SimpleApplicationObject simpleApplicationObject, MqmsFailureTrack mqmsFailureTrack){
        //向流程系统提交同意的申请
        Map map = new HashMap();
        map = JSONObject.parseObject(JSONObject.toJSONString(simpleApplicationObject), Map.class);
        map.put("auditorInfo", "agree");
        map.put("auditorComment", "同意");

        //TODO 业务系统更新 3/25

        JSONObject returnJson = httpService.postInJSON(Config.processSystem.getVarName()+"/SAO/audit/team3fvariables", map, JSONObject.class);
        returnJson.put("success", "true");
        return returnJson;
    }

    @RequestMapping("/quality_section")
    public JSONObject qualitySection(SimpleApplicationObject simpleApplicationObject, MqmsFailureTrack mqmsFailureTrack){
        //向流程系统提交同意的申请
        Map map = new HashMap();
        map = JSONObject.parseObject(JSONObject.toJSONString(simpleApplicationObject), Map.class);
        map.put("auditorInfo", "agree");
        map.put("auditorComment", "同意");

        //TODO 业务系统更新 3/25

        JSONObject returnJson = httpService.postInJSON(Config.processSystem.getVarName()+"/SAO/audit/team3fvariables", map, JSONObject.class);
        returnJson.put("success", "true");
        return returnJson;
    }

    @RequestMapping("/quality_department")
    public JSONObject qualityDepartment(SimpleApplicationObject simpleApplicationObject, MqmsFailureTrack mqmsFailureTrack){
        //向流程系统提交同意的申请
        Map map = new HashMap();
        map = JSONObject.parseObject(JSONObject.toJSONString(simpleApplicationObject), Map.class);
        map.put("auditorInfo", "agree");
        map.put("auditorComment", "同意");

        //TODO 业务系统更新 3/25

        JSONObject returnJson = httpService.postInJSON(Config.processSystem.getVarName()+"/SAO/audit/team3fvariables", map, JSONObject.class);
        returnJson.put("success", "true");
        return returnJson;
    }

    @RequestMapping("/doc_collect")
    public JSONObject docCollect(SimpleApplicationObject simpleApplicationObject, MqmsFailureTrack mqmsFailureTrack){
        //向流程系统提交同意的申请
        Map map = new HashMap();
        map = JSONObject.parseObject(JSONObject.toJSONString(simpleApplicationObject), Map.class);
        map.put("auditorInfo", "agree");
        map.put("auditorComment", "同意");

        //TODO 业务系统更新 3/25

        JSONObject returnJson = httpService.postInJSON(Config.processSystem.getVarName()+"/SAO/audit/team3fvariables", map, JSONObject.class);
        returnJson.put("success", "true");
        return returnJson;
    }
}
