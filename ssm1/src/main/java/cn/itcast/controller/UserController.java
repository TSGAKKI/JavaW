package cn.itcast.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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


	@RequestMapping("/login.action")
	public String Login(User user, HttpSession session, Model model) {
		User users;
		users = userService.findByUsercode(user.getUsercode());
		if (users.getUserpassword().equals(user.getUserpassword())) {
			session.setAttribute("user", users);
			return "redirect:/customer/list_init.action";
		} else {
			model.addAttribute("msg", "账号或密码错误，请重新输入！");
	         // 返回到登录页面
			return "loginForm";
		}
	}

	public String Logout() {
		return "";
	}

	public String Register(User user) {
		return null;

	}
}
