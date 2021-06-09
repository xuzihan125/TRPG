package com.trpg.version1.service.Impl;

import com.trpg.version1.mybatis.dao.LabelMapper;
import com.trpg.version1.mybatis.entity.Label;
import com.trpg.version1.mybatis.entity.LabelExample;
import com.trpg.version1.mybatis.vo.LabelListVO;
import com.trpg.version1.service.LabelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class LabelServiceImpl implements LabelService {
    @Resource
    private LabelMapper labelMapper;

    @Override
    public List<LabelListVO> getLabelList() {
        List<LabelListVO> labelListVOList = new ArrayList<LabelListVO>();
        LabelExample labelExample = new LabelExample();
        List<Label> labels = labelMapper.selectByExample(labelExample);
        for(Label label : labels){
            LabelListVO labelListVO = new LabelListVO(label);
            labelListVOList.add(labelListVO);
        }
        return labelListVOList;
    }
}
