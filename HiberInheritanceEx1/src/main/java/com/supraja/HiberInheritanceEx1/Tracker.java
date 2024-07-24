package com.supraja.HiberInheritanceEx1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Relevantz")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Tracker 
{  
   @Id
   int eid;
   @Column(name="name")
   String ename;
   @Column(name="Designation")
   String desig;
   
public Tracker(int eid, String ename, String desig) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.desig = desig;
}
public Tracker() {
	super();
	// TODO Auto-generated constructor stub
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDesig() {
	return desig;
}
public void setDesig(String desig) {
	this.desig = desig;
}
   
   
}
