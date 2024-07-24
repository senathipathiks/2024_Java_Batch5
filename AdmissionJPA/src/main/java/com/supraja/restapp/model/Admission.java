package com.supraja.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admission")
public class Admission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	@Column
	private String document;
	@Column
	private int quarterlyfee;
	@Column
	private int halfyearlyfee;
	@Column
	private int transportfee;
	@Column
	private int totalfee;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public int getQuarterlyfee() {
		return quarterlyfee;
	}

	public void setQuarterlyfee(int quarterlyfee) {
		this.quarterlyfee = quarterlyfee;
	}

	public int getHalfyearlyfee() {
		return halfyearlyfee;
	}

	public void setHalfyearlyfee(int halfyearlyfee) {
		this.halfyearlyfee = halfyearlyfee;
	}

	public int getTransportfee() {
		return transportfee;
	}

	public void setTransportfee(int transportfee) {
		this.transportfee = transportfee;
	}

	public int getTotalfee() {
		return totalfee;
	}

	public void setTotalfee(int totalfee) {
		this.totalfee = totalfee;
	}

	public Admission(int aid, String document, int quarterlyfee, int halfyearlyfee, int transportfee, int totalfee) {
		super();
		this.aid = aid;
		this.document = document;
		this.quarterlyfee = quarterlyfee;
		this.halfyearlyfee = halfyearlyfee;
		this.transportfee = transportfee;
		this.totalfee = totalfee;
	}

	public Admission() {
		super();
		// TODO Auto-generated constructor stub
	}

}