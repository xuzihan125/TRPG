package com.trpg.version1.controller.module;

import com.trpg.version1.mybatis.entity.Module;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author xuzihan
 * @version 1.0
 * @description: TODO
 * @data
 **/
@Api(value = "模组主页处理接口")
@Controller
public class ModuleController {

    @ApiOperation(value = "方法描述:获得模组列表,请求方式:GET,参数:String,返回值:JsonMessage<List<Module>>,是否可用:no")
    @RequestMapping(value = "/module/get")
    public List<Module> getModuleList(){
        return null;
    }
}
