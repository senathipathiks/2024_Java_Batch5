package com.gopi.dependency;

public class Address {
	int doorno;
	String Strname;
	String city;
	int pin;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int doorno, String strname, String city, int pin) {
		super();
		this.doorno = doorno;
		Strname = strname;
		this.city = city;
		this.pin = pin;
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getStrname() {
		return Strname;
	}
	public void setStrname(String strname) {
		Strname = strname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", Strname=" + Strname + ", city=" + city + ", pin=" + pin + "]";
	}
	
	
}
