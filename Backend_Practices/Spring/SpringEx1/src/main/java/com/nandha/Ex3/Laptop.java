package com.nandha.Ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	@Autowired
	Specification specs;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(Specification specs) {
		super();
		this.specs = specs;
	}

	public Specification getSpecs() {
		return specs;
	}

	public void setSpecs(Specification specs) {
		this.specs = specs;
	}
	

	public void display() {
		
//		System.out.println(specs);
		
		System.out.println("******Nandha Web Solutions******\n");
		System.out.println("Laptop Name      :"+specs.getlName());
		System.out.println("Laptop Model     :"+specs.getlModel());
		System.out.println("Laptop HardDisk  :"+specs.getlHD()+" HDD");
		System.out.println("Laptop Processor :"+specs.getlPro());
		System.out.println("Laptop RAM       :"+specs.getLram()+" MB");

	}
	
	
}
