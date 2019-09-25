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

import com.itheima.dao.IUserDao;
import com.itheima.domain.QueryVo;
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
		//commit 
		sqlSession.commit();
		sqlSession.close();
		in.close();
		
	}

	@Test
	public void testFindAll(){
			
		List<User> users = userDao.findAll();
		for (User user : users) {
			System.out.println(user);
		}
	}
	
	@Test
	public void testFindName(){

		List<User> users = userDao.findByName("%liulei%");
		for (User user : users) {
			System.out.println(user);
		}
	}
	
	@Test
	public void testFindByCondition() {
		User u=new User();
		u.setUsername("liulei");
		u.setJobs("Graduate");
		
		List<User> users=userDao.findUserByCondition(u);
		for(User user:users) {
			System.out.println(user);
		}
		
	}
	
	@Test
	public void testFindByIds() {
		QueryVo vo=new QueryVo();
		List<Integer>  list=new ArrayList<>();
		list.add(2);
		list.add(3);
		vo.setIdS(list);
		List<User> users=userDao.findUserInIds(vo);
		for(User user:users) {
			System.out.println(user);
		}
		
	}
	
	@Test 
	public void testFindTotal() {
		System.out.println(userDao.findTotal());
	}
	
	
	@Test 
	public void testSaveUser() {
		User user=new User();
		user.setJobs("Students_id");
		user.setUsername("liuleis");
		user.setPhone("18584424013");
		System.out.println(user);
		userDao.saveUser(user);	
		System.out.println("保存操作之后"+user);
	}
	
	@Test
	public void testupdateUser() {
		User user=new User();
		user.setId(1);
		user.setJobs("Students");
		user.setUsername("liuleis");
		user.setPhone("18584424013");
		userDao.updateUser(user);
	}
	
	@Test
	public void testdeleteId() {
		userDao.deleteUser(1);
	}
	
	@Test
	public void testfindById() {
		User user=userDao.findById(2);
		System.out.println(user);
	}
	
}
