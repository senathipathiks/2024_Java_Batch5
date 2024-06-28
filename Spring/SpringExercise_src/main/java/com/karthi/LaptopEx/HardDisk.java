package com.karthi.LaptopEx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HardDisk {
	@Value("Samsung")
	String name;

	public HardDisk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HardDisk(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
