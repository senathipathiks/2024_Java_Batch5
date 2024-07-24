package com.velan.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Product Id")
	private int id;
	@Column(name="Product Name")
	private String prodname;
	@Column(name="Product Price")
	private int prodprice;
	@Column(name="Product Quantity")
	private int prodquantity;
	

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(int id, String prodname, int prodprice, int prodquantity) {
		super();
		this.id = id;
		this.prodname = prodname;
		this.prodprice = prodprice;
		this.prodquantity = prodquantity;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getProdname() {
		return prodname;
	}


	public void setProdname(String prodname) {
		this.prodname = prodname;
	}


	public int getProdprice() {
		return prodprice;
	}


	public void setProdprice(int prodprice) {
		this.prodprice = prodprice;
	}


	public int getProdquantity() {
		return prodquantity;
	}


	public void setProdquantity(int prodquantity) {
		this.prodquantity = prodquantity;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", prodname=" + prodname + ", prodprice=" + prodprice + ", prodquantity="
				+ prodquantity + "]";
	}

	

}
