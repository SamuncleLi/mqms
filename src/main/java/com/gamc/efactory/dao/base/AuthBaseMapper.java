package com.gamc.efactory.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gamc.efactory.model.dataObject.Auth;
/**
*  @author author
*/
public interface AuthBaseMapper {

    int insertAuth(Auth object);

    int updateAuth(Auth object);

    int update(Auth.UpdateBuilder object);

    List<Auth> queryAuth(Auth object);

    Auth queryAuthLimit1(Auth object);

}