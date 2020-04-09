package com.gamc.efactory;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import static java.util.Collections.singletonList;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@MapperScan("com.gamc.efactory.dao")
//public class MqmsApplication extends SpringBootServletInitializer {
public class MqmsApplication {
//		war包方式启动
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
//		return builder.sources(MqmsApplication.class);
//	}
	public static void main(String[] args) {
		SpringApplication.run(MqmsApplication.class, args);
	}
}
