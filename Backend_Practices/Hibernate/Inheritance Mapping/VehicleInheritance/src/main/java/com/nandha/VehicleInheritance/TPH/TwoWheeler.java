package com.nandha.VehicleInheritance.TPH;

import jakarta.persistence.Entity;

@Entity

public class TwoWheeler extends Vehicle {
	
	String VehicleType;
	String Mileage;
	public TwoWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TwoWheeler(int vehicleId, String vehicleBrandName, String model, String year) {
		super(vehicleId, vehicleBrandName, model, year);
		// TODO Auto-generated constructor stub
	}
	public TwoWheeler(int vehicleId, String vehicleBrandName, String model, String year, String vehicleType,
			String mileage) {
		super(vehicleId, vehicleBrandName, model, year);
		VehicleType = vehicleType;
		Mileage = mileage;
	}
	public String getVehicleType() {
		return VehicleType;
	}
	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}
	public String getMileage() {
		return Mileage;
	}
	public void setMileage(String mileage) {
		Mileage = mileage;
	}
	
	
	

}
