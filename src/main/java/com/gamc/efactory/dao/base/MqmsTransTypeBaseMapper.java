package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsTransType;
/**
*  @author wangjian
*/
public interface MqmsTransTypeBaseMapper {

    int insertMqmsTransType(MqmsTransType object);

    int updateMqmsTransType(MqmsTransType object);

    int update(MqmsTransType.UpdateBuilder object);

    List<MqmsTransType> queryMqmsTransType(MqmsTransType object);

    MqmsTransType queryMqmsTransTypeLimit1(MqmsTransType object);

}