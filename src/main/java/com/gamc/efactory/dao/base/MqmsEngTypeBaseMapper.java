package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsEngType;
/**
*  @author author
*/
public interface MqmsEngTypeBaseMapper {

    int insertMqmsEngType(MqmsEngType object);

    int updateMqmsEngType(MqmsEngType object);

    int update(MqmsEngType.UpdateBuilder object);

    List<MqmsEngType> queryMqmsEngType(MqmsEngType object);

    MqmsEngType queryMqmsEngTypeLimit1(MqmsEngType object);

}