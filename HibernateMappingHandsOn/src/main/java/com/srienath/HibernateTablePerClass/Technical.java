package com.srienath.HibernateTablePerClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Technical2")

public class Technical extends Tracker {
	
	int ttid;
	
	@Column(name="Tcname")
	String tcname;

	public Technical() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Technical(int empId, String empName, String designation) {
		super(empId, empName, designation);
		// TODO Auto-generated constructor stub
	}

	public Technical(int empId, String empName, String designation, int ttid, String tcname) {
		super(empId, empName, designation);
		this.ttid = ttid;
		this.tcname = tcname;
	}

	public int getTtid() {
		return ttid;
	}

	public void setTtid(int ttid) {
		this.ttid = ttid;
	}

	public String getTcname() {
		return tcname;
	}

	public void setTcname(String tcname) {
		this.tcname = tcname;
	}

	
	
}
