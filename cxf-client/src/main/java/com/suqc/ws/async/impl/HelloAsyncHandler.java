package com.suqc.ws.async.impl;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import java.util.concurrent.ExecutionException;

public class HelloAsyncHandler implements AsyncHandler<String> {
    private String reply;
    public String getResponse(){
        return this.reply;
    }
    public void handleResponse(Response<String> res) {
        try {
            System.out.println("handleResponse called");
            reply = res.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
