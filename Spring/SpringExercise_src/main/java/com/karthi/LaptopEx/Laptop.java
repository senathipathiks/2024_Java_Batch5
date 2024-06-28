package com.karthi.LaptopEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	@Value("938")
	int num;
	
	@Autowired
	Specification spec;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int num, Specification spec) {
		super();
		this.num = num;
		this.spec = spec;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Specification getSpec() {
		return spec;
	}

	public void setSpec(Specification spec) {
		this.spec = spec;
	}
	
	public void display() {
		System.out.println("Laptop Number: "+num);
		System.out.println(spec.hd.name);
	}
	
}
