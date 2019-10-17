package cn.itcast.dao;

import org.apache.ibatis.jdbc.SQL;

import cn.itcast.domain.Customer;

public class CustomerDaoProvider {
	public String findCustomerList(Customer customer) {
		return new SQL() {
			{
				SELECT("*");
				FROM("customer");
				if (customer.getUserid() != null) {
					WHERE("userid=#{userid}");
				}
				if (customer.getCussource() != null) {
					WHERE("cussource=#{cussource}");

				}
				if (customer.getCusindustry() != null) {
					WHERE("cusindustry=#{cusindustry}");

				}
				if (customer.getCuslevel() != null) {
					WHERE("cuslevel=#{cuslevel}");

				}
			}
		}.toString();
	}

	public String updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return new SQL() {
			{
				UPDATE("customer");

				if (customer.getCussource() != null) {
					SET("cussource=#{cussource}");
				}
				if (customer.getCusindustry() != null) {
					SET("cusindustry=#{cusindustry}");
				}
				if (customer.getCuslevel() != null) {
					SET("cuslevel=#{cuslevel}");
				}
				if (customer.getCusaddress() != null) {
					SET("cusaddress=#{cusaddress}");
				}
				if (customer.getCusname() != null) {
					SET("cusname=#{cusname}");
				}
				if (customer.getCusphone() != null) {
					SET("cusphone=#{cusphone}");
				}
				if (customer.getCusmoblie() != null) {
					SET("cusmoblie=#{cusmoblie}");
				}
				if (customer.getCuszipcode() != null) {
					SET("cuszipcode=#{cuszipcode}");
				}
				WHERE("cusid=#{cusid}");
			}
		}.toString();
	}
	public String createCustomer(Customer customer) {
		return new SQL() {
			{
				INSERT_INTO("customer");
				if (customer.getCussource() != null) {
					VALUES("cussource", "#{cussource}");
				}
				if (customer.getCusindustry() != null) {
					VALUES("cusindustry", "#{cusindustry}");		
				}
				if (customer.getCuslevel() != null) {
					VALUES("cuslevel", "#{cuslevel}");
					
				}
				if (customer.getCusaddress() != null) {
					VALUES("cusaddress", "#{cusaddress}");					
				}
				if (customer.getCusname() != null) {
					VALUES("cusname", "#{cusname}");
				}
				if (customer.getCusphone() != null) {
					VALUES("cusphone", "#{cusphone}");
				}
				if (customer.getCusmoblie() != null) {
					VALUES("cusmoblie", "#{cusmoblie}");
				}
				if (customer.getCuszipcode() != null) {
					VALUES("cuszipcode", "#{cuszipcode}");
				}
			}
		}.toString();
	}
}
