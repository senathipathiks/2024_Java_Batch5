package com.madhan.restapp.model;

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
@Table(name="Cus table")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private int phnno;
	@Column
	private int accno;
	@Column
	private int totalamount;
	
	@OneToOne(targetEntity = Loan.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "loan")
	private Loan loan;

	public Customer() {
		super();
		
	}

	public Customer(int id, String name, int phnno, int accno, int totalamount, Loan loan) {
		super();
		this.id = id;
		this.name = name;
		this.phnno = phnno;
		this.accno = accno;
		this.totalamount = totalamount;
		this.loan = loan;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhnno() {
		return phnno;
	}

	public void setPhnno(int phnno) {
		this.phnno = phnno;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public int getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phnno=" + phnno + ", accno=" + accno + ", totalamount="
				+ totalamount + ", loan=" + loan + "]";
	}
	
	
	
}
