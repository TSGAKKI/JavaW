package cn.itcast.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/findAll")
	 public String findAll(Model model) {
		 System.out.println("表现层");
		 List<Account> list=accountService.findAll();
		 model.addAttribute("list",list);
		 return "list";
	 }
	
	@RequestMapping("/saveAccount")
	public void saveAccount(Account account,HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		accountService.saveAccount(account);
		response.sendRedirect(request.getContextPath()+"/account/findAll");
	}
}
