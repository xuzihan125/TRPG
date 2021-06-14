package com.trpg.version1.service;

import com.trpg.version1.common.Enum.FileType;
import com.trpg.version1.mybatis.dto.ChatMessageDTO;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface FileService {
    void uploafFile(MultipartFile file, String filename);

    void deleteFile(String filename);

    String uploadFile(MultipartFile files, String filename, FileType type);

    List<String> uploadFiles(MultipartFile[] files);

    String downloadFile(String name, HttpServletResponse response);

    String createEmptyFile(String filename, FileType type);

    void recordLine(ChatMessageDTO chatMessageDTO, Integer chatId);

    ChatMessageDTO getLine(Integer chatId);
}
