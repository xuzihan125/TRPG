package com.trpg.version1.mybatis.entity;

import java.io.Serializable;

public class Ability implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ability.characterId
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    private Integer characterid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ability.skillId
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    private Integer skillid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ability.numPro
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    private Integer numpro;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ability.numHobby
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    private Integer numhobby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ability.numLearn
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    private Integer numlearn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ability.state
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ability
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ability.characterId
     *
     * @return the value of ability.characterId
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    public Integer getCharacterid() {
        return characterid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ability.characterId
     *
     * @param characterid the value for ability.characterId
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    public void setCharacterid(Integer characterid) {
        this.characterid = characterid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ability.skillId
     *
     * @return the value of ability.skillId
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    public Integer getSkillid() {
        return skillid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ability.skillId
     *
     * @param skillid the value for ability.skillId
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    public void setSkillid(Integer skillid) {
        this.skillid = skillid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ability.numPro
     *
     * @return the value of ability.numPro
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    public Integer getNumpro() {
        return numpro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ability.numPro
     *
     * @param numpro the value for ability.numPro
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    public void setNumpro(Integer numpro) {
        this.numpro = numpro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ability.numHobby
     *
     * @return the value of ability.numHobby
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    public Integer getNumhobby() {
        return numhobby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ability.numHobby
     *
     * @param numhobby the value for ability.numHobby
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    public void setNumhobby(Integer numhobby) {
        this.numhobby = numhobby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ability.numLearn
     *
     * @return the value of ability.numLearn
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    public Integer getNumlearn() {
        return numlearn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ability.numLearn
     *
     * @param numlearn the value for ability.numLearn
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    public void setNumlearn(Integer numlearn) {
        this.numlearn = numlearn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ability.state
     *
     * @return the value of ability.state
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ability.state
     *
     * @param state the value for ability.state
     *
     * @mbg.generated Mon Jun 14 20:23:53 CST 2021
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
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
        sb.append(", skillid=").append(skillid);
        sb.append(", numpro=").append(numpro);
        sb.append(", numhobby=").append(numhobby);
        sb.append(", numlearn=").append(numlearn);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}