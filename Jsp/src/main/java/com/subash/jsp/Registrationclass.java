package com.subash.jsp;

public class Registrationclass {

	String uname;
	String pno;
	String loc;
	String age;
	String email;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Registrationclass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registrationclass(String uname, String pno, String loc, String age, String email) {
		super();
		this.uname = uname;
		this.pno = pno;
		this.loc = loc;
		this.age = age;
		this.email = email;
	}

}
