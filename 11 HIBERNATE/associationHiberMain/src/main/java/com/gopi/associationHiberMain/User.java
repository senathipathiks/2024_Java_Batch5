package com.gopi.associationHiberMain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


public class User {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int id;
	private String userName;
	
	@ManyToMany(targetEntity = Vehicle.class,cascade = CascadeType.ALL)
	@JoinTable(name="usr_vehicle",joinColumns=@JoinColumn(name="user_id"),inverseJoinColumns=@JoinColumn(name="vehicle_id") )
	private List<Vehicle> vehicle;
	
	@OneToOne(targetEntity = Address.class,cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;
	
	@OneToMany(targetEntity = Mobile.class,cascade = CascadeType.ALL)
	@JoinTable(name="user_mobile_mapping",joinColumns=@JoinColumn(name="user_id"),inverseJoinColumns=@JoinColumn(name="mobile_id"))
	private List<Mobile> mobile;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String userName, List<Vehicle> vehicle, Address address, List<Mobile> mobile) {
		super();
		this.id = id;
		this.userName = userName;
		this.vehicle = vehicle;
		this.address = address;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Mobile> getMobile() {
		return mobile;
	}

	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}
	
	
}
