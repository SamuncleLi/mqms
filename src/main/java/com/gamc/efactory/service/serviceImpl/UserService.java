package com.gamc.efactory.service.serviceImpl;

import com.gamc.efactory.dao.UserMapper;
import com.gamc.efactory.model.dataObject.Role;
import com.gamc.efactory.model.dataObject.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public static void main(String[] args) throws UnknownHostException, IOException {

        int port = 7000;
        String host = "localhost";

        // 创建一个套接字并将其连接到指定端口号
        Socket socket = new Socket(host, port);

        DataInputStream dis = new DataInputStream(
                new BufferedInputStream(socket.getInputStream()));

        DataOutputStream dos = new DataOutputStream(
                new BufferedOutputStream(socket.getOutputStream()));

        Scanner sc = new Scanner(System.in);

        boolean flag = false;

        while (!flag) {

            System.out.println("请输入正方形的边长:");
            double length = sc.nextDouble();

            dos.writeDouble(length);
            dos.flush();

            double area = dis.readDouble();

            System.out.println("服务器返回的计算面积为:" + area);

            while (true) {

                System.out.println("继续计算？(Y/N)");

                String str = sc.next();

                if (str.equalsIgnoreCase("N")) {
                    dos.writeInt(0);
                    dos.flush();
                    flag = true;
                    break;
                } else if (str.equalsIgnoreCase("Y")) {
                    dos.writeInt(1);
                    dos.flush();
                    break;
                }
            }
        }
        socket.close();
    }
}
