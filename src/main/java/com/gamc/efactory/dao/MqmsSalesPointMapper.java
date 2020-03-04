package com.gamc.efactory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsSalesPoint;
import com.gamc.efactory.dao.base.MqmsSalesPointBaseMapper;
/**
*  @author author
*/
public interface MqmsSalesPointMapper extends MqmsSalesPointBaseMapper{

    String selectSalesPointInfor(@Param("salesPointCode") String salesPointCode);

}