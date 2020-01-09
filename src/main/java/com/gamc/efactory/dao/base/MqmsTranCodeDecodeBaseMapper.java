package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsTranCodeDecode;
/**
*  @author author
*/
public interface MqmsTranCodeDecodeBaseMapper {

    int insertMqmsTranCodeDecode(MqmsTranCodeDecode object);

    int updateMqmsTranCodeDecode(MqmsTranCodeDecode object);

    int update(MqmsTranCodeDecode.UpdateBuilder object);

    List<MqmsTranCodeDecode> queryMqmsTranCodeDecode(MqmsTranCodeDecode object);

    MqmsTranCodeDecode queryMqmsTranCodeDecodeLimit1(MqmsTranCodeDecode object);

}