package cn.itcast.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.domain.Account;
import cn.itcast.domain.Customer;
import cn.itcast.domain.User;
import cn.itcast.service.CustomerService;
import cn.itcast.service.UserService;
import cn.itcast.service.impl.AccountServiceImpl;
import cn.itcast.service.impl.CustomerServiceImpl;
import cn.itcast.service.impl.UserServiceImpl;

@Controller
public class UserController {
	@Autowired
	private UserService userService;


	@RequestMapping("user/login")
	public String Login(User user, HttpSession request) {
		User users;
		users = userService.findByUsercode(user.getUsercode());
		if (users.getUserpassword().equals(user.getUserpassword())) {
			request.setAttribute("user", users);
			return "redirect:/customer/list_init.action";
		} else {
			return "success";
		}
	}

	public String Logout() {
		return "";
	}

	public String Register(User user) {
		return null;

	}
}
