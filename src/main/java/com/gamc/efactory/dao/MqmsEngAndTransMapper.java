package com.gamc.efactory.dao;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsEngAndTrans;
import com.gamc.efactory.dao.base.MqmsEngAndTransBaseMapper;
/**
*  @author wangjian
*/
public interface MqmsEngAndTransMapper extends MqmsEngAndTransBaseMapper{

    List<HashMap<String, String>> querryDifferentType();
    List<HashMap<String, String>> querryDetailType(@Param("engOrTrans") String engOrTrans);
}