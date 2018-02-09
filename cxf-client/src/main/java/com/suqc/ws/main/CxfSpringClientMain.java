package com.suqc.ws.main;

import java.util.HashMap;
import java.util.Map;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;

import com.suqc.ws.cxfspring.HelloWS;
import com.suqc.ws.handler.ClientPasswordCallbackHandler;



public class CxfSpringClientMain {
	public static void main(String[] args) throws Exception{
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(HelloWS.class);
		factory.setAddress("http://localhost:8080/cxfdemo/ws/hellows?wsdl");
		factory.getInInterceptors().add(new org.apache.cxf.interceptor.LoggingInInterceptor());

		//WS-Security输出拦截器
		Map<String, Object> outProps = new HashMap<String, Object>();
		outProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
		//添加用户名
		outProps.put(WSHandlerConstants.USER, "admin");
		outProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
		outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS, ClientPasswordCallbackHandler.class.getName());

		factory.getOutInterceptors().add(new WSS4JOutInterceptor(outProps));
		factory.getOutInterceptors().add(new com.suqc.ws.interceptor.AuthAddInterceptor());
		factory.getOutInterceptors().add(new org.apache.cxf.interceptor.LoggingOutInterceptor());

		HelloWS helloWS = factory.create(HelloWS.class);
		String welcome = helloWS.welcome("end ----  accountwcx@qq.com");
		System.out.println(welcome);
		
//		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
//		factory.setServiceClass(HelloWS.class);
//		factory.setAddress("http://localhost:8080/ws/hellows?wsdl");
//		factory.getInInterceptors().add(new LoggingInInterceptor());
//		//客户端拦截器授权
//		factory.getOutInterceptors().add(new com.suqc.ws.interceptor.AuthAddInterceptor());
//		factory.getOutInterceptors().add(new org.apache.cxf.interceptor.LoggingOutInterceptor());
//		HelloWS helloWS = factory.create(HelloWS.class);
//		String welcome = helloWS.welcome("jax--accountwcx@qq.com");
//		System.out.println(welcome);
		
		//URL不是必须的  	除非URL有变化
//		URL wsdlUrl = new URL("http://localhost:8080/ws/hellows?wsdl");
//		HelloWSService helloWSS = new HelloWSService(wsdlUrl);
//		//HelloWSService helloWSS = new HelloWSService();
//		HelloWS helloWS = helloWSS.getHelloWSPort();
//		String welcome = helloWS.welcome("suqc@qq.com");
//		System.out.println(welcome);
	}
}
