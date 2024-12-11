package com.hibernate.InheritanceMapping;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class TwoWheeler extends Vehicle {

	String type;
	int mileage;
	public TwoWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TwoWheeler(int vehicleId, String vname, String model) {
		super(vehicleId, vname, model);
		// TODO Auto-generated constructor stub
	}
	public TwoWheeler(int vehicleId, String vname, String model, String type, int mileage) {
		super(vehicleId, vname, model);
		this.type = type;
		this.mileage = mileage;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	

	
	
}
