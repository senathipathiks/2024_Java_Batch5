package com.nsms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="springProduct")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int prodID;
	@Column
	private String prodName;
	@Column
	private double price;
	@Column
	private String prodType;
	@Column
	private String prodStatus;
	@Column
	private int stockLeft;
	public int getProdID() {
		return prodID;
	}
	public void setProdID(int prodID) {
		this.prodID = prodID;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProdType() {
		return prodType;
	}
	public void setProdType(String prodType) {
		this.prodType = prodType;
	}
	public String getProdStatus() {
		return prodStatus;
	}
	public void setProdStatus(String prodStatus) {
		this.prodStatus = prodStatus;
	}
	public int getStockLeft() {
		return stockLeft;
	}
	public void setStockLeft(int stockLeft) {
		this.stockLeft = stockLeft;
	}
	public Product(int prodID, String prodName, double price, String prodType, String prodStatus, int stockLeft) {
		super();
		this.prodID = prodID;
		this.prodName = prodName;
		this.price = price;
		this.prodType = prodType;
		this.prodStatus = prodStatus;
		this.stockLeft = stockLeft;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [prodID=" + prodID + ", prodName=" + prodName + ", price=" + price + ", prodType=" + prodType
				+ ", prodStatus=" + prodStatus + ", stockLeft=" + stockLeft + "]";
	}
	
	

}
