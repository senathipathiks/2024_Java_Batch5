package com.lms.bean;

public class Applicant {

	String aid;
	String aname;
	String job;
	String sts;
	
	public Applicant() {
		// TODO Auto-generated constructor stub
		super();
		
	}

	public Applicant(String aid,
	String aname,
	String job,
	String sts) 
	{
		super();
		this.aid = aid;
		this.aname = aname;
		this.job = job;
		this.sts = sts;
	}

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getSts() {
		return sts;
	}

	public void setSts(String sts) {
		this.sts = sts;
	}

//	public int getEmpid() {
//		return empid;
//	}
//
//	public void setEmpid(int empid) {
//		this.empid = empid;
//	}
//
//	public String getEmpname() {
//		return empname;
//	}
//
//	public void setEmpname(String empname) {
//		this.empname = empname;
//	}
//
//	public String getEmpdesg() {
//		return empdesg;
//	}
//
//	public void setEmpdesg(String empdesg) {
//		this.empdesg = empdesg;
//	}
//
//	public int getsal() {
//		return sal;
//	}
//
//	public void setsal(int sal) {
//		this.sal = sal;
//	}
	

}
