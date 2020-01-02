package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.WmsFinancialCenter;
/**
*  @author author
*/
public interface WmsFinancialCenterBaseMapper {

    int insertWmsFinancialCenter(WmsFinancialCenter object);

    int updateWmsFinancialCenter(WmsFinancialCenter object);

    int update(WmsFinancialCenter.UpdateBuilder object);

    List<WmsFinancialCenter> queryWmsFinancialCenter(WmsFinancialCenter object);

    WmsFinancialCenter queryWmsFinancialCenterLimit1(WmsFinancialCenter object);

}