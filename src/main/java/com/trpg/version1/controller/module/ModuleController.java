package com.trpg.version1.controller.module;

import com.trpg.version1.common.Enum.ResultCode;
import com.trpg.version1.common.JsonMessage;
import com.trpg.version1.common.exception.OpException;
import com.trpg.version1.common.util.ResultCodeUtil;
import com.trpg.version1.mybatis.dto.ModuleUploadDTO;
import com.trpg.version1.mybatis.entity.Module;
import com.trpg.version1.mybatis.vo.ModuleListVO;
import com.trpg.version1.service.ModuleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
public class ModuleController {
    @Resource
    private ModuleService moduleService;

    @ApiOperation(value = "方法描述:获得模组列表,请求方式:GET,参数:null,返回值:JsonMessage<List<ModuleListVO>>,是否可用:yes")
    @RequestMapping(value = "/module/get",method = RequestMethod.GET)
    public JsonMessage<List<ModuleListVO>> getModuleList(){
        return new JsonMessage<List<ModuleListVO>>(moduleService.ModuleList());
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
