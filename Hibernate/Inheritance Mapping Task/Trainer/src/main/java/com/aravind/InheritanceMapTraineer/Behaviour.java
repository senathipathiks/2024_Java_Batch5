package com.aravind.InheritanceMapTraineer;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Behaviour1")
public class Behaviour extends Trainner {
	
	String qual;
	String desg;
	
	
	public Behaviour() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Behaviour(int tid, String tname, String city) {
		super(tid, tname, city);
		// TODO Auto-generated constructor stub
	}


	public Behaviour(int tid, String tname, String city, String qual, String desg) {
		super(tid, tname, city);
		this.qual = qual;
		this.desg = desg;
	}


	public String getQual() {
		return qual;
	}


	public void setQual(String qual) {
		this.qual = qual;
	}


	public String getDesg() {
		return desg;
	}


	public void setDesg(String desg) {
		this.desg = desg;
	}


	@Override
	public String toString() {
		return "Behaviour [qual=" + qual + ", desg=" + desg + "]";
	}
	
	
	
	

}
