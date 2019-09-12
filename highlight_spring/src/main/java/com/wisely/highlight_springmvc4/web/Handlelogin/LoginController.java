package com.wisely.highlight_springmvc4.web.Handlelogin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wisely.highlight_springmvc4.Daoimp.UserDaoimp;
import com.wisely.highlight_springmvc4.pojo.User;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	UserDaoimp daoimp;
	
	@RequestMapping("/ ") // 2
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String userName = request.getParameter("userName");
		String userPwd = request.getParameter("userPwd");
		// 创建模型视图对象用来返回
		User user;
user=daoimp.login(userName, userPwd);
		if (user!=null) {
			// 将页面需要使用的数据保存
			// mav.addObject("currentUserName", userName);
			// 设置视图名称
			ModelAndView mav = new ModelAndView("login");
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("index");
			return mav;
		}

	}
}
