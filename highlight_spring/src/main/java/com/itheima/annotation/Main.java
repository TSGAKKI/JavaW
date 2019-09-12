package com.itheima.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(config.class);
	UserDaoImp daoImp=context.getBean(UserDaoImp.class);
	daoImp.save();
		context.close();
	}

}
