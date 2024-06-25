package com.srienath.HibernateTablePerClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Tracker3")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Tracker {
	@Id
	int EmpId;
	@Column(name="EmpName")
	String EmpName;
	@Column(name="Designation")
	String Designation;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public Tracker(int empId, String empName, String designation) {
		super();
		EmpId = empId;
		EmpName = empName;
		Designation = designation;
	}
	public Tracker() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
