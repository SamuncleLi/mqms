package com.gamc.efactory.webservice;

import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.interceptor.OutInterceptors;
import org.dom4j.Element;
import org.dom4j.Attribute;
import org.dom4j.io.SAXReader;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

import javax.jws.WebService;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.List;

//入拦截器
@InInterceptors(interceptors={"com.gamc.efactory.webservice.SoapInterceptor"})
//出拦截器
@OutInterceptors(interceptors={"com.gamc.efactory.webservice.SoapOutInterceptor"})
//对外发布的服务接口名称
@WebService(serviceName = "soapuser", targetNamespace = "http://localhost/BOI/", endpointInterface = "com.gamc.efactory.webservice.SoapUserService")
@Component
public class SoapUserServiceImpl implements SoapUserService{
    public SoapResponse Invoke(String from,String token, String funcName, String parameters) {
        SoapResponse u=new SoapResponse();
        HashMap<String, Object> result = new HashMap<String, Object>();
        try {
            u.setInvokeResult(true);
            System.out.println(parameters);
            SAXReader saxReader = new SAXReader();
            org.dom4j.Document docDom4j = saxReader.read(new ByteArrayInputStream(parameters.getBytes("utf-8")));
            org.dom4j.Element root = docDom4j.getRootElement();
            List<Attribute> rooAttrList = root.attributes();
            for (Attribute rootAttr : rooAttrList) {
                System.out.println(rootAttr.getName() + ": " + rootAttr.getValue());
                result.put(rootAttr.getName(), rootAttr.getValue());
            }

            List<Element> childElements = root.elements();

            for (org.dom4j.Element e1 : childElements) {
                System.out.println("第一层：" + e1.getName() + ": " + e1.getText());
                result.put("fir" + e1.getName(), e1.getText());
            }

            for (org.dom4j.Element child : childElements) {
                //未知属性名情况下
                List<Attribute> attributeList = child.attributes();
                for (Attribute attr : attributeList) {
                    System.out.println("第二层：" + attr.getName() + ": " + attr.getValue());
                    result.put("sec" + attr.getName(), attr.getValue());
                }

                List<org.dom4j.Element> elementList = child.elements();
                for (org.dom4j.Element ele : elementList) {

                    System.out.println("第二层：" + ele.getName() + ": " + ele.getText());
                    result.put("sec" + ele.getName(), ele.getText());

                    List<Attribute> kidAttr = ele.attributes();
                    for (Attribute kidattr : kidAttr) {
                        System.out.println("第三层：" + kidattr.getName() + ": " + kidattr.getValue());
                        result.put("thi" + kidattr.getName(), kidattr.getValue());
                    }

                    List<Element> lidList = ele.elements();
                    int size = lidList.size();
                    if (size > 0) {
                        for (org.dom4j.Element e2 : lidList) {
                            System.out.println("第三层：" + e2.getName() + ": " + e2.getText());
                            result.put("thi" + e2.getName(), e2.getText());
                        }
                    }
                }
            }
            System.out.println(result.toString());
            u.setResult("1:接收成功");
            return u;
        }
        catch (Exception e){
            System.out.println(e);
            u.setInvokeResult(false);
            return u;
        }
    }
}