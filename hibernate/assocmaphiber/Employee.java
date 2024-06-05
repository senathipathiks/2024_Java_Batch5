package com.ani.assocmaphiber;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee101")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToOne(targetEntity=Laptop.class,cascade=CascadeType.ALL)
	private Laptop Laptop;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, com.ani.assocmaphiber.Laptop laptop) {
		super();
		this.id = id;
		this.name = name;
		Laptop = laptop;
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
	public Laptop getLaptop() {
		return Laptop;
	}
	public void setLaptop(Laptop laptop) {
		Laptop = laptop;
	}
	

}
