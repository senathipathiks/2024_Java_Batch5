package com.gopi.associationHiberMain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Vehicle {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String vehicheName;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int id, String vehicheName) {
		super();
		this.id = id;
		this.vehicheName = vehicheName;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVehicheName() {
		return vehicheName;
	}

	public void setVehicheName(String vehicheName) {
		this.vehicheName = vehicheName;
	}

	
}
