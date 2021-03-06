package com.gamc.efactory.dao;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsTranProductionDecode;
import com.gamc.efactory.dao.base.MqmsTranProductionDecodeBaseMapper;
/**
 *  @author wangjian
 */
public interface MqmsTranProductionDecodeMapper extends MqmsTranProductionDecodeBaseMapper{

    String selectTranProductionCode(@Param("tran_pro_model") String tranProModel);
    String selectTranType(@Param("tran_pro_model") String tranProModel);
    int deleteTransTypeById(@Param("id") String id);
    List<HashMap<String, String>> searchTransTypeInfor(
            @Param("tranProModel") String tranProModel,
            @Param("tranSingleCode") String tranSingleCode,
            @Param("tranShortCode") String tranShortCode,
            @Param("tranTypeDetail") String tranTypeDetail,
            @Param("tranWarrantyYears") String tranWarrantyYears,
            @Param("tranWarrantyMillege") String tranWarrantyMillege
            );
}