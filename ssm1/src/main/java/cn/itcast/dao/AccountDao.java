package cn.itcast.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import cn.itcast.domain.Account;

/**
 * 账户接口
 * 
 * @author 15486
 *
 */
@Repository
public interface AccountDao {

	//查询所有账户
	@Select("select * from account")
	public List<Account> findAll();

	//保存账户信息
	@Insert("insert into account (name,money) values(#{name},#{money})")
	public void saveAccount(Account account);

}
