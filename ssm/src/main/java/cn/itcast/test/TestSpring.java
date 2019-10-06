package cn.itcast.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.service.AccountService;

public class TestSpring {
	
	@Test
	public void run1() {
		//加载配置文件
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		AccountService accountService=(AccountService) context.getBean("accountService");
		accountService.findAll();
	}
}
