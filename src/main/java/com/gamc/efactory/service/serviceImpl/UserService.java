package com.gamc.efactory.service.serviceImpl;

import com.gamc.efactory.dao.UserMapper;
import com.gamc.efactory.model.dataObject.Role;
import com.gamc.efactory.model.dataObject.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zeho Lee on 2019/8/28.
 */
public class UserService implements UserDetailsService {
    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String userId) { //重写loadUserByUsername 方法获得 userdetails 类型用户
        User user = userMapper.queryUserLimit1(Integer.parseInt(userId));
        if(user == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        //用于添加用户的权限。只要把用户权限添加到authorities 就万事大吉。
        for(Role role:user.getRoles())
        {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
            System.out.println(role.getName());
        }
        return new org.springframework.security.core.userdetails.User(String.valueOf(user.getUserId()),
                user.getTimeKey(), authorities);
    }
}
