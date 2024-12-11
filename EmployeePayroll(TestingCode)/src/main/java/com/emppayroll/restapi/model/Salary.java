package com.emppayroll.restapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Payroll")
public class Salary {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Pay_id")
	private int pid;
	
	@Column(name = "BasicPay")
	private int bp;	
	
	@Column(name = "DA")
	private int da;
	
	@Column(name = "TA")
	private int ta;
	
	@Column (name = "HR")
	private int hr;
	
	@Column(name = "Gross_Salary")
	private int sal;


	
	
	public Salary() {
		super();
		
	}

	public Salary(int pid, int bp, int da, int ta, int hr, int sal) {
		super();
		this.pid = pid;
		this.bp = bp;
		this.da = da;
		this.ta = ta;
		this.hr = hr;
		this.sal = sal;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getBp() {
		return bp;
	}

	public void setBp(int bp) {
		this.bp = bp;
	}

	public int getDa() {
		return da;
	}

	public void setDa(int da) {
		this.da = da;
	}

	public int getTa() {
		return ta;
	}

	public void setTa(int ta) {
		this.ta = ta;
	}

	public int getHr() {
		return hr;
	}

	public void setHr(int hr) {
		this.hr = hr;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	

	@Override
	public String toString() {
		return "Salary [pid=" + pid + ", bp=" + bp + ", da=" + da + ", ta=" + ta + ", hr=" + hr + ", sal=" + sal;
	}
	
	
	
	
}
