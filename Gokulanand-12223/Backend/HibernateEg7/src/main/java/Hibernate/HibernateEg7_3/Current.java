package Hibernate.HibernateEg7_3;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Current2")
public class Current extends Account 
{
	String accountype;

	public Current() 
	{
		super();
	}

	public Current(int accountnum, String holdername, String atm) 
	{
		super(accountnum, holdername, atm);
	}

	public Current(int accountnum, String holdername, String atm, String accountype) {
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
