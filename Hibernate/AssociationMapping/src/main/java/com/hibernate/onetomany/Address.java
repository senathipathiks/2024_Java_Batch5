package com.hibernate.onetomany;

import javax.persistence.*;

@Entity

@Table(name="AddressOMG")
public class Address {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int id;
	private String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(int id, String city) {
		super();
		this.id = id;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + "]";
	}
	
	

}
