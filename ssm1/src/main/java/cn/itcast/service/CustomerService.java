package cn.itcast.service;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cn.itcast.domain.Customer;

public interface CustomerService {

	// 查找全部用户
	public List<Customer> findAllCus();

	// 按Userid查找用户
	public List<Customer> findByuserid(int userid);

	// 添加用戶
	public int saveCustomer(Customer customer);

	// 按cusid查询customer用户
	public Customer findBycusid(Integer cusid);
}
