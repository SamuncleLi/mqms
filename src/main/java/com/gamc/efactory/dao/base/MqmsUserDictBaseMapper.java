package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsUserDict;
/**
*  @author lizeh
*/
public interface MqmsUserDictBaseMapper {

    int insertMqmsUserDict(MqmsUserDict object);

    int updateMqmsUserDict(MqmsUserDict object);

    int update(MqmsUserDict.UpdateBuilder object);

    List<MqmsUserDict> queryMqmsUserDict(MqmsUserDict object);

    MqmsUserDict queryMqmsUserDictLimit1(MqmsUserDict object);

}