package com.jsp.bean;

public class Donor {
	int donorid;
	String donorname;
	String donorbg;
	String donorphoneno;
	public Donor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Donor(int donorid, String donorname, String donorbg, String donorphoneno) {
		super();
		this.donorid = donorid;
		this.donorname = donorname;
		this.donorbg = donorbg;
		this.donorphoneno = donorphoneno;
	}
	public int getdonorid() {
		return donorid;
	}
	public void setdonorid(int donorid) {
		this.donorid = donorid;
	}
	public String getdonorname() {
		return donorname;
	}
	public void setdonorname(String donorname) {
		this.donorname = donorname;
	}
	public String getdonorbg() {
		return donorbg;
	}
	public void setdonorbg(String donorbg) {
		this.donorbg = donorbg;
	}
	public String getdonorphoneno() {
		return donorphoneno;
	}
	public void setdonorphoneno(String donorphoneno) {
		this.donorphoneno = donorphoneno;
	}

}
