package com.trpg.version1.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.trpg.version1.common.Enum.FileType;
import com.trpg.version1.common.Enum.ResultCode;
import com.trpg.version1.common.exception.OpException;
import com.trpg.version1.mybatis.dto.ChatMessageDTO;
import com.trpg.version1.service.FileService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/6/4
 **/
@Service
public class FileServiceImpl implements FileService {
    @Value("H:/learn/软件系统设计/front-coc-new/src/assets/target/classes/")
    private String absPath;

    @Value("${relativePath.file}")
    private String fileRel;

    private static Map<String, ReadWriteLock> fileLock = new HashMap<>();

    @Override
    public String createEmptyFile(String filename, FileType type) {
        String dir = absPath + type.getDir() + filename;
        File dest = new File(dir);
        if(!dest.getParentFile().exists()){
            dest.getParentFile().mkdir();
        }
        try{
            dest.createNewFile();
        }catch (Exception e) {
            throw new OpException(ResultCode.FILE_OPERATION_FAIL.getCode(),ResultCode.FILE_OPERATION_FAIL.getDesc());
        }
        return dir;
    }

    @Override
    public String uploadFile(MultipartFile file, String filename, FileType type) {
        if(file.isEmpty()){
            throw new OpException(ResultCode.FILE_EMPTY.getCode(),ResultCode.FILE_EMPTY.getDesc());
        }
        String dir = null;
        BufferedOutputStream stream = null;
        try {
            String fileDir;
            if(type != FileType.DEFAULT){
                String fileType = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
                fileDir = filename + fileType;
            }
            else{
                fileDir = file.getOriginalFilename();
            }
            dir = absPath + type.getDir() + fileDir;
            File dest = new File(dir);
            String tempo  = dest.getParentFile().getPath();
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            }
            byte[] bytes = file.getBytes();
            stream = new BufferedOutputStream(new FileOutputStream(dest));
            stream.write(bytes);
            stream.close();
            dir = "target/classes/" + type.getDir() + fileDir;
        } catch (Exception e) {
            throw new OpException(ResultCode.FILE_OPERATION_FAIL.getCode(),ResultCode.FILE_OPERATION_FAIL.getDesc());
        }
        return dir;
    }

    @Override
    public void uploafFile(MultipartFile file, String fileUrl) {
        BufferedOutputStream stream = null;
        try{
            File dest = new File(fileUrl);
            String tempo  = dest.getParentFile().getPath();
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            }
            byte[] bytes = file.getBytes();
            stream = new BufferedOutputStream(new FileOutputStream(dest));
            stream.write(bytes);
            stream.close();
        }
        catch(Exception e){
            throw new OpException(ResultCode.FILE_OPERATION_FAIL.getCode(),ResultCode.FILE_OPERATION_FAIL.getDesc());
        }
    }

    @Override
    public void recordLine(ChatMessageDTO chatMessageDTO, Integer chatId) {
        String dir = absPath + FileType.RECORD.getDir() + chatId+".txt";
        File file = new File(dir);

    }

    @Override
    public ChatMessageDTO getLine(Integer chatId) {
        return null;
    }

    @Override
    public void deleteFile(String filename) {
        File file = new File("test.txt");
        if(file.exists()){
            file.delete();
        }
    }

    @Override
    public List<String> uploadFiles(MultipartFile[] files) {
        List<String> result = new ArrayList<>();
        for(MultipartFile file : files){
            String fileType = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            result.add(uploadFile(file,null,FileType.DEFAULT));
        }
        return result;
    }

    @Override
    public String downloadFile(String name, HttpServletResponse response) {

        //logService.logDownload("H:/learn/软件系统设计/file/"+name, response);
        System.out.println(name);
        // 获取文件
        File file = new File(name);
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
