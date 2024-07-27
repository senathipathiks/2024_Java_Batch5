package com.day4.Laptop_Specs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Storage {
	@Value("SSD - Seagate 1 TB")
	String ssd;

	public Storage(String ssd) {
		super();
		this.ssd = ssd;
	}

	public Storage() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Storage [ssd=" + ssd + "]";
	}

	public String getSsd() {
		return ssd;
	}

	public void setSsd(String ssd) {
		this.ssd = ssd;
	}
	
	
}
