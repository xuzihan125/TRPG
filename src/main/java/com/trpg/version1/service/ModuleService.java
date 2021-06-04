package com.trpg.version1.service;

import com.trpg.version1.mybatis.entity.Module;
import com.trpg.version1.mybatis.vo.ModuleListVO;

import java.util.List;

public interface ModuleService {
    List<Module> ModuleList();
}
