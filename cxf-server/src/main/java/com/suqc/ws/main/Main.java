package com.suqc.ws.main;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.suqc.ws.service.HelloWS;
import com.suqc.ws.service.impl.HelloWSImpl;

public class Main {
	public static void main(String[] args) {
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceClass(HelloWS.class);
        //服务发布的地址
        factory.setAddress("http://localhost:8999/services/hello");
        factory.setServiceBean(new HelloWSImpl());
        factory.create();
	}
}
//wsimport.exe -encoding utf-8 -s G:\workspace\cxf-client\src\main\java -p com.suqc.ws.cxfspring http://localhost:8080/cxf-spring-web-server/ws/hellows?wsdl