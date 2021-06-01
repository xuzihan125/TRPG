package com.trpg.version1.common.Enum;

public enum ResultCode {
    //00：操作成功
    SUCCESS("000000","返回成功"),
    //01：参数校验
    INVALID_INPUT("010001","接口调用参数错误"),
    INVALID_ATTRIBUTE("010002","内部服务参数错误"),
    //02:账号
    EMAIL_ALREADY_EXIST("020001","邮箱已存在"),
    TOKENERROR("020001","token错误"),
    //03:其他服务器调用
    INVALID_PHONE_CLIENT("030001","手机号码验证服务器连接失败"),
    INVALID_PHONE_TARGET("030002","短信发送失败"),
    //04:房间操作
    INVALID_ROOM_ROLE("040001","用户权限不足"),
    EMAILNOTEXIST("400002","账号不存在"),
    NOT_EXIST_BOOK("200001","满足条件的书不存在"),
    FILE_OPERATION_FAIL("500001","文件操作失败"),
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
