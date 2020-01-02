package com.gamc.efactory.webservice;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.dom4j.Attribute;
import org.dom4j.Element;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.*;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class SoapClient {
    Logger logger = LoggerFactory.getLogger(SoapClient.class);
    /**
     * @描述
     * @编写人 Zeho Lee
     * @邮箱 lizeh@gacmotor.com
     * @日期 2019/10/15
     * @参变量 wsdlUrl服务发布地址 serviceName服务名 portName服务端口 from发送方系统的名字 token交易唯一标识 funcName接口名称 guid传输的信息报文id data传输的数据
     * @返回
     * @抛出异常
    */
    public static JSONObject sendMessage(String wsdlUrl, String serviceName, String portName, String from, String token, String funcName, String guid, String dataJsonString){
        JSONObject result = new JSONObject();
        try{
            String ns = "http://localhost/BOI/";
            //1.创建服务(Service)
            //获取地址
            URL url = new URL(wsdlUrl);
            QName sName = new QName(ns, serviceName);
            Service service = Service.create(url, sName);

            //2.创建Dispatch
            Dispatch<SOAPMessage> dispatch = service.createDispatch(new QName(ns, portName),
                    SOAPMessage.class, Service.Mode.MESSAGE);

            //3.创建SOAP消息
            //创建消息工厂
            MessageFactory messageFactory = MessageFactory.newInstance();
            //通过消息工厂创建SOAPMessage
            SOAPMessage soapMessage = messageFactory.createMessage();
            //创建SOAPPart
            SOAPPart soapPart = soapMessage.getSOAPPart();
            //创建信封-获取soap消息部分中的信封句柄
            SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
            soapEnvelope.setPrefix("soapenv");
            soapEnvelope.removeNamespaceDeclaration("SOAP-ENV");
            soapEnvelope.setAttribute("xmlns:boi", ns);

            SOAPHeader soapHeader = soapEnvelope.getHeader();
            soapHeader.setPrefix("soapenv");

            SOAPBody soapBody = soapEnvelope.getBody();
            soapBody.setPrefix("soapenv");
            soapBody.removeNamespaceDeclaration("SOAP-ENV");
            //创建业务节点
            QName qName = new QName(ns, "Invoke", "boi");
            //把业务节点加入消息体
            SOAPBodyElement ele = soapBody.addBodyElement(qName);

            ele.addChildElement("from", "boi").setValue(from);//数据发起系统 + 握手码
            ele.addChildElement("token", "boi").setValue(token);//交易唯一标识ID
            ele.addChildElement("funcName", "boi").setValue(funcName);//由funcName唯一标识接口
            //Bill、Response等格式的请求数据需要生成xml
            org.dom4j.Document document = DocumentHelper.createDocument();
            // 2、创建根节点rss
            Element interfaceEle = document.addElement("Interface");

            //非必需,根据要求做改动
            interfaceEle.addAttribute("Sender", "GQP");
            interfaceEle.addAttribute("Receiver", "GPS");
            interfaceEle.addAttribute("Billtype", "M17");

            Element entryEle = interfaceEle.addElement("Entry");
            // 3、向rss节点添加version属性
            entryEle.addAttribute("DoFlag", "I");
            // 4、生成子节点及子节点内容
            Element guidEle = entryEle.addElement("Guid");
            guidEle.setText(guid);
            Element dataEle = entryEle.addElement("data");
            dataEle.setText(dataJsonString);
            // 5、设置生成xml的格式
            OutputFormat format = OutputFormat.createPrettyPrint();
            // 设置编码格式
            format.setEncoding("UTF-8");
            format.setSuppressDeclaration(false);

            // stringWriter字符串是用来保存XML文档的  
            StringWriter stringWriter = new StringWriter();
            // xmlWriter是用来把XML文档写入字符串的(工具)  ，StandaloneWriter拓展了xmlWriter，使得xml文件头包含standalone=”yes”
            StandaloneWriter xmlWriter = new StandaloneWriter(stringWriter, format);
            xmlWriter.write(document);

            ele.addChildElement("parameters", "boi").setValue("<![CDATA[" + stringWriter.toString() + "]]>");
            soapMessage.saveChanges();
            soapMessage.writeTo(System.out);

            //5.通过Dispatch传递信息，会返回响应消息
            SOAPMessage response = dispatch.invoke(soapMessage);
            response.writeTo(System.out);
            System.out.println("\n response......");

            //6.将响应的消息转换为dom对象(解析xml)
            Document doc = response.getSOAPPart().getEnvelope().getBody().extractContentAsDocument();
            String invokeString = doc.getElementsByTagNameNS(ns,"InvokeResult").item(0).getTextContent();
            String xmlString = doc.getElementsByTagNameNS(ns,"result").item(0).getTextContent();
            System.out.println(xmlString);

            result.put("invokeString", invokeString);
            result.put("xmlString", xmlString);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return result;
    }

    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", "111");
        //每次发送的uuid必须是独特的
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        sendMessage("http://localhost:8083/wms/ws/userService?wsdl", "soapuser", "SoapUserServiceImplPort", "GQP654321", uuid,"funcName", "guid", jsonObject.toJSONString());
    }
//        try {
//            String ns = "http://localhost/BOI/";
//            String wsdlUrl = "http://localhost:8083/wms/ws/userService?wsdl";
//            //1.创建服务(Service)
//            //获取地址
//            URL url = new URL(wsdlUrl);
//            /**WSDL实际是这样的：
//             * <wsdl:service name="soapuser">
//             *     <wsdl:port binding="tns:soapuserSoapBinding" name="SoapUserServiceImplPort">
//             *         <soap:address location="http://localhost:8083/wms/ws/userService"/>
//             *     </wsdl:port>
//             * </wsdl:service>
//             * 下面的QName的localPart即为service name
//             * Dispatch里面的localPart为port name
//             */
//            QName sName = new QName(ns, "soapuser");
//            Service service = Service.create(url, sName);
//
//            //2.创建Dispatch
//            Dispatch<SOAPMessage> dispatch = service.createDispatch(new QName(ns, "SoapUserServiceImplPort"),
//                    SOAPMessage.class, Service.Mode.MESSAGE);
//
//            //3.创建SOAP消息
//            //创建消息工厂
//            MessageFactory messageFactory = MessageFactory.newInstance();
//            //通过消息工厂创建SOAPMessage
//            SOAPMessage soapMessage = messageFactory.createMessage();
//            //创建SOAPPart
//            SOAPPart soapPart = soapMessage.getSOAPPart();
//            //创建信封-获取soap消息部分中的信封句柄
//            SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
//            soapEnvelope.setPrefix("soapenv");
//            soapEnvelope.removeNamespaceDeclaration("SOAP-ENV");
//            //soapEnvelope.setAttribute("xmlns:xsd", XSD_NS);
//            //soapEnvelope.setAttribute("xmlns:xsi", XSI_NS);
//            soapEnvelope.setAttribute("xmlns:boi", ns);
////            //添加信息头内容
////            SOAPHeader soapHeader = soapEnvelope.getHeader();
////            soapHeader.setPrefix("soapenv");
////            //创建soap工厂
////            SOAPFactory soapFactory = SOAPFactory.newInstance();
//////            SOAPElement wsHeaderElm = soapFactory.createElement("HEADER");
////            SOAPElement extraParamsElm = soapFactory.createElement("extraParams");//主节点
////            SOAPElement esbCodeElm = soapFactory.createElement("esbCode");//子节点
////            SOAPElement COMPElm = soapFactory.createElement("COMP");//子节点
////            SOAPElement transactionTypeElm = soapFactory.createElement("transactionType");//子节点
////            SOAPElement requestTimeElm = soapFactory.createElement("requestTime");//子节点
////            SOAPElement requestSequenceElm = soapFactory.createElement("requestSequence");//子节点
////            //为上述消息头标签添加节点文本值
////            esbCodeElm.addTextNode("001");
////            COMPElm.addTextNode("CE-2");
////            transactionTypeElm.addTextNode("Entry");
////            requestTimeElm.addTextNode("2016-06-24T23:11:11.123+08:00");
////            requestSequenceElm.addTextNode("1888");
////            //绑定节点关系
////            extraParamsElm.addChildElement(esbCodeElm);
////            extraParamsElm.addChildElement(COMPElm);
////            extraParamsElm.addChildElement(transactionTypeElm);
////            extraParamsElm.addChildElement(requestTimeElm);
////            extraParamsElm.addChildElement(requestSequenceElm);
////
////            soapHeader.addChildElement(extraParamsElm);
//            //创建消息体
//            SOAPBody soapBody = soapEnvelope.getBody();
//            soapBody.setPrefix("soapenv");
//            soapBody.removeNamespaceDeclaration("SOAP-ENV");
//            //创建业务节点
//            QName qName = new QName(ns, "Invoke", "boi");
//            //把业务节点加入消息体
//            SOAPBodyElement ele = soapBody.addBodyElement(qName);
//
//            ele.addChildElement("from").setValue("EDM654321");//数据发起系统 + 握手码
//            ele.addChildElement("token").setValue("TESTSFSFddddWEREFDF");//交易唯一标识ID
//            ele.addChildElement("funcName").setValue("ItemInfo_E30");//由funcName唯一标识接口
//
//            //Bill、Response等格式的请求数据需要生成xml
//            org.dom4j.Document document = DocumentHelper.createDocument();
//            // 2、创建根节点rss
//            Element interfaceEle = document.addElement("Interface");
//            Element entryEle = interfaceEle.addElement("Entry");
//            // 3、向rss节点添加version属性
//            entryEle.addAttribute("DoFlag", "I");
//            // 4、生成子节点及子节点内容
//            Element guidEle = entryEle.addElement("Guid");
//            guidEle.setText("4F86");
//            Element dataEle = entryEle.addElement("data");
//            JSONObject jsonObject = new JSONObject();
//            jsonObject.put("id", "111");
//            dataEle.setText(jsonObject.toString());
//            // 5、设置生成xml的格式
//            OutputFormat format = OutputFormat.createPrettyPrint();
//            // 设置编码格式
//            format.setEncoding("UTF-8");
//
//            // stringWriter字符串是用来保存XML文档的  
//            StringWriter stringWriter = new StringWriter();
//            // xmlWriter是用来把XML文档写入字符串的(工具)  
//            XMLWriter xmlWriter = new XMLWriter(stringWriter, format);
//            xmlWriter.write(document);
//
//            ele.addChildElement("parameters").setValue("<![CDATA[" + stringWriter.toString() + "]]>");
////            ele.addChildElement("parameters").setValue("<![CDATA[<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?>\n" +
////                    "<Interface Sender=\"[请求方系统名称]\" Receiver=\"[提供方系统名称]\" Billtype=\"[服务名称]\">\n" +
////                    "<Entry DoFlag=\"I\">\n" +
////                    "<Guid>[XXXXXXXX-7C25-4F86-84EA-XXXXXXXXXXXX]</Guid>\n" +
////                    "<line1>message test</line1>\n" +
////                    "<line2>message test …</line2>\n" +
////                    "</Entry>\n" +
////                    "</Interface>]]>");//<![CDATA[Bill、 Entry、 Response格式数据报文]]>
//            soapMessage.saveChanges();
//            soapMessage.writeTo(System.out);
//            System.out.println("\n invoking......");
//            /*
//             *上面步骤3、4即为SOAP消息体的创建，打印结果为：
//             * <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:boi="http://localhost/BOI/">
//             *     <soapenv:Header>
//             *         <extraParams>
//             *             <esbCode>001</esbCode>
//             *             <COMP>CE-2</COMP>
//             *             <transactionType>Entry</transactionType>
//             *             <requestTime>2016-06-24T23:11:11.123+08:00</requestTime>
//             *             <requestSequence>1888</requestSequence>
//             *         </extraParams>
//             *     </soapenv:Header>
//             *     <soapenv:Body>
//             *         <boi:Invoke>
//             *             <boi:name>tom</boi:name>
//             *         </boi:Invoke>
//             *     </soapenv:Body>
//             * </soapenv:Envelope>
//             *
//             * 经过拦截器后：
//             * <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:boi="http://localhost/BOI/">
//             *     <soapenv:Header>
//             *         <extraParams>
//             *             <esbCode>001</esbCode>
//             *             <COMP>CE-2</COMP>
//             *             <transactionType>Entry</transactionType>
//             *             <requestTime>2016-06-24T23:11:11.123+08:00</requestTime>
//             *             <requestSequence>1888</requestSequence>
//             *         </extraParams>
//             *     </soapenv:Header>
//             *     <soapenv:Body>
//             *         <boi:Invoke>
//             *             <boi:name>tom</boi:name>
//             *         </boi:Invoke>
//             *     </soapenv:Body>
//             * </soapenv:Envelope>
//             */
//
//            //5.通过Dispatch传递信息，会返回响应消息
//            SOAPMessage response = dispatch.invoke(soapMessage);
//            response.writeTo(System.out);
//            System.out.println("\n response......");
//            /*
//             * 上面步骤为向服务器端传递消息，未经过拦截器为
//             * <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
//             *     <soap:Header/>
//             *     <soap:Body>
//             *         <ns2:InvokeResponse xmlns:ns2="http://localhost/BOI/">
//             *             <return>
//             *                 <ns2:username>tom</ns2:username>
//             *                 <ns2:password>123456</ns2:password>
//             *             </return>
//             *         </ns2:InvokeResponse>
//             *     </soap:Body>
//             * </soap:Envelope>
//             *
//             * 经过拦截器后
//             * <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
//             *     <soapenv:Header/>
//             *     <soapenv:Body>
//             *         <NS1:InvokeResponse xmlns:NS1="http://localhost/BOI/">
//             *             <NS1:username>tom</NS1:username>
//             *             <NS1:password>123456</NS1:password>
//             *         </NS1:InvokeResponse>
//             *     </soapenv:Body>
//             * </soapenv:Envelope>
//             */
//
//            //6.将响应的消息转换为dom对象(解析xml)
//            Document doc = response.getSOAPPart().getEnvelope().getBody().extractContentAsDocument();
//            String xmlString = doc.getElementsByTagNameNS(ns,"result").item(0).getTextContent();
//            System.out.println(xmlString);
//            HashMap<String, Object> result = new HashMap<String, Object>();
//
//            SAXReader saxReader = new SAXReader();
//            org.dom4j.Document docDom4j = saxReader.read(new ByteArrayInputStream(xmlString.getBytes("utf-8")));
//            org.dom4j.Element root = docDom4j.getRootElement();
//            List<Attribute> rooAttrList = root.attributes();
//            for (Attribute rootAttr : rooAttrList) {
//                System.out.println(rootAttr.getName() + ": " + rootAttr.getValue());
//                result.put(rootAttr.getName(), rootAttr.getValue());
//            }
//
//            List<Element> childElements = root.elements();
//
//            for (org.dom4j.Element e1 : childElements) {
//                System.out.println("第一层：" + e1.getName() + ": " + e1.getText());
//                result.put("fir" + e1.getName(), e1.getText());
//            }
//
//            for (org.dom4j.Element child : childElements) {
//                //未知属性名情况下
//                List<Attribute> attributeList = child.attributes();
//                for (Attribute attr : attributeList) {
//                    System.out.println("第二层：" + attr.getName() + ": " + attr.getValue());
//                    result.put("sec" + attr.getName(), attr.getValue());
//                }
//
//                List<org.dom4j.Element> elementList = child.elements();
//                for (org.dom4j.Element elem : elementList) {
//
//                    System.out.println("第二层：" + elem.getName() + ": " + elem.getText());
//                    result.put("sec" + elem.getName(), elem.getText());
//
//                    List<Attribute> kidAttr = elem.attributes();
//                    for (Attribute kidattr : kidAttr) {
//                        System.out.println("第三层：" + kidattr.getName() + ": " + kidattr.getValue());
//                        result.put("thi" + kidattr.getName(), kidattr.getValue());
//                    }
//
//                    List<Element> lidList = elem.elements();
//                    int size = lidList.size();
//                    if (size > 0) {
//                        for (org.dom4j.Element e2 : lidList) {
//                            System.out.println("第三层：" + e2.getName() + ": " + e2.getText());
//                            result.put("thi" + e2.getName(), e2.getText());
//                        }
//                    }
//                }
//            }
//
//                System.out.println(result.toString());
//            /*
//             * 上面步骤为处理消息，即解析返回的SOAP消息
//             * 打印结果为：tom
//             */
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}