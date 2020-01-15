package com.gamc.efactory.dao;

import java.math.BigDecimal;
import java.util.List;

import com.gamc.efactory.model.dataObject.MqmsVoucherRaw;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsVoucher;
import com.gamc.efactory.dao.base.MqmsVoucherBaseMapper;
/**
*  @author wangjian
*/
public interface MqmsVoucherMapper extends MqmsVoucherBaseMapper{

    int selectEngTypeCount(@Param("eng_code") String engCode,@Param("confirm_date") String confirmDate);
    BigDecimal selectTotalCost(@Param("eng_code") String engCode, @Param("confirm_date") String confirmDate);
    int selectByVoucherCode(@Param("voucher_code") String voucherCode);
    int updateByVoucher(MqmsVoucher object);

}