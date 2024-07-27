package mypackage;

public class Contact {
	private String fname ;
	private String lname;
	private String email;
	private long phno;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public Contact(String fname, String lname, String email, long phno) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phno = phno;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void display() {
		System.out.println("First name :"+fname);
		System.out.println("Last name :"+lname);
		System.out.println("Email :"+email);
		System.out.println("Ph no :"+phno);
		
	
	}
	

}
