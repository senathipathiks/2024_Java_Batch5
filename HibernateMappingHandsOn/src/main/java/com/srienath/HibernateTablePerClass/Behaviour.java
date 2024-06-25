package com.srienath.HibernateTablePerClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Behaviour2")

public class Behaviour extends Tracker {
	
	int btid;
	
	String btname;
	public Behaviour() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Behaviour(int empId, String empName, String designation) {
		super(empId, empName, designation);
		// TODO Auto-generated constructor stub
	}
	public Behaviour(int empId, String empName, String designation, int btid, String btname) {
		super(empId, empName, designation);
		this.btid = btid;
		this.btname = btname;
	}
	public int getBtid() {
		return btid;
	}
	public void setBtid(int btid) {
		this.btid = btid;
	}
	public String getBtname() {
		return btname;
	}
	public void setBtname(String btname) {
		this.btname = btname;
	}
	
	
	
}
