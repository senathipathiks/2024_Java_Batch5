package Day3;

//Bank.java
import java.util.ArrayList;

import java.util.List;


interface Account {
  void deposit(double amount);
  void withdraw(double amount);
  double getBalance();
}

//SavingsAccount.java (Class implementing Account)
class SavingsAccount1 implements Account {
	private double balance;
	private double interestRate;

	public SavingsAccount1(double initialDeposit, double interestRate) {
		this.balance = initialDeposit;
		this.interestRate = interestRate;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	public void applyInterest() {
		balance += balance * (interestRate / 100);
	}
}

//CurrentAccount.java (Class implementing Account)
class CurrentAccount implements Account {
	private double balance;
	private double overdraftLimit;

	public CurrentAccount(double initialDeposit, double overdraftLimit) {
		this.balance = initialDeposit;
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public void withdraw(double amount) {
		if (balance - amount >= -overdraftLimit) {
			balance -= amount;
		} else {
			System.out.println("Insufficient funds!");
		}
	}

	@Override
	public double getBalance() {
		return balance;
	}
}



class Bank {
	private List<Account> accounts;

	public Bank() {
		accounts = new ArrayList<>();
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	// You can add more methods related to managing accounts (e.g., view balances)

	public static void main(String[] args) {
		Bank bank = new Bank();

		// Create a SavingsAccount with an initial deposit of $1000 and an interest rate
		// of 5%
		SavingsAccount1 savingsAccount = new SavingsAccount1(1000, 5);
		bank.addAccount(savingsAccount);

		// Create a CurrentAccount with an initial deposit of $2000 and an overdraft
		// limit of $1000
		CurrentAccount currentAccount = new CurrentAccount(2000, 1000);
		bank.addAccount(currentAccount);

		// Perform transactions
		savingsAccount.deposit(200); // Deposit $200 into savings account
		currentAccount.withdraw(150); // Withdraw $150 from current account

		// Apply interest to the savings account
		savingsAccount.applyInterest();

		// Display balances
		System.out.println("Savings Account balance: $" + savingsAccount.getBalance());
		System.out.println("Current Account balance: $" + currentAccount.getBalance());
	}
}
