package com.gopi.hibernew;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emphiberano")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto id generation (no need to give the id in insertion)
	@Column
	private int eid;
	@Column
	private String name;
	@Column
	private String city;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee( String name, String city) {
		super();
//		this.eid = eid;
		this.name = name;
		this.city = city;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
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
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", city=" + city + "]";
	}
	
	
}
