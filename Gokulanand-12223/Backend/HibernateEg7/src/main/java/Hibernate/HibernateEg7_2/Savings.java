package Hibernate.HibernateEg7_2;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Savings")
public class Savings extends Account 
{
	String accountype;

	public Savings() 
	{
		super();
	}

	public Savings(int accountnum, String holdername, String atm) 
	{
		super(accountnum, holdername, atm);
	}

	public Savings(int accountnum, String holdername, String atm, String accountype) {
		super(accountnum, holdername, atm);
		this.accountype = accountype;
	}

	public String getAccountype() {
		return accountype;
	}

	public void setAccountype(String accountype) {
		this.accountype = accountype;
	}
}
