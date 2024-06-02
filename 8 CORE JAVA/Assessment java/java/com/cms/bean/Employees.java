package com.cms.bean;

public class Employees {
int Eid;
String Ename;
String Edesig;

public Employees(int eid, String ename, String edesig) {
	super();
	Eid = eid;
	Ename = ename;
	Edesig = edesig;
}

public Employees() {
	super();
	// TODO Auto-generated constructor stub
}

public int getEid() {
	return Eid;
}

public void setEid(int eid) {
	Eid = eid;
}

public String getEname() {
	return Ename;
}

public void setEname(String ename) {
	Ename = ename;
}

public String getEdesig() {
	return Edesig;
}

public void setEdesig(String edesig) {
	Edesig = edesig;
}



}
