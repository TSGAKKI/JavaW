package cn.itcast.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import cn.itcast.domain.Customer;
import cn.itcast.domain.User;

@Repository
public interface CustomerDao {
	
	//查找全部用户
		@Select("select * from customer")
		public List<Customer> findAllCus();
		
		//按Userid查找用户
		@Select("select * from customer where userid = #{userid}")
		public List<Customer> findByuserid(int userid) ;
		
		//添加用戶
		@Insert("insert into customer(usercode,username,userpassword) values('1548637398','tsgakki','TSLIUlei19891998')")
		public int saveCustomer(Customer customer); 
}
