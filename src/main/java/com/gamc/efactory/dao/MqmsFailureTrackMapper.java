package com.gamc.efactory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsFailureTrack;
import com.gamc.efactory.dao.base.MqmsFailureTrackBaseMapper;
/**
*  @author author
*/
public interface MqmsFailureTrackMapper extends MqmsFailureTrackBaseMapper{
    public List<MqmsFailureTrack> checkTrack(String voucherCodes);

}