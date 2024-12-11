package com.spring.ManyToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.mysql.cj.x.protobuf.MysqlxCrud.Projection;


@Entity
@Table(name = "Employee")
public class Employee {
	
	@Id
	@Column(name = "EmpId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Empname")
	private String name;
	
	
	@ManyToMany(targetEntity = Project.class, cascade = CascadeType.ALL,mappedBy = "employee")
	private List<Project> project;
 
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Employee(int id, String name, List<Project> project) {
		super();
		this.id = id;
		this.name = name;
		this.project = project;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProjects() {
		return project;
	}

	public void setProjects(List<Project> project) {
		this.project = project;
	}
	
	
	
	
 
	
}