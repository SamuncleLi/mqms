package com.gamc.efactory.config;

import freemarker.ext.jsp.TaglibFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zeho Lee on 2019/8/28.
 */
@Configuration
public class TldConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private FreeMarkerConfigurer configurer;

    @PostConstruct
    public void freeMarkerConfigurer() {
        List<String> tlds = new ArrayList<String>();
        tlds.add("/static/security.tld");
        TaglibFactory taglibFactory = configurer.getTaglibFactory();
        taglibFactory.setClasspathTlds(tlds);
        if(taglibFactory.getObjectWrapper() == null) {
            taglibFactory.setObjectWrapper(configurer.getConfiguration().getObjectWrapper());
        }
    }
}

