package com.supraja.dependency;

public class Address 
{
  int dno;
  String stname;
  String city;
public int getDno() {
	return dno;
}
public void setDno(int dno) {
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
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int dno, String stname, String city) {
	super();
	this.dno = dno;
	this.stname = stname;
	this.city = city;
}
@Override
public String toString() {
	return "Address [dno=" + dno + ", stname=" + stname + ", city=" + city + "]";
}
}
