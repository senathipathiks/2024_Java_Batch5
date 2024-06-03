package com.aravind.componentAutowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("124")
	int doorno;
	
	@Value("NGO Colony")
	String strname;
	
	@Value("Dindigul")
	String city;
	

	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", strname=" + strname + ", city=" + city + "]";
	}
	
	
	
	
	
	

}
