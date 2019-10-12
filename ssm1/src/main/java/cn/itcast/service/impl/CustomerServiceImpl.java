package cn.itcast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.dao.CustomerDao;
import cn.itcast.domain.Customer;
import cn.itcast.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public List<Customer> findAllCus() {
		// TODO Auto-generated method stub
		return customerDao.findAllCus();
	}

	@Override
	public List<Customer> findByuserid(int userid) {
		// TODO Auto-generated method stub
		return customerDao.findByuserid(userid);
	}

	@Override
	public int saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.saveCustomer(customer);
	}

}
