package com.suqc.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="HelloWS",targetNamespace="http://service.ws.suqc.com/hello")
public interface HelloWS {
	@WebMethod
	String welcome(@WebParam(name="name") String name);
}
