package com.madhan.hibernateaccount;

import javax.persistence.Entity;

@Entity
public class Savings extends Account {
	int savings;

	public Savings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Savings(int accno, String accholder) {
		super(accno, accholder);
		// TODO Auto-generated constructor stub
	}

	public Savings(int accno, String accholder, int savings) {
		super(accno, accholder);
		this.savings = savings;
	}

	public int getSavings() {
		return savings;
	}

	public void setSavings(int savings) {
		this.savings = savings;
	}
	

}
