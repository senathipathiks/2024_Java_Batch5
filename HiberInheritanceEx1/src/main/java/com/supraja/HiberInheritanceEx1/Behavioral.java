package com.supraja.HiberInheritanceEx1;

import javax.persistence.Entity;

@Entity
public class Behavioral extends Tracker 
{
   int bid;
   String bname;
public Behavioral(int eid, String ename, String desig, int bid, String bname) {
	super(eid, ename, desig);
	this.bid = bid;
	this.bname = bname;
}
public Behavioral() {
	super();
	// TODO Auto-generated constructor stub
}
public Behavioral(int eid, String ename, String desig) {
	super(eid, ename, desig);
	// TODO Auto-generated constructor stub
}
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
   
   
}
