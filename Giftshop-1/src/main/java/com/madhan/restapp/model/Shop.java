package com.madhan.restapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="shop table")
public class Shop {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String prname;
	@Column
	private int available;
	@Column
	private int userrating;
	
	@OneToOne(targetEntity = Product.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "product")
	private Product product;

	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shop(int id, String prname, int available, int userrating, Product product) {
		super();
		this.id = id;
		this.prname = prname;
		this.available = available;
		this.userrating = userrating;
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrname() {
		return prname;
	}

	public void setPrname(String prname) {
		this.prname = prname;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public int getUserrating() {
		return userrating;
	}

	public void setUserrating(int userrating) {
		this.userrating = userrating;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Shop [id=" + id + ", prname=" + prname + ", available=" + available + ", userrating=" + userrating
				+ ", product=" + product + "]";
	}
	
	
	
	
}
