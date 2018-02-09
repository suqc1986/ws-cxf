package com.suqc.ws.main;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Test;

import com.suqc.ws.cxffile.CxfFileWrapper;
import com.suqc.ws.cxffile.FileWS;
//wsimport.exe -encoding utf-8 -s D:\myworkspace\ws-cxf\cxf-client\src -p com.suqc.ws.cxfspring http://localhost:8080/ws/hellows?wsdl
public class FileUpDownWsClient {
	@Test
	public void upload(){
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(FileWS.class);
		factory.setAddress("http://localhost:8080/ws/file");
		factory.getInInterceptors().add(new org.apache.cxf.interceptor.LoggingInInterceptor());
		factory.getOutInterceptors().add(new com.suqc.ws.interceptor.AuthAddInterceptor());
		factory.getOutInterceptors().add(new org.apache.cxf.interceptor.LoggingOutInterceptor());
		FileWS fileWS = factory.create(FileWS.class);
		CxfFileWrapper fileWrapper = new CxfFileWrapper();
		fileWrapper.setFileName("Xme_5.0.517.exe");
		fileWrapper.setFileExtension("exe");
		String filePath = "E:\\TDDOWNLOAD\\Xme_5.0.517.exe";
		//String filePath = "e:\\temp\\项目产出文档模板.zip";
		DataSource source = new FileDataSource(new File(filePath));
		fileWrapper.setFile(new DataHandler(source));
		boolean success = fileWS.upload(fileWrapper);
		System.out.println(success ? "上传成功！" : "上传失败！");
	}
	@Test
	public void download(){
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(FileWS.class);
		factory.setAddress("http://localhost:8080/ws/file");
		FileWS fileWS = factory.create(FileWS.class);
		CxfFileWrapper fileWrapper = fileWS.download();
		OutputStream os = null;
		InputStream is = null;
		BufferedOutputStream bos = null;
		try {
		    is = fileWrapper.getFile().getInputStream();
		    // 文件在客户端的保存位置
		    File dest = new File("d:\\dev\\tmp\\download\\" + fileWrapper.getFileName());
		    os = new FileOutputStream(dest);
		    bos = new BufferedOutputStream(os);
		    byte[] buffer = new byte[1024];
		    int len = 0;
		    while ((len = is.read(buffer)) != -1) {
		        bos.write(buffer, 0, len);
		    }
		    bos.flush();
		    System.out.println("下载完成");
		} catch (IOException e) {
		    e.printStackTrace();
		}finally{
		    if(bos != null){
		        try{
		            bos.close();
		        }catch(Exception e){
		        }
		    }

		    if(os != null){
		        try{
		            os.close();
		        }catch(Exception e){
		        }
		    }

		    if(is != null){
		        try{
		            is.close();
		        }catch(Exception e){
		        }
		    }
		}
	}
}
