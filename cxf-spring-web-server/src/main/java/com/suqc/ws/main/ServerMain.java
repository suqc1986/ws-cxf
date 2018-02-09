package com.suqc.ws.main;

import java.util.HashMap;
import java.util.Map;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;

import com.suqc.ws.handler.ServerPasswordCallbackHandler;
import com.suqc.ws.service.HelloWS;
import com.suqc.ws.service.impl.HelloWSImpl;

public class ServerMain {
	public static void main(String[] args) {
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		factory.setServiceClass(HelloWS.class);
		factory.setAddress("http://localhost:8280/cxfservers/services/hello");
		factory.setServiceBean(new HelloWSImpl());

		//WS-Security输入拦截器
		Map<String, Object> inProps = new HashMap<String, Object>();
		inProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
		inProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
		inProps.put(WSHandlerConstants.PW_CALLBACK_CLASS, ServerPasswordCallbackHandler.class.getName());

		factory.getInInterceptors().add(new WSS4JInInterceptor(inProps));
		factory.getInInterceptors().add(new LoggingInInterceptor());

		factory.create();
	}
}
