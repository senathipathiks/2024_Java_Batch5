package com.subash.AssociationMappingMTM.copy;

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
@Table(name = "project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Pname;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	List<Employee2> employee = new ArrayList<>();

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int id, String pname, List<Employee2> employee) {
		super();
		this.id = id;
		Pname = pname;
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public List<Employee2> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee2> employee) {
		this.employee = employee;
	}
	
	
	
	
	
}
