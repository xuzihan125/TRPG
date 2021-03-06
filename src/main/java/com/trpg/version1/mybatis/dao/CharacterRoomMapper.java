package com.trpg.version1.mybatis.dao;

import com.trpg.version1.mybatis.entity.CharacterRoom;
import com.trpg.version1.mybatis.entity.CharacterRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CharacterRoomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table characterRoom
     *
     * @mbg.generated Sun Jun 13 03:05:19 CST 2021
     */
    long countByExample(CharacterRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table characterRoom
     *
     * @mbg.generated Sun Jun 13 03:05:19 CST 2021
     */
    int deleteByExample(CharacterRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table characterRoom
     *
     * @mbg.generated Sun Jun 13 03:05:19 CST 2021
     */
    int deleteByPrimaryKey(@Param("characterid") Integer characterid, @Param("userid") Integer userid, @Param("roomid") Integer roomid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table characterRoom
     *
     * @mbg.generated Sun Jun 13 03:05:19 CST 2021
     */
    int insert(CharacterRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table characterRoom
     *
     * @mbg.generated Sun Jun 13 03:05:19 CST 2021
     */
    int insertSelective(CharacterRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table characterRoom
     *
     * @mbg.generated Sun Jun 13 03:05:19 CST 2021
     */
    List<CharacterRoom> selectByExample(CharacterRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table characterRoom
     *
     * @mbg.generated Sun Jun 13 03:05:19 CST 2021
     */
    CharacterRoom selectByPrimaryKey(@Param("characterid") Integer characterid, @Param("userid") Integer userid, @Param("roomid") Integer roomid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table characterRoom
     *
     * @mbg.generated Sun Jun 13 03:05:19 CST 2021
     */
    int updateByExampleSelective(@Param("record") CharacterRoom record, @Param("example") CharacterRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table characterRoom
     *
     * @mbg.generated Sun Jun 13 03:05:19 CST 2021
     */
    int updateByExample(@Param("record") CharacterRoom record, @Param("example") CharacterRoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table characterRoom
     *
     * @mbg.generated Sun Jun 13 03:05:19 CST 2021
     */
    int updateByPrimaryKeySelective(CharacterRoom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table characterRoom
     *
     * @mbg.generated Sun Jun 13 03:05:19 CST 2021
     */
    int updateByPrimaryKey(CharacterRoom record);
}