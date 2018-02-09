package com.suqc.ws.main;

import com.suqc.ws.async.impl.HelloAsyncHandler;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.util.concurrent.Future;

public class AsyncMain {
    public static void main(String[] args) throws Exception{
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(HelloService.class);
        factoryBean.setAddress("http://localhost:9090/cxfdemo/ws/asyncHelloService?wsdl");
        factoryBean.getInInterceptors().add(new LoggingInInterceptor());
        factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
        HelloService client = (HelloService)factoryBean.create();

        HelloAsyncHandler helloAsyncHandler = new HelloAsyncHandler();
        System.out.println("Invoking changeStudentAsync using callback object...");
        Future<?> response = client.sayHelloAsync(
                "CrazyPig", helloAsyncHandler);
        while (!response.isDone()) {
            Thread.sleep(100);
        }

        String resp = helloAsyncHandler.getResponse();
        System.out.println("Server responded through callback with: " + resp);

        System.exit(0);
    }
}
//wsimport.exe -s D:\IdeaProjects\workspace\ws-cxf\cxf-client\src\main\java -p com.suqc.ws.async http://localhost:9090/cxfdemo/ws/asyncHelloService?wsdl