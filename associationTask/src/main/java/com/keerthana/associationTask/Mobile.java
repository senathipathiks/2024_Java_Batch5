package com.keerthana.associationTask;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Mobile {
 
	@Id
	@GeneratedValue
	private int mid;
	private String brand;
	private String model;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(int mid, String brand, String model, User user) {
		super();
		this.mid = mid;
		this.brand = brand;
		this.model = model;
		this.user = user;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
