package com.gamc.efactory.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.gamc.efactory.dao.NewMaterialMapper;
import com.gamc.efactory.model.dataObject.NewMaterial;
import com.gamc.efactory.service.NewMaterialService;
import com.gamc.efactory.util.AttDateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Zeho Lee on 2019/10/7.
 */
@Service
public class NewMaterialServiceImpl implements NewMaterialService{
    @Autowired
    NewMaterialMapper newMaterialMapper;
    /**
     * @描述 审核一条新增物料申请
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2019/10/7
     * @参变量
     * @返回
     * @抛出异常
    */
    public JSONObject checkNewMaterial(NewMaterial newMaterial){
        JSONObject result = new JSONObject();
        //如果传回来空值
        if(newMaterial.getNewMaterialId() ==0){
            result.put("success", "false");
            result.put("errorMsg", "请选择至少一条数据");
            return result;
        }
        //如果这个新物料申请不是待审核状态
        NewMaterial queryExample = new NewMaterial();
        queryExample.setNewMaterialId(newMaterial.getNewMaterialId());
        if(!newMaterialMapper.queryNewMaterialLimit1(queryExample).getState().equals("待审核")){
            result.put("success", "false");
            result.put("errorMsg","已审核过的申请不允许再审");
            return result;
        }
        if(newMaterial.getCheckerName() == null){
            result.put("success", "false");
            result.put("errorMsg","登录已过期，请重新登录");
            return result;
        }
        newMaterial.setState("已审核");
        newMaterial.setCheckedTime(AttDateUtil.getNow("all"));
        newMaterialMapper.updateNewMaterial(newMaterial);
        result.put("success", "true");
        return result;
    }
}
