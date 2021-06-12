package com.trpg.version1.mybatis.dao;

import com.trpg.version1.mybatis.entity.Module;
import com.trpg.version1.mybatis.entity.ModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbg.generated Sat Jun 12 13:54:50 CST 2021
     */
    long countByExample(ModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbg.generated Sat Jun 12 13:54:50 CST 2021
     */
    int deleteByExample(ModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbg.generated Sat Jun 12 13:54:50 CST 2021
     */
    int deleteByPrimaryKey(Integer mid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbg.generated Sat Jun 12 13:54:50 CST 2021
     */
    int insert(Module record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbg.generated Sat Jun 12 13:54:50 CST 2021
     */
    int insertSelective(Module record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbg.generated Sat Jun 12 13:54:50 CST 2021
     */
    List<Module> selectByExample(ModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbg.generated Sat Jun 12 13:54:50 CST 2021
     */
    Module selectByPrimaryKey(Integer mid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbg.generated Sat Jun 12 13:54:50 CST 2021
     */
    int updateByExampleSelective(@Param("record") Module record, @Param("example") ModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbg.generated Sat Jun 12 13:54:50 CST 2021
     */
    int updateByExample(@Param("record") Module record, @Param("example") ModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbg.generated Sat Jun 12 13:54:50 CST 2021
     */
    int updateByPrimaryKeySelective(Module record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table module
     *
     * @mbg.generated Sat Jun 12 13:54:50 CST 2021
     */
    int updateByPrimaryKey(Module record);
}