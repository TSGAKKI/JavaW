package com.itheima.dao;

import java.util.List;

import javax.management.Query;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itheima.domain.User;

public interface IUserDao {
	
	// 查询用户
	@Select("select * from user")
//	@Results(id = "userMap", value = { 
//			//名称不对应时进行映射
//			@Result(id = true, column = "id", property = "id"),
//			//@Result(column = "id", property = "id"), 
//			//@Result(column = "id", property = "id") 
//			})
	List<User> findAll();

	// 保存用户
	@Insert("insert into user(username,address,sex,birthday) values(#{username},#{address},#{sex},#{birthday})")
	//@ResultMap(value = { "userMap" })
	void saveUser(User user);

	// 更新用户
	@Update("update user set username=#{username},sex=#{sex},address=#{address},birthday=#{birthday} where id=#{id}")
	void updateUser(User user);

	// 删除用户
	@Delete("delete from user where id=#{id} ")
	void deleteUser(Integer id);

	// select by id
	@Select("select * from user where id=#{id}")
	User findById(Integer id);

}
