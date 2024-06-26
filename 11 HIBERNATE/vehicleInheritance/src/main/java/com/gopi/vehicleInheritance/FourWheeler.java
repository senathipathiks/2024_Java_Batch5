package com.gopi.vehicleInheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="FourWheeler1Subclass")
public class FourWheeler extends Vehicle {
	
	int millage_4;
	String model_4;
	public FourWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FourWheeler(int vehicleId, int price, String owner) {
		super(vehicleId, price, owner);
		// TODO Auto-generated constructor stub
	}
	public FourWheeler(int vehicleId, int price, String owner, int millage_4, String model_4) {
		super(vehicleId, price, owner);
		this.millage_4 = millage_4;
		this.model_4 = model_4;
	}
	public int getMillage_4() {
		return millage_4;
	}
	public void setMillage_4(int millage_4) {
		this.millage_4 = millage_4;
	}
	public String getModel_4() {
		return model_4;
	}
	public void setModel_4(String model_4) {
		this.model_4 = model_4;
	}
	
	
}
