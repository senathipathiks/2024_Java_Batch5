package com.eb.testing.model;


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
@Table(name = "Billing_tbl")

public class Bill {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Bill_id")
	private int id;
	
	@Column(name = "Rate_Type")
	private String type;
	
	@Column(name = "EB-Branch")
	private String city;
	
	@Column(name = "Contact")
	private long mobile;
	
	@Column(name = "Bill_Due_Date")
	private String date;
	
	
	@Column(name = "UnitsConsumed")
	private int nos;
	

	@Column(name = "PricePerUnit")
	private int price;
	
	@Column(name = "Total_Bill")
	private int bill;
	
	
	@OneToOne(targetEntity=Customer.class, cascade = CascadeType.MERGE)
	@JoinColumn
	private Customer customer;


	public Bill() {
		super();
		
	}


	public Bill(int id, String type, String city, long mobile, String date, int nos, int price, int bill,
			Customer customer) {
		super();
		this.id = id;
		this.type = type;
		this.city = city;
		this.mobile = mobile;
		this.date = date;
		this.nos = nos;
		this.price = price;
		this.bill = bill;
		this.customer = customer;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
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


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
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


	public int getBill() {
		return bill;
	}


	public void setBill(int bill) {
		this.bill = bill;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Bill [id=" + id + ", type=" + type + ", city=" + city + ", mobile=" + mobile + ", date=" + date
				+ ", nos=" + nos + ", price=" + price + ", bill=" + bill + ", customer=" + customer + "]";
	}


	
}
