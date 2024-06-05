package com.vidhu.annotations;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	
	@Value("380")
	int doorno;
	@Value("kalvi nagar")
	String strname;
	@Value("madurai")

	String city;
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

}
