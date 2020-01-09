package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsMtocDecode;
/**
*  @author author
*/
public interface MqmsMtocDecodeBaseMapper {

    int insertMqmsMtocDecode(MqmsMtocDecode object);

    int updateMqmsMtocDecode(MqmsMtocDecode object);

    int update(MqmsMtocDecode.UpdateBuilder object);

    List<MqmsMtocDecode> queryMqmsMtocDecode(MqmsMtocDecode object);

    MqmsMtocDecode queryMqmsMtocDecodeLimit1(MqmsMtocDecode object);

}