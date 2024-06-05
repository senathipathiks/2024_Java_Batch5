package com.hibernate.onetomany;

 import java.util.List;

import javax.persistence.*;

 @Entity
 @Table(name="employeeOMG")
public class Employee {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
	 private String name;
	 
	 
	
	 @OneToMany(targetEntity = Address.class,cascade=CascadeType.ALL)
	 @JoinColumn(name="emp_id") //use this @joincolumn when 3 tables are created
	 private List<Address> address;
	 
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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
	public void setAddress(List<Address> list) {
		// TODO Auto-generated method stub
		
	}
	public Employee(int id, String name, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	 
	
	

}
