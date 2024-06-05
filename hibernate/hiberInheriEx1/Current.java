package com.ani.hiberInheriEx1;

import javax.persistence.Entity;

@Entity
public class Current extends Account {
	int withdraw;

	public Current() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Current(int accountid, String accountname, String branch) {
		super(accountid, accountname, branch);
		// TODO Auto-generated constructor stub
	}

	public Current(int accountid, String accountname, String branch, int withdraw) {
		super(accountid, accountname, branch);
		this.withdraw = withdraw;
	}

	@Override
	public String toString() {
		return "Current [withdraw=" + withdraw + "]";
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	

}
