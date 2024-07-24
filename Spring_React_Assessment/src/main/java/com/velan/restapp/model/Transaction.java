package com.velan.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Transaction Id")
	private int tid;
	@Column(name = "Account Number")
	private long acno;
	@Column(name = "Transaction Type")
	private String type;
	@Column(name = "Amount")
	private double amount;
	@Column(name = "Transaction Date")
	private String date;
	
	public Transaction() {
		super();
	}

	public Transaction(int tid, long acno, String type, double amount, String date) {
		super();
		this.tid = tid;
		this.acno = acno;
		this.type = type;
		this.amount = amount;
		this.date = date;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public long getAcno() {
		return acno;
	}

	public void setAcno(long acno) {
		this.acno = acno;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Transaction [tid=" + tid + ", acno=" + acno + ", type=" + type + ", amount=" + amount + ", date=" + date
				+ "]";
	}

}
