package com.ems.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_emp")
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   int eid;
	@Column
   String ename;
	@Column
   String edept;
public Employee(int eid, String ename, String edept) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.edept = edept;
}
public Employee() {
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
public String getEdept() {
	return edept;
}
public void setEdept(String edept) {
	this.edept = edept;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", edept=" + edept + "]";
}
   
   
}
