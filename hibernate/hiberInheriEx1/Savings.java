package com.ani.hiberInheriEx1;

import javax.persistence.Entity;

@Entity
public class Savings extends Account {
	float viewbalance;

	@Override
	public String toString() {
		return "Savings [viewbalance=" + viewbalance + "]";
	}

	public float getViewbalance() {
		return viewbalance;
	}

	public void setViewbalance(float viewbalance) {
		this.viewbalance = viewbalance;
	}

	public Savings(int accountid, String accountname, String branch, float viewbalance) {
		super(accountid, accountname, branch);
		this.viewbalance = viewbalance;
	}

	public Savings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Savings(int accountid, String accountname, String branch) {
		super(accountid, accountname, branch);
		// TODO Auto-generated constructor stub
	}

}
