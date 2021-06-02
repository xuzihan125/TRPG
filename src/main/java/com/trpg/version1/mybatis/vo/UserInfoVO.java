package com.trpg.version1.mybatis.vo;

import com.trpg.version1.mybatis.entity.CommentUser;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class UserInfoVO {
    private Integer userid;
    private String email;
    private String phone;
    private String wechatid;
    private String nickname;
    private String descri;
    private Integer avgscore;
    private List<CommentUser> commentUserList = new ArrayList<CommentUser>();
    private List<Map<String, String>> characterList = new ArrayList<Map<String, String>>();
}
