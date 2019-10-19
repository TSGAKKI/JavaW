package cn.itcast.domain;

import java.io.Serializable;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer cusid = null;
	private String cusname = null;
	private Integer userid = null;
	// 用户信息来源
	private String cussource = null;
	// 客户所属行业
	private String cusindustry = null;

	private String cuslevel = null;

	private String cusphone = null;
	private String cusmoblie = null;

	// 邮政编码
	private String cuszipcode = null;
	// 客户地址
	private String cusaddress = null;
	// 创建时间
	private Date cuscreatetime = null;

	public Customer(HttpServletRequest request) {
		// TODO Auto-generated constructor stub
		
		this.cusaddress = (String) request.getAttribute("cusaddress");
		this.cusindustry = (String) request.getAttribute("cusindustry");
		this.cuslevel = (String) request.getAttribute("cuslevel");
		this.cusmoblie = (String) request.getAttribute("cusmoblie");
		this.cusname = (String) request.getAttribute("cusname");
		this.cussource = (String) request.getAttribute("cussource");
		this.cuszipcode = (String) request.getAttribute("cuszipcode");
		this.cusphone = (String) request.getAttribute("cusphone");
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [cusid=" + cusid + ", cusname=" + cusname + ", userid=" + userid + ", cussource=" + cussource
				+ ", cusindustry=" + cusindustry + ", cuslevel=" + cuslevel + ", cusphone=" + cusphone + ", cusmoblie="
				+ cusmoblie + ", cuszipcode=" + cuszipcode + ", cusaddress=" + cusaddress + ", cuscreatetime="
				+ cuscreatetime + "]";
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public void setCusid(Integer cusid) {
		this.cusid = cusid;
	}

	public Integer getCusid() {
		return cusid;
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
