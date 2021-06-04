package com.trpg.version1.service.Impl;

import com.trpg.version1.mybatis.dao.ModuleMapper;
import com.trpg.version1.mybatis.entity.Module;
import com.trpg.version1.mybatis.entity.ModuleExample;
import com.trpg.version1.mybatis.vo.ModuleListVO;
import com.trpg.version1.service.ModuleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ModuleServiceImpl implements ModuleService {
    @Resource
    ModuleMapper moduleMapper;

    @Override
    public List<Module> ModuleList() {
        ModuleExample moduleExample = new ModuleExample();
        List<Module> moduleList = moduleMapper.selectByExample(moduleExample);
        return moduleList;
    }
}
