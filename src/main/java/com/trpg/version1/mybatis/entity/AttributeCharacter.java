package com.trpg.version1.mybatis.entity;

import java.io.Serializable;

public class AttributeCharacter implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attributeCharacter.characterId
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    private Integer characterid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attributeCharacter.attributeId
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    private Integer attributeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attributeCharacter.num
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    private Integer num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attributeCharacter.state
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table attributeCharacter
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attributeCharacter.characterId
     *
     * @return the value of attributeCharacter.characterId
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    public Integer getCharacterid() {
        return characterid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attributeCharacter.characterId
     *
     * @param characterid the value for attributeCharacter.characterId
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    public void setCharacterid(Integer characterid) {
        this.characterid = characterid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attributeCharacter.attributeId
     *
     * @return the value of attributeCharacter.attributeId
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    public Integer getAttributeid() {
        return attributeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attributeCharacter.attributeId
     *
     * @param attributeid the value for attributeCharacter.attributeId
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    public void setAttributeid(Integer attributeid) {
        this.attributeid = attributeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attributeCharacter.num
     *
     * @return the value of attributeCharacter.num
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attributeCharacter.num
     *
     * @param num the value for attributeCharacter.num
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attributeCharacter.state
     *
     * @return the value of attributeCharacter.state
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attributeCharacter.state
     *
     * @param state the value for attributeCharacter.state
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attributeCharacter
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", characterid=").append(characterid);
        sb.append(", attributeid=").append(attributeid);
        sb.append(", num=").append(num);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}