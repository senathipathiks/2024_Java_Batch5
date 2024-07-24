package com.supraja.demo.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studsb")
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int sid;
   private String sname;
   private String scity;
public Student(int sid, String sname, String scity) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.scity = scity;
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
public String getScity() {
	return scity;
}
public void setScity(String scity) {
	this.scity = scity;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + "]";
}
   
   
}
