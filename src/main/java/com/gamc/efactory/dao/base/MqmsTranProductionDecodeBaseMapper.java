package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsTranProductionDecode;
/**
*  @author wangjian
*/
public interface MqmsTranProductionDecodeBaseMapper {

    int insertMqmsTranProductionDecode(MqmsTranProductionDecode object);

    int updateMqmsTranProductionDecode(MqmsTranProductionDecode object);

    int update(MqmsTranProductionDecode.UpdateBuilder object);

    List<MqmsTranProductionDecode> queryMqmsTranProductionDecode(MqmsTranProductionDecode object);

    MqmsTranProductionDecode queryMqmsTranProductionDecodeLimit1(MqmsTranProductionDecode object);

}