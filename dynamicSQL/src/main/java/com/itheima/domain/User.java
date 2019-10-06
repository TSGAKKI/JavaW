package com.itheima.domain;


import java.util.Date;
import java.util.List;


public class User {

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", address=" + address + ", sex=" + sex + ", birthday="
				+ birthday + "]";
	}

	
	private Integer id;
	private String username;
	private String address;
	private String sex;
	private Date birthday;
	private List<Account> accounts;

	//多对多的关系映射:一个用户可以具备多个角色
//	private List<Role> roles;
//	
//	
//	public List<Role> getRoles() {
//		return roles;
//	}
//
//	public void setRoles(List<Role> roles) {
//		this.roles = roles;
//	}

	// 一对多关系映射,主表应包含从表实体集合引用
	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
