package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.WmsDict;
/**
*  @author author
*/
public interface WmsDictBaseMapper {

    int insertWmsDict(WmsDict object);

    int updateWmsDict(WmsDict object);

    int update(WmsDict.UpdateBuilder object);

    List<WmsDict> queryWmsDict(WmsDict object);

    WmsDict queryWmsDictLimit1(WmsDict object);

}