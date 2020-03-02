package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsFaultDecode;
/**
*  @author wangjian
*/
public interface MqmsFaultDecodeBaseMapper {

    int insertMqmsFaultDecode(MqmsFaultDecode object);

    int updateMqmsFaultDecode(MqmsFaultDecode object);

    int update(MqmsFaultDecode.UpdateBuilder object);

    List<MqmsFaultDecode> queryMqmsFaultDecode(MqmsFaultDecode object);

    MqmsFaultDecode queryMqmsFaultDecodeLimit1(MqmsFaultDecode object);

}