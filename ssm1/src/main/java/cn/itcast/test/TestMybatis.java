package cn.itcast.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.itcast.dao.AccountDao;
import cn.itcast.dao.UserDao;
import cn.itcast.domain.Account;
import cn.itcast.domain.User;

public class TestMybatis {
	@Test
	public void run1() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

		SqlSession session = factory.openSession();
		UserDao userdao = session.getMapper(UserDao.class);
		List<User> users = userdao.findAll();
		
			System.out.println(users);
			//System.out.println(user.getCustomers());
		
		session.close();
		inputStream.close();
	}
	
	@Test
	public void testSave() throws IOException {
		Account account=new Account();
		account.setName("刘");
		account.setMoney(2010.0);
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

		SqlSession session = factory.openSession();
		AccountDao dao = session.getMapper(AccountDao.class);

		dao.saveAccount(account);
		session.commit();
		session.close();
		inputStream.close();
	}
}
