package Polymorphism;

public class Polymorphism {// Method overloading
	
	public static void area(int side)
	{
		System.out.println(side*side);
	}
	public static void area(int l,int b)
	{
		System.out.println(l*b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area(5);
		area(5,4);

	}

}
