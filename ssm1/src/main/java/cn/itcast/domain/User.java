package cn.itcast.domain;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
	private String username;
	private String usercode;
	private String userpassword;
	private Integer userid;

	private List<Customer> customers;

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", usercode=" + usercode + ", userpassword=" + userpassword + ", userid="
				+ userid + "]";
	}

}
