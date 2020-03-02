package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsVinDecode;
/**
*  @author wangjian
*/
public interface MqmsVinDecodeBaseMapper {

    int insertMqmsVinDecode(MqmsVinDecode object);

    int updateMqmsVinDecode(MqmsVinDecode object);

    int update(MqmsVinDecode.UpdateBuilder object);

    List<MqmsVinDecode> queryMqmsVinDecode(MqmsVinDecode object);

    MqmsVinDecode queryMqmsVinDecodeLimit1(MqmsVinDecode object);

}