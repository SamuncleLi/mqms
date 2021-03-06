package com.gamc.efactory.dao;

import java.util.List;

import com.gamc.efactory.model.dataObject.MqmsProduction;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsProductionRaw;
import com.gamc.efactory.dao.base.MqmsProductionRawBaseMapper;
/**
*  @author wangjian
*/
public interface MqmsProductionRawMapper extends MqmsProductionRawBaseMapper{
    int selectByVin(@Param("vin") String vin);
    int updateByVin(MqmsProductionRaw object);

}