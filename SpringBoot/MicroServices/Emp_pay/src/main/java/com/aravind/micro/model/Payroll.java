package com.aravind.micro.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payroll")
public class Payroll {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	
	@Column
	private double bpay;
	
	@Column
	private double hra;
	
	@Column
	private double da;
	
	@Column 
	private double ta;
	
	@Column
	private double pf;
	
	@Column
	private double salary;
	

    
	public Payroll() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payroll(int pid, double bpay, double hra, double da, double ta, double pf, double salary) {
		super();
		this.pid = pid;
		this.bpay = bpay;
		this.hra = hra;
		this.da = da;
		this.ta = ta;
		this.pf = pf;
		this.salary = salary;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public double getBpay() {
		return bpay;
	}

	public void setBpay(double bpay) {
		this.bpay = bpay;
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

	public double getTa() {
		return ta;
	}

	public void setTa(double ta) {
		this.ta = ta;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	


	@Override
	public String toString() {
		return "Payroll [pid=" + pid + ", bpay=" + bpay + ", hra=" + hra + ", da=" + da + ", ta=" + ta + ", pf=" + pf
				+ ", salary=" + salary +"]";
	}

	
}
