package com.srienath.annotation;


public class Subject {
int subno;
String subname;
int chapters;
public int getSubno() {
	return subno;
}
public void setSubno(int subno) {
	this.subno = subno;
}
public String getSubname() {
	return subname;
}
public void setSubname(String subname) {
	this.subname = subname;
}
public int getChapters() {
	return chapters;
}
public void setChapters(int chapters) {
	this.chapters = chapters;
}
public Subject(int subno, String subname, int chapters) {
	super();
	this.subno = subno;
	this.subname = subname;
	this.chapters = chapters;
}
public Subject() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Subject [subno=" + subno + ", subname=" + subname + ", chapters=" + chapters + "]";
}
 
 
}
 
