package cn.itcast.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import cn.itcast.domain.User;

@Repository
public interface UserDao {
	//查找全部用户
	@Select("select * from user")
	public List<User> findAll();
	
	//按Username查找用户
	@Select("select * from user where usercode = #{usercode}")
	public List<User> findByUsercode(String usercode) ;
	
	//添加用戶
	@Insert("insert into user(usercode,username,userpassword) values('1548637398','tsgakki','TSLIUlei19891998')")
	public int saveUser(User user); 
}
