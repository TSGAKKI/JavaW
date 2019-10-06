package com.itheima.test;

import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.itheima.dao.IUserDao;

import com.itheima.domain.User;

public class MybatisTest {
	private InputStream in;
	private SqlSession sqlSession;
	private IUserDao userDao;

	@Before
	public void init() throws Exception {
		in = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		sqlSession = factory.openSession();
		userDao = sqlSession.getMapper(IUserDao.class);
	}

	@After
	public void destroy() throws Exception {
		// commit
		sqlSession.commit();
		sqlSession.close();
		in.close();

	}

	@Test
	public void testFindAll() {
		List<User> users = userDao.findAll();
		for (User user : users) {
			System.out.println(user);
		}
	}

	@Test
	public void testsaveUser() {
		// TODO Auto-generated method stub
		User user = new User();
		user.setAddress("北京市海淀区");
		user.setUsername("save_sql");
		userDao.saveUser(user);
	}
	
	@Test
	public void testupdateUser() {
		User user = new User();
		user.setId(50);
		user.setAddress("北京市海淀区");
		user.setUsername("save_sql");
		user.setBirthday(new Date());
		user.setSex("M");
		
		userDao.updateUser(user);
	}
	
	@Test 
	public void testdeleteUser() {
		userDao.deleteUser(50);
	}
	
	@Test 
	public void testseletoneUser() {
		
		System.out.println(userDao.findById(46));
	}
	
	
	
	
}
