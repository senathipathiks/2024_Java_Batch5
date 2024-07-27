package com.coffee.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserID")
	private int uid;
	@Column(name = "User_Name")
	private String uname;
	
	@ManyToOne(cascade = CascadeType.MERGE,targetEntity = Orders.class)
	@JoinColumn
	private Orders orders;

	public User() {
		super();
	}

	public User(int uid, String uname, Orders orders) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", orders=" + orders + "]";
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
}
