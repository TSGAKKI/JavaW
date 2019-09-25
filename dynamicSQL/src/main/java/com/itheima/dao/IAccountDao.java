package com.itheima.dao;

import java.util.List;

import com.itheima.domain.Account;
import com.itheima.domain.AccountUser;

public interface IAccountDao {
	List<Account> findAll();
	
	List<AccountUser> findAllAccount();
}
