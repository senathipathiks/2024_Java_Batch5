package com.madhan.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="loan")
public class Loan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private int loanamount;
	@Column
	private int emi;
	@Column
	private String transactiontype;
	@Column
	private int total;
	public Loan() {
		super();
		
	}
	public Loan(int id, int loanamount, int emi, String transactiontype, int total) {
		super();
		this.id = id;
		this.loanamount = loanamount;
		this.emi = emi;
		this.transactiontype = transactiontype;
		this.total = total;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLoanamount() {
		return loanamount;
	}
	public void setLoanamount(int loanamount) {
		this.loanamount = loanamount;
	}
	public int getEmi() {
		return emi;
	}
	public void setEmi(int emi) {
		this.emi = emi;
	}
	public String getTransactiontype() {
		return transactiontype;
	}
	public void setTransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Loan [id=" + id + ", loanamount=" + loanamount + ", emi=" + emi + ", transactiontype=" + transactiontype
				+ ", total=" + total + "]";
	}
	
	
	

}
