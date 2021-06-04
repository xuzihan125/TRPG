package com.trpg.version1.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.trpg.version1.common.Enum.ResultCode;
import com.trpg.version1.common.exception.OpException;
import com.trpg.version1.service.FileService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/6/4
 **/
@Service
public class FileServiceImpl implements FileService {
    @Value("${absolutePath.resource}")
    private String absPath;

    @Value("${relativePath.file}")
    private String fileRel;



    @Override
    public String uploadFile(MultipartFile[] files) {
        MultipartFile file;
//        System.out.println("get request,files size:" + files.length);
        for (int i = 0; i < files.length; ++i) {
            file = files[i];
            if (!file.isEmpty()) {
                try {
                    String fileName = file.getOriginalFilename();
                    File dest = new File(absPath + fileRel + fileName);
                    System.out.println(fileName);
                    if (!dest.getParentFile().exists()) {
                        dest.getParentFile().mkdirs();
                    }
                    file.transferTo(dest); // 保存文件
                } catch (Exception e) {
                    throw new OpException(ResultCode.FILE_OPERATION_FAIL.getCode(),ResultCode.FILE_OPERATION_FAIL.getDesc());
                }
            } else {
                throw new OpException(ResultCode.FILE_EMPTY.getCode(),ResultCode.FILE_EMPTY.getDesc());
            }
        }
        return "文件保存成功";
    }

    @Override
    public String downloadFile(String name, HttpServletResponse response) {

        //        logService.logDownload("H:/learn/软件系统设计/file/"+name, response);
        System.out.println(name);
        // 获取文件
        File file = new File(absPath + fileRel + name);
        if(!file.exists()){
            throw new OpException(ResultCode.FILE_NOT_EXIST.getCode(),ResultCode.FILE_NOT_EXIST.getDesc());
        }
        try{
            //文件名
            String fileName = file.getName();
            // 清空缓冲区，状态码和响应头(headers)
            response.reset();
            // 设置ContentType，响应内容为二进制数据流，编码为utf-8，此处设定的编码是文件内容的编码
            response.setContentType("application/octet-stream;charset=utf-8");
            // 以（Content-Disposition: attachment; filename="filename.jpg"）格式设定默认文件名，设定utf编码，此处的编码是文件名的编码，使能正确显示中文文件名
            response.setHeader("Content-Disposition", "attachment;fileName=" + fileName + ";filename*=utf-8''" + URLEncoder.encode(fileName, "utf-8"));
        }catch(UnsupportedEncodingException e){
            throw new OpException(ResultCode.FILE_NAME_UNENCODABLE.getCode(),ResultCode.FILE_NAME_UNENCODABLE.getDesc());
        }

        // 实现文件下载
        byte[] buffer = new byte[1024];
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            // 获取字节流
            OutputStream os = response.getOutputStream();
            int i = bis.read(buffer);
            while (i != -1) {
                os.write(buffer, 0, i);
                i = bis.read(buffer);
            }
        } catch (Exception e) {
            throw new OpException(ResultCode.FILE_DOWNLOAD_FAIL.getCode(),ResultCode.FILE_DOWNLOAD_FAIL.getDesc());
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return "上传成功";
    }
}
