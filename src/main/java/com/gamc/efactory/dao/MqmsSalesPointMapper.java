package com.gamc.efactory.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsSalesPoint;
import com.gamc.efactory.dao.base.MqmsSalesPointBaseMapper;
/**
*  @author author
*/
public interface MqmsSalesPointMapper extends MqmsSalesPointBaseMapper{

    String selectSalesPointInfor(@Param("salesPointCode") String salesPointCode);
    int deleteSalesPointById(@Param("id") String id);
    List<HashMap<String, String>> searchSalesPointInfor(
            @Param("salesPointName") String salesPointName,
            @Param("salesPointArea") String salesPointArea,
            @Param("salesPointCode") String salesPointCode);
}