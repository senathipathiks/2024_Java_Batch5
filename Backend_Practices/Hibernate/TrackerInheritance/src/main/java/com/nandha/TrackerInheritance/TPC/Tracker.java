package com.nandha.TrackerInheritance.TPC;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name="tracker_tpc")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Tracker {
	
	@Id
	int empid;
	@Column(name="empName")
	String empname;
	@Column(name="empRole")
	String emprole;
	
	
	public Tracker() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Tracker(int empid, String empname, String emprole) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.emprole = emprole;
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
	public String getEmprole() {
		return emprole;
	}
	public void setEmprole(String emprole) {
		this.emprole = emprole;
	}
	@Override
	public String toString() {
		return "Tracker [empid=" + empid + ", empname=" + empname + ", emprole=" + emprole + "]";
	}

	
}



