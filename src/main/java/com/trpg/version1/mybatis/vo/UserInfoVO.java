package com.trpg.version1.mybatis.vo;

import com.trpg.version1.mybatis.entity.Charact;
import com.trpg.version1.mybatis.entity.CommentUser;
import lombok.Data;

import javax.xml.stream.events.Characters;
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
    private Integer game_num;
    private List<CommentUser> commentUserList;
    private Integer commentUserNum;
    private List<Charact> characterList;
    private Integer characterNum;
}
