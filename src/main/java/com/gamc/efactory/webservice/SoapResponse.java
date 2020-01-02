package com.gamc.efactory.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="NS1", namespace="http://localhost/BOI/")
public class SoapResponse {
    @XmlElement(name="InvokeResult", namespace="http://localhost/BOI/")
    private Boolean invokeResult;
    @XmlElement(name="result", namespace="http://localhost/BOI/")
    private String result;

    public Boolean getInvokeResult() {
        return invokeResult;
    }

    public void setInvokeResult(Boolean invokeResult) {
        this.invokeResult = invokeResult;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
