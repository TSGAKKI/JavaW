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
	public int createCustomer(Customer customer);

	// 按cusid查询customer用户
	public Customer findBycusid(Integer cusid);
	
	//按条件查询
	public List<Customer> findCustomerList(Customer customer);
	
	//根据条件更新用户数据
	public int updateCustomer(Customer customer);
	
	//根据cusid删除
	public int deleteCustomer(Integer cusid);
	
}
