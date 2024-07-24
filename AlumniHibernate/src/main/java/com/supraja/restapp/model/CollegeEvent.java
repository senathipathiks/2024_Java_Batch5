package com.supraja.restapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "coll")
public class CollegeEvent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	@Column
	private String ename;
	@Column
	private String fundallocation;

	@OneToOne(targetEntity = Alumni.class, cascade = CascadeType.ALL)
	private Alumni alumni;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getFundallocation() {
		return fundallocation;
	}

	public void setFundallocation(String fundallocation) {
		this.fundallocation = fundallocation;
	}

	public Alumni getAlumni() {
		return alumni;
	}

	public void setAlumni(Alumni alumni) {
		this.alumni = alumni;
	}

	public CollegeEvent(int eid, String ename, String fundallocation, Alumni alumni) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.fundallocation = fundallocation;
		this.alumni = alumni;
	}

	public CollegeEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

}
