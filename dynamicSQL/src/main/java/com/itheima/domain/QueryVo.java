package com.itheima.domain;

import java.util.List;

public class QueryVo {
	User user;
	private List<Integer> Ids;

	public List<Integer> getIdS() {
		return Ids;
	}

	public void setIdS(List<Integer> ids) {
		Ids = ids;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "QueryVo [user=" + user + "]";
	}

}
