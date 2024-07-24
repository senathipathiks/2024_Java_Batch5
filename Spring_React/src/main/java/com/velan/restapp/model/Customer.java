package com.velan.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Customer ID")
	private int cusid;
	@Column(name="Customer Name")
	private String cusname;
	@Column(name="Mobile Number")
	private long mobileno;
	@Column(name="Customer City")
	private String city;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int cusid, String cusname, long mobileno, String city) {
		super();
		this.cusid = cusid;
		this.cusname = cusname;
		this.mobileno = mobileno;
		this.city = city;
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

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [cusid=" + cusid + ", cusname=" + cusname + ", mobileno=" + mobileno + ", city=" + city + "]";
	}

}
