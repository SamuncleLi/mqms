package com.gamc.efactory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsFailureReport;
import com.gamc.efactory.dao.base.MqmsFailureReportBaseMapper;
import org.springframework.security.core.parameters.P;

/**
*  @author lizeh
*/
public interface MqmsFailureReportMapper extends MqmsFailureReportBaseMapper{
    int countByMonth(@Param("engType") String engType, @Param("yearAndMonth")String yearAndMonth);

}