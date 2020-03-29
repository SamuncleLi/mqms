package com.gamc.efactory.service.serviceImpl;

import com.gamc.efactory.service.HttpService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.InetSocketAddress;
import java.util.Map;

/**
 * Created by Zeho Lee on 2019/1/10.
 */
@Service
public class HttpServiceImpl implements HttpService{
    //接收form
    @Override
    public <T> T postInForm(String url, MultiValueMap<String, String> params, Class<T> returnClass){
        RestTemplate client = new RestTemplate();
//        RestTemplate client = new RestTemplate(new SimpleClientHttpRequestFactory() {{
//            setProxy(new java.net.Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 8888)));
//        }});
        HttpHeaders headers = new HttpHeaders();
        //  请勿轻易改变此提交方式，大部分的情况下，提交方式都是表单提交 todo contenttype可设置
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<MultiValueMap<String, String>>(params, headers);
        return client.postForObject(url,params, returnClass);
    }

    //接收JSON
    @Override
    public <T> T postInJSON(String url, Map<String, String> params, Class<T> returnClass){
//        RestTemplate client = new RestTemplate();
        RestTemplate client = new RestTemplate(new SimpleClientHttpRequestFactory() {{
            setProxy(new java.net.Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 8888)));
        }});
        HttpHeaders headers = new HttpHeaders();
        //  请勿轻易改变此提交方式，大部分的情况下，提交方式都是表单提交 todo contenttype可设置
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Map<String, String>> requestEntity = new HttpEntity<Map<String, String>>(params, headers);
        return client.postForObject(url,requestEntity, returnClass, params);
    }

//    //接收JSON
//    public String postInJSON(String url, Map<String, String> params){
//        RestTemplate client = new RestTemplate();
//        HttpHeaders headers = new HttpHeaders();
//        //  请勿轻易改变此提交方式，大部分的情况下，提交方式都是表单提交 todo contenttype可设置
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        HttpEntity<Map<String, String>> requestEntity = new HttpEntity<Map<String, String>>(params, headers);
//        //  执行HTTP请求
//        ResponseEntity<String> response = client.exchange(url, HttpMethod.POST, requestEntity, String.class);
//        return response.getBody();
//    }
}
