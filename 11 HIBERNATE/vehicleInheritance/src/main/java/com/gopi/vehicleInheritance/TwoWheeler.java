package com.gopi.vehicleInheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TwoWheeler1Subclass")
public class TwoWheeler extends Vehicle {

	int millage_2;
	String model_2;

	
	public TwoWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TwoWheeler(int vehicleId, int price, String owner) {
		super(vehicleId, price, owner);
		// TODO Auto-generated constructor stub
	}
	public TwoWheeler(int vehicleId, int price, String owner, int millage_2, String model_2) {
		super(vehicleId, price, owner);
		this.millage_2 = millage_2;
		this.model_2 = model_2;
	}
	public int getmillage_2() {
		return millage_2;
	}
	public void setmillage_2(int millage_2) {
		this.millage_2 = millage_2;
	}
	public String getmodel_2() {
		return model_2;
	}
	public void setmodel_2(String model_2) {
		this.model_2 = model_2;
	}
	
	
}
