package com.gopi.vehicleInheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Vehicle2Joined")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicle {
	
	@Id
	int vehicleId;
	@Column
	int price;
	@Column
	String owner;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int vehicleId, int price, String owner) {
		super();
		this.vehicleId = vehicleId;
		this.price = price;
		this.owner = owner;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}
