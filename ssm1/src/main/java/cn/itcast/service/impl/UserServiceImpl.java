package cn.itcast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import cn.itcast.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public List<User> findByUsercode(String usercode) {
		// TODO Auto-generated method stub
		System.out.println("进入业务层findUserName");
		return userDao.findByUsercode(usercode);
	}

	@Override
	public int saveUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(user);
		return userDao.saveUser(user);
	}

}
