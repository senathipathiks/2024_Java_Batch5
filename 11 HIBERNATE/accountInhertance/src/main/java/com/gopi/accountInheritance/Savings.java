package com.gopi.accountInheritance;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Savings2")
//@AttributeOverrides({
//@AttributeOverride(name="accNum",column = @Column(name="AccNum")),
//@AttributeOverride(name="accType",column = @Column(name="AccType")),
//@AttributeOverride(name="bank",column = @Column(name="Bank")),
//@AttributeOverride(name="Branch",column = @Column(name="Branch"))
//})
public class Savings extends Account {

	int savingsAmount;

	public Savings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Savings(int accNum, String accType, String bank, String branch) {
		super(accNum, accType, bank, branch);
		// TODO Auto-generated constructor stub
	}

	public Savings(int accNum, String accType, String bank, String branch, int savingsAmount) {
		super(accNum, accType, bank, branch);
		this.savingsAmount = savingsAmount;
	}

	public int getSavingsAmount() {
		return savingsAmount;
	}

	public void setSavingsAmount(int savingsAmount) {
		this.savingsAmount = savingsAmount;
	}
	
	
	
}
