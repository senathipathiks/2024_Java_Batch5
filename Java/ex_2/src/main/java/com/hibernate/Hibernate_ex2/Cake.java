package com.hibernate.Hibernate_ex2;

public class Cake {
	int cake_id;
	int cake_price;
	String cake_name;
	String cake_title;
	String cake_quantity;
	String cake_flavour;
	
	public Cake() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cake(int cake_id, int cake_price, String cake_name, String cake_title, String cake_quantity,
			String cake_flavour) {
		super();
		this.cake_id = cake_id;
		this.cake_price = cake_price;
		this.cake_name = cake_name;
		this.cake_title = cake_title;
		this.cake_quantity = cake_quantity;
		this.cake_flavour = cake_flavour;
	}

	@Override
	public String toString() {
		return "Cake [cake_id=" + cake_id + ", cake_price=" + cake_price + ", cake_name=" + cake_name + ", cake_title="
				+ cake_title + ", cake_quantity=" + cake_quantity + ", cake_flavour=" + cake_flavour + "]";
	}

	public int getCake_id() {
		return cake_id;
	}

	public void setCake_id(int cake_id) {
		this.cake_id = cake_id;
	}

	public int getCake_price() {
		return cake_price;
	}

	public void setCake_price(int cake_price) {
		this.cake_price = cake_price;
	}

	public String getCake_name() {
		return cake_name;
	}

	public void setCake_name(String cake_name) {
		this.cake_name = cake_name;
	}

	public String getCake_title() {
		return cake_title;
	}

	public void setCake_title(String cake_title) {
		this.cake_title = cake_title;
	}

	public String getCake_quantity() {
		return cake_quantity;
	}

	public void setCake_quantity(String cake_quantity) {
		this.cake_quantity = cake_quantity;
	}

	public String getCake_flavour() {
		return cake_flavour;
	}

	public void setCake_flavour(String cake_flavour) {
		this.cake_flavour = cake_flavour;
	}	
	
}
