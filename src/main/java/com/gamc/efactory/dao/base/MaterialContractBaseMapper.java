package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.MaterialContract;
/**
*  @author lizeh
*/
public interface MaterialContractBaseMapper {

    int insertMaterialContract(MaterialContract object);

    int updateMaterialContract(MaterialContract object);

    int update(MaterialContract.UpdateBuilder object);

    List<MaterialContract> queryMaterialContract(MaterialContract object);

    MaterialContract queryMaterialContractLimit1(MaterialContract object);

}