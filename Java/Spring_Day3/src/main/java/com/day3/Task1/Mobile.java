package com.day3.Task1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Value("Xiaomi")
	String brand;
	@Value("Note 5 Pro")
	String model;
	
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", model=" + model + "]";
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
