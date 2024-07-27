package mypackage;

public class InstanceVsStaticMethods
{
	//Instance method Concept
	void method1()
	{
		System.out.println("Instance Method");
	}
	
	//Static method Concept
	static void method2()
	{
		System.out.println("Static Method");
	}
	
	public static void main(String[] args)
	{
		InstanceVsStaticMethods obj = new InstanceVsStaticMethods();
		
		obj.method1();								//Instance method 
		
		InstanceVsStaticMethods.method2();			//Static method
	}
}
