package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.SimpleApplicationObject;
/**
*  @author lizeh
*/
public interface SimpleApplicationObjectBaseMapper {

    int insertSimpleApplicationObject(SimpleApplicationObject object);

    int updateSimpleApplicationObject(SimpleApplicationObject object);

    int update(SimpleApplicationObject.UpdateBuilder object);

    List<SimpleApplicationObject> querySimpleApplicationObject(SimpleApplicationObject object);

    SimpleApplicationObject querySimpleApplicationObjectLimit1(SimpleApplicationObject object);

}