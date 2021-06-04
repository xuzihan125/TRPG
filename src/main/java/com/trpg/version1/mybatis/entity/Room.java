package com.trpg.version1.mybatis.entity;

import java.io.Serializable;

public class Room implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.roomId
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    private Integer roomid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.name
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.descri
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    private String descri;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.type
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.short_Time
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    private String shortTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.long_Time
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    private String longTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.image_Url
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    private String imageUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.rule_Type
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    private String ruleType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.time_Background
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    private String timeBackground;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.place_Background
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    private String placeBackground;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.fileUrl
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    private String fileurl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.recommend_People_Min
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    private Integer recommendPeopleMin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.recommend_People_Max
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    private Integer recommendPeopleMax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.state
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table room
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.roomId
     *
     * @return the value of room.roomId
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public Integer getRoomid() {
        return roomid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.roomId
     *
     * @param roomid the value for room.roomId
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.name
     *
     * @return the value of room.name
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.name
     *
     * @param name the value for room.name
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.descri
     *
     * @return the value of room.descri
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public String getDescri() {
        return descri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.descri
     *
     * @param descri the value for room.descri
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public void setDescri(String descri) {
        this.descri = descri == null ? null : descri.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.type
     *
     * @return the value of room.type
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.type
     *
     * @param type the value for room.type
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.short_Time
     *
     * @return the value of room.short_Time
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public String getShortTime() {
        return shortTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.short_Time
     *
     * @param shortTime the value for room.short_Time
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public void setShortTime(String shortTime) {
        this.shortTime = shortTime == null ? null : shortTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.long_Time
     *
     * @return the value of room.long_Time
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public String getLongTime() {
        return longTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.long_Time
     *
     * @param longTime the value for room.long_Time
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public void setLongTime(String longTime) {
        this.longTime = longTime == null ? null : longTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.image_Url
     *
     * @return the value of room.image_Url
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.image_Url
     *
     * @param imageUrl the value for room.image_Url
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.rule_Type
     *
     * @return the value of room.rule_Type
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.rule_Type
     *
     * @param ruleType the value for room.rule_Type
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType == null ? null : ruleType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.time_Background
     *
     * @return the value of room.time_Background
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public String getTimeBackground() {
        return timeBackground;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.time_Background
     *
     * @param timeBackground the value for room.time_Background
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public void setTimeBackground(String timeBackground) {
        this.timeBackground = timeBackground == null ? null : timeBackground.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.place_Background
     *
     * @return the value of room.place_Background
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public String getPlaceBackground() {
        return placeBackground;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.place_Background
     *
     * @param placeBackground the value for room.place_Background
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public void setPlaceBackground(String placeBackground) {
        this.placeBackground = placeBackground == null ? null : placeBackground.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.fileUrl
     *
     * @return the value of room.fileUrl
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public String getFileurl() {
        return fileurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.fileUrl
     *
     * @param fileurl the value for room.fileUrl
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public void setFileurl(String fileurl) {
        this.fileurl = fileurl == null ? null : fileurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.recommend_People_Min
     *
     * @return the value of room.recommend_People_Min
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public Integer getRecommendPeopleMin() {
        return recommendPeopleMin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.recommend_People_Min
     *
     * @param recommendPeopleMin the value for room.recommend_People_Min
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public void setRecommendPeopleMin(Integer recommendPeopleMin) {
        this.recommendPeopleMin = recommendPeopleMin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.recommend_People_Max
     *
     * @return the value of room.recommend_People_Max
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public Integer getRecommendPeopleMax() {
        return recommendPeopleMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.recommend_People_Max
     *
     * @param recommendPeopleMax the value for room.recommend_People_Max
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public void setRecommendPeopleMax(Integer recommendPeopleMax) {
        this.recommendPeopleMax = recommendPeopleMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.state
     *
     * @return the value of room.state
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.state
     *
     * @param state the value for room.state
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Tue May 25 22:40:26 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roomid=").append(roomid);
        sb.append(", name=").append(name);
        sb.append(", descri=").append(descri);
        sb.append(", type=").append(type);
        sb.append(", shortTime=").append(shortTime);
        sb.append(", longTime=").append(longTime);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append(", ruleType=").append(ruleType);
        sb.append(", timeBackground=").append(timeBackground);
        sb.append(", placeBackground=").append(placeBackground);
        sb.append(", fileurl=").append(fileurl);
        sb.append(", recommendPeopleMin=").append(recommendPeopleMin);
        sb.append(", recommendPeopleMax=").append(recommendPeopleMax);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}