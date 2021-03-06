package com.gamc.efactory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsFailureAnalysis;
import com.gamc.efactory.dao.base.MqmsFailureAnalysisBaseMapper;
/**
*  @author lizeh
*/
public interface MqmsFailureAnalysisMapper extends MqmsFailureAnalysisBaseMapper{
    //获取某个failureTrack下的所有flag
    public List<String> queryFlags(int failureTrackId);

}