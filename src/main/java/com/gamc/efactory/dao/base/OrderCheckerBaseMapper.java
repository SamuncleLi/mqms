package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.OrderChecker;
/**
*  @author author
*/
public interface OrderCheckerBaseMapper {

    int insertOrderChecker(OrderChecker object);

    int updateOrderChecker(OrderChecker object);

    int update(OrderChecker.UpdateBuilder object);

    List<OrderChecker> queryOrderChecker(OrderChecker object);

    OrderChecker queryOrderCheckerLimit1(OrderChecker object);

}