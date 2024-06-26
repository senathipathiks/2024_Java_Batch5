package com.gopi.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Payroll-RestaPI")
public class Payroll {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	@Column
	private int basic;
	@Column
	private int hra;
	@Column
	private int da;
	@Column
	private int ta;
	@Column
	private int pf;
	@Column
	private int ctc;
	public Payroll() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payroll(int pid, int basic, int hra, int da, int ta, int pf, int ctc) {
		super();
		this.pid = pid;
		this.basic = basic;
		this.hra = hra;
		this.da = da;
		this.ta = ta;
		this.pf = pf;
		this.ctc = ctc;
	}
	public int getpid() {
		return pid;
	}
	public void setpid(int pid) {
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
	public int getTa() {
		return ta;
	}
	public void setTa(int ta) {
		this.ta = ta;
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
	@Override
	public String toString() {
		return "Payroll [pid=" + pid + ", basic=" + basic + ", hra=" + hra + ", da=" + da + ", ta=" + ta + ", pf="
				+ pf + ", ctc=" + ctc + "]";
	}

	
	
	

}
