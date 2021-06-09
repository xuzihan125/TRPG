package com.trpg.version1.mybatis.dao;

import com.trpg.version1.mybatis.entity.Charact;
import com.trpg.version1.mybatis.entity.CharactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CharactMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charact
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    long countByExample(CharactExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charact
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    int deleteByExample(CharactExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charact
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    int insert(Charact record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charact
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    int insertSelective(Charact record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charact
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    List<Charact> selectByExample(CharactExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charact
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    int updateByExampleSelective(@Param("record") Charact record, @Param("example") CharactExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charact
     *
     * @mbg.generated Tue Jun 08 23:11:43 CST 2021
     */
    int updateByExample(@Param("record") Charact record, @Param("example") CharactExample example);
}