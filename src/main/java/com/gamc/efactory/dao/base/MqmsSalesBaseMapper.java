package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsSales;
/**
*  @author lizeh
*/
public interface MqmsSalesBaseMapper {

    int insertMqmsSales(MqmsSales object);

    int updateMqmsSales(MqmsSales object);

    int update(MqmsSales.UpdateBuilder object);

    List<MqmsSales> queryMqmsSales(MqmsSales object);

    MqmsSales queryMqmsSalesLimit1(MqmsSales object);

}