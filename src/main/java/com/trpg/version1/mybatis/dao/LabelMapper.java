package com.trpg.version1.mybatis.dao;

import com.trpg.version1.mybatis.entity.Label;
import com.trpg.version1.mybatis.entity.LabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LabelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table labell
     *
     * @mbg.generated Tue Jun 08 23:12:34 CST 2021
     */
    long countByExample(LabelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table labell
     *
     * @mbg.generated Tue Jun 08 23:12:34 CST 2021
     */
    int deleteByExample(LabelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table labell
     *
     * @mbg.generated Tue Jun 08 23:12:34 CST 2021
     */
    int deleteByPrimaryKey(Integer labelid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table labell
     *
     * @mbg.generated Tue Jun 08 23:12:34 CST 2021
     */
    int insert(Label record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table labell
     *
     * @mbg.generated Tue Jun 08 23:12:34 CST 2021
     */
    int insertSelective(Label record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table labell
     *
     * @mbg.generated Tue Jun 08 23:12:34 CST 2021
     */
    List<Label> selectByExample(LabelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table labell
     *
     * @mbg.generated Tue Jun 08 23:12:34 CST 2021
     */
    Label selectByPrimaryKey(Integer labelid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table labell
     *
     * @mbg.generated Tue Jun 08 23:12:34 CST 2021
     */
    int updateByExampleSelective(@Param("record") Label record, @Param("example") LabelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table labell
     *
     * @mbg.generated Tue Jun 08 23:12:34 CST 2021
     */
    int updateByExample(@Param("record") Label record, @Param("example") LabelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table labell
     *
     * @mbg.generated Tue Jun 08 23:12:34 CST 2021
     */
    int updateByPrimaryKeySelective(Label record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table labell
     *
     * @mbg.generated Tue Jun 08 23:12:34 CST 2021
     */
    int updateByPrimaryKey(Label record);
}