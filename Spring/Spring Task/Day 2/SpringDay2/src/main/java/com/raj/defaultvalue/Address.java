package com.raj.defaultvalue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("516")
	int doorno;
	@Value("Kamaraj Nagar")
	String strname;
	@Value("Kovilpatti")
	String city;
	
	public Address() {
		super();
	}
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
	@Override
	public String toString() {
		return "Address : Doorno : " + doorno + ", streetname : " + strname + ", City : " + city + "";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
