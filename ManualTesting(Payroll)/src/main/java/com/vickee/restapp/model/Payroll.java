package com.vickee.restapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Payroll")
public class Payroll {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private int basic;
	private int hra;
	private int da;
	private int pf;
	private int ctc;
	
	
	public Payroll() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Payroll(int pid, int basic, int hra, int da, int pf, int ctc) {
		super();
		this.pid = pid;
		this.basic = basic;
		this.hra = hra;
		this.da = da;
		this.pf = pf;
		this.ctc = ctc;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public int getBasic() {
		return basic;
	}


	public void setBasic(int basic) {
		this.basic = basic;
	}


	public int getHra() {
		return hra;
	}


	public void setHra(int hra) {
		this.hra = hra;
	}


	public int getDa() {
		return da;
	}


	public void setDa(int da) {
		this.da = da;
	}


	public int getPf() {
		return pf;
	}
	

	public void setPf(int pf) {
		this.pf = pf;
	}


	public int getCtc() {
		return ctc;
	}


	public void setCtc(int ctc) {
		this.ctc = ctc;
	}
	
	
}
