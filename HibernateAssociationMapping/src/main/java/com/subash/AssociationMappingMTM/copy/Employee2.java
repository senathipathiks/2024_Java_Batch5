package com.subash.AssociationMappingMTM.copy;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.subash.AssociationMappingOTO.Laptop;

@Entity
@Table(name = "Employee2")
public class Employee2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "employee")
	private List<Project> project;
	
//	@OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL)
//	@JoinColumn 
//	private List<Address> address;
	
	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee2(int id, String name, List<Project> project) {
		super();
		this.id = id;
		this.name = name;
		this.project = project;
	}






	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
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





	

}
