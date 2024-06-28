package com.emproll.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Emp_tbl")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Emp_ID")
	private int eid;
	@Column(name = "Emp_Name")
	private String ename;
	@Column(name = "Department")
	private String edept;
	
	@OneToOne(cascade = CascadeType.ALL,targetEntity = Payroll.class)
	private Payroll payroll;
	
	public Employee() {
		super();
	}

	public Employee(int eid, String ename, String edept, Payroll payroll) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edept = edept;
		this.payroll = payroll;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edept=" + edept + ", payroll=" + payroll + "]";
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEdept() {
		return edept;
	}

	public void setEdept(String edept) {
		this.edept = edept;
	}

	public Payroll getPayroll() {
		return payroll;
	}

	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}

}
