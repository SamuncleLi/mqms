package com.gamc.efactory.dao;

import com.gamc.efactory.model.dataObject.User;

/**
 * Created by Zeho Lee on 2019/7/30.
 */
public interface UserMapper {
    User queryUserLimit1(int userId);
}
