package com.gamc.efactory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.SparePartsContract;
import com.gamc.efactory.dao.base.SparePartsContractBaseMapper;
/**
*  @author lizeh
*/
public interface SparePartsContractMapper extends SparePartsContractBaseMapper{
    int countSparePartsContract(SparePartsContract sparePartsContract);

}