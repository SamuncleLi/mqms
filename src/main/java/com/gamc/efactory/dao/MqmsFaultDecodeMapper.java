package com.gamc.efactory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsFaultDecode;
import com.gamc.efactory.dao.base.MqmsFaultDecodeBaseMapper;
/**
*  @author wangjian
*/
public interface MqmsFaultDecodeMapper extends MqmsFaultDecodeBaseMapper{

   String selectFaultCode(@Param("fault_symptom_phoeno") String faultSymptomPhoeno);
}