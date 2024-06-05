package com.spring.OneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Employee")
public class Employee {
	
	@Id
	@Column(name = "EmpId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Empname")
	private String name;
	
	
	@OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL)
	@JoinColumn
	private List<Address> address;
 
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Employee(int id, String name, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	
	
	
 
	
}