package com.parlor.bean;

public class Parlor {
	int userid;
	String username;
	int userage;
	String userphoneno;
	String useradd;
	public Parlor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parlor(int userid, String username, int userage, String userphoneno, String useradd) {
		super();
		this.userid = userid;
		this.username = username;
		this.userage = userage;
		this.userphoneno = userphoneno;
		this.useradd = useradd;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getUserage() {
		return userage;
	}
	public void setUserage(int userage) {
		this.userage = userage;
	}
	public String getUserphoneno() {
		return userphoneno;
	}
	public void setUserphoneno(String userphoneno) {
		this.userphoneno = userphoneno;
	}
	public String getUseradd() {
		return useradd;
	}
	public void setUseradd(String useradd) {
		this.useradd = useradd;
	}
	
	
}
