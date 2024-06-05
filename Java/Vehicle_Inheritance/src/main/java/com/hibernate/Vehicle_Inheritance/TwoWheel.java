package com.hibernate.Vehicle_Inheritance;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
public class TwoWheel extends Vehicle {
	String vname;
	int year;
	String fuel_type;
	
	public TwoWheel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TwoWheel(int vid, String owner_name, String fC_date) {
		super(vid, owner_name, fC_date);
		// TODO Auto-generated constructor stub
	}
	public TwoWheel(int vid, String owner_name, String fC_date, String vname, int year, String fuel_type) {
		super(vid, owner_name, fC_date);
		this.vname = vname;
		this.year = year;
		this.fuel_type = fuel_type;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getFuel_type() {
		return fuel_type;
	}
	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}
	@Override
	public String toString() {
		return "TwoWheel [vname=" + vname + ", year=" + year + ", fuel_type=" + fuel_type + "]";
	}
	
}
