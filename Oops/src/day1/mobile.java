package day1;

class mob {
	int ram;
	double price;
	String brandName;
	
	mob(String brandName, double price, int ram){
		this.ram = ram;
		this.price = price;
		this.brandName = brandName;	
	}
	void display() {
		System.out.println("The BrandName: "+ brandName);
		System.out.println("The Price:"+ price);
		System.out.println("the Ram" + ram);
	}
}
public class mobile {
	public static void main(String[] args) {
		mob samsung = new mob("samsung", 19800, 8);
		mob samsung1 = new mob("samsung1", 19000, 10);
		samsung.display();
		samsung1.display();}
}

