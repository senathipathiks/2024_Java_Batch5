package com.hibernate.Vehicle_Joined;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Four_Joined")
public class FourWheel extends Vehicle {
	String vname;
	int year;
	String fuel_type;
	
	public FourWheel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FourWheel(int vid, String owner_name, String fC_date) {
		super(vid, owner_name, fC_date);
		// TODO Auto-generated constructor stub
	}
	
	public FourWheel(int vid, String owner_name, String fC_date, String vname, int year, String fuel_type) {
		super(vid, owner_name, fC_date);
		this.vname = vname;
		this.year = year;
		this.fuel_type = fuel_type;
	}
	/**
	 * @return the vname
	 */
	public String getVname() {
		return vname;
	}
	/**
	 * @param vname the vname to set
	 */
	public void setVname(String vname) {
		this.vname = vname;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the fuel_type
	 */
	public String getFuel_type() {
		return fuel_type;
	}
	/**
	 * @param fuel_type the fuel_type to set
	 */
	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}
	@Override
	public String toString() {
		return "FourWheel [vname=" + vname + ", year=" + year + ", fuel_type=" + fuel_type + "]";
	}
	

}
