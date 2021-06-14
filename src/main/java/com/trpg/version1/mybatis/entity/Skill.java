package com.trpg.version1.mybatis.entity;

import java.io.Serializable;

public class Skill implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column skill.skillId
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    private Integer skillid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column skill.name
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column skill.descri
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    private String descri;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column skill.numDefault
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    private Integer numdefault;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column skill.state
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column skill.type
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column skill.cid
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    private Integer cid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table skill
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.skillId
     *
     * @return the value of skill.skillId
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    public Integer getSkillid() {
        return skillid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.skillId
     *
     * @param skillid the value for skill.skillId
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    public void setSkillid(Integer skillid) {
        this.skillid = skillid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.name
     *
     * @return the value of skill.name
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.name
     *
     * @param name the value for skill.name
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.descri
     *
     * @return the value of skill.descri
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    public String getDescri() {
        return descri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.descri
     *
     * @param descri the value for skill.descri
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    public void setDescri(String descri) {
        this.descri = descri == null ? null : descri.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.numDefault
     *
     * @return the value of skill.numDefault
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    public Integer getNumdefault() {
        return numdefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.numDefault
     *
     * @param numdefault the value for skill.numDefault
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    public void setNumdefault(Integer numdefault) {
        this.numdefault = numdefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.state
     *
     * @return the value of skill.state
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.state
     *
     * @param state the value for skill.state
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.type
     *
     * @return the value of skill.type
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.type
     *
     * @param type the value for skill.type
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.cid
     *
     * @return the value of skill.cid
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.cid
     *
     * @param cid the value for skill.cid
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated Mon Jun 14 20:23:52 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", skillid=").append(skillid);
        sb.append(", name=").append(name);
        sb.append(", descri=").append(descri);
        sb.append(", numdefault=").append(numdefault);
        sb.append(", state=").append(state);
        sb.append(", type=").append(type);
        sb.append(", cid=").append(cid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}