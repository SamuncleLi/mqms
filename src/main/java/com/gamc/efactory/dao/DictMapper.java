package com.gamc.efactory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.Dict;
import com.gamc.efactory.dao.base.DictBaseMapper;
import org.springframework.stereotype.Repository;

/**
*  @author lizeh
*/
@Repository
public interface DictMapper extends DictBaseMapper{
    int countDict(Dict dict);

}