package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsFailureAnalysis;
/**
*  @author lizeh
*/
public interface MqmsFailureAnalysisBaseMapper {

    int insertMqmsFailureAnalysis(MqmsFailureAnalysis object);

    int updateMqmsFailureAnalysis(MqmsFailureAnalysis object);

    int update(MqmsFailureAnalysis.UpdateBuilder object);

    List<MqmsFailureAnalysis> queryMqmsFailureAnalysis(MqmsFailureAnalysis object);

    MqmsFailureAnalysis queryMqmsFailureAnalysisLimit1(MqmsFailureAnalysis object);

}