package com.gamc.efactory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MqmsSales;
import com.gamc.efactory.dao.base.MqmsSalesBaseMapper;
/**
*  @author wangjian
*/
public interface MqmsSalesMapper extends MqmsSalesBaseMapper{
    int selectSecondSalesCount(@Param("engType") String engShortCode,@Param("beginData") String beginData,@Param("endData") String endData);
    int selectTranSecondSalesCount(@Param("tranType") String tranType,@Param("beginData") String beginData,@Param("endData") String endData);
    int selectCarMutilSalesCount(@Param("carType") String carType,
                                 @Param("beginData") String beginData,
                                 @Param("endData") String endData,
                                 @Param("nextData") String nextData);

    MqmsSales selectByVinCode(@Param("vin_code") String vinCode);
    int selectVinCodeCount(@Param("vin_code") String vinCode);
    int updateByVinCode(MqmsSales object);
    int selectCountBySalesArea(@Param("salesArea") String salesArea);
    int querryFailureMonthCount(@Param("beginDate") String beginDate,@Param("endDate") String endDate);


}