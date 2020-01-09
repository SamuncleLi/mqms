package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsVoucherRaw;
/**
*  @author author
*/
public interface MqmsVoucherRawBaseMapper {

    int insertMqmsVoucherRaw(MqmsVoucherRaw object);

    int updateMqmsVoucherRaw(MqmsVoucherRaw object);

    int update(MqmsVoucherRaw.UpdateBuilder object);

    List<MqmsVoucherRaw> queryMqmsVoucherRaw(MqmsVoucherRaw object);

    MqmsVoucherRaw queryMqmsVoucherRawLimit1(MqmsVoucherRaw object);

}