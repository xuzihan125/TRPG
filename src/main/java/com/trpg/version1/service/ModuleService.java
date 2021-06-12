package com.trpg.version1.service;

import com.trpg.version1.mybatis.dto.ModuleUploadDTO;
import com.trpg.version1.mybatis.entity.Module;
import com.trpg.version1.mybatis.vo.ModuleListVO;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ModuleService {
    List<ModuleListVO> ModuleList();

    String moduleUpload(ModuleUploadDTO moduleUploadDTO);
}
