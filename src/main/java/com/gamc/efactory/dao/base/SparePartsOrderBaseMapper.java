package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.SparePartsOrder;
/**
*  @author lizeh
*/
public interface SparePartsOrderBaseMapper {

    int insertSparePartsOrder(SparePartsOrder object);

    int updateSparePartsOrder(SparePartsOrder object);

    int update(SparePartsOrder.UpdateBuilder object);

    List<SparePartsOrder> querySparePartsOrder(SparePartsOrder object);

    SparePartsOrder querySparePartsOrderLimit1(SparePartsOrder object);

}