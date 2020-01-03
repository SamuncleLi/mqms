package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.ProductionRaw;
/**
*  @author wangjian
*/
public interface ProductionRawBaseMapper {

    int insertProductionRaw(ProductionRaw object);

    int updateProductionRaw(ProductionRaw object);

    int update(ProductionRaw.UpdateBuilder object);

    List<ProductionRaw> queryProductionRaw(ProductionRaw object);

    ProductionRaw queryProductionRawLimit1(ProductionRaw object);

}