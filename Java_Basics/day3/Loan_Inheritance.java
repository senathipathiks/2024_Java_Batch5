package day3;

class loan {
	private int amount;
	private int years;

	loan(int amount, int years) {
		this.amount = amount;
		this.years = years;
	}

	void display() {
		System.out.println("The Amount of loan is " + amount);
		System.out.println("The Number of years are " + years);
	}
}

class personalLoan extends loan {
	String reason;

	personalLoan(int amount, int years, String reason) {
		super(amount, years);
		this.reason = reason;
	}

	void display() {
		super.display();
		System.out.println("The Reason is " + reason);
	}
}

class carLoan extends loan {
	String carname;

	carLoan(int amount, int years, String carname) {
		super(amount, years);
		this.carname = carname;
	}

	void display() {
		super.display();
		System.out.println("The Carname is " + carname);
	}
}

class homeLoan extends loan {
	int houseno;

	homeLoan(int amount, int years, int houseno) {
		super(amount, years);
		this.houseno = houseno;
	}

	void display() {
		super.display();
		System.out.println("The House Number is " + houseno);
	}
}

public class Loan_Inheritance {

	public static void main(String[] args) {
		carLoan hl = new carLoan(100000, 100, "Pagero");
		hl.display();
	}

}




