package com.evn.bean;  

public class Event {
int eid;
String ename;
String etime;
int eamount;
public Event() {
	super();
	// TODO Auto-generated constructor stub
}

public Event(int eid, String ename, String etime, int eamount) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.etime = etime;
	this.eamount = eamount;
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
public String getEtime() {
	return etime;
}
public void setEtime(String etime) {
	this.etime = etime;
}
public int getEamount() {
	return eamount;
}
public void setEamount(int eamount) {
	this.eamount = eamount;
}


}