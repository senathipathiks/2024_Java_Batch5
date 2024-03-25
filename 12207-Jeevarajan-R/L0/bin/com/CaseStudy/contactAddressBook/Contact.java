package CaseStudy.contactAddressBook;

public class Contact {

	private int mobileNumber;
	private String firstName;
	private String lastName;
	private String email;
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}
	
	public Contact(String firstName, String lastName, String email,int mobileNumber) {
		super();
		this.mobileNumber = mobileNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		System.out.println("Contact Name : "+firstName +" " +lastName );
		System.out.println("Contact Number : "+mobileNumber);
		System.out.println("Contact email : "+email );
		System.out.println("-------------------------------");
	}
	
	

}
