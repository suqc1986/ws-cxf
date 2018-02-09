package com.suqc.ws.main;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.suqc.ws.cscy.ICscyService;

public class KspaceClient {
	public static void main(String[] args) throws Exception{
//		wsimport.exe -encoding utf-8 -s G:\workspace\cxf-client\src\main\java -p com.suqc.ws.kspace http://127.0.0.1:8080/kspace-oai/ws/importService?wsdl
//		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
//		factory.setServiceClass(IUtilService.class);
//		factory.setAddress("http://127.0.0.1:8080/kspace-oai/ws/importService?wsdl");
//		IUtilService service = factory.create(IUtilService.class);
//		String result = service.login("admin", "admin123");
//		String result = service.getContentType();
//		String result = service.getTemplateByCtype(1);
//		String result = service.getCommDicts(11);
//		String result = service.getFullTextPath(1);
//		System.out.println(result);
		
//  	wsdl2java -p com.suqc.ws.cscy -d G:\workspace\cxf-client\src\main\java http://127.0.0.1:8080/kspace-jspui/ws/icscyService?wsdl
//		wsimport.exe -encoding utf-8 -s G:\workspace\cxf-client\src\main\java -p com.suqc.ws.cscy http://127.0.0.1:8080/kspace-jspui/ws/icscyService?wsdl
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(ICscyService.class);
		factory.setAddress("http://127.0.0.1:8080/kspace-jspui/ws/icscyService?wsdl");
		ICscyService service = factory.create(ICscyService.class);
//		String result = service.getCommList();
		String result = service.getApplyDetail(21);
		System.out.println(result);
		
//		URL wsdlUrl = new URL("http://127.0.0.1:8080/kspace-jspui/ws/icscyService?wsdl");
//		ICscyServiceService factory = new ICscyServiceService(wsdlUrl);
//		ICscyService service = factory.getICscyServicePort();
//		String result = service.toLogin("admin", "admin123");
//		String result = service.getApplyDetail(14);
//		System.out.println(result);
	}
}

//		wsimport.exe -encoding utf-8 -s G:\workspace\cxf-client\src\main\java -p com.suqc.ws.cxfspring http://localhost:8080/cxfdemo/ws/hellows?wsdl