package com.trpg.version1.mybatis.entity;

import java.io.Serializable;

public class Charact implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column charact.characterId
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    private Integer characterid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column charact.userId
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column charact.isElligibleToEnroll
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    private String iselligibletoenroll;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column charact.getSeminarsTaken
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    private String getseminarstaken;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column charact.state
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table charact
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column charact.characterId
     *
     * @return the value of charact.characterId
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public Integer getCharacterid() {
        return characterid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column charact.characterId
     *
     * @param characterid the value for charact.characterId
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public void setCharacterid(Integer characterid) {
        this.characterid = characterid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column charact.userId
     *
     * @return the value of charact.userId
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column charact.userId
     *
     * @param userid the value for charact.userId
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column charact.isElligibleToEnroll
     *
     * @return the value of charact.isElligibleToEnroll
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public String getIselligibletoenroll() {
        return iselligibletoenroll;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column charact.isElligibleToEnroll
     *
     * @param iselligibletoenroll the value for charact.isElligibleToEnroll
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public void setIselligibletoenroll(String iselligibletoenroll) {
        this.iselligibletoenroll = iselligibletoenroll == null ? null : iselligibletoenroll.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column charact.getSeminarsTaken
     *
     * @return the value of charact.getSeminarsTaken
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public String getGetseminarstaken() {
        return getseminarstaken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column charact.getSeminarsTaken
     *
     * @param getseminarstaken the value for charact.getSeminarsTaken
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public void setGetseminarstaken(String getseminarstaken) {
        this.getseminarstaken = getseminarstaken == null ? null : getseminarstaken.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column charact.state
     *
     * @return the value of charact.state
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column charact.state
     *
     * @param state the value for charact.state
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charact
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", characterid=").append(characterid);
        sb.append(", userid=").append(userid);
        sb.append(", iselligibletoenroll=").append(iselligibletoenroll);
        sb.append(", getseminarstaken=").append(getseminarstaken);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}