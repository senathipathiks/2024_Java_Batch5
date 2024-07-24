package com.aravind.micro.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	
	@Column
	private String ename;
	
	@Column
	private String edep;
	
	@Column
	private String edes;
	
	@Column
	private String ecity;
	
	@OneToOne(targetEntity=Payroll.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "pid")
	private Payroll pay;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, String edep, String edes, String ecity) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edep = edep;
		this.edes = edes;
		this.ecity = ecity;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEdep() {
		return edep;
	}

	public void setEdep(String edep) {
		this.edep = edep;
	}

	public String getEdes() {
		return edes;
	}

	public void setEdes(String edes) {
		this.edes = edes;
	}

	public String getEcity() {
		return ecity;
	}

	public void setEcity(String ecity) {
		this.ecity = ecity;
	}

	
	public Payroll getPay() {
		return pay;
	}
	public void setPay(Payroll pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edep=" + edep + ", edes=" + edes + ", ecity=" + ecity
				+ ", pay=" + pay + "]";
	}
	
	

}
