package com.day3.Task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class People {
	@Value("Arjun")
	String name;
	@Value("Madurai")
	String address;
	
	@Autowired
	private Mobile mob;
	
	public People() {
		super();
		// TODO Auto-generated constructor stub
	}

	public People(String name, String address, Mobile mob) {
		super();
		this.name = name;
		this.address = address;
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", address=" + address + ", mob=" + mob + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Mobile getMob() {
		return mob;
	}

	public void setMob(Mobile mob) {
		this.mob = mob;
	}
	
	
}