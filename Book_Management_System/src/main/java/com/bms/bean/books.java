package com.bms.bean;

public class books {
	int Bookid;
	String Bookname;
	String Bookauthor;
	String Bookdateofbuy;
	public books() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getBookid() {
		return Bookid;
	}

	public void setBookid(int bookid) {
		Bookid = bookid;
	}

	public String getBookname() {
		return Bookname;
	}

	public void setBookname(String bookname) {
		Bookname = bookname;
	}

	public String getBookauthor() {
		return Bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		Bookauthor = bookauthor;
	}

	public String getBookdateofbuy() {
		return Bookdateofbuy;
	}

	public void setBookdateofbuy(String bookdateofbuy) {
		Bookdateofbuy = bookdateofbuy;
	}

	public books(int bookid, String bookname, String bookauthor, String bookdateofbuy) {
		super();
		Bookid = bookid;
		Bookname = bookname;
		Bookauthor = bookauthor;
		Bookdateofbuy = bookdateofbuy;
	}
	
	
}
