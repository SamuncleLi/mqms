package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsSalesRaw;
/**
*  @author lizeh
*/
public interface MqmsSalesRawBaseMapper {

    int insertMqmsSalesRaw(MqmsSalesRaw object);

    int updateMqmsSalesRaw(MqmsSalesRaw object);

    int update(MqmsSalesRaw.UpdateBuilder object);

    List<MqmsSalesRaw> queryMqmsSalesRaw(MqmsSalesRaw object);

    MqmsSalesRaw queryMqmsSalesRawLimit1(MqmsSalesRaw object);

}