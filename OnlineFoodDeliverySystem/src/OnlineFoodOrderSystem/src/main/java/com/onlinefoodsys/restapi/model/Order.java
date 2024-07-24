package com.onlinefoodsys.restapi.model;


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
@Table(name = "Order_tbl")
public class Order {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Order_id")
	private int id;
	
	@Column(name = "Restaurant_Name")
	private String name;
	
	@Column(name = "Location")
	private String city;
	
	@Column(name = "Contact")
	private long mobile;
	
	@Column(name = "Order_Item")
	private String item;
	
	@Column(name = "Quantity")
	private int nos;
	

	@Column(name = "Price")
	private int price;
	
	
	@ManyToOne(targetEntity=Customer.class, cascade = CascadeType.MERGE)
	@JoinColumn
	private Customer customer;


	public Order() {
		super();
		
	}


	public Order(int id, String name, String city, long mobile, String item, int nos, int price, Customer customer) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.mobile = mobile;
		this.item = item;
		this.nos = nos;
		this.price = price;
		this.customer = customer;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public long getMobile() {
		return mobile;
	}


	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}


	public int getNos() {
		return nos;
	}


	public void setNos(int nos) {
		this.nos = nos;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", city=" + city + ", mobile=" + mobile + ", item=" + item
				+ ", nos=" + nos +", Customer=" + customer + ", TotalAmt=" + price + "]";
	}
	
	
	
}
