package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.Warehousing;
/**
*  @author author
*/
public interface WarehousingBaseMapper {

    int insertWarehousing(Warehousing object);

    int updateWarehousing(Warehousing object);

    int update(Warehousing.UpdateBuilder object);

    List<Warehousing> queryWarehousing(Warehousing object);

    Warehousing queryWarehousingLimit1(Warehousing object);

}