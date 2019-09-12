package com.wisely.highlight_springmvc4.Daoimp;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.wisely.highlight_springmvc4.Dao.UserDao;
import com.wisely.highlight_springmvc4.pojo.User;

@Service
public class UserDaoimp implements UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public User login(String username, String password) {

		// TODO Auto-generated method stub
		List<User> us;
		String sql = "select * from User where username =? and password=?";
		Object[] params = new Object[] { username, password };

		RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
		us=jdbcTemplate.query(sql, params, rowMapper);
		if (us.size()==1) {
			return new User(username,password);
		}
		return null;

	}

}
