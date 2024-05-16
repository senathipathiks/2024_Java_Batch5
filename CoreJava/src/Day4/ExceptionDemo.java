package Day4;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a=20,b=0;
		String name="velan";
		try 
		{
		int n= Integer.parseInt(name);
		int res=a/b;
		}
		catch(ArithmeticException Ae)
		{
			System.out.println(Ae);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		System.out.println("Exception handled successfully ");
	}
}
