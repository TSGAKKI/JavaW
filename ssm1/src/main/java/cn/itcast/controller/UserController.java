package cn.itcast.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.domain.Account;
import cn.itcast.domain.Customer;
import cn.itcast.domain.User;
import cn.itcast.service.CustomerService;
import cn.itcast.service.impl.AccountServiceImpl;
import cn.itcast.service.impl.CustomerServiceImpl;
import cn.itcast.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	@Autowired
	private CustomerServiceImpl customerServiceImpl;

	@RequestMapping("/login")
	public String Login(User user, HttpServletRequest request) {
		User users;
		List<Customer> customers;
		System.out.println(user.getUserpassword());
		users = userServiceImpl.findByUsercode(user.getUsercode());

		if (users.getUserpassword().equals(user.getUserpassword())) {
			customers = customerServiceImpl.findByuserid(users.getUserid());
			request.setAttribute("customers", customers);

			return "custom";
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
