package com.gamc.efactory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsProduction;
import com.gamc.efactory.dao.base.MqmsProductionBaseMapper;
/**
*  @author wangjian
*/
public interface MqmsProductionMapper extends MqmsProductionBaseMapper{
    int selectByVin(@Param("vin") String vin);
    int updateByVin(MqmsProduction object);
}