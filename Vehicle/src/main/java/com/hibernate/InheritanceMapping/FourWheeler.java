package com.hibernate.InheritanceMapping;

import javax.persistence.Entity;

@Entity
public class FourWheeler extends Vehicle {

	
	int Mileage;
	String vehicleType;
	String transmissionType;
	public FourWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FourWheeler(int vehicleId, String vname, String model) {
		super(vehicleId, vname, model);
		// TODO Auto-generated constructor stub
	}
	public FourWheeler(int vehicleId, String vname, String model, int mileage, String vehicleType,
			String transmissionType) {
		super(vehicleId, vname, model);
		Mileage = mileage;
		this.vehicleType = vehicleType;
		this.transmissionType = transmissionType;
	}
	public int getMileage() {
		return Mileage;
	}
	public void setMileage(int mileage) {
		Mileage = mileage;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getTransmissionType() {
		return transmissionType;
	}
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
	
	
	
	
	
	
}
