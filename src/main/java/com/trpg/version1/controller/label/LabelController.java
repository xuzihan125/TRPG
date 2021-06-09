package com.trpg.version1.controller.label;

import com.trpg.version1.common.JsonMessage;
import com.trpg.version1.mybatis.dao.LabelMapper;
import com.trpg.version1.mybatis.entity.Module;
import com.trpg.version1.mybatis.vo.LabelListVO;
import com.trpg.version1.service.LabelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(value = "模组主页处理接口")
@RestController
public class LabelController {
    @Resource
    private LabelService labelService;

    @ApiOperation(value = "方法描述:获得标签列表,请求方式:GET,参数:null,返回值:JsonMessage<List<LabelListVO>>,是否可用:yes")
    @RequestMapping(value = "/label/get",method = RequestMethod.GET)
    public JsonMessage<List<LabelListVO>> getModuleList(){
        return new JsonMessage<List<LabelListVO>>(labelService.getLabelList());
    }
}
