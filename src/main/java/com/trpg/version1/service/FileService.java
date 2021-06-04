package com.trpg.version1.service;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

public interface FileService {
    String uploadFile(MultipartFile[] files);

    String downloadFile(String name, HttpServletResponse response);
}
