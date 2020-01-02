package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.SparePartsContract;
/**
*  @author lizeh
*/
public interface SparePartsContractBaseMapper {

    int insertSparePartsContract(SparePartsContract object);

    int updateSparePartsContract(SparePartsContract object);

    int update(SparePartsContract.UpdateBuilder object);

    List<SparePartsContract> querySparePartsContract(SparePartsContract object);

    SparePartsContract querySparePartsContractLimit1(SparePartsContract object);

}