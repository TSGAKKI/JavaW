package cn.itcast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountDao accountDao;

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		System.out.println("业务层,查询所有账户...");
		return accountDao.findAll();
	}

	@Override
	public void saveAccount(Account account) {
		// TODO Auto-generated method stub
		System.out.println("业务层,保存所有账户...");
		accountDao.saveAccount(account);
	}

}
