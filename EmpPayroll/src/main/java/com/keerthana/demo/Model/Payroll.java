package com.keerthana.demo.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Payroll {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int salaryId;
	private String basicSalary;
	private int houseAllowance;
	private int travelAllowance;
	private int pf;
	private int tax;
	private double totalSalary;
	
	@OneToMany(mappedBy = "payroll")
	private List<Employee> employee;
	
	
	public Payroll() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payroll(int salaryId, String basicSalary, int houseAllowance, int travelAllowance, int pf, int tax,
			double totalSalary) {
		super();
		this.salaryId = salaryId;
		this.basicSalary = basicSalary;
		this.houseAllowance = houseAllowance;
		this.travelAllowance = travelAllowance;
		this.pf = pf;
		this.tax = tax;
		this.totalSalary = totalSalary;
	}

	public int getSalaryId() {
		return salaryId;
	}

	public void setSalaryId(int salaryId) {
		this.salaryId = salaryId;
	}

	public String getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(String basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getHouseAllowance() {
		return houseAllowance;
	}

	public void setHouseAllowance(int houseAllowance) {
		this.houseAllowance = houseAllowance;
	}

	public int getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(int travelAllowance) {
		this.travelAllowance = travelAllowance;
	}

	public int getPf() {
		return pf;
	}

	public void setPf(int pf) {
		this.pf = pf;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public double getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}

	@Override
	public String toString() {
		return "Payroll [salaryId=" + salaryId + ", basicSalary=" + basicSalary + ", houseAllowance=" + houseAllowance
				+ ", travelAllowance=" + travelAllowance + ", pf=" + pf + ", tax=" + tax + ", totalSalary="
				+ totalSalary + "]";
	}
	
	
	
	
}
