package com.srienath.constructorArg;

public class Student {
int stid;
String stname;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public int getStid() {
	return stid;
}
public void setStid(int stid) {
	this.stid = stid;
}
public String getStname() {
	return stname;
}
public void setStname(String stname) {
	this.stname = stname;
}
public Student(int stid, String stname) {
	super();
	this.stid = stid;
	this.stname = stname;
}
@Override
public String toString() {
	return "Student [stid=" + stid + ", stname=" + stname + "]";
}
 
}
