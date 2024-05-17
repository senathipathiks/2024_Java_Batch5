package day3;
class BankAccount{
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
 
class SavingsAcc extends BankAccount{
	
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
 
class CheckAccount extends BankAccount{
	
	int deposit() {
		return balance;
	}
	
	int withdraw() {
		return balance;
	}
	
}
public class Bank {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount B = new BankAccount();
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
