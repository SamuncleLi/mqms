package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsBreakdown;
/**
*  @author author
*/
public interface MqmsBreakdownBaseMapper {

    int insertMqmsBreakdown(MqmsBreakdown object);

    int updateMqmsBreakdown(MqmsBreakdown object);

    int update(MqmsBreakdown.UpdateBuilder object);

    List<MqmsBreakdown> queryMqmsBreakdown(MqmsBreakdown object);

    MqmsBreakdown queryMqmsBreakdownLimit1(MqmsBreakdown object);

}