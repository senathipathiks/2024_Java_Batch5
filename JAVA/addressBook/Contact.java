package addressBook;
//plain old java object - POJO
//Java bean or Model or POJO class
//bean is a collection of public private getter and setter also 
//the purpose of bean class is to store the data in single box
public class Contact {
	private String fname;
	private String ename;
	private double mobile;
	private String email;

	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getMobile() {
		return mobile;
	}


	public void setMobile(double mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Contact() {
		super();
		
	}


	public Contact(String fname, String ename, double mobile, String email) {
		super();
		this.fname = fname;
		this.ename = ename;
		this.mobile = mobile;
		this.email = email;
	}


	public void display()
	{
		System.out.println("First Name : "+fname);
		System.out.println("Last Name : "+ename);
		System.out.println("Mobile number : "+mobile);
		System.out.println("Email : "+email);
		
	}

}
