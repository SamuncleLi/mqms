package com.gamc.efactory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsVinDecode;
import com.gamc.efactory.dao.base.MqmsVinDecodeBaseMapper;
/**
*  @author wangjian
*/
public interface MqmsVinDecodeMapper extends MqmsVinDecodeBaseMapper{

    MqmsVinDecode vinDecode(@Param("vin_short_code") String vinShortCode);
}