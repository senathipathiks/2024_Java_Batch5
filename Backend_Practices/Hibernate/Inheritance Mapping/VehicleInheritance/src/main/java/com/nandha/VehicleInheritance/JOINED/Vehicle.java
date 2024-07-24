package com.nandha.VehicleInheritance.JOINED;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name="vehiclejoined")
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicle {
	
	@Id
	int vehicleId;
	
	@Column
	String vehicleBrandName;
	
	@Column(name = "vehicleModel")
	String Model;
	
	@Column(name = "vehicleYear")
	String Year;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int vehicleId, String vehicleBrandName, String model, String year) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleBrandName = vehicleBrandName;
		Model = model;
		Year = year;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleBrandName() {
		return vehicleBrandName;
	}
	public void setVehicleBrandName(String vehicleBrandName) {
		this.vehicleBrandName = vehicleBrandName;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleBrandName=" + vehicleBrandName + ", Model=" + Model
				+ ", Year=" + Year + "]";
	}
	
	
	

}
