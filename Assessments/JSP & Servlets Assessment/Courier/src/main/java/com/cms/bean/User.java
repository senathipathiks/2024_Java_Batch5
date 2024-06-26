package com.cms.bean;

public class User {
	int uid;
	String uname;
	int cid;
	String uadd;
	String desti;
	String rec_name;
	
	public User() {
		super();
	}

	public User(int uid, String uname, int cid, String uadd, String desti, String rec_name) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.cid = cid;
		this.uadd = uadd;
		this.desti = desti;
		this.rec_name = rec_name;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getUadd() {
		return uadd;
	}

	public void setUadd(String uadd) {
		this.uadd = uadd;
	}

	public String getDesti() {
		return desti;
	}

	public void setDesti(String desti) {
		this.desti = desti;
	}

	public String getRec_name() {
		return rec_name;
	}

	public void setRec_name(String rec_name) {
		this.rec_name = rec_name;
	}
	
	
}