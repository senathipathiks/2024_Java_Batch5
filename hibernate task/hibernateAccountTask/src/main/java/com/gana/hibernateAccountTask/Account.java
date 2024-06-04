package com.gana.hibernateAccountTask;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="account2")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

@Inheritance(strategy = InheritanceType.JOINED)
public class Account {
	
		
		@Id
		int accountid;
		@Column(name="name")
		String accountname;
		@Column(name="balance")
		String accountbalance;
		public Account() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Account(int accountid, String accountname, String accountbalance) {
			super();
			this.accountid = accountid;
			this.accountname = accountname;
			this.accountbalance = accountbalance;
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
		public String getAccountbalance() {
			return accountbalance;
		}
		public void setAccountbalance(String accountbalance) {
			this.accountbalance = accountbalance;
		}
		@Override
		public String toString() {
			return "Account [accountid=" + accountid + ", accountname=" + accountname + ", accountbalance="
					+ accountbalance + "]";
		}
		
		
		

	}



