package com.supraja.atComponentSimple;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address 
{
  @Value("20/21")	
  String dno;
  
  @Value("KK Nagar")
  String stname;
  
  @Value("Chennai")
  String city;
  
public Address(String dno, String stname, String city) {
	super();
	this.dno = dno;
	this.stname = stname;
	this.city = city;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Address [dno=" + dno + ", stname=" + stname + ", city=" + city + "]";
}
public String getDno() {
	return dno;
}
public void setDno(String dno) {
	this.dno = dno;
}
public String getStname() {
	return stname;
}
public void setStname(String stname) {
	this.stname = stname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
  
}

