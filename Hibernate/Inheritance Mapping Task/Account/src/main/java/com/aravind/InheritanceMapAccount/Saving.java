package com.aravind.InheritanceMapAccount;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="saving1")
public class Saving extends Account {
	float withdraw;
	float deposit;
	public Saving() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Saving(int accno, String bname) {
		super(accno, bname);
		// TODO Auto-generated constructor stub
	}
	
	
	public Saving(int accno, String bname, float withdraw, float deposit) {
		super(accno, bname);
		this.withdraw = withdraw;
		this.deposit = deposit;
	}
	public float getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(float withdraw) {
		this.withdraw = withdraw;
	}
	public float getDeposit() {
		return deposit;
	}
	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
	
	@Override
	public String toString() {
		return "Saving [withdraw=" + withdraw + ", deposit=" + deposit + "]";
	}
	
	
	
	


	
	
	
	

}
