package com.suqc.ws.service.impl;

import javax.jws.WebService;

import com.suqc.ws.service.HelloWS;
@WebService(
		endpointInterface="com.suqc.ws.service.HelloWS",
		portName="HelloWSPort",
		serviceName="HelloWSService",
		targetNamespace="http://service.ws.suqc.com/hello")
public class HelloWSImpl implements HelloWS{

	@Override
    public String welcome(String name) {
        return "Welcome---->" + name;
    }
	
}
