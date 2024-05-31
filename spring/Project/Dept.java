package com.spring.Project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dept {
	@Value ("IT")
	String dname;
	@Value("8000")
    int sal ;
	@Value("Intern")
	 String desg;
    @Value("05")
	 int did;
	@Value("Relevantz-VTC")
	 String loc;
	
	
public Dept() {
	super();
	// TODO Auto-generated constructor stub
}

public Dept(String dname, int sal, String desg, int did, String loc) {
	super();
	this.dname = dname;
	this.sal = sal;
	this.desg = desg;
	this.did = did;
	this.loc = loc;
}

public String getDname() {
	return dname;
}

public void setDname(String dname) {
	this.dname = dname;
}

public int getSal() {
	return sal;
}

public void setSal(int sal) {
	this.sal = sal;
}

public String getDesg() {
	return desg;
}

public void setDesg(String desg) {
	this.desg = desg;
}

public int getDid() {
	return did;
}

public void setDid(int did) {
	this.did = did;
}

public String getLoc() {
	return loc;
}

public void setLoc(String loc) {
	this.loc = loc;
}

@Override
public String toString() {
	return "Dept name=" + dname + ", salary=" + sal + ", Designation=" + desg + ", Dept id=" + did + ", location =" + loc + "";
}





 
 
 
}
