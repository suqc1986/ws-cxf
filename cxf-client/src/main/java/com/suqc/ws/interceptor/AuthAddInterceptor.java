package com.suqc.ws.interceptor;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


/**
 * 添加授权拦截器
 * 用于在客户端发请求时添加授权
 * @author accountwcx@qq.com
 *
 */
public class AuthAddInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

	public AuthAddInterceptor() {
		super(Phase.PREPARE_SEND);
	}

	public void handleMessage(SoapMessage message) throws Fault {
		List<Header> headers = message.getHeaders();
        Document doc = DOMUtils.createDocument();
        //Element auth = doc.createElement("auth");
        Element auth = doc.createElementNS("http://www.tmp.com/auth", "auth");
        Element name = doc.createElement("name");
        name.setTextContent("admin");
        Element password = doc.createElement("password");  
        password.setTextContent("admin");  
        auth.appendChild(name);  
        auth.appendChild(password);
        headers.add(new Header(new QName(""), auth));
	}

}
