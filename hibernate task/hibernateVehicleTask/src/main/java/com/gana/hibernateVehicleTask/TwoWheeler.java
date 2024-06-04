package com.gana.hibernateVehicleTask;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TwoWheeler1")
public class TwoWheeler extends Vehicle {
	
	int mileage;

	public TwoWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TwoWheeler(int vehicleid, String vehiclename, String model) {
		super(vehicleid, vehiclename, model);
		// TODO Auto-generated constructor stub
	}

	public TwoWheeler(int vehicleid, String vehiclename, String model, int mileage) {
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
