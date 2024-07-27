package com.coffee.model;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orders")
@CrossOrigin(origins = "http://localhost:3000")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OrderID")
	private int oid;
	@Column(name = "Coffee_Name")
	private String coffeename;
	@Column(name = "Amount")
	private int amount;
	
	public Orders() {
		super();
	}
	
	public Orders(int oid, String coffeename, int amount) {
		super();
		this.oid = oid;
		this.coffeename = coffeename;
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", coffeename=" + coffeename + ", amount=" + amount + "]";
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getCoffeename() {
		return coffeename;
	}
	public void setCoffeename(String coffeename) {
		this.coffeename = coffeename;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
}
