package com.hiber.Accounts_joined;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Account_Joined")
public class Account {
	@Id
	@Column(name = "Customer_ID")
	int cust_id;
	@Column(name = "Account_No")
	int accno;
	@Column(name = "Customer_Name")
	String cust_name;
	@Column(name = "Bank_Name")
	String bank_name;
	@Column(name = "Branch_Name")
	String branch_name;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int cust_id, int accno, String cust_name, String bank_name, String branch_name) {
		super();
		this.cust_id = cust_id;
		this.accno = accno;
		this.cust_name = cust_name;
		this.bank_name = bank_name;
		this.branch_name = branch_name;
	}

	@Override
	public String toString() {
		return "Account [cust_id=" + cust_id + ", accno=" + accno + ", cust_name=" + cust_name + ", bank_name="
				+ bank_name + ", branch_name=" + branch_name + "]";
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

}
