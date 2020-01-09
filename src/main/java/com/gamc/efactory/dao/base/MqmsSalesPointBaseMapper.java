package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsSalesPoint;
/**
*  @author author
*/
public interface MqmsSalesPointBaseMapper {

    int insertMqmsSalesPoint(MqmsSalesPoint object);

    int updateMqmsSalesPoint(MqmsSalesPoint object);

    int update(MqmsSalesPoint.UpdateBuilder object);

    List<MqmsSalesPoint> queryMqmsSalesPoint(MqmsSalesPoint object);

    MqmsSalesPoint queryMqmsSalesPointLimit1(MqmsSalesPoint object);

}