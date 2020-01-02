package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.WarehousingReason;
/**
*  @author lizh
*/
public interface WarehousingReasonBaseMapper {

    int insertWarehousingReason(WarehousingReason object);

    int updateWarehousingReason(WarehousingReason object);

    int update(WarehousingReason.UpdateBuilder object);

    List<WarehousingReason> queryWarehousingReason(WarehousingReason object);

    WarehousingReason queryWarehousingReasonLimit1(WarehousingReason object);

}