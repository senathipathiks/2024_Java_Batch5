package com.gopi.menuacc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AccDetails")
public class Account {

	
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column
	private int accId;
	@Column
	private int accNum;
	@Column
	private String accType;
	@Column
	private String bank;
	@Column
	private String branch;
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Account(int accId ,int accNum, String accType, String bank, String branch) {
		super();
		this.accId = accId;
		this.accNum = accNum;
		this.accType = accType;
		this.bank = bank;
		this.branch = branch;
	}

	public int getAccId() {
		return accId;
	}
	
	public int getAccNum() {
		return accNum;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}
	
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId +", accNum=" + accNum + ", accType=" + accType + ", bank=" + bank + ", branch=" + branch + "]";
	}
	
	
	
}
