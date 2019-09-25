package com.itheima.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.IUserDao;
import com.itheima.domain.Account;

import com.itheima.domain.User;

public class AccountTest {
	private InputStream in;
	private SqlSession sqlSession;
	private IAccountDao accountDao;

	@Before
	public void init() throws Exception {
		in = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		sqlSession = factory.openSession();
		accountDao = sqlSession.getMapper(IAccountDao.class);
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
		List<Account> accounts = accountDao.findAll();
		System.out.println(accounts);
		//sqlSession.clearCache();
		List<Account> account = accountDao.findAll();
		System.out.println(account);
//		for (Account account : accounts) {
//			System.out.println(account);
//			System.out.println(account.getUser());
//		}
	}
}
