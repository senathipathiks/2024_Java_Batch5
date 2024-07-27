package com.emproll.model;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Payroll_tbl")
@CrossOrigin(origins = "http://localhost:3000")
public class Payroll {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private double basic;
	private double hra;
	private double da;
	private double pf;
	private double totsal;
	

	public Payroll() {
		super();
	}


	public Payroll(int pid, double basic, double hra, double da, double pf, double totsal) {
		super();
		this.pid = pid;
		this.basic = basic;
		this.hra = hra;
		this.da = da;
		this.pf = pf;
		this.totsal = totsal;
	}


	@Override
	public String toString() {
		return "Payroll [pid=" + pid + ", basic=" + basic + ", hra=" + hra + ", da=" + da + ", pf=" + pf + ", totsal="
				+ totsal + "]";
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public double getBasic() {
		return basic;
	}


	public void setBasic(double basic) {
		this.basic = basic;
	}


	public double getHra() {
		return hra;
	}


	public void setHra(double hra) {
		this.hra = hra;
	}


	public double getDa() {
		return da;
	}


	public void setDa(double da) {
		this.da = da;
	}


	public double getPf() {
		return pf;
	}


	public void setPf(double pf) {
		this.pf = pf;
	}


	public double getTotsal() {
		return totsal;
	}


	public void setTotsal(double totsal) {
		this.totsal = totsal;
	}

}
