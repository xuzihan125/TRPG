package com.trpg.version1.mybatis.entity;

import java.io.Serializable;

public class RoomUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roomUser.userId
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roomUser.roomId
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    private Integer roomid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roomUser.level
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    private Integer level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roomUser.state
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table roomUser
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roomUser.userId
     *
     * @return the value of roomUser.userId
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roomUser.userId
     *
     * @param userid the value for roomUser.userId
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roomUser.roomId
     *
     * @return the value of roomUser.roomId
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public Integer getRoomid() {
        return roomid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roomUser.roomId
     *
     * @param roomid the value for roomUser.roomId
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roomUser.level
     *
     * @return the value of roomUser.level
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roomUser.level
     *
     * @param level the value for roomUser.level
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roomUser.state
     *
     * @return the value of roomUser.state
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roomUser.state
     *
     * @param state the value for roomUser.state
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomUser
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", roomid=").append(roomid);
        sb.append(", level=").append(level);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}