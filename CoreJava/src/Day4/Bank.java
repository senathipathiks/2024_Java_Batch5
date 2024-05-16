package Day4;

class BankAccount{
	int balance=10000;
	
	void deposite(int amount) {
		balance=balance+amount;
		System.out.println("Bank Balance After Deposite :"+balance);
	}
	void withdraw(int amount) {
		balance=balance-amount;
        System.out.println("Bank Balance After Withdraw :"+balance);
	}
}

class SavingAccount extends BankAccount{
	
	void withdraw(int amount) {
		balance=2000;
		if(balance>2000) {
			balance-=amount;
			System.out.println("Balance :"+balance);
		}
		else {
			System.out.println("Your Balance is below 2000 unable to withdraw");
		}
	}
}

class CheckingAccount extends BankAccount{
	
	void withdraw(int amount) {
		balance =2000;
		int fine=200;
		if(balance>2000) {
		  balance-=amount;
		  System.out.println("Balance :"+balance); 
		}
		else {
		  System.out.println("Your Balance is below 2000 unable to withdraw");
          balance-=fine;
          System.out.println("Fine :"+fine);
		}
	}
	
}
public class Bank {

	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		ba.deposite(2000);
		ba.withdraw(5000);
		SavingAccount sa=new SavingAccount();
	    sa.withdraw(1000);
		CheckingAccount ca=new CheckingAccount();
		ca.withdraw(1000);
		}

}
