package com.employeepayroll.application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payrolltable")
public class Payroll {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "payroll_id")
	private int payrollId;

	private double basicSalary;
	private double hra;
	private double ta;
	private double ma;
	private double otherAllowances;
	private double netSalary;

	public Payroll() {
		super();
	}

	public Payroll(int payrollId, double basicSalary, double hra, double ta, double ma, double otherAllowances,
			double netSalary) {
		super();
		this.payrollId = payrollId;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.ta = ta;
		this.ma = ma;
		this.otherAllowances = otherAllowances;
		this.netSalary = netSalary;
	}

	public int getPayrollId() {
		return payrollId;
	}

	public void setPayrollId(int payrollId) {
		this.payrollId = payrollId;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getTa() {
		return ta;
	}

	public void setTa(double ta) {
		this.ta = ta;
	}

	public double getMa() {
		return ma;
	}

	public void setMa(double ma) {
		this.ma = ma;
	}

	public double getOtherAllowances() {
		return otherAllowances;
	}

	public void setOtherAllowances(double otherAllowances) {
		this.otherAllowances = otherAllowances;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	@Override
	public String toString() {
		return "Payroll [payrollId=" + payrollId + ", basicSalary=" + basicSalary + ", hra=" + hra + ", ta=" + ta
				+ ", ma=" + ma + ", otherAllowances=" + otherAllowances + ", netSalary=" + netSalary + "]";
	}

}
