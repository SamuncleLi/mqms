package com.gamc.efactory.service.serviceImpl;

import com.gamc.efactory.dao.MaterialMapper;
import com.gamc.efactory.dao.NewMaterialMapper;
import com.gamc.efactory.service.MaterialService;
import com.gamc.efactory.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Zeho Lee on 2019/8/21.
 */
@Service
public class MaterialServiceImpl implements MaterialService{
    @Autowired
    MaterialMapper materialMapper;
    @Autowired
    NewMaterialMapper newMaterialMapper;
    public String getNewMaterialCode(String newMaterialType){
        String newMaterialCode = "";
        //新编号需要查询新物料申请表和物料总表两张
        if("备件".equals(newMaterialType)){
            //搜索编号中B编号最大的一个，加1
            String maxCode1 = materialMapper.queryMaxMaterialCode("B0%");
            String maxCode2 = newMaterialMapper.queryMaxMaterialCode("B0%");
            maxCode2 = StringUtil.isEmpty(maxCode2)?"":maxCode2;
            if(maxCode1.compareTo(maxCode2) <=0){
                maxCode2 = maxCode2.substring(3);
                newMaterialCode = "B" + String.format("%07d", Integer.parseInt(maxCode2)+1) + "S";
            }
            else {
                maxCode1 = maxCode1.substring(1);
                newMaterialCode = "B" + String.format("%07d", Integer.parseInt(maxCode1)+1) + "S";
            }
        }
        else if("资材".equals(newMaterialType)) {
            //DCK最大的一个加一
            String maxCode1 = materialMapper.queryMaxMaterialCode("DCK%");
            String maxCode2 = newMaterialMapper.queryMaxMaterialCode("DCK%");
            maxCode2 = StringUtil.isEmpty(maxCode2)?"":maxCode2;
            if (maxCode1.compareTo(maxCode2) <= 0) {
                maxCode2 = maxCode2.substring(3);
                newMaterialCode = "DCK" + String.format("%06d", Integer.parseInt(maxCode2) + 1);
            } else {
                maxCode1 = maxCode1.substring(3);
                newMaterialCode = "DCK" + String.format("%06d", Integer.parseInt(maxCode1) + 1);

            }
        }
        else if("不做在库管理的刀具".equals(newMaterialType)){
            //L99开头，最大加1
            String maxCode1 = materialMapper.queryMaxMaterialCode("L99%");
            String maxCode2 = newMaterialMapper.queryMaxMaterialCode("L99%");
            maxCode2 = StringUtil.isEmpty(maxCode2)?"":maxCode2;
            if (maxCode1.compareTo(maxCode2) <= 0) {
                maxCode2 = maxCode2.substring(3);
                newMaterialCode = "L99" + String.format("%04d", Integer.parseInt(maxCode2) + 1);
            } else {
                maxCode1 = maxCode1.substring(3);
                newMaterialCode = "L99" + String.format("%04d", Integer.parseInt(maxCode1) + 1);

            }
        }
        else if("随机备件".equals(newMaterialType)){
            //L99开头，最大加1
            String maxCode1 = materialMapper.queryMaxMaterialCode("B%%S");
            String maxCode2 = newMaterialMapper.queryMaxMaterialCode("B%%S");
            maxCode2 = StringUtil.isEmpty(maxCode2)?"":maxCode2;
            if (maxCode1.compareTo(maxCode2) <= 0) {
                maxCode2 = maxCode2.replace("B", "");
                maxCode2 = maxCode2.replace("S", "");
                newMaterialCode = "B" + String.format("%05d", Integer.parseInt(maxCode2) + 1) + "S";
            } else {
                maxCode1 = maxCode1.replace("B", "");
                maxCode1 = maxCode1.replace("S", "");
                newMaterialCode = "B" + String.format("%05d", Integer.parseInt(maxCode1) + 1) + "S";
            }
        }
        return newMaterialCode;
    }

    public String divideContractType(String materialCode){
        if(StringUtil.isEmpty(materialCode)){
            return "";
        }
        //第一个字母为K或者M
        String headCode = materialCode.substring(0,1);
        if(headCode.equals("K") || headCode.equals("M")){
            return "已签开口合同";
        }
        else if(headCode.equals("B") || headCode.equals("L") ||headCode.equals("D")){
            return "未签开口合同";
        }
        else{
            return "";
        }

        //
    }

    public String divideOrderManagementType(String materialCode){
        if(StringUtil.isEmpty(materialCode)){
            return "";
        }
        //第一个字母为K或者M
        String headCode = materialCode.substring(0,1);
        if(headCode.equals("K") || headCode.equals("B")){
            return "备件";
        }
        else if(headCode.equals("M") || headCode.equals("L") ||headCode.equals("D")){
            return "资材";
        }
        else{
            return "";
        }
    }
}
