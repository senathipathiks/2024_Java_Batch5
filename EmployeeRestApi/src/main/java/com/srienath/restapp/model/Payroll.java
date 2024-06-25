package com.srienath.restapp.model;

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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pid")
	private int pid;
	@Column(name="hre")
	private int hre;
	@Column(name="ta")
	private int ta;
	@Column(name="bp")
	private int bp;
	@Column(name="pf")
	private int pf;
	
	@Column(name="ctc")
	private int ctc;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getHre() {
		return hre;
	}

	public void setHre(int hre) {
		this.hre = hre;
	}

	public int getTa() {
		return ta;
	}

	public void setTa(int ta) {
		this.ta = ta;
	}

	public int getBp() {
		return bp;
	}

	public void setBp(int bp) {
		this.bp = bp;
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

	public Payroll(int pid, int hre, int ta, int bp, int pf, int ctc) {
		super();
		this.pid = pid;
		this.hre = hre;
		this.ta = ta;
		this.bp = bp;
		this.pf = pf;
		this.ctc = ctc;
	}

	public Payroll() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
