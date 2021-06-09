package com.trpg.version1.service;

import com.trpg.version1.mybatis.vo.LabelListVO;

import java.util.List;

public interface LabelService {
    List<LabelListVO> getLabelList();
}
