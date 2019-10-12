package cn.itcast.domain;

import java.sql.Date;

public class Customer {
	private int cusid;
	private String cusname;
	private int userid;
	// 用户信息来源
	private String cussource;
	// 客户所属行业
	private String cusindustry;

	private String cuslevel;

	private String cusphone;
	private String cusmoblie;

	// 邮政编码
	private String cuszipcode;
	// 客户地址
	private String cusaddress;
	// 创建时间
	private Date cuscreatetime;

	
	@Override
	public String toString() {
		return "Customer [cusid=" + cusid + ", cusname=" + cusname + ", userid=" + userid + ", cussource=" + cussource
				+ ", cusindustry=" + cusindustry + ", cuslevel=" + cuslevel + ", cusphone=" + cusphone + ", cusmoblie="
				+ cusmoblie + ", cuszipcode=" + cuszipcode + ", cusaddress=" + cusaddress + ", cuscreatetime="
				+ cuscreatetime + "]";
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getCusid() {
		return cusid;
	}

	public void setCusid(int cusid) {
		this.cusid = cusid;
	}

	public String getCusname() {
		return cusname;
	}

	public void setCusname(String cusname) {
		this.cusname = cusname;
	}

	public String getCussource() {
		return cussource;
	}

	public void setCussource(String cussource) {
		this.cussource = cussource;
	}

	public String getCusindustry() {
		return cusindustry;
	}

	public void setCusindustry(String cusindustry) {
		this.cusindustry = cusindustry;
	}

	public String getCuslevel() {
		return cuslevel;
	}

	public void setCuslevel(String cuslevel) {
		this.cuslevel = cuslevel;
	}

	public String getCusphone() {
		return cusphone;
	}

	public void setCusphone(String cusphone) {
		this.cusphone = cusphone;
	}

	public String getCusmoblie() {
		return cusmoblie;
	}

	public void setCusmoblie(String cusmoblie) {
		this.cusmoblie = cusmoblie;
	}

	public String getCuszipcode() {
		return cuszipcode;
	}

	public void setCuszipcode(String cuszipcode) {
		this.cuszipcode = cuszipcode;
	}

	public String getCusaddress() {
		return cusaddress;
	}

	public void setCusaddress(String cusaddress) {
		this.cusaddress = cusaddress;
	}

	public Date getCuscreatetime() {
		return cuscreatetime;
	}

	public void setCuscreatetime(Date cuscreatetime) {
		this.cuscreatetime = cuscreatetime;
	}

}
