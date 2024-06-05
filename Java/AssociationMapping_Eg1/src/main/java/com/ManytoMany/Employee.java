package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "emplist")
	private List<Project> plist;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String name, List<Project> plist) {
		super();
		this.empid = empid;
		this.name = name;
		this.plist = plist;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", plist=" + plist + "]";
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getPlist() {
		return plist;
	}

	public void setPlist(List<Project> plist) {
		this.plist = plist;
	}

}
