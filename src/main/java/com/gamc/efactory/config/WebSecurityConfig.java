package com.gamc.efactory.config;

/**
 * Created by Zeho Lee on 2019/8/28.
 */
import com.gamc.efactory.service.serviceImpl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
    UserDetailsService userService(){ //注册UserDetailsService 的bean
        return new UserService();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService()); //user Details Service验证

    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //必须有下面两条语句，否则会报错！
        // 关掉csrf的功能
        http.csrf().disable();
        // 跨域的问题
        http.headers().frameOptions().disable();
//        http.authorizeRequests()
//                .anyRequest().authenticated() //任何请求,登录后可以访问
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .failureUrl("/login?error")
//                .permitAll() //登录页面用户任意访问
//                .and()
//                .logout().permitAll(); //注销行为任意访问
        http.authorizeRequests()
                .anyRequest()
                .permitAll() //登录页面用户任意访问
                .and()
                .logout().permitAll(); //注销行为任意访问
    }

//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//
////        auth.inMemoryAuthentication()
////                .withUser("user").password("user").roles("USER")
////                .and()
////                .withUser("admin").password("admin").roles("ADMIN");
//
////        auth.jdbcAuthentication()
//
//        auth.authenticationProvider(custAuthenticationProvider);
//    }

}
