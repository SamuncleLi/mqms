package com.gamc.efactory.dao;

import java.util.List;
import java.util.Map;

import com.sun.javafx.collections.MappingChange;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsVoucherRaw;
import com.gamc.efactory.dao.base.MqmsVoucherRawBaseMapper;
/**
*  @author wangjian
*/
public interface MqmsVoucherRawMapper extends MqmsVoucherRawBaseMapper{
    int selectByVoucherCode(@Param("voucherCode") String voucherCode);

}