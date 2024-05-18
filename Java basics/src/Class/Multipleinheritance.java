package Class;

class Loan  
{
	int amount;
	int totalyears;
	
	Loan(int amount,int totalyears)
	{
		this.amount = amount;
		this.totalyears = totalyears;
	}
	void display()
	{
		System.out.println("The total amount bought = " + amount);
		System.out.println("The total years for setteling a amount = " + totalyears);
	}
	
}

class Carloan extends Loan
{
        String modelofcar;
        int Yearmanufactured;
        
	Carloan(int amount, int totalyears,String modelofcar,int Yearmanufactured) {
		super(amount, totalyears);

		this.modelofcar = modelofcar;
		this.Yearmanufactured = Yearmanufactured;
		// TODO Auto-generated constructor stub
	}
	
	void display2()
	{
		System.out.println("The model of the car is: " +modelofcar);
		System.out.println("The year of car manufactured is: " +Yearmanufactured);
	
	}
}
class Homeloan extends Loan
{
	int Yearconstructed;
	int Amountneeded;
	Homeloan(int amount, int totalyears,int Yearconstructed,int Amountneeded) {
		super(amount, totalyears);
		// TODO Auto-generated constructor stub
	}
	
}
class personalloan extends Loan
{
	String reason;
	personalloan(int amount, int totalyears,String reason) {
		super(amount, totalyears);
		// TODO Auto-generated constructor stub
	}

	
}
public class Multipleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carloan obj = new Carloan(1000000,7,"Eon",2014);
		obj.display();
		obj.display2();

	}
}


