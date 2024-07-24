package com.assessment.App.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ordertable")
public class Order {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;

    private String orderedItems;
    
    private Double totalAmount;
    
    private String Payment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Order(int orderId, String orderedItems, Double totalAmount, String payment, User user) {
		super();
		this.orderId = orderId;
		this.orderedItems = orderedItems;
		this.totalAmount = totalAmount;
		Payment = payment;
		this.user = user;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public String getOrderedItems() {
		return orderedItems;
	}


	public void setOrderedItems(String orderedItems) {
		this.orderedItems = orderedItems;
	}


	public Double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}


	public String getPayment() {
		return Payment;
	}


	public void setPayment(String payment) {
		Payment = payment;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderedItems=" + orderedItems + ", totalAmount=" + totalAmount
				+ ", Payment=" + Payment + ", user=" + user + "]";
	}


	

}
