package com.wisely.highlight_springmvc4.Dao;

import com.wisely.highlight_springmvc4.pojo.User;

public interface UserDao {
	public User login(String username, String password);
}
