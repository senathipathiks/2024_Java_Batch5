package com.gana.hibernateAccountTask;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "savings1")
public class Savings extends Account {
	
	int savedamount;

	public Savings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Savings(int accountid, String accountname, String accountbalance) {
		super(accountid, accountname, accountbalance);
		// TODO Auto-generated constructor stub
	}



	public Savings(int accountid, String accountname, String accountbalance, int savedamount) {
		super(accountid, accountname, accountbalance);
		this.savedamount = savedamount;
	}

	public int getSavedamount() {
		return savedamount;
	}

	public void setSavedamount(int savedamount) {
		this.savedamount = savedamount;
	}
	

}
