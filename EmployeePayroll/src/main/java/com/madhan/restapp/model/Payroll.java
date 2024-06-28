package com.madhan.restapp.model;

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
	@Column
	private int id; 
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
	public Payroll(int id, int hra, int da, int ta, int pf, int ctc) {
		super();
		this.id = id;
		this.hra = hra;
		this.da = da;
		this.ta = ta;
		this.pf = pf;
		this.ctc = ctc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Payroll [id=" + id + ", hra=" + hra + ", da=" + da + ", ta=" + ta + ", pf=" + pf + ", ctc=" + ctc + "]";
	}
	
	
	
}
