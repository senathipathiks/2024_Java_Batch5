package com.prabha.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Payroll_Table")
public class Payroll {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "hra")
	private int hra;
	@Column(name = "da")
	private int da;
	@Column(name = "ta")
	private int ta;
	@Column(name = "pf")
	private int pf;
	@Column(name = "Total Salary")
	private int total_salary;

	public Payroll() {
		super();
	}

	public Payroll(int id, int hra, int da, int ta, int pf, int total_salary) {
		super();
		this.id = id;
		this.hra = hra;
		this.da = da;
		this.ta = ta;
		this.pf = pf;
		this.total_salary = total_salary;
	}

	@Override
	public String toString() {
		return "Payroll [id=" + id + ", hra=" + hra + ", da=" + da + ", ta=" + ta + ", pf=" + pf + ", total_salary="
				+ total_salary + "]";
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

	public int getTotal_salary() {
		return total_salary;
	}

	public void setTotal_salary(int total_salary) {
		this.total_salary = total_salary;
	}

}
