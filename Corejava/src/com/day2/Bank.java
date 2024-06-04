package com.day2;

class BankName
{
	private String name ;
	private int amount ;
	private int year ;
	
	BankName(String name,int amount,int year)
	{
		this.name = name;
		this.amount = amount;
		this.year = year;
		
}
	void display()
	{
		System.out.println("name:"+name);
		System.out.println("amount:"+amount);
		System.out.println("year:"+year);
	}
}

class CarLoan extends BankName
{
	int carno;
	int loanamount;
	
	CarLoan(String name,int amount,int year,int carno,int loanamount)
	{
		super(name,amount,year);
		this.carno = carno;
		this.loanamount = loanamount;
	}
	void display() {
		super.display();
		System.out.println("carno:"+carno);
		System.out.println("loanamount:"+loanamount);
		
	}
}


class HomeLoan extends BankName
{
	int homeno;
	int loanamount;
	
	HomeLoan(String name,int amount,int year,int homeno,int loanamount)
	{
		super(name,amount,year);
		this.homeno = homeno;
		this.loanamount = loanamount;
	}
	void display() {
		super.display();
		System.out.println("homeno:"+homeno);
		System.out.println("loanamount:"+loanamount);
		
	}
}
public class Bank {

	public static void main(String[] args) {
		CarLoan car = new CarLoan("ms",57,7178,243,13);
		car.display();
		HomeLoan home = new HomeLoan("gyh",67,68,79,68);
		home.display();

	}

}
