package com.hiber.Hiber_Operations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int bookid;
	@Column
	String bookname;
	@Column
	int custid;
	@Column
	String custname;
	@Column
	String validity;
	
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Books(int bookid, String bookname, int custid, String custname, String validity) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.custid = custid;
		this.custname = custname;
		this.validity = validity;
	}

	@Override
	public String toString() {
		return "\n\n ------------------------- \n \t\t\t***Indian Library*** \nBook ID= " + bookid + "\nBook Name= " + bookname + "\nCustomer ID= " + custid + "\nCustomer Name= " + custname
				+ "\nBook Validity= " + validity + "]\n ---------------------------";
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}
	
}
