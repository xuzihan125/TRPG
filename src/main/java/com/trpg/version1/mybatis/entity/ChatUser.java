package com.trpg.version1.mybatis.entity;

import java.io.Serializable;

public class ChatUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chatUser.chatId
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    private Integer chatid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chatUser.userid
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chatUser.state
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table chatUser
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chatUser.chatId
     *
     * @return the value of chatUser.chatId
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public Integer getChatid() {
        return chatid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chatUser.chatId
     *
     * @param chatid the value for chatUser.chatId
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public void setChatid(Integer chatid) {
        this.chatid = chatid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chatUser.userid
     *
     * @return the value of chatUser.userid
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chatUser.userid
     *
     * @param userid the value for chatUser.userid
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chatUser.state
     *
     * @return the value of chatUser.state
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chatUser.state
     *
     * @param state the value for chatUser.state
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chatUser
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chatid=").append(chatid);
        sb.append(", userid=").append(userid);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}