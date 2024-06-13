package com.gopi.associationMapping;

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

import antlr.collections.List;

@Entity
@Table(name="Employee102")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	
	@OneToMany(targetEntity = Address.class,cascade = CascadeType.ALL)
	@JoinColumn(name="empID")
	private java.util.List<Address> address;
	
//	@OneToOne(targetEntity = Laptop.class,cascade = CascadeType.ALL)
//	private Laptop laptop;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

public Employee(int id, String name, java.util.List<Address> address) {
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

public java.util.List<Address> getAddress() {
	return address;
}

public void setAddress(java.util.List<Address> address) {
	this.address = address;
}

}
