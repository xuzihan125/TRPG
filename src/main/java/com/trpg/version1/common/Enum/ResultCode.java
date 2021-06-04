package com.trpg.version1.common.Enum;

public enum ResultCode {
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
    //02:账号
    EMAIL_ALREADY_EXIST("020001","邮箱已存在"),
    TOKENERROR("020002","token错误"),
    EMAIL_NOT_EXIST("020003", "该邮箱还未注册"),
    WRONG_PASSWORD("020004", "密码错误"),
    //03:其他服务器调用
    INVALID_PHONE_CLIENT("030001","手机号码验证服务器连接失败"),
    INVALID_PHONE_TARGET("030002","短信发送失败"),
    //04:房间操作错误码
    INVALID_ROOM_ROLE("040001","房间角色权限不足"),
    //05：文件操作
    FILE_OPERATION_FAIL("050001","同名文件已存在"),
    FILE_EMPTY("050002","文件为空"),
    FILE_NOT_EXIST("050003","文件不存在"),
    FILE_DOWNLOAD_FAIL("050004","文件传输失败"),
    FILE_NAME_UNENCODABLE("050004","文件传输失败"),

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
}
