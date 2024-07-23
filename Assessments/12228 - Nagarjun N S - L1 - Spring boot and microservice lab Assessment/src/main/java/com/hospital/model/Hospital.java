package com.hospital.model;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@CrossOrigin("*")
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Hospital_ID")
	private int hid;
	@Column(name = "Hospital_Name")
	private String hname;
	@Column(name = "City")
	private String hcity;
	@Column(name = "Rating")
	private int hrating;
	
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Hospital(int hid, String hname, String hcity, int hrating) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.hcity = hcity;
		this.hrating = hrating;
	}
	
	@Override
	public String toString() {
		return "Hospital [hid=" + hid + ", hname=" + hname + ", hcity=" + hcity + ", hrating=" + hrating + "]";
	}
	
	public int getHid() {
		return hid;
	}
	
	public void setHid(int hid) {
		this.hid = hid;
	}
	
	public String getHname() {
		return hname;
	}
	
	public void setHname(String hname) {
		this.hname = hname;
	}
	
	public String getHcity() {
		return hcity;
	}
	
	public void setHcity(String hcity) {
		this.hcity = hcity;
	}
	
	public int getHrating() {
		return hrating;
	}
	
	public void setHrating(int hrating) {
		this.hrating = hrating;
	}
	
}