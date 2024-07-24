package com.supraja.HiberInheritanceEx1;

import javax.persistence.Entity;

@Entity
public class Technical extends Tracker 
{
   int cid;
   String cname;
public Technical(int eid, String ename, String desig, int cid, String cname) {
	super(eid, ename, desig);
	this.cid = cid;
	this.cname = cname;
}
public Technical() {
	super();
	// TODO Auto-generated constructor stub
}
public Technical(int eid, String ename, String desig) {
	super(eid, ename, desig);
	// TODO Auto-generated constructor stub
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
   
   
}
