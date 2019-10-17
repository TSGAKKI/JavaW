package cn.itcast.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.springframework.stereotype.Repository;

import cn.itcast.domain.Customer;
import cn.itcast.domain.User;

@Repository
public interface CustomerDao {

	// 查找全部用户
	@Select("select * from customer")
	public List<Customer> findAllCus();

	// 按Userid查找用户
	@Select("select * from customer where userid = #{userid}")
	public List<Customer> findByuserid(int userid);

	//根据customer条件查询
	@SelectProvider(type = CustomerDaoProvider.class,method = "findCustomerList")
	public List<Customer> findCustomerList(Customer customer);

	// 添加用戶
	@Insert("insert into customer(usercode,username,userpassword) values('1548637398','tsgakki','TSLIUlei19891998')")
	public int saveCustomer(Customer customer);

	// 通过cusid查询用户
	@Select("select * from customer where cusid = #{cusid}")
	public Customer findBycusid(Integer cusid);
	
	//更新用户
	@UpdateProvider(type = CustomerDaoProvider.class,method = "updateCustomer")
	public int updateCustomer(Customer customer);
	
	//删除customer
	@Delete("delete from customer where cusid=#{cusid}")
	public int deleteCustomer(Integer cusid);
}
