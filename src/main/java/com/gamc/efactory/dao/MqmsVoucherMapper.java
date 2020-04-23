package com.gamc.efactory.dao;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

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

    int selectClaimCount(@Param("engType") String engType,@Param("beginDate") String beginDate,@Param("endDate") String endDate);
    int selectTransClaimCount(@Param("tranTypeDetail") String transTypeDetail,@Param("beginDate") String beginDate,@Param("endDate") String endDate);
    int selectCarMutilMount(@Param("carModel")String carModel, @Param("beginDate")String beginDate, @Param("endDate")String endDate);
    BigDecimal selectTotalCost(@Param("eng_type") String engType, @Param("confirm_date") String confirmDate);
    int selectByVoucherCode(@Param("voucher_code") String voucherCode);
    //左等右不等
    int countBetweenYearAndMonth(@Param("eng_type")String engType, @Param("begin")String begin, @Param("end")String end);
    //左右均等于
    int salesFailureTimeBetween(@Param("eng_type")String engType, @Param("begin")String begin, @Param("end")String end);
    int salesTransFailureTimeBetween(@Param("tranTypeDetail")String tranTypeDetail, @Param("begin")String begin, @Param("end")String end);
    public List<FailureTop10> transFailureTop10(MqmsVoucher mqmsVoucher);
    int updateMqmsVoucherByVoucherCode(MqmsVoucher object);
    int querryWeekMileageCount(@Param("begin") String begin,@Param("end") String end,@Param("beginDate") String beginDate,@Param("endDate") String endDate);
    int querryDifferentMonthCount(@Param("begin") String begin,@Param("end") String end,@Param("beginDate") String beginDate,@Param("endDate") String endDate);
    int querryDifferentRegionsCount(@Param("salesArea") String salesArea,@Param("beginDate") String beginDate,@Param("endDate") String endDate);
    String[] querryDifferentArea(@Param("beginDate") String beginDate,@Param("endDate") String endDate);
    List<HashMap<String, String>> querryDifferentEngArrange(@Param("beginDate") String beginDate, @Param("endDate") String endDate);
    int querryEngFailureMonthCount(@Param("beginDate") String beginDate,@Param("endDate") String endDate,@Param("engArrange") String engArrange,@Param("engType") String engType);
    int querryTransFailureMonthCount(@Param("beginDate") String beginDate,@Param("endDate") String endDate,@Param("engArrange") String engArrange,@Param("engType") String engType);
    int querryOfflineMonthCount(@Param("beginDate") String beginDate,@Param("endDate") String endDate,@Param("engArrange") String engArrange);
    }