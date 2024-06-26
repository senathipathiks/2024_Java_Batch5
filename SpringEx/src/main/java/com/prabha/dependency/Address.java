package com.prabha.dependency;

public class Address {

	int doorno;
	String StreetName;
	String city;

	public int getDoorno() {
		return doorno;
	}

	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}

	public String getStreetName() {
		return StreetName;
	}

	public void setStreetName(String streetName) {
		StreetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", StreetName=" + StreetName + ", city=" + city + "]";
	}

	public Address(int doorno, String streetName, String city) {
		super();
		this.doorno = doorno;
		this.StreetName = streetName;
		this.city = city;
	}

}