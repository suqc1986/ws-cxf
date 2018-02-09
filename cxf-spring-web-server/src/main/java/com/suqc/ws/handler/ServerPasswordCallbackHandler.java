package com.suqc.ws.handler;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class ServerPasswordCallbackHandler implements CallbackHandler {

    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
        if (pc.getIdentifier().equals("admin")) {
            //设置密码
            //这个密码和客户端发送的密码进行比较
            //如果和客户端不同将抛出org.apache.ws.security.WSSecurityException
            pc.setPassword("123");
        }
    }

}