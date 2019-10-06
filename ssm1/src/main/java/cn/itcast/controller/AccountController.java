package cn.itcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController {
//	@Autowired
//	private AccountService accountService;
//	
	@RequestMapping("/findAll")
	 public String findAll() {
		 System.out.println("findall run");
		// accountService.findAll();
		 return "list";
	 }
}
