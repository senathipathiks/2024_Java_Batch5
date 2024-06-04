package com.gana.hibernateVehicleTask;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FourWheeler1")
public class FourWheeler extends Vehicle {
	
	int mileage;

	public FourWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FourWheeler(int vehicleid, String vehiclename, String model) {
		super(vehicleid, vehiclename, model);
		// TODO Auto-generated constructor stub
	}

	public FourWheeler(int vehicleid, String vehiclename, String model, int mileage) {
		super(vehicleid, vehiclename, model);
		this.mileage = mileage;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	

}
