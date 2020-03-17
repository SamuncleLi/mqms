package com.gamc.efactory.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URLDecoder;

/**
 * Created by Zeho Lee on 2018/11/23.
 */
public class AttHttpRequestUtil {
    /**
     * httpPost
     * @param url  路径
     * @param jsonParam 参数
     * @return
     */
    public static JSONObject httpPost(String url,JSONObject jsonParam) throws Exception{
        return httpPost(url, jsonParam, false);
    }

    public static JSONObject httpPost(String url,JSONObject jsonParam, String contentType){
        return httpPost(url, jsonParam, false, contentType);
    }

    /**
     * post请求
     * @param url         url地址
     * @param jsonParam     参数
     * @param noNeedResponse    不需要返回结果
     * @return
     */
    public static JSONObject httpPost(String url,JSONObject jsonParam, boolean noNeedResponse) throws Exception{
        //post请求返回结果
        HttpHost proxy = new HttpHost("127.0.0.1",8888,"http");
  // RequestConfig config = RequestConfig.custom().setProxy(proxy).setConnectTimeout(10000).setSocketTimeout(15000).build();
  RequestConfig config = RequestConfig.custom().setConnectTimeout(60000).setSocketTimeout(60000).build();
        CloseableHttpClient httpClient= HttpClientBuilder.create().setDefaultRequestConfig(config).build();
        JSONObject jsonResult = null;
        HttpPost method = new HttpPost(url);
        //System.out.println(url);

            if (null != jsonParam) {
                //解决中文乱码问题
                StringEntity entity = new StringEntity(jsonParam.toString(), "utf-8");
                entity.setContentEncoding("UTF-8");
                entity.setContentType("application/json");
                method.setEntity(entity);
            }
            HttpResponse result = httpClient.execute(method);
            url = URLDecoder.decode(url, "UTF-8");
            /**请求发送成功，并得到响应**/
            if (result.getStatusLine().getStatusCode() == 200) {
                String str = "";
                try {
                    /**读取服务器返回过来的json字符串数据**/
                    str = EntityUtils.toString(result.getEntity());
                    if (noNeedResponse) {
                        return null;
                    }
                    /**把json字符串转换成json对象**/
                    jsonResult = JSONObject.parseObject(str);
                } catch (Exception e) {
                    System.out.println("json对象转换失败");
                }
            }

        return jsonResult;
    }

    /**
     * @描述 不以json方式发送的request
     * @编写人 Zeho Lee
     * @日期 2018/12/26
     * @参变量
     * @返回
     * @抛出异常
    */
    public static JSONObject httpPost(String url,JSONObject jsonParam, boolean noNeedResponse, String contentType){
        //post请求返回结果
        HttpHost proxy = new HttpHost("127.0.0.1",8888,"http");
        RequestConfig config = RequestConfig.custom().setProxy(proxy).setConnectTimeout(10000).setSocketTimeout(15000).build();
        CloseableHttpClient httpClient= HttpClientBuilder.create().setDefaultRequestConfig(config).build();
        JSONObject jsonResult = null;
        HttpPost method = new HttpPost(url);
        System.out.println(url);
        try {
            if (null != jsonParam) {
                //解决中文乱码问题
                StringEntity entity = new StringEntity(jsonParam.toString(), "utf-8");
                entity.setContentEncoding("UTF-8");
                entity.setContentType(contentType);
                method.setEntity(entity);
            }
            HttpResponse result = httpClient.execute(method);
            url = URLDecoder.decode(url, "UTF-8");
            /**请求发送成功，并得到响应**/
            if (result.getStatusLine().getStatusCode() == 200) {
                String str = "";
                try {
                    /**读取服务器返回过来的json字符串数据**/
                    str = EntityUtils.toString(result.getEntity());
                    if (noNeedResponse) {
                        return null;
                    }
                    /**把json字符串转换成json对象**/
                    jsonResult = JSONObject.parseObject(str);
                } catch (Exception e) {
                    System.out.println("json对象转换失败");
                }
            }
        } catch (IOException e) {
            System.out.println("post请求提交失败");
        }
        return jsonResult;
    }

    /**
     * 发送get请求
     * @param url    路径
     * @return
     */
    public static JSONObject httpGet(String url){
//            设置代理
        System.setProperty("http.proxyHost", "127.0.0.1");
        System.setProperty("https.proxyHost", "127.0.0.1");
        System.setProperty("http.proxyPort", "8888");
        System.setProperty("https.proxyPort", "8888");
        //get请求返回结果
        JSONObject jsonResult = null;
        try {
            HttpHost proxy = new HttpHost("localhost",8888);
            RequestConfig config = RequestConfig.custom().setProxy(proxy).setConnectTimeout(10000).setSocketTimeout(15000).build();
            CloseableHttpClient client= HttpClientBuilder.create().setDefaultRequestConfig(config).build();

            //发送get请求
            HttpGet request = new HttpGet(url);
            HttpResponse response = client.execute(request);

            /**请求发送成功，并得到响应**/
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                /**读取服务器返回过来的json字符串数据**/
                String strResult = EntityUtils.toString(response.getEntity());
                /**把json字符串转换成json对象**/
                jsonResult = JSONObject.parseObject(strResult);
                url = URLDecoder.decode(url, "UTF-8");
            } else {
                System.out.println("get请求提交失败:" + url);
            }
        } catch (IOException e) {
            System.out.println("get请求提交失败");
        }
        return jsonResult;
    }

}
