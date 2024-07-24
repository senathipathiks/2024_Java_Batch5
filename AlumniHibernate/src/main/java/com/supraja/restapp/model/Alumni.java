package com.supraja.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aluu")
public class Alumni {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int aid;
	@Column
	private String aname;
	@Column
	private String dept;
	@Column
	private String passedoutyear;
	@Column
	private String currentstatus;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPassedoutyear() {
		return passedoutyear;
	}

	public void setPassedoutyear(String passedoutyear) {
		this.passedoutyear = passedoutyear;
	}

	public String getCurrentstatus() {
		return currentstatus;
	}

	public void setCurrentstatus(String currentstatus) {
		this.currentstatus = currentstatus;
	}

	public Alumni(int aid, String aname, String dept, String passedoutyear, String currentstatus) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.dept = dept;
		this.passedoutyear = passedoutyear;
		this.currentstatus = currentstatus;
	}

	public Alumni() {
		super();
		// TODO Auto-generated constructor stub
	}

}