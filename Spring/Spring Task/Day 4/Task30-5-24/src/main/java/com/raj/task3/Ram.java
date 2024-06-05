package com.raj.task3;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ram {
	@Value("LPDDR5")
	String ram_type;
	@Value("Toshiba")
	String ram_brand;
	
	public Ram() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ram(String ram_type, String ram_brand) {
		super();
		this.ram_type = ram_type;
		this.ram_brand = ram_brand;
	}

	@Override
	public String toString() {
		return "Ram [ram_type=" + ram_type + ", ram_brand=" + ram_brand + "]";
	}

	public String getRam_type() {
		return ram_type;
	}

	public void setRam_type(String ram_type) {
		this.ram_type = ram_type;
	}

	public String getRam_brand() {
		return ram_brand;
	}

	public void setRam_brand(String ram_brand) {
		this.ram_brand = ram_brand;
	}
	
}
