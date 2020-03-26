package com.gamc.efactory.dao;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsFaultDecode;
import com.gamc.efactory.dao.base.MqmsFaultDecodeBaseMapper;
/**
*  @author wangjian
*/
public interface MqmsFaultDecodeMapper extends MqmsFaultDecodeBaseMapper{

   String selectFaultCode(@Param("fault_symptom_phoeno") String faultSymptomPhoeno);
   int deleteFaultCodeById(@Param("id") String id);
   List<HashMap<String, String>> searchFaultCodeInfor(@Param("faultPartCode") String faultPartCode, @Param("faultPartName") String faultPartName, @Param("faultSymptomPhoeno") String faultSymptomPhoeno, @Param("faultSymptomCode") String faultSymptomCode);
}