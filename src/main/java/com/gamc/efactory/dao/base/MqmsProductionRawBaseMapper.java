package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsProductionRaw;
/**
*  @author lizeh
*/
public interface MqmsProductionRawBaseMapper {

    int insertMqmsProductionRaw(MqmsProductionRaw object);

    int updateMqmsProductionRaw(MqmsProductionRaw object);

    int update(MqmsProductionRaw.UpdateBuilder object);

    List<MqmsProductionRaw> queryMqmsProductionRaw(MqmsProductionRaw object);

    MqmsProductionRaw queryMqmsProductionRawLimit1(MqmsProductionRaw object);

}