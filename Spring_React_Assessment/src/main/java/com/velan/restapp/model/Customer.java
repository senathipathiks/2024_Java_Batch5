package com.velan.restapp.model;


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
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Customer ID")
	private int cid;
	@Column(name="Customer Name")
	private String name;
	@Column(name="Address")
	private String addr;
	@Column(name="Mobile Number")
	private String mobileno;
	
	
	@OneToOne(targetEntity = Transaction.class  , cascade = CascadeType.ALL)
	@JoinColumn(name="tid")
	private Transaction trans;
	
	public Customer() {
		super();
	}

	public Customer(int cid, String name, String addr, String mobileno, Transaction trans) {
		super();
		this.cid = cid;
		this.name = name;
		this.addr = addr;
		this.mobileno = mobileno;
		this.trans = trans;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public Transaction getTrans() {
		return trans;
	}

	public void setTrans(Transaction trans) {
		this.trans = trans;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", addr=" + addr + ", mobileno=" + mobileno + ", trans="
				+ trans + "]";
	}

}
