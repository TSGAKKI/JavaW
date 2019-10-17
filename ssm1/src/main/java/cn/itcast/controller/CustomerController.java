package cn.itcast.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.domain.Customer;
import cn.itcast.domain.User;
import cn.itcast.service.CustomerService;
import cn.itcast.service.UserService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@Autowired
	private UserService userService;

	@RequestMapping("/list_init.action")
	public String list(HttpSession session,String custName, String custSource, String custIndustry,
			String custLevel, Model model) {
		
		User user = (User) session.getAttribute("user");
		Customer customer=new Customer();
		List<Customer> customers;
		customer.setUserid(user.getUserid());
		customers = customerService.findCustomerList(customer);
		model.addAttribute("customers", customers);

		return "custom";
	}
	
	@RequestMapping("/getCustomerById.action")
	@ResponseBody
	public Customer getCustomerById(Integer id) {
		Customer customer = customerService.findBycusid(id);
		System.out.println(customer);
		return customer;
	}
	
	
	/**
	 * 更新客户
	 */
	@RequestMapping("/update.action")
	@ResponseBody
	public String customerUpdate(Customer customer) {
	    int rows = customerService.updateCustomer(customer);
	    if(rows > 0){
	        return "OK";
	    }else{
	        return "FAIL";
	    }
	}

	/**
	 * 删除客户
	 */
	@RequestMapping("/delete.action")
	@ResponseBody
	public String customerDelete(Integer cusid) {
	    int rows = customerService.deleteCustomer(cusid);
	    if(rows > 0){			
	        return "OK";
	    }else{
	        return "FAIL";			
	    }
	}
}
