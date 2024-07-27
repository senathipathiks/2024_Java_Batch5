package Hibernate.HibernateEg8_3;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "twowheeler2")
public class Twowheeler extends Vehicle 
{
	int year;
	String brand;
	String model;
	
	public Twowheeler() 
	{
		super();
	}
	
	public Twowheeler(int vehicleid, String ownername, String rto) 
	{
		super(vehicleid, ownername, rto);
	}
	
	public Twowheeler(int vehicleid, String ownername, String rto, int year, String brand, String model) {
		super(vehicleid, ownername, rto);
		this.year = year;
		this.brand = brand;
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	
	
	
}
