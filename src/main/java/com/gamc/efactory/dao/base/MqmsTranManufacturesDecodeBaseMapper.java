package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsTranManufacturesDecode;
/**
*  @author wangjian
*/
public interface MqmsTranManufacturesDecodeBaseMapper {

    int insertMqmsTranManufacturesDecode(MqmsTranManufacturesDecode object);

    int updateMqmsTranManufacturesDecode(MqmsTranManufacturesDecode object);

    int update(MqmsTranManufacturesDecode.UpdateBuilder object);

    List<MqmsTranManufacturesDecode> queryMqmsTranManufacturesDecode(MqmsTranManufacturesDecode object);

    MqmsTranManufacturesDecode queryMqmsTranManufacturesDecodeLimit1(MqmsTranManufacturesDecode object);

}