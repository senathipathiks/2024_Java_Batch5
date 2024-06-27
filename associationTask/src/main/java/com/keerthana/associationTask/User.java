package com.keerthana.associationTask;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Collection<Vehicle> vehicle=new ArrayList<>();
	
	@OneToMany(cascade=CascadeType.ALL)
	private Collection<Mobile> mobile=new ArrayList<>();
	
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;


	public User() {
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


	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}


	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}


	public Collection<Mobile> getMobile() {
		return mobile;
	}


	public void setMobile(Collection<Mobile> mobile) {
		this.mobile = mobile;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	

}
