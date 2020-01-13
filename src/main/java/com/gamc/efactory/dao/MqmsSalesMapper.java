package com.gamc.efactory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsSales;
import com.gamc.efactory.dao.base.MqmsSalesBaseMapper;
/**
*  @author wangjian
*/
public interface MqmsSalesMapper extends MqmsSalesBaseMapper{

    int selectSecondSalesCount(@Param("eng_type") String engCode,@Param("second_pin_date") String secondPinDate);
        }