package com.gamc.efactory.service;

import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import java.util.Map;

/**
 * Created by Zeho Lee on 2019/1/10.
 */
@Service
public interface HttpService {
    public <T> T postInForm(String url, MultiValueMap<String, String> params, Class<T> returnClass);
    public <T> T postInJSON(String url, Map<String, String> params, Class<T> returnClass);


}
