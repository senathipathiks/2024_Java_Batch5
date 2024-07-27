package com.day4.Laptop_Specs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Value("2191")
	int Lap_id;
	@Value("HP")
	String Lap_name;
	@Value("Z Book")
	String Lap_Model;
	
	@Autowired
	private Specs specs;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int lap_id, String lap_name, String lap_Model, Specs specs) {
		super();
		Lap_id = lap_id;
		Lap_name = lap_name;
		Lap_Model = lap_Model;
		this.specs = specs;
	}

	public void display() {
		System.out.println("Laptop ID: "+Lap_id);
		System.out.println("Laptop Name: "+Lap_name);
		System.out.println("Laptop Model: "+Lap_Model);
		System.out.println();
		specs.display();
	}

	public int getLap_id() {
		return Lap_id;
	}

	public void setLap_id(int lap_id) {
		Lap_id = lap_id;
	}

	public String getLap_name() {
		return Lap_name;
	}

	public void setLap_name(String lap_name) {
		Lap_name = lap_name;
	}

	public String getLap_Model() {
		return Lap_Model;
	}

	public void setLap_Model(String lap_Model) {
		Lap_Model = lap_Model;
	}

	public Specs getSpecs() {
		return specs;
	}

	public void setSpecs(Specs specs) {
		this.specs = specs;
	}
	
}
