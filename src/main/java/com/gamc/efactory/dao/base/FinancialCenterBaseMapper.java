package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.FinancialCenter;
/**
*  @author lizeh
*/
public interface FinancialCenterBaseMapper {

    int insertFinancialCenter(FinancialCenter object);

    int updateFinancialCenter(FinancialCenter object);

    int update(FinancialCenter.UpdateBuilder object);

    List<FinancialCenter> queryFinancialCenter(FinancialCenter object);

    FinancialCenter queryFinancialCenterLimit1(FinancialCenter object);

}