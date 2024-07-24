package com.aravind.sonar.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="order1")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	
	@Column(name="Assignee Name")
	private String oname;
	
	@Column(name="Location")
	private String loc;

	public Order() {
		super();
		
	}

	public Order(int oid, String oname, String loc) {
		super();
		this.oid = oid;
		this.oname = oname;
		this.loc = loc;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", oname=" + oname + ", loc=" + loc + "]";
	}

}
