package com.gamc.efactory.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gamc.efactory.dao.MaterialContractMapper;
import com.gamc.efactory.dao.SparePartsContractMapper;
import com.gamc.efactory.model.dataObject.Material;
import com.gamc.efactory.dao.MaterialMapper;
import com.gamc.efactory.dao.base.MaterialBaseMapper;
import com.gamc.efactory.model.dataObject.MaterialContract;
import com.gamc.efactory.model.dataObject.SparePartsContract;
import com.gamc.efactory.util.EasyUIUtil;
import com.gamc.efactory.util.ExcelUtil;
import com.gamc.efactory.util.StringUtil;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zeho Lee on 2019/7/9.
 */
@RestController
public class MaterialController {
    @Autowired
    MaterialMapper materialMapper;
    @Autowired
    SparePartsContractMapper sparePartsContractMapper;
    @Autowired
    MaterialContractMapper materialContractMapper;

    Logger logger = LoggerFactory.getLogger(MaterialController.class);

    @RequestMapping(value="/material/build")
    public JSONObject insertMaterial(Material material){
        JSONObject result = new JSONObject();
        int successTotal = materialMapper.insertMaterial(material);
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

    @RequestMapping(value = "/material/listLimit1")
    public JSONObject listLimit1(Material material){
        Material result = materialMapper.queryMaterialLimit1(material);
        return JSONObject.parseObject(JSON.toJSONString(result));
    }

    @RequestMapping(value = "/material/list/fuzzySearch")
    public JSONArray fuzzySearch(@RequestParam("materialCode") String materialCode){
        Material material = Material.QueryBuild().fuzzyMaterialCode(materialCode).build();
        List<Material> result = materialMapper.queryMaterial(material);
        return EasyUIUtil.formatDataToComboBox(result);
    }

    @RequestMapping(value="/material/update")
    public JSONObject updateMaterial(Material material){
        JSONObject result = new JSONObject();
        int successTotal =0;
        successTotal = materialMapper.updateMaterial(material);

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


    @RequestMapping(value = "/material/batch/update")
    public JSONObject freezeMaterial(@RequestParam(value = "jsonArrayStr")String jsonArrayStr){
        JSONObject result = new JSONObject();
        List<Material> materialList = JSON.parseArray(jsonArrayStr, Material.class);
        int successTotal = 0;
        for(Material material:materialList){
            successTotal += materialMapper.updateMaterial(material);
        }
        if(successTotal < materialList.size()){
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

    @RequestMapping(value="/material/list")
    public JSONObject listMaterial(Material material, @RequestParam(value = "page",required = false)String page, @RequestParam(value = "rows", required = false)String rows){
//        if(material instanceof com.gamc.efactory.model.dataObject.Material.QueryBuilder){};
        int total = materialMapper.countMaterial(material);
        material.QueryBuild().fetchMaterialCode();
        JSONObject result = new JSONObject();
        if(page != null && rows != null){
            PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(rows));
        }

        List<Material> materialList = new ArrayList<>();

        return EasyUIUtil.formatDataToDatagird(materialMapper.queryMaterial(material), total);

    }

    @RequestMapping(value = "/material/upload")
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
                    if(StringUtil.isNotEmpty( workBookContent.get(j).get(0))) {
                        Material material = new Material();
                        material.setMaterialCode( workBookContent.get(j).get(0));
                        material.setMaterialName( workBookContent.get(j).get(1));
                        material.setMaterialSpecs( workBookContent.get(j).get(2));
                        material.setMaterialUnit( workBookContent.get(j).get(3));
                        material.setSupplierCode( workBookContent.get(j).get(4));
                        material.setSupplierName( workBookContent.get(j).get(5));
                        material.setMaterialOrderMinNum(workBookContent.get(j).get(6));
                        material.setMaterialLeadTime( workBookContent.get(j).get(7));
                        material.setWarehouseCode( workBookContent.get(j).get(8));
                        material.setShelfCode( workBookContent.get(j).get(9));
                        material.setPackageSpecs( workBookContent.get(j).get(10));
                        material.setInitialDepartment( workBookContent.get(j).get(11));
                        material.setMaterialSignal( workBookContent.get(j).get(12));
                        material.setStockNumNow( new BigDecimal(workBookContent.get(j).get(13)));
                        material.setLastUpdated( workBookContent.get(j).get(14));
                        
                        materialMapper.insertMaterial(material);
                        //TODO excel上传方式：上传到material_origin表，同时查询material表，判断是否新增成功，更新material表状态

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

    @RequestMapping(value = "/material/sparePartsContract/list")
    public JSONObject sparePartsContractList(SparePartsContract sparePartsContract, @RequestParam(value = "page",required = false)String page, @RequestParam(value = "rows", required = false)String rows){
        //TODO 条件查询
        int total = sparePartsContractMapper.countSparePartsContract(sparePartsContract);
        JSONObject result = new JSONObject();
        if(page != null && rows != null){
            PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(rows));
        }
        result = EasyUIUtil.formatDataToDatagird(sparePartsContractMapper.querySparePartsContract(sparePartsContract), total);
        return result;
    }

    @RequestMapping(value = "/material/materialContract/list")
    public JSONObject materialContractList(MaterialContract materialContract, @RequestParam(value = "page",required = false)String page, @RequestParam(value = "rows", required = false)String rows){
        //TODO 条件查询
        int total = materialContractMapper.countMaterialContract(materialContract);
        JSONObject result = new JSONObject();
        if(page != null && rows != null){
            PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(rows));
        }
        result = EasyUIUtil.formatDataToDatagird(materialContractMapper.queryMaterialContract(materialContract), total);
        return result;
    }
}
