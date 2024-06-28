package com.vickee.restapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "IMS")
public class ShopKeeper {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String shopname;
	private String sname;
	private long mobile;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private Dealer dealer;

	public ShopKeeper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShopKeeper(int sid, String shopname, String sname, long mobile, Dealer dealer) {
		super();
		this.sid = sid;
		this.shopname = shopname;
		this.sname = sname;
		this.mobile = mobile;
		this.dealer = dealer;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	
}
