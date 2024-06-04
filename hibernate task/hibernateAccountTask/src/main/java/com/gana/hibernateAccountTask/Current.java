package com.gana.hibernateAccountTask;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "current1")
public class Current extends Account {
	int currentbalance;

	public Current() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Current(int accountid, String accountname, String accountbalance) {
		super(accountid, accountname, accountbalance);
		// TODO Auto-generated constructor stub
	}


	public Current(int accountid, String accountname, String accountbalance, int currentbalance) {
		super(accountid, accountname, accountbalance);
		this.currentbalance = currentbalance;
	}

	public int getCurrentbalance() {
		return currentbalance;
	}

	public void setCurrentbalance(int currentbalance) {
		this.currentbalance = currentbalance;
	}

	
	

}
