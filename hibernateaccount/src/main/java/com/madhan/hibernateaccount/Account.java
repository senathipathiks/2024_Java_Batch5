package com.madhan.hibernateaccount;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="account")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class Account {
	@Id
	int accno;
	@Column(name="name")
	String accholder;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accno, String accholder) {
		super();
		this.accno = accno;
		this.accholder = accholder;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccholder() {
		return accholder;
	}
	public void setAccholder(String accholder) {
		this.accholder = accholder;
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", accholder=" + accholder + "]";
	}
	
	

	
	
}
