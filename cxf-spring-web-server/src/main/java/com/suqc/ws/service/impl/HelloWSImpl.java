package com.suqc.ws.service.impl;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.suqc.ws.dao.HelloDao;
import com.suqc.ws.service.HelloWS;
@WebService(
		endpointInterface="com.suqc.ws.service.HelloWS",
		portName="HelloWSPort",
		serviceName="HelloWSService",
		targetNamespace="http://service.ws.suqc.com/hello")
@Service("helloWSImpl")
public class HelloWSImpl implements HelloWS{
	@Resource
	private HelloDao helloDao;
	
	public String welcome(String name) {
		return helloDao.welcome(name);
	}
}
