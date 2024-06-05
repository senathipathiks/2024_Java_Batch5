package com.vicky.autowired;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	int doorno;
	String strname;
	String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", strname=" + strname + ", city=" + city + "]";
	}
	
}
