package com.gamc.efactory.config;

import com.gamc.efactory.service.serviceImpl.UserService;
import com.gamc.efactory.webservice.SoapUserServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import com.gamc.efactory.webservice.SoapUserService;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * Created by Zeho Lee on 2019/9/16.
 */
@Configuration
public class WebServiceConfig {

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }
    @Bean
    public SoapUserService SoapUserService() {
        return new SoapUserServiceImpl();
    }

    //发布服务
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), SoapUserService());
        endpoint.publish("/userService");
        return endpoint;
    }
}
