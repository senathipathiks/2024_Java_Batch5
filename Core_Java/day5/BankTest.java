package com.day5;
//Write a Java program to create a base class BankAccount with methods deposit() and withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the withdraw() method in each subclass to impose different withdrawal limits and fees.
class BankAccount{
	int bal = 1000;
	int deposit(int amount) {
		System.out.println("Deposited ="+amount);
		bal += amount;
		return bal;
		
	}
	int withdraw(int amount) {
		System.out.println("with draw amount ="+amount);
		bal -= amount;
		return bal;
		
		
	}
}
class SavingAccount extends BankAccount{
	int withdraw(int amount) {
		if(bal > 200) {
			bal -= amount;
			
		}
		return bal;
	}
	int deposit(int amount) {
		bal += amount;
		return bal;
	}
	
}
class CheckingAccount extends BankAccount{
	int withdraw() {
		return bal;
	}
	int deposit() {
		return bal;
	}
}
public class BankTest {

	public static void main(String[] args) {
		CheckingAccount c = new CheckingAccount();
		System.out.println(c.withdraw(500));
		System.out.println(c.deposit(500));
		SavingAccount s = new SavingAccount();
		System.out.println(s.withdraw(1000));
		System.out.println(s.deposit(50));

	}

}
