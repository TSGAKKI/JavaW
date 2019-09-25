package com.itheima.dao;

import java.util.List;

import javax.management.Query;

import org.apache.ibatis.annotations.Select;


import com.itheima.domain.User;

public interface IUserDao {
	// @Select("select * from t_customer")
	List<User> findAll();
	
	//查询user对应的role信息
	List<User> findAllR();
	
	// select by id
	User findById(Integer id);
}
