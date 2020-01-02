package com.gamc.efactory.webservice;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "SoapUserService", targetNamespace = "http://localhost/BOI/")
public interface SoapUserService {
    public SoapResponse Invoke(
            @WebParam(name = "from",targetNamespace = "http://localhost/BOI/")String from,
            @WebParam(name = "token",targetNamespace = "http://localhost/BOI/")String token,
            @WebParam(name = "funcName",targetNamespace = "http://localhost/BOI/")String funcName,
            @WebParam(name = "parameters",targetNamespace = "http://localhost/BOI/")String parameters);
}