package com.srienath.restapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="pets")
public class Pets {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ppid")
	private int ppid;
	@Column(name="ppname")
	private String ppname;
	@Column(name="pptype")
	private String pptype;
	@Column(name="pgender")
	private String pgender;
	@Column(name="pbreed")
	private String pbreed;
	@Column(name="page")
	private String page;
	@Column(name="pstockLeft")
	private int pstockLeft;
	@Column(name="price")
	private int price;
	
	

	public int getPpid() {
		return ppid;
	}
	public void setPpid(int ppid) {
		this.ppid = ppid;
	}
	public String getPpname() {
		return ppname;
	}
	public void setPpname(String ppname) {
		this.ppname = ppname;
	}
	public String getPptype() {
		return pptype;
	}
	public void setPptype(String pptype) {
		this.pptype = pptype;
	}
	public String getPgender() {
		return pgender;
	}
	public void setPgender(String pgender) {
		this.pgender = pgender;
	}
	public String getPbreed() {
		return pbreed;
	}
	public void setPbreed(String pbreed) {
		this.pbreed = pbreed;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public int getPstockLeft() {
		return pstockLeft;
	}
	public void setPstockLeft(int pstockLeft) {
		this.pstockLeft = pstockLeft;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Pets(int ppid, String ppname, String pptype, String pgender, String pbreed, String page, int pstockLeft,
			int price) {
		super();
		this.ppid = ppid;
		this.ppname = ppname;
		this.pptype = pptype;
		this.pgender = pgender;
		this.pbreed = pbreed;
		this.page = page;
		this.pstockLeft = pstockLeft;
		this.price = price;
	}
	public Pets() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
	
}
