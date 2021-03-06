package com.trpg.version1.controller.module;

import com.trpg.version1.common.Enum.ResultCode;
import com.trpg.version1.common.JsonMessage;
import com.trpg.version1.common.exception.OpException;
import com.trpg.version1.common.util.ResultCodeUtil;
import com.trpg.version1.mybatis.dto.ModuleUploadDTO;
import com.trpg.version1.mybatis.entity.Module;
import com.trpg.version1.mybatis.vo.ModuleListShortVO;
import com.trpg.version1.mybatis.vo.ModuleListVO;
import com.trpg.version1.service.ModuleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data
 **/
@Api(value = "模组主页处理接口")
@RestController
@CrossOrigin
public class ModuleController {
    @Resource
    private ModuleService moduleService;

    @ApiOperation(value = "方法描述:获得模组列表,请求方式:GET,参数:null,返回值:JsonMessage<List<ModuleListVO>>,是否可用:yes")
    @RequestMapping(value = "/module/getList",method = RequestMethod.GET)
    public JsonMessage<List<ModuleListShortVO>> getModuleList(String match){
        return new JsonMessage<List<ModuleListShortVO>>(moduleService.ModuleList(match));
    }

    @ApiOperation(value = "方法描述:获得模组列表,请求方式:GET,参数:null,返回值:JsonMessage<List<ModuleListVO>>,是否可用:yes")
    @RequestMapping(value = "/module/get/{mid}",method = RequestMethod.GET)
    public JsonMessage<ModuleListVO> getModuleList(@PathVariable("mid") Integer mid){
        return new JsonMessage<ModuleListVO>(moduleService.getModule(mid));
    }

    @ApiOperation(value = "方法描述:上传模组,请求方式:GET,参数:,返回值:JsonMessage<String>,是否可用:yes")
    @RequestMapping(value = "/module/upload",method = RequestMethod.POST)
    public JsonMessage<String> moduleUpload(@Valid ModuleUploadDTO moduleUploadDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            ResultCode resultCode = ResultCodeUtil.getCodeFromBind(bindingResult);
            throw new OpException(resultCode.getCode(),resultCode.getDesc());
        }
        return new JsonMessage<String>(moduleService.moduleUpload(moduleUploadDTO));
    }
}
