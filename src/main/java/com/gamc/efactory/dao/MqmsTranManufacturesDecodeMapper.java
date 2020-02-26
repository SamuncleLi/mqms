package com.gamc.efactory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsTranManufacturesDecode;
import com.gamc.efactory.dao.base.MqmsTranManufacturesDecodeBaseMapper;
/**
*  @author wangjian
*/
public interface MqmsTranManufacturesDecodeMapper extends MqmsTranManufacturesDecodeBaseMapper{

    String selectTranManufacture(@Param("tran_manufacture_model") String tranManufactureModel);
}