package com.supraja.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payroll")
public class Payroll 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int pid;
	@Column
   private int pf;
	@Column
   private int hra;
	@Column
   private int ta;
	@Column
   private int bp;
	@Column
	private int ctc;
	
	public Payroll() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPf() {
		return pf;
	}
	public void setPf(int pf) {
		this.pf = pf;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
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
	public int getCtc() {
		return ctc;
	}
	public void setCtc(int ctc) {
		this.ctc = ctc;
	}
	public Payroll(int pid, int pf, int hra, int ta, int bp, int ctc) {
		super();
		this.pid = pid;
		this.pf = pf;
		this.hra = hra;
		this.ta = ta;
		this.bp = bp;
		this.ctc = ctc;
	}
	
}