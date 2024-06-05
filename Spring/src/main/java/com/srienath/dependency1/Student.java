package com.srienath.dependency1;

import java.util.ArrayList;

 
public class Student {
int sid;
String sname;
ArrayList<Subject> sub;
public Student(int sid, String sname, ArrayList<Subject> sub) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.sub = sub;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
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
public ArrayList<Subject> getSub() {
	return sub;
}
public void setSub(ArrayList<Subject> sub) {
	this.sub = sub;
}
public void display() {
	System.out.println(sid);
	System.out.println(sname);
	for(Subject subject: sub) {
		System.out.println(subject);
	}
}
 
}
