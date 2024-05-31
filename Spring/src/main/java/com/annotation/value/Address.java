package com.annotation.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("44")
	 int no;
	@Value("ThendralNagar-12th Street")
	  String st;
	@Value("Madurai-625012")
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
		return "Address Door no :" + no + ", Street :" + st + ", City :" + city + "";
	}
}
