package com.trpg.version1.mybatis.dao;

import com.trpg.version1.mybatis.entity.LabelModule;
import com.trpg.version1.mybatis.entity.LabelModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LabelModuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table labelModule
     *
     * @mbg.generated Tue Jun 08 23:12:34 CST 2021
     */
    long countByExample(LabelModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table labelModule
     *
     * @mbg.generated Tue Jun 08 23:12:34 CST 2021
     */
    int deleteByExample(LabelModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table labelModule
     *
     * @mbg.generated Tue Jun 08 23:12:34 CST 2021
     */
    int insert(LabelModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table labelModule
     *
     * @mbg.generated Tue Jun 08 23:12:34 CST 2021
     */
    int insertSelective(LabelModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table labelModule
     *
     * @mbg.generated Tue Jun 08 23:12:34 CST 2021
     */
    List<LabelModule> selectByExample(LabelModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table labelModule
     *
     * @mbg.generated Tue Jun 08 23:12:34 CST 2021
     */
    int updateByExampleSelective(@Param("record") LabelModule record, @Param("example") LabelModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table labelModule
     *
     * @mbg.generated Tue Jun 08 23:12:34 CST 2021
     */
    int updateByExample(@Param("record") LabelModule record, @Param("example") LabelModuleExample example);
}