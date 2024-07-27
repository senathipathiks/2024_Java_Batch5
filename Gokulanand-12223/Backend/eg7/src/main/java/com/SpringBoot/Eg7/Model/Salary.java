package com.SpringBoot.Eg7.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import com.SpringBoot.Eg7.Model.*;

@Entity
@Table(name = "sal_tbl")
public class Salary 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int salid;
	@Column
	private long basicsalary;
	@Column
	private long ta;
	@Column
	private long da;
	@Column
	private long hra;
	@Column
	private long pf;
	@Column
	private long ctc;

	public Salary() 
	{
		super();
	}

	public Salary(int salid, long basicsalary, long ta, long da, long hra, long pf, long ctc) {
		super();
		this.salid = salid;
		this.basicsalary = basicsalary;
		this.ta = ta;
		this.da = da;
		this.hra = hra;
		this.pf = pf;
		this.ctc = ctc;
	}

	public int getSalid() {
		return salid;
	}

	public void setSalid(int salid) {
		this.salid = salid;
	}

	public long getBasicsalary() {
		return basicsalary;
	}

	public void setBasicsalary(long basicsalary) {
		this.basicsalary = basicsalary;
	}

	public long getTa() {
		return ta;
	}

	public void setTa(long ta) {
		this.ta = ta;
	}

	public long getDa() {
		return da;
	}

	public void setDa(long da) {
		this.da = da;
	}

	public long getHra() {
		return hra;
	}

	public void setHra(long hra) {
		this.hra = hra;
	}

	public long getPf() {
		return pf;
	}

	public void setPf(long pf) {
		this.pf = pf;
	}
	
	public long getCtc() {
		return ctc;
	}

	public void setCtc(long ctc) {
		this.ctc = ctc;
	}

	@Override
	public String toString() {
		return "Salary [salid=" + salid + ", basicsalary=" + basicsalary + ", ta=" + ta + ", da=" + da + ", hra="
				+ hra + ", pf=" + pf + ", ctc=" + ctc + ", employee=" + "]";
	}
}
