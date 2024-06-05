package com.ani.hiberInheriEx1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Table(name="Account")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Account {
	@Id
	int accountid;
	@Column(name="name")
	String accountname;
	@Column(name="branch")
	String branch;
	@Override
	public String toString() {
		return "Account [accountid=" + accountid + ", accountname=" + accountname + ", branch=" + branch + "]";
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Account(int accountid, String accountname, String branch) {
		super();
		this.accountid = accountid;
		this.accountname = accountname;
		this.branch = branch;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
