package Exercises;

class Account{
	int balance=1000;
	
	int desposit(int amount) {
		balance=balance+amount;
		return balance;
	}
	int withdraw(int amount) {
		balance=balance-amount;
		return balance;
	}
}
 
class SavingsAcc extends Account{
	
	int withdraw(int amount) {
		if(balance>200) {
			balance=balance-amount;
		}
		return balance;
	}
	
	int desposit(int amount) {
		balance+=amount;
		return balance;
	}
}
 
class CheckAccount extends Account{
	
	int deposit() {
		return balance;
	}
	
	int withdraw() {
		return balance;
	}
	
}
public class BankAccount {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account B = new Account();
		System.out.println(B.desposit(2500));
		System.out.println(B.withdraw(500));
		SavingsAcc s = new SavingsAcc();
		System.out.println(s.withdraw(100));
		System.out.println(s.desposit(500));
		CheckAccount C = new CheckAccount();
		System.out.println(C.deposit());
		System.out.println(C.withdraw());
	}
 
}