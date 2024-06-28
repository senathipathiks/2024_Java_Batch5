package com.hiber.Inheritance_Accounts;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Current_Account")
public class Current extends Account {
	
	String acc_type;
	int interest_percentage;
	int min_bal;
	
	public Current() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Current(int cust_id, int accno, String cust_name, String bank_name, String branch_name, String acc_type,
			int interest_percentage, int min_bal) {
		super(cust_id, accno, cust_name, bank_name, branch_name);
		this.acc_type = acc_type;
		this.interest_percentage = interest_percentage;
		this.min_bal = min_bal;
	}

	@Override
	public String toString() {
		return "Current [acc_type=" + acc_type + ", interest_percentage=" + interest_percentage + ", min_bal=" + min_bal
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
