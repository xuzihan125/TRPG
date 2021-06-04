package com.trpg.version1.mybatis.entity;

import java.io.Serializable;

public class ChatGroup implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chatGroup.chatId
     *
     * @mbg.generated Mon May 31 12:20:08 CST 2021
     */
    private Integer chatid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chatGroup.roomId
     *
     * @mbg.generated Mon May 31 12:20:08 CST 2021
     */
    private Integer roomid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chatGroup.type
     *
     * @mbg.generated Mon May 31 12:20:08 CST 2021
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chatGroup.title
     *
     * @mbg.generated Mon May 31 12:20:08 CST 2021
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chatGroup.fileUrl
     *
     * @mbg.generated Mon May 31 12:20:08 CST 2021
     */
    private String fileurl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chatGroup.state
     *
     * @mbg.generated Mon May 31 12:20:08 CST 2021
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table chatGroup
     *
     * @mbg.generated Mon May 31 12:20:08 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chatGroup.chatId
     *
     * @return the value of chatGroup.chatId
     *
     * @mbg.generated Mon May 31 12:20:08 CST 2021
     */
    public Integer getChatid() {
        return chatid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chatGroup.chatId
     *
     * @param chatid the value for chatGroup.chatId
     *
     * @mbg.generated Mon May 31 12:20:08 CST 2021
     */
    public void setChatid(Integer chatid) {
        this.chatid = chatid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chatGroup.roomId
     *
     * @return the value of chatGroup.roomId
     *
     * @mbg.generated Mon May 31 12:20:08 CST 2021
     */
    public Integer getRoomid() {
        return roomid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chatGroup.roomId
     *
     * @param roomid the value for chatGroup.roomId
     *
     * @mbg.generated Mon May 31 12:20:08 CST 2021
     */
    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chatGroup.type
     *
     * @return the value of chatGroup.type
     *
     * @mbg.generated Mon May 31 12:20:08 CST 2021
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chatGroup.type
     *
     * @param type the value for chatGroup.type
     *
     * @mbg.generated Mon May 31 12:20:08 CST 2021
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chatGroup.title
     *
     * @return the value of chatGroup.title
     *
     * @mbg.generated Mon May 31 12:20:08 CST 2021
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chatGroup.title
     *
     * @param title the value for chatGroup.title
     *
     * @mbg.generated Mon May 31 12:20:08 CST 2021
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chatGroup.fileUrl
     *
     * @return the value of chatGroup.fileUrl
     *
     * @mbg.generated Mon May 31 12:20:08 CST 2021
     */
    public String getFileurl() {
        return fileurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chatGroup.fileUrl
     *
     * @param fileurl the value for chatGroup.fileUrl
     *
     * @mbg.generated Mon May 31 12:20:08 CST 2021
     */
    public void setFileurl(String fileurl) {
        this.fileurl = fileurl == null ? null : fileurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chatGroup.state
     *
     * @return the value of chatGroup.state
     *
     * @mbg.generated Mon May 31 12:20:08 CST 2021
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chatGroup.state
     *
     * @param state the value for chatGroup.state
     *
     * @mbg.generated Mon May 31 12:20:08 CST 2021
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chatGroup
     *
     * @mbg.generated Mon May 31 12:20:08 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chatid=").append(chatid);
        sb.append(", roomid=").append(roomid);
        sb.append(", type=").append(type);
        sb.append(", title=").append(title);
        sb.append(", fileurl=").append(fileurl);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}