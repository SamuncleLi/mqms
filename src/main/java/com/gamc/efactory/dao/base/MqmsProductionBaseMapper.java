package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsProduction;
/**
*  @author lizeh
*/
public interface MqmsProductionBaseMapper {

    int insertMqmsProduction(MqmsProduction object);

    int updateMqmsProduction(MqmsProduction object);

    int update(MqmsProduction.UpdateBuilder object);

    List<MqmsProduction> queryMqmsProduction(MqmsProduction object);

    MqmsProduction queryMqmsProductionLimit1(MqmsProduction object);

}