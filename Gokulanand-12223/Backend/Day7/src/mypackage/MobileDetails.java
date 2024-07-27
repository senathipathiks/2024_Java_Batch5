package mypackage;

class Mobile
{
	//Instance or Object Variables
	String brandName;
	double price;
	int ram;
	
	//Constructor
	Mobile(String brandName, double price, int ram)
	{
		this.brandName = brandName;
		this.price = price;
		this.ram = ram;
	}
	
	//Method
	void display()
	{
		System.out.println("Brand Name is " + brandName);
		System.out.println("Pricing is " + price);
		System.out.println("RAM Storage is " + ram);
		System.out.println("-------------------------------------");
		
	}
}
public class MobileDetails 
{
	public static void main(String[] args)
	{
		Mobile samsung = new Mobile("Samsung", 10000, 8);
		samsung.display();
		
		Mobile vivo = new Mobile("Vivo" , 15000, 16);
		vivo.display();
	}

}
