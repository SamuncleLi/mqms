package com.gamc.efactory.dao;

import java.util.List;

import com.gamc.efactory.model.dataObject.MqmsProduction;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsSalesRaw;
import com.gamc.efactory.dao.base.MqmsSalesRawBaseMapper;
/**
*  @author wangjian
*/
public interface MqmsSalesRawMapper extends MqmsSalesRawBaseMapper{
    int selectByVinCode(@Param("vin_code") String vinCode);
    int updateByVinCode(MqmsSalesRaw object);

}