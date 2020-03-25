package com.gamc.efactory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsSales;
import com.gamc.efactory.dao.base.MqmsSalesBaseMapper;
/**
*  @author wangjian
*/
public interface MqmsSalesMapper extends MqmsSalesBaseMapper{
    int selectSecondSalesCount(@Param("engShortCode") String engShortCode,@Param("beginData") String beginData,@Param("endData") String endData);
    int selectTranSecondSalesCount(@Param("tranType") String tranType,@Param("beginData") String beginData,@Param("endData") String endData);
    MqmsSales selectByVinCode(@Param("vin_code") String vinCode);
    int selectVinCodeCount(@Param("vin_code") String vinCode);
    int updateByVinCode(MqmsSales object);
}