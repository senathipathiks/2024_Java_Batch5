package com.madhan.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String pname;
	@Column
	private String category;
	@Column
	private int price;
	@Column
	private int deliverydate;
	@Column
	private String sellername;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String pname, String category, int price, int deliverydate, String sellername) {
		super();
		this.id = id;
		this.pname = pname;
		this.category = category;
		this.price = price;
		this.deliverydate = deliverydate;
		this.sellername = sellername;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDeliverydate() {
		return deliverydate;
	}
	public void setDeliverydate(int deliverydate) {
		this.deliverydate = deliverydate;
	}
	public String getSellername() {
		return sellername;
	}
	public void setSellername(String sellername) {
		this.sellername = sellername;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", category=" + category + ", price=" + price
				+ ", deliverydate=" + deliverydate + ", sellername=" + sellername + "]";
	}
	
	
	
	
}
