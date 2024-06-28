package com.vickee.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_tbl")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String cusname;
	@Column
	private long phone;
	@Column
	private String caketype;
	@Column
	private int kg;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int id, String cusname, long phone, String caketype, int kg) {
		super();
		this.id = id;
		this.cusname = cusname;
		this.phone = phone;
		this.caketype = caketype;
		this.kg = kg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getCaketype() {
		return caketype;
	}
	public void setCaketype(String caketype) {
		this.caketype = caketype;
	}
	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	
}
