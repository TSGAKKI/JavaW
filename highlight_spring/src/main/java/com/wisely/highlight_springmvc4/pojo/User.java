package com.wisely.highlight_springmvc4.pojo;

public class User {

	private String user_name;
	private String user_password;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String user_name, String user_password) {
		this.user_name = user_name;
		this.user_password = user_password;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User [ user_name= " + user_name + " user_password= " + user_name + "]";
	}
}
