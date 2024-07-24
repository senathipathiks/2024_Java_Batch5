package com.nandha.AccountInheritance.JOINED;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Savings_Account_joined")
public class Savings extends Account {
	
	String acc_type;
	int interest_percentage;
	int min_bal;
	public Savings() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Savings(int cust_id, int accno, String cust_name, String bank_name, String branch_name, String acc_type,
			int interest_percentage, int min_bal) {
		super(cust_id, accno, cust_name, bank_name, branch_name);
		this.acc_type = acc_type;
		this.interest_percentage = interest_percentage;
		this.min_bal = min_bal;
	}
	@Override
	public String toString() {
		return "Savings [acc_type=" + acc_type + ", interest_percentage=" + interest_percentage + ", min_bal=" + min_bal
				+ "]";
	}
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	public int getInterest_percentage() {
		return interest_percentage;
	}
	public void setInterest_percentage(int interest_percentage) {
		this.interest_percentage = interest_percentage;
	}
	public int getMin_bal() {
		return min_bal;
	}
	public void setMin_bal(int min_bal) {
		this.min_bal = min_bal;
	}
	
	
	
}

