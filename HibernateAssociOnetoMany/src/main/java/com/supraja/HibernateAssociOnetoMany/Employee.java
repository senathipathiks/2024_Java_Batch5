package com.supraja.HibernateAssociOnetoMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employ")
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int eid;
   private String ename;
   
   @OneToMany(targetEntity=Address.class,cascade=CascadeType.ALL)
   @JoinColumn
   private List<Address> address;

public Employee(int eid, String ename, List<Address> address) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.address = address;
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

public List<Address> getAddress() {
	return address;
}

public void setAddress(List<Address> address) {
	this.address = address;
}
   
}
