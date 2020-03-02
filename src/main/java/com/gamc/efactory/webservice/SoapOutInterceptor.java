package com.gamc.efactory.webservice;


//import com.gamc.efactory.controller.OrderController;
import org.apache.commons.io.IOUtils;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class SoapOutInterceptor extends AbstractPhaseInterceptor<Message> {
    Logger log = LoggerFactory.getLogger(SoapOutInterceptor.class);
    public SoapOutInterceptor() {
        //这儿使用pre_stream，意思为在流关闭之前
        super(Phase.PRE_STREAM);
    }

    public void handleMessage(Message message) {
        try {
            //添加前缀
            Map<String, String> envMap = new HashMap<String, String>();
            envMap.put( "soapenv" , "http://schemas.xmlsoap.org/soap/envelope/");
            Map<String, String> nsMap = new HashMap<String, String>();
            nsMap.put( "http://localhost/BOI/" , "boi" );
            JAXBDataBinding dataBinding = (JAXBDataBinding)message.getExchange().getEndpoint().getService().getDataBinding();
            dataBinding.setNamespaceMap(nsMap);
            message.put("soap.env.ns.map", envMap);

            OutputStream os = message.getContent(OutputStream.class);
            CachedStream cs = new CachedStream();
            message.setContent(OutputStream.class, cs);
            message.getInterceptorChain().doIntercept(message);
            CachedOutputStream csnew = (CachedOutputStream) message.getContent(OutputStream.class);
            InputStream in = csnew.getInputStream();
            String xml = IOUtils.toString(in);
            System.out.println("replaceBegin" + xml);
            xml = xml.replace("xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"","xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"")
                    //.replace("xmlns:ns2=\"http://localhost/BOI/\"", "xmlns:NS1=\"http://localhost/BOI/\"")
                    .replace("<return>", "")
                    .replace("</return>", "")
                    .replace("soap:", "soapenv:")
                    .replace("ns2", "boi")
                    .replace("<soapenv:Header/>", "");

            System.out.println("replaceAfter" + xml);
            //这里对xml做处理，处理完后同理，写回流中
            IOUtils.copy(new ByteArrayInputStream(xml.getBytes("UTF-8")), os);
            cs.close();
            os.flush();
            message.setContent(OutputStream.class, os);
        } catch (Exception e) {
            log.error("Error when split original inputStream. CausedBy : " + "\n" + e);
        }
    }

    private class CachedStream extends CachedOutputStream {
        public CachedStream() {
            super();
        }

        protected void doFlush() throws IOException {
            currentStream.flush();
        }

        protected void doClose() throws IOException {

        }

        protected void onWrite() throws IOException {

        }
    }

}
