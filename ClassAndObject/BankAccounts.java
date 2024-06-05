package ClassAndObject;

//BankAccount.java (Parent class)
class BankAccount {
	protected String accountNumber;
	protected double balance;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balance");
		}
	}

	public double getBalance() {
		return balance;
	}
}

//SavingsAccount.java (Child class)
class SavingsAccount extends BankAccount {
	public SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (getBalance() - amount < 100) {
			System.out.println("Minimum balance of $100 required!");
		} else {
			super.withdraw(amount);
		}
	}
}

//CheckingAccount.java (Child class)
class CheckingAccount extends BankAccount {
	private double overdraftLimit;

	public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double amount) {
		if (balance - amount < -overdraftLimit) {
			System.out.println("Exceeds overdraft limit!");
		} else {
			super.withdraw(amount);
		}
	}
}

//Example usage in Main.java
public class BankAccounts {
	public static void main(String[] args) {

		// Create a SavingsAccount object
		SavingsAccount savingsAccount = new SavingsAccount("SA123", 500);
		savingsAccount.withdraw(200); // Withdraw $200
		System.out.println("Savings Account balance: $" + savingsAccount.getBalance());

		// Create a CheckingAccount object
		CheckingAccount checkingAccount = new CheckingAccount("CA456", 1000, 500);
     checkingAccount.withdraw(1500); // Withdraw $1500
		System.out.println("Checking Account balance: $" + checkingAccount.getBalance());
	}
}
