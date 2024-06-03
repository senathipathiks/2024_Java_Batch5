package com.aravind.InheritanceMapAccount;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
//@Table(name="Account")
//@Table(name="Account1")
@Table(name="Account2")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Inheritance(strategy = InheritanceType.JOINED)
public class Account {
	@Id
	int accno;
	
	@Column
	String bname;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accno, String bname) {
		super();
		this.accno = accno;
		this.bname = bname;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", bname=" + bname + "]";
	}
	

}
