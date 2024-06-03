package com.aravind.LapSpecfic;

import org.springframework.beans.factory.annotation.Autowired;

public class Laptop {
	int lapid;
	String lapname;

	Specific spec;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int lapid, String lapname) {
		super();
		this.lapid = lapid;
		this.lapname = lapname;
	}

	public int getLapid() {
		return lapid;
	}

	public void setLapid(int lapid) {
		this.lapid = lapid;
	}

	public String getLapname() {
		return lapname;
	}

	public void setLapname(String lapname) {
		this.lapname = lapname;
	}

	public Specific getSpec() {
		return spec;
	}

	public void setSpec(Specific spec) {
		this.spec = spec;
	}

	@Override
	public String toString() {
		return "Laptop [lapid=" + lapid + ", lapname=" + lapname + ", spec=" + spec + "]";
	}

}
