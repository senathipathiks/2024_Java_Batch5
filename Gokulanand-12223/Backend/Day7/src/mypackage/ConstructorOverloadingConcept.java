package mypackage;

//Constructor Overloading (or) Compile Time Polymorphism

public class ConstructorOverloadingConcept
{
	ConstructorOverloadingConcept(int a, int b)
	{
		System.out.println(a+b);
	}
	
	ConstructorOverloadingConcept(float a, float b)
	{
		System.out.println(a+b);
	}
	
	ConstructorOverloadingConcept(double a, double b)
	{
		System.out.println(a+b);
	}
	
	ConstructorOverloadingConcept(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args)
	{
		ConstructorOverloadingConcept obj1 = new ConstructorOverloadingConcept(10, 20);
		
		ConstructorOverloadingConcept obj2 = new ConstructorOverloadingConcept(10.5f, 20.5f);
		
		ConstructorOverloadingConcept obj3 = new ConstructorOverloadingConcept(10d, 20d);
		
		ConstructorOverloadingConcept obj4 = new ConstructorOverloadingConcept(10, 20, 30);
				
	}
}
