package com.itheima.dao;

import java.util.List;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import com.itheima.domain.Account;

public interface IAccountDao {
	//一对一一个账户一个用户
	@Select("select * from account")
	@Results(value = { 
			@Result(id = true, column  = "id", property = "id"),
			@Result(column = "uid", property = "uid"), 
			@Result(column = "money", property = "money"),
			@Result(property = "user", column = "uid", one = @One(select = "com.itheima.dao.IUserDao.findById", fetchType = FetchType.EAGER))
	})
	
	List<Account> findAllAccount();
}
