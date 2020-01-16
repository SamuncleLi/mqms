package com.gamc.efactory.dao;

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
}