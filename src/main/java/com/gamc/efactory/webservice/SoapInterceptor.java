package com.gamc.efactory.webservice;

import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SoapInterceptor extends AbstractPhaseInterceptor<Message> {

    public SoapInterceptor() {
        super(Phase.RECEIVE);
    }
    @Override
    public void handleMessage(Message message) throws Fault {
        InputStream is = message.getContent(InputStream.class);
        if (is != null) {
            try {
                String str = IOUtils.toString(is);
                // 原请求报文
                System.out.println("====> request xml=\r\n" + str);

                // 把siebel格式的报文替换成符合cxf带前缀的命名空间
                str = str.replace("ns1:", "")
                        .replace("xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"", " ")
                        //.replace("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"", "xmlns:cus=\"http://10.80.48.162:8000/mycrm/webservice/customerService\"")
                        .replace("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"", "xmlns:ser=\"http://service.webservice.jeesite.thinkgem.com/\"")

                        //.replace("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"", "xmlns:cus=\"http://localhost:8080/mycrm/webservice/customerService\"")
                        .replace(" xmlns:ns1=\"http://tzgl.webservice.com/\"", "")
                        .replace(" xmlns:ns1=\"http://service.webservice.jeesite.thinkgem.com/\"", "")
                        .replace(" soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\"", "")
                        .replace(" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\"", "")
                        .replace(" xsi:type=\"soapenc:string\"", "")
                        .replace("<receive>", "<ser:receive>")
                        .replace("</receive>", "</ser:receive>");

                // 替换后的报文
                System.out.println("====> replace xml=\r\n" + str);

                InputStream ism = new ByteArrayInputStream(str.getBytes("UTF-8"));
                message.setContent(InputStream.class, ism);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
