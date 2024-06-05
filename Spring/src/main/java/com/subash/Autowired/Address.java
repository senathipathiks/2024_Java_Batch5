package com.subash.Autowired;

public class Address {

	String doorno;
	String streetname;
	String city;
	
	public Address(String doorno, String streetname, String city) {
		super();
		this.doorno = doorno;
		this.streetname = streetname;
		this.city = city;
	}

	public String getDoorno() {
		return doorno;
	}

	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address() {
		super();
	}

	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", streetname=" + streetname + ", city=" + city + "]";
	}

	
}
