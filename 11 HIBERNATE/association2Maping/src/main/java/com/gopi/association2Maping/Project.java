package com.gopi.association2Maping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name="Project111")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	@Column	
	private String pname;
	
	@ManyToMany(targetEntity = Employee.class,cascade = CascadeType.ALL)
	private java.util.List<Employee> employee;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pid, String pname, List<Employee> employee) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.employee = employee;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public java.util.List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(java.util.List<Employee> employee) {
		this.employee = employee;
	}
	
	
}
