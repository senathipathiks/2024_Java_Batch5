package com.gana.backend.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToOne;

import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int empid;
	@Column
	private String empname;
	@Column
	private String empdesignation;
	@Column
	private String empcity;
	@Column
	private String emprole;
//	@PrimaryKeyJoinColumn
	
	@OneToOne(targetEntity = PayRoll.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "PayRoll")
	private PayRoll payroll;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empname, String empdesignation, String empcity, String emprole, PayRoll payroll) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdesignation = empdesignation;
		this.empcity = empcity;
		this.emprole = emprole;
		this.payroll = payroll;
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
	public String getEmpdesignation() {
		return empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}
	public String getEmpcity() {
		return empcity;
	}
	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}
	public String getEmprole() {
		return emprole;
	}
	public void setEmprole(String emprole) {
		this.emprole = emprole;
	}
	public PayRoll getPayroll() {
		return payroll;
	}
	public void setPayroll(PayRoll payroll) {
		this.payroll = payroll;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empdesignation=" + empdesignation + ", empcity="
				+ empcity + ", emprole=" + emprole + ", payroll=" + payroll + "]";
	}
	
	

}
