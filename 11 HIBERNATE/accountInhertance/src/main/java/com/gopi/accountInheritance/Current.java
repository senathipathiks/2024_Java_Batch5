package com.gopi.accountInheritance;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Current2")
//@AttributeOverrides({
//@AttributeOverride(name="accNum",column = @Column(name="AccNum")),
//@AttributeOverride(name="accType",column = @Column(name="AccType")),
//@AttributeOverride(name="bank",column = @Column(name="Bank")),
//@AttributeOverride(name="Branch",column = @Column(name="Branch"))
//})
public class Current extends Account {

	int currentAmount;

	public Current() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Current(int accNum, String accType, String bank, String branch) {
		super(accNum, accType, bank, branch);
		// TODO Auto-generated constructor stub
	}

	public Current(int accNum, String accType, String bank, String branch, int currentAmount) {
		super(accNum, accType, bank, branch);
		this.currentAmount = currentAmount;
	}

	public int getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(int currentAmount) {
		this.currentAmount = currentAmount;
	}
	
	
}
