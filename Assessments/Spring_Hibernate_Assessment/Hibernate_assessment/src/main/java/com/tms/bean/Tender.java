package com.tms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tender_tbl")
public class Tender {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	@Column(name = "Tender_Name")
	private String tname;
	@Column(name = "City")
	private String tcity;
	@Column(name = "Tender_Budget")
	private int tbudget;
	@Column(name = "Tender_Description")
	private String tdesc;
	@Column(name = "Tender_Owner")
	private String towner;
	
	public Tender() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tender(int tid, String tname, String tcity, int tbudget, String tdesc, String towner) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tcity = tcity;
		this.tbudget = tbudget;
		this.tdesc = tdesc;
		this.towner = towner;
	}

	@Override
	public String toString() {
		return "Tender [tid=" + tid + ", tname=" + tname + ", tcity=" + tcity + ", tbudget=" + tbudget + ", tdesc="
				+ tdesc + ", towner=" + towner + "]";
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTcity() {
		return tcity;
	}

	public void setTcity(String tcity) {
		this.tcity = tcity;
	}

	public int getTbudget() {
		return tbudget;
	}

	public void setTbudget(int tbudget) {
		this.tbudget = tbudget;
	}

	public String getTdesc() {
		return tdesc;
	}

	public void setTdesc(String tdesc) {
		this.tdesc = tdesc;
	}

	public String getTowner() {
		return towner;
	}

	public void setTowner(String towner) {
		this.towner = towner;
	}
	
}
