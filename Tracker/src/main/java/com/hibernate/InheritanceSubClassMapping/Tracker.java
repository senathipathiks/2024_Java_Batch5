package com.hibernate.InheritanceSubClassMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Table(name="TrackerJoins")
@Inheritance(strategy = InheritanceType.JOINED)
public class Tracker {
	
	@Id
	int empid;
	@Column(name="name")
	String empname;
	@Column(name="role")
	String role;
	public Tracker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tracker(int empid, String empname, String role) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.role = role;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}


