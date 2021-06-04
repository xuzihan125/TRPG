package com.trpg.version1.mybatis.dao;

import com.trpg.version1.mybatis.entity.CommentUser;
import com.trpg.version1.mybatis.entity.CommentUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commentUser
     *
     * @mbg.generated Wed Jun 02 16:18:03 CST 2021
     */
    long countByExample(CommentUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commentUser
     *
     * @mbg.generated Wed Jun 02 16:18:03 CST 2021
     */
    int deleteByExample(CommentUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commentUser
     *
     * @mbg.generated Wed Jun 02 16:18:03 CST 2021
     */
    int insert(CommentUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commentUser
     *
     * @mbg.generated Wed Jun 02 16:18:03 CST 2021
     */
    int insertSelective(CommentUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commentUser
     *
     * @mbg.generated Wed Jun 02 16:18:03 CST 2021
     */
    List<CommentUser> selectByExample(CommentUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commentUser
     *
     * @mbg.generated Wed Jun 02 16:18:03 CST 2021
     */
    int updateByExampleSelective(@Param("record") CommentUser record, @Param("example") CommentUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commentUser
     *
     * @mbg.generated Wed Jun 02 16:18:03 CST 2021
     */
    int updateByExample(@Param("record") CommentUser record, @Param("example") CommentUserExample example);
}