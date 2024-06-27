package com.keerthana.associationTask;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Address {
	
@Id
@GeneratedValue()
private int aid;
private String street;
private String city;

@OneToOne(mappedBy="address")
private User user;

public Address() {
	super();
	// TODO Auto-generated constructor stub
}

public Address(int aid, String street, String city, User user) {
	super();
	this.aid = aid;
	this.street = street;
	this.city = city;
	this.user = user;
}

public int getAid() {
	return aid;
}

public void setAid(int aid) {
	this.aid = aid;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}


}
