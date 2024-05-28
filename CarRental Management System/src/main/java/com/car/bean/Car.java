package com.car.bean;

public class Car {
	String cId;
	String cBrand;
	String cModal;
	String cPrice;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String cId, String cBrand, String cModal, String cPrice) {
		super();
		this.cId = cId;
		this.cBrand = cBrand;
		this.cModal = cModal;
		this.cPrice = cPrice;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getcBrand() {
		return cBrand;
	}
	public void setcBrand(String cBrand) {
		this.cBrand = cBrand;
	}
	public String getcModal() {
		return cModal;
	}
	public void setcModal(String cModal) {
		this.cModal = cModal;
	}
	public String getcPrice() {
		return cPrice;
	}
	public void setcPrice(String cPrice) {
		this.cPrice = cPrice;
	}
	
}
