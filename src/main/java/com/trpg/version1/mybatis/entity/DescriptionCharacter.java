package com.trpg.version1.mybatis.entity;

import java.io.Serializable;

public class DescriptionCharacter implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column descriptionCharacter.characterId
     *
     * @mbg.generated Mon Jun 14 22:42:03 CST 2021
     */
    private Integer characterid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column descriptionCharacter.descriptionId
     *
     * @mbg.generated Mon Jun 14 22:42:03 CST 2021
     */
    private Integer descriptionid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column descriptionCharacter.context
     *
     * @mbg.generated Mon Jun 14 22:42:03 CST 2021
     */
    private String context;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column descriptionCharacter.state
     *
     * @mbg.generated Mon Jun 14 22:42:03 CST 2021
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table descriptionCharacter
     *
     * @mbg.generated Mon Jun 14 22:42:03 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column descriptionCharacter.characterId
     *
     * @return the value of descriptionCharacter.characterId
     *
     * @mbg.generated Mon Jun 14 22:42:03 CST 2021
     */
    public Integer getCharacterid() {
        return characterid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column descriptionCharacter.characterId
     *
     * @param characterid the value for descriptionCharacter.characterId
     *
     * @mbg.generated Mon Jun 14 22:42:03 CST 2021
     */
    public void setCharacterid(Integer characterid) {
        this.characterid = characterid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column descriptionCharacter.descriptionId
     *
     * @return the value of descriptionCharacter.descriptionId
     *
     * @mbg.generated Mon Jun 14 22:42:03 CST 2021
     */
    public Integer getDescriptionid() {
        return descriptionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column descriptionCharacter.descriptionId
     *
     * @param descriptionid the value for descriptionCharacter.descriptionId
     *
     * @mbg.generated Mon Jun 14 22:42:03 CST 2021
     */
    public void setDescriptionid(Integer descriptionid) {
        this.descriptionid = descriptionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column descriptionCharacter.context
     *
     * @return the value of descriptionCharacter.context
     *
     * @mbg.generated Mon Jun 14 22:42:03 CST 2021
     */
    public String getContext() {
        return context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column descriptionCharacter.context
     *
     * @param context the value for descriptionCharacter.context
     *
     * @mbg.generated Mon Jun 14 22:42:03 CST 2021
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column descriptionCharacter.state
     *
     * @return the value of descriptionCharacter.state
     *
     * @mbg.generated Mon Jun 14 22:42:03 CST 2021
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column descriptionCharacter.state
     *
     * @param state the value for descriptionCharacter.state
     *
     * @mbg.generated Mon Jun 14 22:42:03 CST 2021
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table descriptionCharacter
     *
     * @mbg.generated Mon Jun 14 22:42:03 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", characterid=").append(characterid);
        sb.append(", descriptionid=").append(descriptionid);
        sb.append(", context=").append(context);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}