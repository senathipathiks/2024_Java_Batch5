package com.madhan.componentscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("3430")
	int doorno;
	@Value("Villapuram")
	String strname;
	@Value("Madurai")
	String city;
	
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getStrname() {
		return strname;
	}
	public void setStrname(String strname) {
		this.strname = strname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(int doorno, String strname, String city) {
		super();
		this.doorno = doorno;
		this.strname = strname;
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", strname=" + strname + ", city=" + city + "]";
	}
	
	

}
