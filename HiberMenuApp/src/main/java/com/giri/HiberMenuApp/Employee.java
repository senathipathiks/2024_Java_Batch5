package com.giri.HiberMenuApp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_tbl")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	@Column(name="employeeName")
	private String ename;
	@Column(name="employeeCity")
	private String ecity;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, String ecity) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ecity = ecity;
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
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", ecity=" + ecity + "]";
	}

}
