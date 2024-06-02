package com.gopi.config1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Subject {
	
//	@Value("101")
	int subid;
//	@Value("Maths")
	String subname;
//	@Value("100")
	int submark;
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(int subid, String subname, int submark) {
		this.subid = subid;
		this.subname = subname;
		this.submark = submark;
	}

	public int getSubid() {
		return subid;
	}

	public void setSubid(int subid) {
		this.subid = subid;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	public int getSubmark() {
		return submark;
	}

	public void setSubmark(int submark) {
		this.submark = submark;
	}

	@Override
	public String toString() {
		return "Subject [subid= " + subid + ", subname= " + subname + ", submark= " + submark + "]";
	}
	
	
}
