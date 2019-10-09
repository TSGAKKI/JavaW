package cn.itcast.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.itcast.domain.User;

public interface UserService {
	//查找全部用户
	public List<User> findAll();
	
	//按Username查找用户
	public List<User> findByUsercode(String usercode) ;
	
	//添加用戶
	public int saveUser(User user);

}
