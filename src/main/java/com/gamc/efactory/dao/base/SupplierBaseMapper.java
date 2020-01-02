package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.Supplier;
/**
*  @author author
*/
public interface SupplierBaseMapper {

    int insertSupplier(Supplier object);

    int updateSupplier(Supplier object);

    int update(Supplier.UpdateBuilder object);

    List<Supplier> querySupplier(Supplier object);

    Supplier querySupplierLimit1(Supplier object);

}