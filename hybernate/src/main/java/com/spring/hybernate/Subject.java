package com.spring.hybernate;

import javax.management.loading.PrivateClassLoader;

public class Subject {
private int sid;
private String sname;
private int marks;
public Subject() {
	super();
	// TODO Auto-generated constructor stub
}
public Subject(int sid, String sname, int marks) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.marks = marks;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Subject [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
}



}
