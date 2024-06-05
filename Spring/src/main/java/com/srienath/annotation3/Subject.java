package com.srienath.annotation3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Subject {
	@Value("1")
int subno;
	@Value("Maths")
String subname;
	@Value("11")
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
 
