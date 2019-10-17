package cn.itcast.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
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
	public String list(HttpSession session, String cusname, String cussource, String cusindustry, String cuslevel,
			Model model) {

		User user = (User) session.getAttribute("user");
		Customer customer = new Customer();
		List<Customer> customers;
		customer.setUserid(user.getUserid());
		customer.setCusname(cusname);
		customer.setCussource(cussource);
		customer.setCusindustry(cusindustry);
		customer.setCuslevel(cuslevel);
		customers = customerService.findCustomerList(customer);

		model.addAttribute("customers", customers);
		// 添加参数
		// Industry选择栏
		model.addAttribute("cuslevel", cuslevel);
		model.addAttribute("cusname", cusname);
		model.addAttribute("cussource", cussource);
		model.addAttribute("cusindustry", cusindustry);
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
		if (rows > 0) {
			return "OK";
		} else {
			return "FAIL";
		}
	}

	/**
	 * 删除客户
	 */
	@RequestMapping("/delete.action")
	@ResponseBody
	public String customerDelete(Integer id) {
		int rows = customerService.deleteCustomer(id);
		if (rows > 0) {
			return "OK";
		} else {
			return "FAIL";
		}
	}

	/**
	 * 创建客户
	 */
	@RequestMapping("/create.action")
	@ResponseBody
	public String customerCreate(Customer customer,HttpServletRequest request, HttpSession session) {
		//Customer customer=new Customer(request); 
		System.out.println(customer);
		// 获取Session中的当前用户信息
		User user = (User) session.getAttribute("user");
		// 将当前用户id存储在客户对象中
		customer.setUserid(user.getUserid());
		// 创建Date对象
		Date date = new Date();
		// 得到一个Timestamp格式的时间，存入mysql中的时间格式“yyyy/MM/dd HH:mm:ss”
		Timestamp timeStamp = new Timestamp(date.getTime());

		customer.setCuscreatetime(timeStamp);
		// 执行Service层中的创建方法，返回的是受影响的行数
		int rows = customerService.createCustomer(customer);
		if (rows > 0) {
			return "OK";
		} else {
			return "FAIL";
		}
	}

}
