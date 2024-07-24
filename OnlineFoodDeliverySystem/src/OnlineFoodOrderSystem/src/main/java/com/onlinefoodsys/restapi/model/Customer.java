package com.onlinefoodsys.restapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Customer_tbl")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Customer_ID")
	private int cid;
	
	@Column(name = "UserName")
	private String uname;	
	
	@Column(name = "Address")
	private String addr;
	
	
	
	@Column (name = "Mobile")
	private long cmobile;
	
	@Column(name = "Payment_Type")
	private String pt;
	
	@Column(name = "Bill_Amount")
	private int bill;

	public Customer() {
		super();
		
	}

	public Customer(int cid, String uname, String addr, long cmobile, String pt, int bill) {
		super();
		this.cid = cid;
		this.uname = uname;
		this.addr = addr;
		this.cmobile = cmobile;
		this.pt = pt;
		this.bill = bill;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public long getCmobile() {
		return cmobile;
	}

	public void setCmobile(long cmobile) {
		this.cmobile = cmobile;
	}

	public String getPt() {
		return pt;
	}

	public void setPt(String pt) {
		this.pt = pt;
	}

	public int getBill() {
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", uname=" + uname + ", addr=" + addr + ", cmobile=" + cmobile + ", pt=" + pt
				+ ", bill=" + bill + "]";
	}


	
	
}
