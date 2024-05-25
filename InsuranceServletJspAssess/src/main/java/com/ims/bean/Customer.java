package com.ims.bean;


public class Customer {
	 String cusid;
	 String cusname;
	 String age;
	 String phoneNo;
	 String emailID;
	 String nomineeName;
	 String nomineeRelation;
	 String address;
	public String getCusid() {
		return cusid;
	}
	public void setCusid(String cusid) {
		this.cusid = cusid;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getNomineeName() {
		return nomineeName;
	}
	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	public String getNomineeRelation() {
		return nomineeRelation;
	}
	public void setNomineeRelation(String nomineeRelation) {
		this.nomineeRelation = nomineeRelation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Customer(String cusid, String cusname, String age, String phoneNo, String emailID, String nomineeName,
			String nomineeRelation, String address) {
		super();
		this.cusid = cusid;
		this.cusname = cusname;
		this.age = age;
		this.phoneNo = phoneNo;
		this.emailID = emailID;
		this.nomineeName = nomineeName;
		this.nomineeRelation = nomineeRelation;
		this.address = address;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
}

