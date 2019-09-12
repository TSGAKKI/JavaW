package com.itheima.annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImp implements UserDao {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("userdao....");
	}

}
