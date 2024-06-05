package com.raj.constructdependency;

public class Address {
	
	int doorno;
	public Address(int doorno, String strname, String city) {
		super();
		this.doorno = doorno;
		this.strname = strname;
		this.city = city;
	}
	String strname;
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
