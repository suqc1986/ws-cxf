package com.suqc.ws.service.impl;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.jws.WebService;
import org.springframework.stereotype.Service;
import com.suqc.ws.pojo.CxfFileWrapper;
import com.suqc.ws.service.FileWS;

@WebService(endpointInterface = "com.suqc.ws.service.FileWS", portName = "FileWSPort", serviceName = "FileWSService", targetNamespace = "http://impl.service.ws.suqc.com/file")
@Service("fileWS")
public class FileWSImpl implements FileWS {

    public boolean upload(CxfFileWrapper file){
        boolean result = true;
        OutputStream os = null;
        InputStream is = null;
        BufferedOutputStream bos = null;

        try {
            is = file.getFile().getInputStream();
            // 文件在服务器上的保存位置
            File dest = new File("d:/upload/" + file.getFileName());
            os = new FileOutputStream(dest);
            bos = new BufferedOutputStream(os);
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = is.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            bos.flush();

        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        } finally {
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
        return result;
    }

    public CxfFileWrapper download() {
        //下载文件的路径
        //String filePath = "D:\\dev\\tmp\\upload\\行政区.txt";
        String filePath = "E:\\TDDOWNLOAD\\Xme_5.0.517.exe";
        CxfFileWrapper fileWrapper = new CxfFileWrapper();
        fileWrapper.setFileName("Xme_5.0.517.exe");
        fileWrapper.setFileExtension("exe");
        DataSource source = new FileDataSource(new File(filePath));
        fileWrapper.setFile(new DataHandler(source));
        return fileWrapper;
    }

}