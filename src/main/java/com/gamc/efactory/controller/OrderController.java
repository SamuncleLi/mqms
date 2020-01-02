package com.gamc.efactory.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gamc.efactory.config.Config;
import com.gamc.efactory.dao.*;
import com.gamc.efactory.model.dataObject.*;
import com.gamc.efactory.model.viewObject.SparePartsOrderVO;
import com.gamc.efactory.service.HttpService;
import com.gamc.efactory.service.MaterialService;
import com.gamc.efactory.util.AttDateUtil;
import com.gamc.efactory.util.EasyUIUtil;
import com.gamc.efactory.util.ExcelUtil;
import com.gamc.efactory.util.StringUtil;
import com.github.pagehelper.PageHelper;
import org.apache.http.HttpResponse;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.sql.ResultSet;
import java.util.*;

/**
 * Created by Zeho Lee on 2019/7/12.
 */
@RestController
public class OrderController {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    MaterialMapper materialMapper;
    @Autowired
    NewMaterialMapper newMaterialMapper;
    @Autowired
    HttpService httpService;
    @Autowired
    MaterialService materialService;
    @Autowired
    MaterialContractMapper materialContractMapper;

    Logger logger = LoggerFactory.getLogger(OrderController.class);

    //TODO 批量插入

    /**
     * 备件订单
     * @param order
     * @return
     */
    @RequestMapping(value="/order/build")
    public JSONObject orderBuild(Order order){
        //新增物料，自动编号，编号规则是
        //L：做在库管理的未签开口合同的资材（L99）
        //DCK：不做在库管理的未签开口合同的资材（到货就领走）
        //M：已签开口合同的资材
        //B：备件



        JSONObject result = new JSONObject();

        //分成 员工已提交、员工已撤回、提交ERP/OA前终止，终止于XX环节、已审核完成、已生成导入模板、已获取订单号、已获取订单详细信息以及其他ERP/OA状态

        order.setOrderInitialTime(AttDateUtil.getNow("all"));
        order.setOrderInitialState("待汇总");


        User user = userMapper.queryUserLimit1(order.getOrderInitialUserId());
        order.setOrderInitialUserName(user.getUserName());
        order.setOrderInitialDepartment(user.getDepartment());

        //插入总订单表，并返回总订单表的id
        int orderId = orderMapper.insertOrder(order);

        //TODO 发送给流程系统并接收回来的信息 发送processName、formName、formId
        Map<String, String> map = new HashMap<>();
        map.put("processName", "orderBuild");
        map.put("formName", "wms_order");
        map.put("formId", String.valueOf(orderId));
        map.put("userId", String.valueOf(user.getUserId()));
        map.put("applyTime", order.getOrderInitialTime());
        map.put("link","http://192.168.199.14:8080/wms/static/orderCheckPage.html");
        JSONObject processChecker = new JSONObject();
        processChecker.put("kzcbjgly", 170);
        JSONObject variables = new JSONObject();
        variables.put("processChecker",processChecker.toJSONString());
        map.put("variables", variables.toJSONString());
        JSONObject arrayVariables = new JSONObject();
        map.put("arrayVariables", arrayVariables.toJSONString());

        JSONObject returnJson = httpService.postInJSON(Config.processSystem.getVarName()+"/SAO/build", map, JSONObject.class);

        //TODO 回退事务处理


        if(orderId<=0){
            result.put("success", "false");
            result.put("errorMsg", "更新失败");
        }
        else{
            result.put("success", "true");
            result.put("successTotal", 1);
        }
        return result;
    }

    /**
     * @描述 批量提交
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2019/8/9
     * @参变量
     * @返回
     * @抛出异常
    */
    @RequestMapping(value = "/order/batch/build")
    public JSONObject insertOrderBatch(@RequestParam(name = "orderInitialUserId")int orderInitialUserId,
                                       @RequestParam(name = "dataArray")String dataArray,
                                       @RequestParam(name= "processChecker")String processCheckerStr,
                                       @RequestParam(name= "conditions")String conditionsStr){
        JSONArray rows= JSONArray.parseArray(dataArray);
        JSONObject processChecker = JSONObject.parseObject(processCheckerStr);
        processChecker.put("ckgly", 1814);
        JSONObject conditions = JSONObject.parseObject(conditionsStr);
        JSONObject variables = new JSONObject();
        variables.put("processChecker", processChecker);
        variables.put("conditions", conditions);

        //获取用户信息
        User user = userMapper.queryUserLimit1(orderInitialUserId);

        int sum = 0;
        //逐行获取数据
        for(int i=0;i<rows.size();i++){
            JSONObject data = rows.getJSONObject(i);
            //获取订单信息
            Order order = data.toJavaObject(Order.class);
            //判断是否是新物料
            String newMaterialSymbol=data.getString("newMaterialSymbol");

            if("true".equals(newMaterialSymbol)){
                String newMaterialType=data.getString("newMaterialType");
                //新编号需要查询新物料申请表和物料总表两张
                String newMaterialCode = materialService.getNewMaterialCode(newMaterialType);

                //提交新物料申请
                NewMaterial newMaterial = new NewMaterial();
                newMaterial.setNewMaterialCode(newMaterialCode);
                newMaterial.setNewMaterialName(order.getMaterialName());
                newMaterial.setNewMaterialSpecs(order.getMaterialSpecs());
                newMaterial.setApplierUserId(orderInitialUserId);
                newMaterial.setApplierUserName(user.getUserName());
                newMaterial.setApplyTime(AttDateUtil.getNow("all"));
                newMaterialMapper.insertNewMaterial(newMaterial);

                //赋值
                order.setMaterialCode(newMaterialCode);
            }

            //判断种类、是否已签开口合同
            String materialCode = order.getMaterialCode();

            order.setContractType(materialService.divideContractType(materialCode));
            order.setOrderManagementType(materialService.divideOrderManagementType(materialCode));

            //如果是已签开口合同，则查询已签开口合同表
            if(order.getContractType().equals("已签开口合同")){
                MaterialContract materialContract = new MaterialContract();
                materialContract.setMaterialCode(materialCode);
                materialContract = materialContractMapper.queryMaterialContractLimit1(materialContract);
                order.setSupplierCode(materialContract.getSupplierCode());
                order.setSupplierName(materialContract.getSupplierName());
            }

            order.setOrderInitialUserId(orderInitialUserId);
            order.setOrderInitialTime(AttDateUtil.getNow("all"));
            order.setOrderInitialState("待汇总");
            order.setOrderInitialUserName(user.getUserName());
            order.setOrderInitialDepartment(user.getDepartment());
            order.setVariables(variables.toJSONString());

            int orderId = orderMapper.insertOrder(order);
            sum++;
        }

        JSONObject result = new JSONObject();
        result.put("successTotal", sum);
        if(sum>0){
            result.put("success","true");
        }
        else{
            result.put("errorMsg","未知错误");
        }
        return result;
    }

    /**
     * @描述 这一步是每个科的窗口人将信息汇总提交给领导审核
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2019/8/20
     * @参变量
     * @返回
     * @抛出异常
    */
    @RequestMapping(value="/order/summary")
    public JSONObject submit(@RequestParam(name = "orderInitialUserId")int orderInitialUserId,
                             @RequestParam(value = "orderIds")String orderIds,
                             @RequestParam(value="simpleReason")String simpleReason){
        JSONObject result = new JSONObject();

        if(StringUtil.isNotEmpty(orderIds)){
            //分割orderIds,获取orderId[]
            String[] orderIdsStr = orderIds.split(",");
            Long[] orderIdsLong = new Long[orderIdsStr.length];
            for(int i=0;i<orderIdsStr.length;i++){
                orderIdsLong[i] = Long.parseLong(orderIdsStr[i]);
            }

            //先判断这些orderId下的订单是否是待汇总状态，如果不是则报错
            Order exampleOrder = Order.QueryBuild().orderIdList(orderIdsLong).orderInitialState("待汇总").build();
            List<Order> queryOrders = orderMapper.queryOrder(exampleOrder);
            if(queryOrders.size()<orderIdsLong.length){
                result.put("errorMsg","只有待汇总状态的订单项允许汇总操作");
                return result;
            }
            //获取processChecker种类
            HashSet<String> variablesSet = new HashSet<>();
            for(Order order:queryOrders){
                variablesSet.add(order.getVariables());
            }
            //根据processChecker分类，分组，分别生成汇总订单号
            for(String variables:variablesSet){
                //生成汇总订单号
                Date date = new Date();
                String orderListCode = String.valueOf(date.getTime());
                //每一组发送一个流程申请
                //TODO 发送给流程系统并接收回来的信息 发送processName、formName、formId
                Map<String, String> map = new HashMap<>();
                map.put("processName", "orderBuild");
                map.put("formName", "wms_order");
                map.put("formId", String.valueOf(orderListCode));
                map.put("userId", String.valueOf(orderInitialUserId));
                map.put("userName",userMapper.queryUserLimit1(orderInitialUserId).getUserName());
                map.put("applyTime", AttDateUtil.getNow("standard"));
                map.put("simpleReason", simpleReason);
                map.put("link",Config.wmsOrderLink.getVarName());
                map.put("variables", variables);
                JSONObject arrayVariables = new JSONObject();
                map.put("arrayVariables", arrayVariables.toJSONString());
                map.put("processInstTitle", "订单汇总-"+userMapper.queryUserLimit1(orderInitialUserId).getUserName()+"-"+AttDateUtil.getNow("standard"));
                //获取每组返回的流程申请状态
                JSONObject returnJson = httpService.postInJSON(Config.processSystem.getVarName()+"/SAO/build", map, JSONObject.class);
                if(returnJson.containsKey("errorMsg")){
                    result.put("errorMsg","发送至流程系统时发生错误，请联系设备科相关人员");
                    return result;
                }
                else{
                    //将每组的是未汇总状态的订单均置为已汇总状态
                    Order order = new Order();
                    order.setOrderInitialState("已汇总");
                    //获取并更新SAOId
                    order.setSimpleApplicationObjectId(returnJson.getLong("SAOId"));
                    System.out.println(returnJson.toJSONString());
                    orderMapper.update(Order.UpdateBuild()
                    .set(order).build()
                    .where(Order.ConditionBuild()
                            .orderIdList(orderIdsLong)
                            .orderInitialStateList("待汇总")
                            .variablesList(variables)
                            .build()));
                }
            }

            for(int i=0;i<orderIdsStr.length;i++){
                Order order = new Order();
                order.setOrderId(Long.valueOf(orderIdsStr[i]));
                order.setOrderInitialState("已递交流程系统");
                //TODO 更新生成的汇总订单号
                orderMapper.updateOrder(order);
            }

            result.put("success","true");
        }
        else {
            result.put("errorMsg", "选择的订单行号为空");
        }

        return result;
    }

    //同意
    @RequestMapping(value="/order/audit")
    public JSONObject auditOrder(@RequestParam HashMap map){
        JSONObject variables = new JSONObject();
        JSONObject arrayVariables = new JSONObject();
        map.put("variables", variables.toJSONString());
        map.put("arrayVariables", arrayVariables.toJSONString());
        if(map.get("auditorInfo").equals("agree")){
            map.put("auditorComment","同意");
        }
        else{
            map.put("auditorComment","不同意");
        }

        //获取每组返回的流程申请状态
//        JSONObject returnJson = httpService.postInJSON("http://172.18.138.253:8081/process/SAO/audit", map, JSONObject.class);
        JSONObject returnJson = httpService.postInJSON(Config.processSystem.getVarName()+"/SAO/audit", map, JSONObject.class);
        return returnJson;
    }

    @RequestMapping(value="/order/knife/build")
    public JSONObject insertKnifeOrder(Order order){
        //TODO build时要注意这是新增物料，要加标志位，并自动编号
        JSONObject result = new JSONObject();

        //分成 员工已提交、员工已撤回、提交ERP/OA前终止，终止于XX环节、已审核完成、已生成导入模板、已获取订单号、已获取订单详细信息以及其他ERP/OA状态
        order.setOrderState("员工已提交");

        int successTotal = orderMapper.insertOrder(order);
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

    @RequestMapping(value="/order/update")
    public JSONObject updateOrder(Order order){
        JSONObject result = new JSONObject();
        int successTotal =0;
        successTotal = orderMapper.updateOrder(order);

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


    @RequestMapping(value = "/order/batch/update")
    public JSONObject freezeOrder(@RequestParam(value = "jsonArrayStr")String jsonArrayStr){
        JSONObject result = new JSONObject();
        List<Order> orderList = JSON.parseArray(jsonArrayStr, Order.class);
        int successTotal = 0;
        for(Order order:orderList){
            successTotal += orderMapper.updateOrder(order);
        }
        if(successTotal < orderList.size()){
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

    /**
     * @描述 审核完成，更新状态
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2019/9/1
     * @参变量 simpleApplicationObjectId 流程系统的id
     * @返回 TODO 返回结果
     * @抛出异常
    */
    @RequestMapping(value="/order/batch/checkFinish")
    public void checkFinish(@RequestParam(value = "simpleApplicationObjectId")long simpleApplicationId){
        System.out.println("已接收到流程系统消息");
        Order order = new Order();
        order.setOrderInitialState("审核完成");
        //获取并更新SAOId
        orderMapper.update(Order.UpdateBuild()
                .set(order).build()
                .where(Order.ConditionBuild()
                        .simpleApplicationObjectIdList(simpleApplicationId)
                        .orderInitialStateList("已递交流程系统")
                        .build()));
    }

    @RequestMapping(value="/order/list")
    public JSONObject listOrder(Order order, @RequestParam(value = "page",required = false)String page, @RequestParam(value = "rows", required = false)String rows){
//        if(order instanceof com.gamc.efactory.model.dataObject.Order.QueryBuilder){};
        //TODO 条件查询
        int total = orderMapper.countOrder(order);
        JSONObject result = new JSONObject();
        if(page != null && rows != null){
            PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(rows), "order_id desc");
        }
        result = EasyUIUtil.formatDataToDatagird(orderMapper.queryOrder(order), total);
        return result;
    }

    @RequestMapping(value = "/order/download/contract")
    public void downloadOrderContract(@RequestParam(value = "orderIds")String orderIds, HttpSession session , HttpServletResponse response){
        List<Order> orderList = new ArrayList<>();
        Order order = new Order();

        String[] orderIdsStr = orderIds.split(",");
        Long[] orderIdsLong = new Long[orderIdsStr.length];
        for (int i = 0; i < orderIdsStr.length; i++) {
            orderIdsLong[i] = Long.parseLong(orderIdsStr[i]);
        }
        order = Order.QueryBuild().orderIdList(orderIdsLong).orderInitialState("审核完成").contractType("已签开口合同").build();
        orderList = orderMapper.queryOrder(order);
        try {
            String[] columnNames = {"materialCode","materialName","materialSpecs","supplierCode","orderMaterialNum","warehouseCode","warehouseSymbol","financialCenterCode","warehousingReasonCode"};
            // 创建 Excel 文件的输入流对象，这里获取了项目根目录
            File excelFileInputStream = ResourceUtils.getFile("classpath:excel-template/ERP采购订单导入模板-江文娟.xlsm");

            // XSSFWorkbook 就代表一个 Excel 文件

            // 创建其对象，就打开这个 Excel 文件

            XSSFWorkbook workbook = new XSSFWorkbook(excelFileInputStream);

            // 输入流使用后，及时关闭！这是文件流操作中极好的一个习惯！
            XSSFSheet sheet = workbook.getSheet("采购订单导入");
            XSSFCellStyle style = workbook.createCellStyle();
            style.setBorderLeft((short) 1);
            style.setBorderRight((short) 1);
            style.setBorderTop((short) 1);
            style.setBorderBottom((short) 1);

            //数据从第三栏开始
            int dataRow = 2;

            for(int i=0;i<orderList.size();i++){
                XSSFRow row = sheet.createRow(dataRow+i);
                Order orderExample = orderList.get(i);
                for(int j=0;j<columnNames.length;j++){
                    XSSFCell cell = row.createCell(j);
                    cell.setCellValue(EasyUIUtil.getFieldValueByName(columnNames[j], orderExample));
                    cell.setCellStyle(style);
                }
            }

            String filename = URLEncoder.encode("ERP采购订单导入模板-江文娟.xlsm","UTF8");
            OutputStream output = response.getOutputStream();
            response.reset();
            response.setHeader("Content-disposition", "attachment; filename=\"" + filename + "\"");
            response.setContentType("application/msexcel");

            workbook.write(output);
            output.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/order/download/noContract")
    public void downloadOrderNoContract(@RequestParam(value = "orderIds")String orderIds, HttpSession session , HttpServletResponse response){
        List<Order> orderList = new ArrayList<>();
        Order order = new Order();

        String[] orderIdsStr = orderIds.split(",");
        Long[] orderIdsLong = new Long[orderIdsStr.length];
        for (int i = 0; i < orderIdsStr.length; i++) {
            orderIdsLong[i] = Long.parseLong(orderIdsStr[i]);
        }
        order = Order.QueryBuild().orderIdList(orderIdsLong).orderInitialState("审核完成").contractType("已签开口合同").build();
        orderList = orderMapper.queryOrder(order);

        try {
            String[] columnNames = {"materialCode","materialName","materialSpecs","materialUnit","orderMaterialNum","orderId","materialBrand","recommendedSupplierName","prospectiveArrivalDate","financialCenterCode","importantProjectCode","orderDescription","orderInitialUserName"};
            // 创建 Excel 文件的输入流对象，这里获取了项目根目录
            File excelFileInputStream = ResourceUtils.getFile("classpath:excel-template/采购申请单导入模板v2.xlsx");

            // XSSFWorkbook 就代表一个 Excel 文件

            // 创建其对象，就打开这个 Excel 文件

            XSSFWorkbook workbook = new XSSFWorkbook(excelFileInputStream);

            // 输入流使用后，及时关闭！这是文件流操作中极好的一个习惯！
            XSSFSheet sheet = workbook.getSheet("采购申请单明细行");
            XSSFCellStyle style = workbook.createCellStyle();
//            style.setBorderLeft((short) 1);
//            style.setBorderRight((short) 1);
//            style.setBorderTop((short) 1);
//            style.setBorderBottom((short) 1);

            //数据从第二行开始
            int dataRow = 1;

            for(int i=0;i<orderList.size();i++){
                XSSFRow row = sheet.createRow(dataRow+i);
                Order orderExample = orderList.get(i);
                for(int j=0;j<columnNames.length;j++){
                    XSSFCell cell = row.createCell(j);
                    cell.setCellValue(EasyUIUtil.getFieldValueByName(columnNames[j], orderExample));
                    cell.setCellStyle(style);
                }
            }

            String filename = URLEncoder.encode("采购申请单导入模板v2.xls","UTF8");
            OutputStream output = response.getOutputStream();
            response.reset();
            response.setHeader("Content-disposition", "attachment; filename=\"" + filename + "\"");
            response.setContentType("application/msexcel");

            workbook.write(output);
            output.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @RequestMapping(value="/order/upload")
    public JSONObject uploadOrder(@RequestParam("file") MultipartFile file){
        //TODO 上传时要区分这是200还是240，是erp还是gip还是OA
        JSONObject result = new JSONObject();
        try{
            String fileName = file.getOriginalFilename();
            if (!fileName.matches("^.+\\.(?i)(xls)$") && !fileName.matches("^.+\\.(?i)(xlsx)$")) {
                logger.error("上传文件格式不正确");
                result.put("success", "false");
            }
            else{
                InputStream is = file.getInputStream();
                List<List<String>> workBookContent = ExcelUtil.importXlsx(file.getInputStream());//读取记录,item转换成输入流
                for (int j=2; j<workBookContent.size();j++ ){//如果需要处理表头，这里的j=1、2.。。。开始，具体看表头的所占用的行数
                    if(StringUtil.isNotEmpty( workBookContent.get(j).get(4))) {
                        Order order = new Order();
                        order.setOrderOperaterUserName((String) workBookContent.get(j).get(0));
                        order.setOrderOperaterTime((String) workBookContent.get(j).get(1));
                        order.setOrderType((String) workBookContent.get(j).get(2));
                        order.setFinancialListCode((String) workBookContent.get(j).get(3));
                        order.setPurchasingListCode((String) workBookContent.get(j).get(4));
                        order.setMaterialCode((String) workBookContent.get(j).get(5));
                        order.setMaterialName((String) workBookContent.get(j).get(6));
                        order.setConfirmMaterialName((String) workBookContent.get(j).get(7));
                        order.setMaterialSpecs((String) workBookContent.get(j).get(8));
                        order.setConfirmMaterialSpecs((String) workBookContent.get(j).get(9));
                        order.setMaterialBrand((String) workBookContent.get(j).get(10));
                        order.setConfirmMaterialBrand((String) workBookContent.get(j).get(11));
                        order.setMaterialUnit((String) workBookContent.get(j).get(12));
                        order.setOrderMaterialNum((int) Double.parseDouble(workBookContent.get(j).get(13)));
                        order.setFinancialCenterCode((String) workBookContent.get(j).get(14));
                        order.setOrderBuyer((String) workBookContent.get(j).get(15));
                        order.setSupplierName((String) workBookContent.get(j).get(16));
                        order.setOrderState((String) workBookContent.get(j).get(17));
                        order.setOrderBuyerCheckDate((String) workBookContent.get(j).get(18));
                        order.setOrderPriceCheckDate((String) workBookContent.get(j).get(19));
                        order.setPurchasingOrderCode((String) workBookContent.get(j).get(20));
                        order.setArrivalDate((String) workBookContent.get(j).get(21));
                        order.setReceivedDate((String)workBookContent.get(j).get(22));
                        order.setPaymentType((String)workBookContent.get(j).get(23));
                        order.setPaymentRate((String)workBookContent.get(j).get(24));
                        order.setBudgetType((String)workBookContent.get(j).get(25));
                        order.setBudgetSubject((String)workBookContent.get(j).get(26));
                        order.setInvestManagementCode((String)workBookContent.get(j).get(27));
                        order.setResearchTestProject((String)workBookContent.get(j).get(28));
                        order.setOrderBuilderName((String)workBookContent.get(j).get(29));

                        //TODO excel方式：根据订单号决定插入还是新增，如果
                        orderMapper.insertOrder(order);

                        //TODO 上传后页面不跳转
                    }
                }
            }
        }
        catch (Exception e){
            logger.error(e.getMessage());
        }
        return result;
    }

    /**
     * @描述 批量删除
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2019/8/26
     * @参变量
     * @返回
     * @抛出异常
    */
    @RequestMapping(value="/order/batch/delete")
    public JSONObject deleteOrderBatch(@RequestParam(value = "orderIds")String orderIds){
        JSONObject result = new JSONObject();
        //将所有的未汇总状态的订单改成已汇总状态
        if(StringUtil.isNotEmpty(orderIds)) {
            //分割orderIds,获取orderId[]
            String[] orderIdsStr = orderIds.split(",");
            Long[] orderIdsLong = new Long[orderIdsStr.length];
            for (int i = 0; i < orderIdsStr.length; i++) {
                orderIdsLong[i] = Long.parseLong(orderIdsStr[i]);
            }

            //先判断这些orderId下的订单是否是未汇总状态，如果不是则报错
            Order exampleOrder = Order.QueryBuild().orderIdList(orderIdsLong).orderInitialState("待汇总").build();
            List<Order> queryOrders = orderMapper.queryOrder(exampleOrder);
            if (queryOrders.size() < orderIdsLong.length) {
                result.put("success", "false");
                result.put("errorMsg", "只有待汇总状态的订单项允许汇总操作");
                return result;
            }

            //将未汇总状态改成已汇总状态
            //将每组的是未汇总状态的订单均置为已汇总状态
            Order order = new Order();
            order.setOrderInitialState("已撤回");
            //获取并更新SAOId
            orderMapper.update(Order.UpdateBuild()
                    .set(order).build()
                    .where(Order.ConditionBuild()
                            .orderIdList(orderIdsLong)
                            .orderInitialStateList("待汇总")
                            .build()));
            result.put("success", "true");
        }
        else {
            result.put("success", "false");
            result.put("errorMsg", "请选择待汇总的订单");
        }
        return result;
    }
}
