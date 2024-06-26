package com.gopi.hibernatesample;

public class User {
private int uid;
private String name;
private String city;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int uid, String name, String city) {
	super();
	this.uid = uid;
	this.name = name;
	this.city = city;
}
public int getuid() {
	return uid;
}
public void setuid(int uid) {
	this.uid = uid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


}
