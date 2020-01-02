package com.gamc.efactory.dao;

import java.util.List;

import com.gamc.efactory.model.dataObject.SparePartsContract;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MaterialContract;
import com.gamc.efactory.dao.base.MaterialContractBaseMapper;
/**
*  @author lizeh
*/
public interface MaterialContractMapper extends MaterialContractBaseMapper{
    int countMaterialContract(MaterialContract materialContract);

}