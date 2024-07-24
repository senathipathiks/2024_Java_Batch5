package com.supraja.HiberAssociationTask;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address 
{
	@Id
	@GeneratedValue
   private int id;
   private String city;
   
   @OneToOne(mappedBy="address")
	private User user;
public Address(int id, String city) {
	super();
	this.id = id;
	this.city = city;
}
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
   
   
}
