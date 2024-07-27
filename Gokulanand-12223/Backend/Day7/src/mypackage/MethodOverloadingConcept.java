package mypackage;

//Method Overloading (or) Compile Time Polymorphism

public class MethodOverloadingConcept
{
	void addition(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void addition(float a, float b)
	{
		System.out.println(a+b);
	}
	
	void addition(double a, double b)
	{
		System.out.println(a+b);
	}
	
	void addition(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args)
	{
		MethodOverloadingConcept obj = new MethodOverloadingConcept();
		
		obj.addition(10,20);
		
		obj.addition(10.5f, 20.5f);
		
		obj.addition(10d, 20d);
		
		obj.addition(10, 20, 30);
			
	}
}
