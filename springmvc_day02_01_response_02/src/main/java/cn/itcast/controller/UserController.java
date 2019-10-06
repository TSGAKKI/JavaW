package cn.itcast.controller;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.resource.HttpResource;

import cn.itcast.domain.User;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/testString")
	public String testString(Model model) {
		System.out.println("run");
		User user = new User();
		user.setUsername("妹妹");
		user.setPassword("123");
		user.setAge(30);
		System.out.println(user);
		model.addAttribute("user", user);
		return "success";
	}

	/**
	 * void 请求转发,不写项目名称
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
//	@RequestMapping("/testVoid")
//	public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		System.out.println("run");
//
//		request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);
//	}
//	
	@RequestMapping("/testVoid")
	public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("run");
//转发
//		request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);
		
		// 重定向response.sendRedirect(request.getContextPath()+"/index.jsp");

		// 设置编码
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		// 直接相应
		response.getWriter().print("你好");
	}
	@RequestMapping("/testmov")
	public ModelAndView testmov() {
		System.out.println("run");
		ModelAndView mv=new ModelAndView();
		User user = new User();
		user.setUsername("妹妹");
		user.setPassword("123");
		user.setAge(30);
		System.out.println(user);
		//吧User对象存入到mv,也会把user对象存入request对象
		mv.addObject("user",user);
		
		//跳转页面
		mv.setViewName("success");
		return mv;
	}
	@RequestMapping("/testRedirOrForward")
	public String testRedirOrForward() {
		System.out.println("run");
		
		//请求转发
		return "forward:/WEB-INF/pages/success.jsp";
	}

}
