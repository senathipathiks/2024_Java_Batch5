package com.spring.OneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addrid;
	@Column(name = "city")
	private String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int addrid, String city) {
		super();
		this.addrid = addrid;
		this.city = city;
	}
	public int getAddrid() {
		return addrid;
	}
	public void setAddrid(int addrid) {
		this.addrid = addrid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
	
	
}
