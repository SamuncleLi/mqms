package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsFailureReport;
/**
*  @author lizeh
*/
public interface MqmsFailureReportBaseMapper {

    int insertMqmsFailureReport(MqmsFailureReport object);

    int updateMqmsFailureReport(MqmsFailureReport object);

    int update(MqmsFailureReport.UpdateBuilder object);

    List<MqmsFailureReport> queryMqmsFailureReport(MqmsFailureReport object);

    MqmsFailureReport queryMqmsFailureReportLimit1(MqmsFailureReport object);

}