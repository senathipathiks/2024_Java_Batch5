package com.keerthana.demo.Model;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	private String employeeName;
	private String designation;
	private String accountDetails;
	private int leaveDays;
	private int workingDays;
	
	
	@ManyToOne
	@JoinColumn(name="payroll_id")
	
	@Autowired
	private Payroll payroll;


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int employeeId, String employeeName, String designation, String accountDetails, int leaveDays,
			int workingDays, Payroll payroll) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.designation = designation;
		this.accountDetails = accountDetails;
		this.leaveDays = leaveDays;
		this.workingDays = workingDays;
		this.payroll = payroll;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getAccountDetails() {
		return accountDetails;
	}


	public void setAccountDetails(String accountDetails) {
		this.accountDetails = accountDetails;
	}


	public int getLeaveDays() {
		return leaveDays;
	}


	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}


	public int getWorkingDays() {
		return workingDays;
	}


	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}


	public Payroll getPayroll() {
		return payroll;
	}


	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}


	
	
	
	
}
