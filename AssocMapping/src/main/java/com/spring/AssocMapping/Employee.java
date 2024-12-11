package com.spring.AssocMapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee101")
public class Employee {
	
	@Id
	@Column(name = "empId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
	
	@OneToOne(targetEntity = Laptop.class, cascade = CascadeType.ALL)
	private Laptop laptop;
 
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	public Employee(int id, String name, String city, Laptop laptop) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.laptop = laptop;
	}
 
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", laptop=" + laptop + "]";
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
 
	public String getCity() {
		return city;
	}
 
	public void setCity(String city) {
		this.city = city;
	}
 
	public Laptop getLaptop() {
		return laptop;
	}
 
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
}