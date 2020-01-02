package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.Dict;
/**
*  @author lizeh
*/
public interface DictBaseMapper {

    int insertDict(Dict object);

    int updateDict(Dict object);

    int update(Dict.UpdateBuilder object);

    List<Dict> queryDict(Dict object);

    Dict queryDictLimit1(Dict object);

}