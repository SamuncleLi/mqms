package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.SalesRaw;
/**
*  @author wangjian
*/
public interface SalesRawBaseMapper {

    int insertSalesRaw(SalesRaw object);

    int updateSalesRaw(SalesRaw object);

    int update(SalesRaw.UpdateBuilder object);

    List<SalesRaw> querySalesRaw(SalesRaw object);

    SalesRaw querySalesRawLimit1(SalesRaw object);

}