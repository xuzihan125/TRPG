package com.trpg.version1.controller.module;

import com.trpg.version1.common.JsonMessage;
import com.trpg.version1.mybatis.entity.Module;
import com.trpg.version1.mybatis.vo.ModuleListVO;
import com.trpg.version1.service.ModuleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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

    @ApiOperation(value = "方法描述:获得模组列表,请求方式:GET,参数:null,返回值:JsonMessage<List<Module>>,是否可用:no")
    @RequestMapping(value = "/module/get",method = RequestMethod.GET)
    public JsonMessage<List<Module>> getModuleList(){
        return new JsonMessage<List<Module>>(moduleService.ModuleList());
    }
}
