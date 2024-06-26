package com.ani.SpringBoot1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
 
@Component
public class Address {
 
	@Value("10/20A")
	private String doorno;
	@Value("Tirunelveli")
	private String city;
 
	public String getDoorno() {
		return doorno;
	}
 
	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}
 
	public String getCity() {
		return city;
	}
 
	public void setCity(String city) {
		this.city = city;
	}
	
	
	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", city=" + city + "]";
	}

	public void show() {
		System.out.println(doorno);
		System.out.println(city);	
	}
 
}