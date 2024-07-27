package com.SpringBoot.Eg6.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "details_tbl")
public class Car 
{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String brand;
	@Column
	private String model;
	@Column
	private String year;
	@Column
	private String colour;
	@Column
	private String price;
	
	public Car() 
	{
		super();
	}

	public Car(int id, String brand, String model, String year, String colour, String price) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.colour = colour;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", model=" + model + ", year=" + year + ", colour=" + colour
				+ ", price=" + price + "]";
	}
}
