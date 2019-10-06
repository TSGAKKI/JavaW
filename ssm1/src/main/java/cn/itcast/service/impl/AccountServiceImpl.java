package cn.itcast.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		System.out.println("业务层,查询所有账户...");
		return null;
	}

	@Override
	public void saveAccount(Account account) {
		// TODO Auto-generated method stub
		System.out.println("业务层,保存所有账户...");
	}

}
