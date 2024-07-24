package com.vickee.restapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "mshop")
public class MobileShop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mid;
	private String sname;
	private String sowner;
	private String location;
	private long mobile;
	
	
	@OneToOne(cascade = CascadeType.MERGE)
	private RepairRequest repair;


	public MobileShop() {
		super();
	}


	public MobileShop(int mid, String sname, String sowner, String location, long mobile, RepairRequest repair) {
		super();
		this.mid = mid;
		this.sname = sname;
		this.sowner = sowner;
		this.location = location;
		this.mobile = mobile;
		this.repair = repair;
	}


	public int getMid() {
		return mid;
	}


	public void setMid(int mid) {
		this.mid = mid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getSowner() {
		return sowner;
	}


	public void setSowner(String sowner) {
		this.sowner = sowner;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public long getMobile() {
		return mobile;
	}


	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


	public RepairRequest getRepair() {
		return repair;
	}


	public void setRepair(RepairRequest repair) {
		this.repair = repair;
	}
	
	
	
}
