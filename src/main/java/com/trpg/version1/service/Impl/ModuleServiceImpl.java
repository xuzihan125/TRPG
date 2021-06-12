package com.trpg.version1.service.Impl;

import com.trpg.version1.common.Enum.FileType;
import com.trpg.version1.common.Enum.ResultCode;
import com.trpg.version1.common.exception.OpException;
import com.trpg.version1.mybatis.dao.LabelModuleMapper;
import com.trpg.version1.mybatis.dao.ModuleMapper;
import com.trpg.version1.mybatis.dao.SysUserMapper;
import com.trpg.version1.mybatis.dto.ModuleUploadDTO;
import com.trpg.version1.mybatis.entity.*;
import com.trpg.version1.mybatis.vo.ModuleListVO;
import com.trpg.version1.service.FileService;
import com.trpg.version1.service.ModuleService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ModuleServiceImpl implements ModuleService {
    @Resource
    private ModuleMapper moduleMapper;

    @Resource
    private LabelModuleMapper labelModuleMapper;

    @Resource
    private SysUserMapper sysUserMapper;

    @Resource
    private FileService fileService;

    @Override
    public List<ModuleListVO> ModuleList() {
        List<ModuleListVO> moduleListVOList = new ArrayList<ModuleListVO>();

        ModuleExample moduleExample = new ModuleExample();
        List<Module> moduleList = moduleMapper.selectByExample(moduleExample);
        for(Module module : moduleList){
            ModuleListVO moduleListVO = new ModuleListVO(module);
            int uid = module.getUserid();
            SysUserExample sysUserExample = new SysUserExample();
            sysUserExample.createCriteria().andUseridEqualTo(uid);
            List<SysUser> users = sysUserMapper.selectByExample(sysUserExample);
            SysUser user = users.stream().findFirst().orElse(null);
            if(user == null){
                throw new OpException(ResultCode.INVALID_ACCOUNT.getCode(),ResultCode.INVALID_ACCOUNT.getDesc());
            }
            moduleListVO.setAuthor(user.getNickname());
            moduleListVO.setAuthor("author");
            moduleListVOList.add(moduleListVO);
        }
        return moduleListVOList;
    }

    @Override
    public ModuleListVO getModule(Integer mid) {
        ModuleExample moduleExample = new ModuleExample();
        moduleExample.createCriteria().andMidEqualTo(mid);
        List<Module> moduleList = moduleMapper.selectByExample(moduleExample);
        Module module = moduleList.stream().findFirst().orElse(null);
        ModuleListVO moduleListVO = new ModuleListVO(module);
        int uid = module.getUserid();
        SysUserExample sysUserExample = new SysUserExample();
        sysUserExample.createCriteria().andUseridEqualTo(uid);
        List<SysUser> users = sysUserMapper.selectByExample(sysUserExample);
        SysUser user = users.stream().findFirst().orElse(null);
        moduleListVO.setAuthor(user.getNickname());
        return moduleListVO;
    }

    @Override
    public String moduleUpload(ModuleUploadDTO moduleUploadDTO) {
        Module module = new Module();
        module.setUserid(moduleUploadDTO.getUid());
        module.setName(moduleUploadDTO.getName());
        module.setDescri(moduleUploadDTO.getDescri());
        module.setType(moduleUploadDTO.getType());
        module.setShorttime(moduleUploadDTO.getShort_time());
        module.setLongtime(moduleUploadDTO.getLong_time());
        module.setRuletype(moduleUploadDTO.getRule_type());
        module.setTimebackground(moduleUploadDTO.getTime_background());
        module.setPlacebackground(moduleUploadDTO.getPlace_background());
        module.setTimepublish(moduleUploadDTO.getTimePublish());
        module.setRecommendpeople(moduleUploadDTO.getRecommend_people());
        module.setFileurl(moduleUploadDTO.getPic_path());
        module.setState(0);

        ModuleExample moduleExample = new ModuleExample();
        moduleExample.createCriteria().andNameEqualTo(moduleUploadDTO.getName());
        long count = moduleMapper.countByExample(moduleExample);
        if(count != 0){
            throw new OpException(ResultCode.EXIST_MODULE_NAME.getCode(),ResultCode.EXIST_MODULE_NAME.getDesc());
        }

        moduleMapper.insert(module);
        int mid = module.getMid();

        List<Integer> labelIds = moduleUploadDTO.getLabel();
        if(labelIds != null){
            for(int labelId : labelIds){
                LabelModule labelModule = new LabelModule();
                labelModule.setLabelid(labelId);
                labelModule.setMid(mid);
                labelModuleMapper.insert(labelModule);
            }
        }

        String moduleDir = fileService.uploadFile(moduleUploadDTO.getFile(), String.valueOf(module.getMid()), FileType.MODULE);
        module.setFileurl(moduleDir);
        String picDir = fileService.uploadFile(moduleUploadDTO.getPic(), String.valueOf(module.getMid()),FileType.COVER);
        module.setCoverurl(picDir);

        ModuleExample example = new ModuleExample();
        example.createCriteria().andMidEqualTo(mid);
        moduleMapper.updateByExample(module,example);
        return "上传模组成功";
    }


}
