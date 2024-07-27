package Hibernate.HibernateEg3;

public class Library 
{
	int bookid;
	String bookname;
	String receiverid;
	String receivername;
	
	public Library() 
	{
		super();
	}

	public Library(int bookid, String bookname, String receiverid, String receivername) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.receiverid = receiverid;
		this.receivername = receivername;
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

	public String getReceiverid() {
		return receiverid;
	}

	public void setReceiverid(String receiverid) {
		this.receiverid = receiverid;
	}

	public String getReceivername() {
		return receivername;
	}

	public void setReceivername(String receivername) {
		this.receivername = receivername;
	}

	@Override
	public String toString() {
		return "Library [bookid=" + bookid + ", bookname=" + bookname + ", receiverid=" + receiverid + ", receivername="
				+ receivername + "]";
	}	
}
