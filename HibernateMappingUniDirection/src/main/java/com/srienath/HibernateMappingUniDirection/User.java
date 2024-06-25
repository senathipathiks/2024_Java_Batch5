package com.srienath.HibernateMappingUniDirection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User_Details")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@OneToOne(targetEntity = Address.class,cascade = CascadeType.ALL)
	private Address address;
	
	@OneToMany(targetEntity = Mobile.class,cascade = CascadeType.ALL)
	@JoinColumn // this line for avoid the third mapping table creation for user,mobile
	private List<Mobile> mobile = new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "user")
	private List<Vehicle> vehicle;
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	



	public User(int id, String name, Address address, List<Mobile> mobile, List<Vehicle> vehicle) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.vehicle = vehicle;
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

	public List<Vehicle> getVehicle() {
		return vehicle;
	}







	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	
	
	
}
