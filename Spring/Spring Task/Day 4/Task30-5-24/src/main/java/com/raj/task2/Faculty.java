package com.raj.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Faculty {
	@Value("101")
	int fac_id;
	@Value("Ponraj")
	String fac_name;
	@Value("Kovilpatti")
	String fac_address;
	
	@Autowired
	private Subject sub;
	
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Faculty(int fac_id, String fac_name, String fac_address, Subject sub) {
		super();
		this.fac_id = fac_id;
		this.fac_name = fac_name;
		this.fac_address = fac_address;
		this.sub = sub;
	}

	public int getFac_id() {
		return fac_id;
	}

	public void setFac_id(int fac_id) {
		this.fac_id = fac_id;
	}

	public String getFac_name() {
		return fac_name;
	}

	public void setFac_name(String fac_name) {
		this.fac_name = fac_name;
	}

	public String getFac_address() {
		return fac_address;
	}

	public void setFac_address(String fac_address) {
		this.fac_address = fac_address;
	}

	public Subject getSub() {
		return sub;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}
	
	public void display() {
		System.out.println(fac_id);
		System.out.println(fac_name);
		System.out.println(fac_address);
		System.out.println(sub);
		
	}
	
}
