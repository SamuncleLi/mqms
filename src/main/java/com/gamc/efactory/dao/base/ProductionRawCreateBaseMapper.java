package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.ProductionRawCreate;
/**
*  @author wangjian
*/
public interface ProductionRawCreateBaseMapper {

    int insertProductionRawCreate(ProductionRawCreate object);

    int updateProductionRawCreate(ProductionRawCreate object);

    int update(ProductionRawCreate.UpdateBuilder object);

    List<ProductionRawCreate> queryProductionRawCreate(ProductionRawCreate object);

    ProductionRawCreate queryProductionRawCreateLimit1(ProductionRawCreate object);

}