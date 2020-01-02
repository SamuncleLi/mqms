package com.gamc.efactory.dao;

import com.gamc.efactory.model.dataObject.Auth;
import com.gamc.efactory.model.dataObject.Role;

import java.util.List;

/**
 * Created by Zeho Lee on 2019/9/9.
 */
public interface RoleMapper {
    List<Auth> queryAuths(Role role);
}
