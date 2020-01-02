package com.gamc.efactory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.Order;
import com.gamc.efactory.dao.base.OrderBaseMapper;
import org.springframework.stereotype.Repository;

/**
*  @author lizh
*/
@Repository
public interface OrderMapper extends OrderBaseMapper{
    int countOrder(Order order);

}