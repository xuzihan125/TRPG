package com.trpg.version1.controller.file;

import com.alibaba.fastjson.JSONObject;
import com.trpg.version1.common.JsonMessage;
import com.trpg.version1.service.FileService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data 2021/6/4
 **/
@RestController("/file")
public class FileController {
    @Resource
    private FileService fileService;

    @ResponseBody
    @RequestMapping(value = "/uploadFile",method = RequestMethod.POST)
    public JsonMessage<String> uploadFile(@RequestParam(required = false, value = "files") MultipartFile[] files) {
        return new JsonMessage<>(fileService.uploadFile(files));
    }

    @RequestMapping(value = "/file/download", method = RequestMethod.GET)
    public JsonMessage<String> Download(@RequestParam("name") String name, HttpServletResponse response) throws Exception {
        return new JsonMessage<>(fileService.downloadFile(name,response));
    }
}
