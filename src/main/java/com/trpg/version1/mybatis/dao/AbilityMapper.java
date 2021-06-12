package com.trpg.version1.mybatis.dao;

import com.trpg.version1.mybatis.entity.Ability;
import com.trpg.version1.mybatis.entity.AbilityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AbilityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 04:43:48 CST 2021
     */
    long countByExample(AbilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 04:43:48 CST 2021
     */
    int deleteByExample(AbilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 04:43:48 CST 2021
     */
    int deleteByPrimaryKey(@Param("characterid") Integer characterid, @Param("skillid") Integer skillid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 04:43:48 CST 2021
     */
    int insert(Ability record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 04:43:48 CST 2021
     */
    int insertSelective(Ability record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 04:43:48 CST 2021
     */
    List<Ability> selectByExample(AbilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 04:43:48 CST 2021
     */
    Ability selectByPrimaryKey(@Param("characterid") Integer characterid, @Param("skillid") Integer skillid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 04:43:48 CST 2021
     */
    int updateByExampleSelective(@Param("record") Ability record, @Param("example") AbilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 04:43:48 CST 2021
     */
    int updateByExample(@Param("record") Ability record, @Param("example") AbilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 04:43:48 CST 2021
     */
    int updateByPrimaryKeySelective(Ability record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ability
     *
     * @mbg.generated Sun Jun 13 04:43:48 CST 2021
     */
    int updateByPrimaryKey(Ability record);
}