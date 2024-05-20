package com.payroll.bean;

public class Leave {

	
	int Lid;
	int empId;
	String empname; 
	String Ltype;
	int NoOfDays;
	String From_date;
	String To_date;
	String Reason;
	
	
	public Leave(int lid, int empId, String empname, String ltype, int noOfDays, String from_date, String to_date,
			String reason) {
		super();
		Lid = lid;
		this.empId = empId;
		this.empname = empname;
		Ltype = ltype;
		NoOfDays = noOfDays;
		From_date = from_date;
		To_date = to_date;
		Reason = reason;
	}


	public int getLid() {
		return Lid;
	}


	public void setLid(int lid) {
		Lid = lid;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public String getLtype() {
		return Ltype;
	}


	public void setLtype(String ltype) {
		Ltype = ltype;
	}


	public int getNoOfDays() {
		return NoOfDays;
	}


	public void setNoOfDays(int noOfDays) {
		NoOfDays = noOfDays;
	}


	public String getFrom_date() {
		return From_date;
	}


	public void setFrom_date(String from_date) {
		From_date = from_date;
	}


	public String getTo_date() {
		return To_date;
	}


	public void setTo_date(String to_date) {
		To_date = to_date;
	}


	public String getReason() {
		return Reason;
	}


	public void setReason(String reason) {
		Reason = reason;
	}


	public Leave() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	

}
