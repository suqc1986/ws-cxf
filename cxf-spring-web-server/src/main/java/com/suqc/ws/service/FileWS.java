package com.suqc.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.suqc.ws.pojo.CxfFileWrapper;

@WebService(name = "FileWS", targetNamespace = "http://impl.service.ws.suqc.com/file")
public interface FileWS {
    /**
     * 文件上传
     * @param file 文件上传包装类
     * @return 上传成功返回true，上传失败返回false。
     */
    @WebMethod
    boolean upload(@WebParam(name = "file") CxfFileWrapper file);

    /**
     * 文件下载
     * @return 文件
     */
    @WebMethod
    CxfFileWrapper download();
}
