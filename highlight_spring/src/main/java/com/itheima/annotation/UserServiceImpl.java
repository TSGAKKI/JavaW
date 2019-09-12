package com.itheima.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserServiceImpl implements UserService {

	@Resource(name="userDao")
	private UserDao userDao;

	
	@Override
	public void save() {
		// TODO Auto-generated method stub
		userDao.save();
		System.out.println("userService...");
	}

}
