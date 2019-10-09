package cn.itcast.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.domain.User;
import cn.itcast.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserServiceImpl userServiceImpl;

	@RequestMapping("/login")
	public String Login(User user) {
		List<User> users;
		System.out.println(user.getUserpassword());
		users = userServiceImpl.findByUsercode(user.getUsercode());
		if (users.get(0).getUserpassword().equals(user.getUserpassword())) {
			return "login";
		} else {
			return "success";
		}
	}
	
	public String Register(User user) {
		return null;
		
	}
}
