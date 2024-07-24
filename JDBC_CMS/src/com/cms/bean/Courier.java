package com.cms.bean;

public class Courier 
{
  int courierid;
  String couriername;
  String courieraddress;
  int courierdate;
public Courier() {
	super();
	// TODO Auto-generated constructor stub
}
public Courier(int courierid, String couriername, String courieraddress, int courierdate) {
	super();
	this.courierid = courierid;
	this.couriername = couriername;
	this.courieraddress = courieraddress;
	this.courierdate = courierdate;
}
public int getCourierid() {
	return courierid;
}
public void setCourierid(int courierid) {
	this.courierid = courierid;
}
public String getCouriername() {
	return couriername;
}
public void setCouriername(String couriername) {
	this.couriername = couriername;
}
public String getCourieraddress() {
	return courieraddress;
}
public void setCourieraddress(String courieraddress) {
	this.courieraddress = courieraddress;
}
public int getCourierdate() {
	return courierdate;
}
public void setCourierdate(int courierdate) {
	this.courierdate = courierdate;
}
}
