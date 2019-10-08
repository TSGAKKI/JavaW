package cn.itcast.service;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cn.itcast.domain.Account;

public interface AccountService {

	// 查询所有账户
	public List<Account> findAll();

	// 保存账户信息	
	public void saveAccount(Account account);
}
