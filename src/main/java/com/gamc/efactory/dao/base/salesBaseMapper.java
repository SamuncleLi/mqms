package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.sales;
/**
*  @author wangjian
*/
public interface salesBaseMapper {

    int insertsales(sales object);

    int updatesales(sales object);

    int update(sales.UpdateBuilder object);

    List<sales> querysales(sales object);

    sales querysalesLimit1(sales object);

}