package Hibernate.HibernateEg7_2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table (name="Acc_tbl_2")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Account 
{
	@Id
	int accountnum;
	@Column(name = "Holder_Name")
	String holdername;
	@Column(name = "ATM")
	String atm;
	
	public Account() 
	{
		super();
	}

	public Account(int accountnum, String holdername, String atm) {
		super();
		this.accountnum = accountnum;
		this.holdername = holdername;
		this.atm = atm;
	}

	public int getAccountnum() {
		return accountnum;
	}

	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}

	public String getHoldername() {
		return holdername;
	}

	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}

	public String getAtm() {
		return atm;
	}

	public void setAtm(String atm) {
		this.atm = atm;
	}

	@Override
	public String toString() {
		return "Account [accountnum=" + accountnum + ", holdername=" + holdername + ", atm=" + atm + "]";
	}
}
