package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsFailureReportRaw;
/**
*  @author author
*/
public interface MqmsFailureReportRawBaseMapper {

    int insertMqmsFailureReportRaw(MqmsFailureReportRaw object);

    int updateMqmsFailureReportRaw(MqmsFailureReportRaw object);

    int update(MqmsFailureReportRaw.UpdateBuilder object);

    List<MqmsFailureReportRaw> queryMqmsFailureReportRaw(MqmsFailureReportRaw object);

    MqmsFailureReportRaw queryMqmsFailureReportRawLimit1(MqmsFailureReportRaw object);

}