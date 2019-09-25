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

import com.itheima.dao.IRoleDao;
import com.itheima.dao.IUserDao;
import com.itheima.domain.Account;
import com.itheima.domain.Role;
import com.itheima.domain.User;

public class RoleTest {
	private InputStream in;
	private SqlSession sqlSession;
	private IRoleDao roleDao;

	@Before
	public void init() throws Exception {
		in = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		sqlSession = factory.openSession();
		roleDao = sqlSession.getMapper(IRoleDao.class);
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
		List<Role> roles = roleDao.findAll();
		for (Role role : roles) {
			System.out.println(role);
			System.out.println(role.getUsers());
		}
	}

}
