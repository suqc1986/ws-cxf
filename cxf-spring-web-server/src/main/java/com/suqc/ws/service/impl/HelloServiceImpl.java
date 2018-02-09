package com.suqc.ws.service.impl;

import com.suqc.ws.service.HelloService;
import org.apache.cxf.annotations.UseAsyncMethod;
import org.apache.cxf.jaxws.ServerAsyncResponse;

import javax.jws.WebService;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import java.util.concurrent.Future;
@WebService(endpointInterface = "com.suqc.ws.service.HelloService")
public class HelloServiceImpl implements HelloService {
    @Override
    @UseAsyncMethod
    public String sayHello(String username) {
        System.out.println("execute sayHello method");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello "+username;
    }

    @Override
    public Future<String> sayHelloAsync(final String username, final AsyncHandler<String> asyncHandler) {
        System.out.println("execute sayHelloAsync method");
        final ServerAsyncResponse<String> asyncResponse = new ServerAsyncResponse<String>();
        new Thread(){
            @Override
            public void run() {
                String result = sayHello(username);
                asyncResponse.set(result);
                System.out.println("Responding on background thread\n");
                asyncHandler.handleResponse(asyncResponse);
            }
        }.start();
        return asyncResponse;
    }

    @Override
    public Response<String> sayHelloAsync(String username) {
        return null;
    }
}
