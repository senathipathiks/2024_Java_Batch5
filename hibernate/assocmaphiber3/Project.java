package com.ani.assocmaphiber3;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="Project100")
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	private String name;
	@ManyToMany(cascade= CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Employee> employee = new ArrayList<Employee>();
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int pid, String name, List<Employee> employee) {
		super();
		this.pid = pid;
		this.name = name;
		this.employee = employee;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	

}
