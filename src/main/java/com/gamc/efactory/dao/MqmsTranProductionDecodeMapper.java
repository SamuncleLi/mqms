package com.gamc.efactory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsTranProductionDecode;
import com.gamc.efactory.dao.base.MqmsTranProductionDecodeBaseMapper;
/**
*  @author wangjian
*/
public interface MqmsTranProductionDecodeMapper extends MqmsTranProductionDecodeBaseMapper{

String selectTranProductionCode(@Param("tran_pro_model") String tranProModel);
}