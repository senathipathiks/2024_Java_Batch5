package com.madhan.hibernatevechile;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="vechile")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vechile {
	
	@Id
	int vno;
	@Column(name="name")
	String vname;
	public Vechile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vechile(int vno, String vname) {
		super();
		this.vno = vno;
		this.vname = vname;
	}
	public int getVno() {
		return vno;
	}
	public void setVno(int vno) {
		this.vno = vno;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	
	
	
	

}
