package com.subash.HibernatePracticeProblemTable_Per_Concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Tracker1")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Tracker {
	@Id
	int EmpId;
	@Column(name="EName")
	String EmpName;
	@Column(name="EDesig")
	String Designation;
	public Tracker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tracker(int empId, String empName, String designation) {
		super();
		EmpId = empId;
		EmpName = empName;
		Designation = designation;
	}
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
	@Override
	public String toString() {
		return "Tracker [EmpId=" + EmpId + ", EmpName=" + EmpName + ", Designation=" + Designation + "]";
	}
	
	
}
