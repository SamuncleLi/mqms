package com.gamc.efactory.dao;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import com.gamc.efactory.controller.VoucherController;
import com.gamc.efactory.model.viewObject.FailureTop10;
import com.gamc.efactory.model.viewObject.TransmissionProportion;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsVoucher;
import com.gamc.efactory.dao.base.MqmsVoucherBaseMapper;
/**
*  @author wangjian
*/
public interface MqmsVoucherMapper extends MqmsVoucherBaseMapper{
    public List<TransmissionProportion> calTransmissionProportion(MqmsVoucher mqmsVoucher);
    public List<FailureTop10> failureTop10(MqmsVoucher mqmsVoucher);

    int selectClaimCount(@Param("engType") String engType,@Param("beginData") String beginData,@Param("endData") String endData);
    int selectTransClaimCount(@Param("tranTypeDetail") String transTypeDetail,@Param("beginData") String beginData,@Param("endData") String endData);
    BigDecimal selectTotalCost(@Param("eng_type") String engType, @Param("confirm_date") String confirmDate);
    int selectByVoucherCode(@Param("voucher_code") String voucherCode);
    //左等右不等
    int countBetweenYearAndMonth(@Param("eng_type")String engType, @Param("begin")String begin, @Param("end")String end);
    //左右均等于
    int salesFailureTimeBetween(@Param("eng_type")String engType, @Param("begin")int begin, @Param("end")int end);
    int salesTransFailureTimeBetween(@Param("tranTypeDetail")String tranTypeDetail, @Param("begin")int begin, @Param("end")int end);
    public List<FailureTop10> transFailureTop10(MqmsVoucher mqmsVoucher);

}