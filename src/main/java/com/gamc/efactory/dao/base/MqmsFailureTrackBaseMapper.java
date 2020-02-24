package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsFailureTrack;
/**
*  @author author
*/
public interface MqmsFailureTrackBaseMapper {

    int insertMqmsFailureTrack(MqmsFailureTrack object);

    int updateMqmsFailureTrack(MqmsFailureTrack object);

    int update(MqmsFailureTrack.UpdateBuilder object);

    List<MqmsFailureTrack> queryMqmsFailureTrack(MqmsFailureTrack object);

    MqmsFailureTrack queryMqmsFailureTrackLimit1(MqmsFailureTrack object);

}