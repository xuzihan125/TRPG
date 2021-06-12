package com.trpg.version1.mybatis.dao;

import com.trpg.version1.mybatis.entity.Room;
import com.trpg.version1.mybatis.entity.RoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Sat Jun 12 12:16:46 CST 2021
     */
    long countByExample(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Sat Jun 12 12:16:46 CST 2021
     */
    int deleteByExample(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Sat Jun 12 12:16:46 CST 2021
     */
    int deleteByPrimaryKey(Integer roomid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Sat Jun 12 12:16:46 CST 2021
     */
    int insert(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Sat Jun 12 12:16:46 CST 2021
     */
    int insertSelective(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Sat Jun 12 12:16:46 CST 2021
     */
    List<Room> selectByExample(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Sat Jun 12 12:16:46 CST 2021
     */
    Room selectByPrimaryKey(Integer roomid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Sat Jun 12 12:16:46 CST 2021
     */
    int updateByExampleSelective(@Param("record") Room record, @Param("example") RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Sat Jun 12 12:16:46 CST 2021
     */
    int updateByExample(@Param("record") Room record, @Param("example") RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Sat Jun 12 12:16:46 CST 2021
     */
    int updateByPrimaryKeySelective(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Sat Jun 12 12:16:46 CST 2021
     */
    int updateByPrimaryKey(Room record);
}