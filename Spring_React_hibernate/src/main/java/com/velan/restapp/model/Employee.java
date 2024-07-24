package com.velan.restapp.model;


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
@Table(name = "emphiber")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Emp ID")
	private int eid;
	@Column(name="Emp Name")
	private String ename;
	@Column(name="Emp Desig")
	private String desig;
	@Column(name="Emp Dept")
	private String dept;
	
	
	@OneToOne(targetEntity = Payroll.class  , cascade = CascadeType.ALL)
	@JoinColumn(name="pid")
	private Payroll payroll;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, String desig, String dept, Payroll payroll) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.desig = desig;
		this.dept = dept;
		this.payroll = payroll;
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


	public String getDesig() {
		return desig;
	}


	public void setDesig(String desig) {
		this.desig = desig;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public Payroll getPayroll() {
		return payroll;
	}


	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", desig=" + desig + ", dept=" + dept + ", payroll="
				+ payroll + "]";
	}

}
