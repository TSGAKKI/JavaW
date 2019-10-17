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

}
