package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsVoucher;
/**
*  @author lizeh
*/
public interface MqmsVoucherBaseMapper {

    int insertMqmsVoucher(MqmsVoucher object);

    int updateMqmsVoucher(MqmsVoucher object);

    int update(MqmsVoucher.UpdateBuilder object);

    List<MqmsVoucher> queryMqmsVoucher(MqmsVoucher object);

    MqmsVoucher queryMqmsVoucherLimit1(MqmsVoucher object);

}