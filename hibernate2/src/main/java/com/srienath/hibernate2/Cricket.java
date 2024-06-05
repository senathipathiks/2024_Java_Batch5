package com.srienath.hibernate2;

public class Cricket {
	private int cid;
	private String name;
	private String cteam;
	
	public Cricket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cricket(int cid, String name, String cteam) {
		super();
		this.cid = cid;
		this.name = name;
		this.cteam = cteam;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCteam() {
		return cteam;
	}
	public void setCteam(String cteam) {
		this.cteam = cteam;
	}
	@Override
	public String toString() {
		return "Cricket [cid=" + cid + ", name=" + name + ", cteam=" + cteam + "]";
	}
	
	
}
