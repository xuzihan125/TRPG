package com.trpg.version1.common.Enum;

public enum ResultCode {
    //99：未定义错误
    UNFROSEEN_ERROR("990001","未定义错误"),
    //00：操作成功
    SUCCESS("000000","返回成功"),
    //01：参数校验
    INVALID_INPUT("010001","接口调用参数错误"),
    INVALID_ATTRIBUTE("010002","内部服务参数错误"),
    EMPTY_EMAIL("010003", "邮箱不能为空"),
    EMPTY_PASSWORD("010004", "密码不能为空"),
    EMPTY_REPASSWORD("010005", "确认密码不能为空"),
    WRONGFORMAT_EMAIL("010006", "邮箱格式错误"),
    WRONGFORMAT_PASSWORD("010007", "密码长度需要在6到16位之间"),
    INVALID_PASSWORD_NOTEQUAL_REPASSWORD("010008", "密码和确认密码不相等"),
    EMPTY_PHONE("010009", "电话号码为空"),
    WRONGFORMAT_PHONE("010010", "电话号码格式错误"),
    EMPTY_NICKNAME("010011", "昵称不能为空"),
    WRONGFORMAT_NICKNAME("010012", "昵称长度必须在6到32之间"),
    EMPTY_WECHATID("010013", "微信号不能为空"),
    EMPTY_DESCRI("010014", "描述不能为空"),
    EMPTY_UID("010015", "userId不能为空"),
    EMPTY_MODULE_NAME("010016", "模组名称不能为空"),
    EMPTY_MODULE_DESCRIPTION("010017", "模组描述不能为空"),
    EMPTY_MODULE_TYPE("010018", "模组类型不能为空"),
    EMPTY_MODULE_SHORT_TIME("010019", "short time不能为空"),
    EMPTY_MODULE_LONG_TIME("010020", "long time不能为空"),
    EMPTY_MODULE_RULE_TYPE("010021", "rule type不能为空"),
    EMPTY_MODULE_TIME_BACKGROUND("010022", "时间背景不能为空"),
    EMPTY_MODULE_PLACE_BACKGROUND("010023", "地点背景不能为空"),
    EMPTY_RECOMMEND_PEOPLE("010024", "推荐人群不能为空"),
    EMPTY_MODULE_PIC_PATH("010025", "图片路径不能为空"),
    EXIST_MODULE_NAME("010026", "该模组名称已被使用"),
    EMPTY_PUBLISH_TIME("010027", "模组上传时间不可为空"),
    EMPTY_CHATROOM_ID("010028", "聊天组id不可为空"),
    EMPTY_ROOM_ID("010029", "房间id不可为空"),
    EMPTY_LEVEL("010030", "用户等级不可为空"),
    INVALID_ABILITY_NUM("010031", "属性值超出取值范围"),
    //02:账号
    EMAIL_ALREADY_EXIST("020001","邮箱已存在"),
    TOKENERROR("020002","token错误"),
    EMAIL_NOT_EXIST("020003", "该邮箱还未注册"),
    WRONG_PASSWORD("020004", "密码错误"),
    INVALID_ACCOUNT("020005","账号不存在"),
    //03:其他服务器调用
    INVALID_PHONE_CLIENT("030001","手机号码验证服务器连接失败"),
    INVALID_PHONE_TARGET("030002","短信发送失败"),
    //04:房间操作错误码
    INVALID_ROOM_ROLE("040001","房间角色权限不足"),
    USER_NOT_IN_ROOM("040002","用户不在指定房间内"),
    USER_SELF_OP("040003","用户不可对自己执行该操作"),
    CHARACTER_NOT_BELONG("040004","角色归属权错误"),
    //05：文件操作
    FILE_OPERATION_FAIL("050001","同名文件已存在"),
    FILE_EMPTY("050002","文件为空"),
    FILE_NOT_EXIST("050003","文件不存在"),
    FILE_DOWNLOAD_FAIL("050004","文件传输失败"),
    FILE_NAME_UNENCODABLE("050004","文件传输失败"),
    //06:模组错误码
    INVALID_MODULE_FILE("060001","模组文件传输失败"),

    EMAILNOTEXIST("400002","账号不存在"),
    NOT_EXIST_BOOK("200001","满足条件的书不存在"),

    INVALID_AUTHOR("300001","权限错误"),
    ERROR_LIST_COPY("800001","链表复制错误");


    private String code;
    private String desc;

    private ResultCode(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static ResultCode getError(String code){
        for(ResultCode error: ResultCode.values()){
            if(code.equals(error.code)){
                return error;
            }
        }
        return ResultCode.UNFROSEEN_ERROR;
    }
}
