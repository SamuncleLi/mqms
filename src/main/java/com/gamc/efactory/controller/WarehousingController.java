package com.gamc.efactory.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gamc.efactory.config.Config;
import com.gamc.efactory.dao.MaterialContractMapper;
import com.gamc.efactory.dao.UserMapper;
import com.gamc.efactory.dao.WarehousingMapper;
import com.gamc.efactory.model.dataObject.*;
import com.gamc.efactory.service.HttpService;
import com.gamc.efactory.service.MaterialService;
import com.gamc.efactory.util.AttDateUtil;
import com.gamc.efactory.util.EasyUIUtil;
import com.gamc.efactory.util.StringUtil;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by Zeho Lee on 2019/7/15.
 */
@RestController
public class WarehousingController {
    @Autowired
    WarehousingMapper warehousingMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    MaterialService materialService;
    @Autowired
    MaterialContractMapper materialContractMapper;
    @Autowired
    HttpService httpService;

    Logger logger = LoggerFactory.getLogger(WarehousingController.class);

    @RequestMapping(value="/warehousing/build")
    public JSONObject insertMaterial(Warehousing warehousing){
        //build时要注意这是新增物料，要加标志位
        JSONObject result = new JSONObject();
        int successTotal = warehousingMapper.insertWarehousing(warehousing);
        if(successTotal<=0){
            result.put("success", "false");
            result.put("errorMsg", "更新失败");
        }
        else{
            result.put("success", "true");
            result.put("successTotal", successTotal);
        }
        return result;
    }

    @RequestMapping(value="/warehousing/update")
    public JSONObject updateWarehousing(Warehousing warehousing){
        JSONObject result = new JSONObject();
        int successTotal =0;
        successTotal = warehousingMapper.updateWarehousing(warehousing);

        if(successTotal<=0){
            result.put("success", "false");
            result.put("errorMsg", "更新失败");
        }
        else{
            result.put("success", "true");
            result.put("successTotal", successTotal);
        }
        return result;
    }


    @RequestMapping(value = "/warehousing/out/batch/build")
    public JSONObject buildBatchWarehousingOut(@RequestParam(name = "warehousingInitialUserId")int warehousingInitialUserId,
                                                @RequestParam(name = "dataArray")String dataArray,
                                                @RequestParam(name= "processChecker")String processCheckerStr,
                                                @RequestParam(name= "conditions")String conditionsStr){
        JSONObject result = new JSONObject();
        JSONArray rows= JSONArray.parseArray(dataArray);
        JSONObject processChecker = JSONObject.parseObject(processCheckerStr);
        processChecker.put("ckgly", 1814);
        JSONObject conditions = JSONObject.parseObject(conditionsStr);
        JSONObject variables = new JSONObject();
        variables.put("processChecker", processChecker);
        variables.put("conditions", conditions);

        //获取用户信息
        User user = userMapper.queryUserLimit1(warehousingInitialUserId);

        int sum = 0;
        int warehousingId;
        //逐行获取数据
        for(int i=0;i<rows.size();i++){
            JSONObject data = rows.getJSONObject(i);
            //获取出库单信息
            Warehousing warehousing = data.toJavaObject(Warehousing.class);

            //判断种类、是否已签开口合同
            String materialCode = warehousing.getMaterialCode();

            warehousing.setMaterialContractType(materialService.divideContractType(materialCode));
            warehousing.setMaterialManagementType(materialService.divideOrderManagementType(materialCode));

            //如果是已签开口合同，则查询已签开口合同表
            if(warehousing.getMaterialContractType().equals("已签开口合同")){
                MaterialContract materialContract = new MaterialContract();
                materialContract.setMaterialCode(materialCode);
                materialContract = materialContractMapper.queryMaterialContractLimit1(materialContract);
            }

            warehousing.setWarehousingInitialUserId(warehousingInitialUserId);
            warehousing.setWarehousingInitialTime(AttDateUtil.getNow("all"));
            warehousing.setWarehousingInitialState("待汇总");
            warehousing.setWarehousingInitialUserName(user.getUserName());
            warehousing.setWarehousingInitialDepartment(user.getDepartment());
            warehousing.setVariables(variables.toJSONString());

            warehousingMapper.insertWarehousing(warehousing);
            sum++;
        }

        //发送给流程系统
        //生成汇总订单号
        Date date = new Date();
        String orderListCode = "1";
//        String orderListCode = String.valueOf(date.getTime());
        //每一组发送一个流程申请
        //TODO 发送给流程系统并接收回来的信息 发送processName、formName、formId
        Map<String, String> map = new HashMap<>();
        map.put("processName", "warehousingOutBuild");
        map.put("formName", "wms_warehousing");
        map.put("formId", String.valueOf(orderListCode));
        map.put("userId", String.valueOf(warehousingInitialUserId));
        map.put("userName",userMapper.queryUserLimit1(warehousingInitialUserId).getUserName());
        map.put("applyTime", AttDateUtil.getNow("standard"));
        map.put("simpleReason", "simpleReason");
        map.put("link", Config.wmsWarehousingOutLink.getVarName());
        map.put("variables", variables.toString());
        JSONObject arrayVariables = new JSONObject();
        map.put("arrayVariables", arrayVariables.toJSONString());
        map.put("processInstTitle", "出库申请-"+userMapper.queryUserLimit1(warehousingInitialUserId).getUserName()+"-"+AttDateUtil.getNow("standard"));
        //获取每组返回的流程申请状态
        JSONObject returnJson = httpService.postInJSON(Config.processSystem.getVarName()+"/SAO/build", map, JSONObject.class);
        if(returnJson.containsKey("errorMsg")){
            result.put("errorMsg","发送至流程系统时发生错误，请联系设备科相关人员");
            return result;
        }

        else {
            //将每组的是未汇总状态的订单均置为已汇总状态
            Warehousing warehousing = new Warehousing();
            warehousing.setWarehousingInitialState("已汇总");
            //获取并更新SAOId
            warehousing.setSimpleApplicationObjectId(returnJson.getLong("SAOId"));
            System.out.println(returnJson.toJSONString());
            warehousingMapper.updateWarehousing(warehousing);

            result.put("successTotal", sum);
        }
        if (sum > 0) {
            result.put("success", "true");
        } else {
            result.put("errorMsg", "未知错误");
        }
        return result;
    }

    @RequestMapping(value = "/warehousing/batch/update")
    public JSONObject freezeWarehousing(@RequestParam(value = "jsonArrayStr")String jsonArrayStr){
        JSONObject result = new JSONObject();
        List<Warehousing> warehousingList = JSON.parseArray(jsonArrayStr, Warehousing.class);
        int successTotal = 0;
        for(Warehousing warehousing:warehousingList){
            successTotal += warehousingMapper.updateWarehousing(warehousing);
        }
        if(successTotal < warehousingList.size()){
            result.put("success", "false");
            result.put("errorMsg", "更新失败");
            result.put("successTotal", successTotal);
        }
        else{
            result.put("success", "true");
            result.put("successTotal", successTotal);
        }
        return result;
    }

    @RequestMapping(value="/warehousing/out/list")
    public JSONObject listWarehousing(Warehousing warehousing, @RequestParam(value = "applyTimeBegin",required = false)String applyTimeBegin,@RequestParam(value = "applyTimeEnd",required = false)String applyTimeEnd,  @RequestParam(value = "page",required = false)String page, @RequestParam(value = "rows", required = false)String rows){
        Warehousing example = Warehousing.QueryBuild().warehousingNumGreaterEqThan(1).build();
        BeanUtils.copyProperties(warehousing, example);
        //TODO 条件查询
        int total = warehousingMapper.countWarehousing(warehousing);
        JSONObject result = new JSONObject();
        if(page != null && rows != null){
            PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(rows));
        }

        List<Warehousing> warehousingList = new ArrayList<>();

        return EasyUIUtil.formatDataToDatagird(warehousingMapper.queryWarehousing(example), total);
    }

    /**
     * @描述 批量撤回（假删除，只是改变状态）
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2019/9/11
     * @参变量
     * @返回
     * @抛出异常
    */
    @RequestMapping(value="/warehousing/out/batch/delete")
    public JSONObject deleteOrderBatch(@RequestParam(value = "warehousingIds")String warehousingIds){
        JSONObject result = new JSONObject();
        //将所有的未汇总状态的订单改成已汇总状态
        if(StringUtil.isNotEmpty(warehousingIds)) {
            //分割orderIds,获取orderId[]
            String[] warehousingIdsStr = warehousingIds.split(",");
            Long[] warehousingIdsLong = new Long[warehousingIdsStr.length];
            for (int i = 0; i < warehousingIdsStr.length; i++) {
                warehousingIdsLong[i] = Long.parseLong(warehousingIdsStr[i]);
            }

            //先判断这些orderId下的订单是否是未汇总状态，如果不是则报错
            Warehousing example = Warehousing.QueryBuild().warehousingIdList(warehousingIdsLong).warehousingInitialStateList("待汇总","已递交流程系统").build();
            List<Warehousing> queryWarehousings = warehousingMapper.queryWarehousing(example);
            if (queryWarehousings.size() < warehousingIdsLong.length) {
                result.put("success", "false");
                result.put("errorMsg", "只有待汇总状态的订单项允许汇总操作");
                return result;
            }

            //将未汇总状态改成已汇总状态
            //将每组的是未汇总状态的订单均置为已汇总状态
            Warehousing warehousing = new Warehousing();
            warehousing.setWarehousingInitialState("已撤回");
            //获取并更新SAOId
            warehousingMapper.update(Warehousing.UpdateBuild()
                    .set(warehousing).build()
                    .where(Warehousing.ConditionBuild()
                            .warehousingIdList(warehousingIdsLong)
                            .warehousingInitialStateList("待汇总","已递交流程系统")
                            .build()));
            result.put("success", "true");
        }
        else {
            result.put("success", "false");
            result.put("errorMsg", "请选择待汇总或处于流程系统的订单");
        }
        return result;
    }
}
