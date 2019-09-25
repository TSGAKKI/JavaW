package com.itheima.dao;

import java.util.List;

import javax.management.Query;

import org.apache.ibatis.annotations.Select;

import com.itheima.domain.QueryVo;
import com.itheima.domain.User;

public interface IUserDao {
	// @Select("select * from t_customer")
	List<User> findAll();

	void saveUser(User user);

	void updateUser(User user);

	// delete by id
	void deleteUser(Integer id);

	// select by id
	User findById(Integer id);

	// fanit select
	List<User> findByName(String name);

	// number of user
	int findTotal();

	List<User> findUserByVo(QueryVo vo);

	List<User> findUserByCondition(User user);
	
	//根据queryvo 中id
	List<User> findUserInIds(QueryVo vo);
}
