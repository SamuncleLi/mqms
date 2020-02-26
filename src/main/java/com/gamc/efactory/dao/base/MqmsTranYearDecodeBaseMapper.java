package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsTranYearDecode;
/**
*  @author wangjian
*/
public interface MqmsTranYearDecodeBaseMapper {

    int insertMqmsTranYearDecode(MqmsTranYearDecode object);

    int updateMqmsTranYearDecode(MqmsTranYearDecode object);

    int update(MqmsTranYearDecode.UpdateBuilder object);

    List<MqmsTranYearDecode> queryMqmsTranYearDecode(MqmsTranYearDecode object);

    MqmsTranYearDecode queryMqmsTranYearDecodeLimit1(MqmsTranYearDecode object);

}