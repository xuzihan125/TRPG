package com.trpg.version1.service;

import com.trpg.version1.common.Enum.FileType;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface FileService {
    String uploadFile(MultipartFile files, String filename, FileType type);

    List<String> uploadFiles(MultipartFile[] files);

    String downloadFile(String name, HttpServletResponse response);
}
