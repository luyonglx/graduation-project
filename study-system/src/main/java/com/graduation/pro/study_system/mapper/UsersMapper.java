package com.graduation.pro.study_system.mapper;

import com.graduation.pro.study_system.pojo.Users;
import com.graduation.pro.study_system.pojo.UsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Mar 19 14:41:31 CST 2015
	 */
	int countByExample(UsersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Mar 19 14:41:31 CST 2015
	 */
	int deleteByExample(UsersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Mar 19 14:41:31 CST 2015
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Mar 19 14:41:31 CST 2015
	 */
	int insert(Users record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Mar 19 14:41:31 CST 2015
	 */
	int insertSelective(Users record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Mar 19 14:41:31 CST 2015
	 */
	List<Users> selectByExample(UsersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Mar 19 14:41:31 CST 2015
	 */
	Users selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Mar 19 14:41:31 CST 2015
	 */
	int updateByExampleSelective(@Param("record") Users record,
			@Param("example") UsersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Mar 19 14:41:31 CST 2015
	 */
	int updateByExample(@Param("record") Users record,
			@Param("example") UsersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Mar 19 14:41:31 CST 2015
	 */
	int updateByPrimaryKeySelective(Users record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbggenerated  Thu Mar 19 14:41:31 CST 2015
	 */
	int updateByPrimaryKey(Users record);
}