package com.gamc.efactory.dao;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsVinDecode;
import com.gamc.efactory.dao.base.MqmsVinDecodeBaseMapper;
/**
*  @author wangjian
*/
public interface MqmsVinDecodeMapper extends MqmsVinDecodeBaseMapper{

    MqmsVinDecode vinDecode(@Param("vin_short_code") String vinShortCode);
    int deleteVinById(@Param("id") String id);
    List<HashMap<String, String>> searchVinInfor(
            @Param("vinShortCode") String vinShortCode,
            @Param("vinSimCode") String vinSimCode,
            @Param("vinEngType") String vinEngType,
            @Param("vinSeries") String vinSeries,
            @Param("vinEngShortCode") String vinEngShortCode,
            @Param("vinTransmShortCode") String vinTransmShortCode,
            @Param("vinCarShortCode") String vinCarShortCode,
            @Param("vinCarType") String vinCarType,
            @Param("vinTransmType") String vinTransmType);
}