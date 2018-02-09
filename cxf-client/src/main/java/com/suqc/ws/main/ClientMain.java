package com.suqc.ws.main;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.suqc.ws.client.HelloWS;

public class ClientMain {
	public static void main(String[] args) throws Exception {
		//方法一      jdk自带    jaxws调用
		
		//URL不是必须的，除非服务的地址有改变
		/*URL wsdlUrl = new URL("http://localhost:8999/services/hello?wsdl");
		HelloWSService helloWSS = new HelloWSService(wsdlUrl);
		HelloWS helloWS = helloWSS.getHelloWSPort();
		String welcome = helloWS.welcome("accountwcx@qq.com");
		System.out.println(welcome);*/
		
		
	   // 方法二    cxf调用
		
	    /*
	    首先在客户端添加cxf
	    <dependency>
	        <groupId>org.apache.cxf</groupId>
	        <artifactId>cxf-rt-frontend-jaxws</artifactId>
	        <version>3.1.1</version>
	    </dependency>
	    <dependency>
	        <groupId>org.apache.cxf</groupId>
	        <artifactId>cxf-rt-transports-http</artifactId>
	        <version>3.1.1</version>
	    </dependency>
	*/
	JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
	factory.setServiceClass(HelloWS.class);
	factory.setAddress("http://localhost:8999/services/hello");
	HelloWS helloWS = factory.create(HelloWS.class);
	String welcome = helloWS.welcome("jax--accountwcx@qq.com");
	System.out.println(welcome);
	}
}
