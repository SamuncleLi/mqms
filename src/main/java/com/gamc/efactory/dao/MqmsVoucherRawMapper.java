package com.gamc.efactory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsVoucherRaw;
import com.gamc.efactory.dao.base.MqmsVoucherRawBaseMapper;
/**
*  @author wangjian
*/
public interface MqmsVoucherRawMapper extends MqmsVoucherRawBaseMapper{
    int selectByQualityFeedbackCode(@Param("quality_feedback_code") String qualityFeedbackCode);
    int updateByQualityFeedbackCode(MqmsVoucherRaw object);
}