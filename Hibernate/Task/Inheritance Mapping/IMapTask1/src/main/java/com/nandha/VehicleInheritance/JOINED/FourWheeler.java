package com.nandha.VehicleInheritance.JOINED;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "fourwheelerjoined")
public class FourWheeler extends Vehicle {
	
	String Mileage;
	String VehicleType;
	String transmissionType;
	public FourWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FourWheeler(int vehicleId, String vehicleBrandName, String model, String year) {
		super(vehicleId, vehicleBrandName, model, year);
		// TODO Auto-generated constructor stub
	}
	public FourWheeler(int vehicleId, String vehicleBrandName, String model, String year, String mileage,
			String vehicleType, String transmissionType) {
		super(vehicleId, vehicleBrandName, model, year);
		Mileage = mileage;
		VehicleType = vehicleType;
		this.transmissionType = transmissionType;
	}
	public String getMileage() {
		return Mileage;
	}
	public void setMileage(String mileage) {
		Mileage = mileage;
	}
	public String getVehicleType() {
		return VehicleType;
	}
	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}
	public String getTransmissionType() {
		return transmissionType;
	}
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
	
	
	
}
