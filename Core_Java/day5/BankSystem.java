package com.day5;

import java.util.ArrayList;


//Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.

interface Account{
	int withdraw(int amount);
	int deposit(int amount);
	double balance();
	double interest();
}

class Bank{
	ArrayList<Account> acc;
	Bank(){
		acc= new ArrayList<>();
	}
	
	void addAccount(Account ac) {
		acc.add(ac);
	}
}

class SA implements Account{
	int bal = 1000;
	public int withdraw(int amount) {
		bal += amount;
		return bal;
	}
	public int deposit(int amount) {
		bal -= amount;
		return bal;
	}
	public double balance(){
		return bal;
	}
	
	public double interest() {
		return bal*0.05;
	}
	
}

class CA implements Account{
	int bal = 1000;
	public int withdraw(int amount) {
		bal += amount;
		return bal;
	}
	public int deposit(int amount) {
		bal -= amount;
		return bal;
	}
	public double balance(){
		return bal;
	}
	
	public double interest() {
		return bal*0.05;
	}
	
}
public class BankSystem {

	public static void main(String[] args) {
		Bank b = new Bank();
		SA save = new SA();
		System.out.println (save.withdraw(100));
		System.out.println (save.deposit(200));
		System.out.println (save.balance());
		System.out.println (save.interest());
		CA cur = new CA();
		System.out.println (cur.withdraw(100));
		System.out.println (cur.deposit(200));
		System.out.println (cur.balance());
		System.out.println (cur.interest());
		

	}

}
