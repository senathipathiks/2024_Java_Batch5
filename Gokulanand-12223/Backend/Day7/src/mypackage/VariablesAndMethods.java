package mypackage;

public class VariablesAndMethods
{
	int b = 20;					 //Instance or Object Variable
	static int c = 30;			 //Static or Class Variable

	public static void main(String[] args)
	{
		int a = 10;           	 //Local Variable
		System.out.println(a);
		
		
		VariablesAndMethods obj = new VariablesAndMethods();			
		System.out.println(obj.b);
		
		
		System.out.println(VariablesAndMethods.c);		
		
	}
	
}
