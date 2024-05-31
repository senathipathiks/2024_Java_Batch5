package com.spring.dependency;

public class Address {
  int no;
  String st;
  String city;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int no, String st, String city) {
	super();
	this.no = no;
	this.st = st;
	this.city = city;
}
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getSt() {
	return st;
}
public void setSt(String st) {
	this.st = st;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Address [no=" + no + ", st=" + st + ", city=" + city + "]";
}
  
  
}
