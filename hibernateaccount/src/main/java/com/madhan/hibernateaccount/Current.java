package com.madhan.hibernateaccount;

import javax.persistence.Entity;

@Entity
public class Current extends Account {

	int curramount;

	public Current() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Current(int accno, String accholder) {
		super(accno, accholder);
		// TODO Auto-generated constructor stub
	}

	public Current(int accno, String accholder, int curramount) {
		super(accno, accholder);
		this.curramount = curramount;
	}

	public int getCurramount() {
		return curramount;
	}

	public void setCurramount(int curramount) {
		this.curramount = curramount;
	}

	
	
	
}
