package com.itheima.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
	@Autowired
	private UserDaoImp userService;
	
	public void save() {
		userService.save();
		System.out.println("usercontroller...");
	}
}
