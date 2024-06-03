package com.aravind.HibernateMenuDriven;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	private int eid;
	
	@Column
	private String ename;
	
	@Column
	private String dep;
	
	
	@Column
	private String sal;


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int eid, String ename, String dep, String sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dep = dep;
		this.sal = sal;
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


	public String getDep() {
		return dep;
	}


	public void setDep(String dep) {
		this.dep = dep;
	}


	public String getSal() {
		return sal;
	}


	public void setSal(String sal) {
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dep=" + dep + ", sal=" + sal + "]";
	}
	
	
	
	
	
	

}
