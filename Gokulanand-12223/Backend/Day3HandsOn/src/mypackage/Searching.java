package mypackage;
import java.util.*;
public class Searching
{
	public static void main(String[] args)
	{
		String element;
		int flag=0;
		Scanner sc=new Scanner(System.in);
		LinkedList<String> colour= new LinkedList<>();
		colour.add("Red");
		colour.add("Blue");
		colour.add("Green");
		colour.add("Black");
		colour.add("Brown");
		
		System.out.println("Enter the element to be Searched :");
		element=sc.nextLine();
		
		for(int i=0;i<colour.size();i++)
		{
			if(element.equals(colour.get(i)))
			{
				System.out.println("Element is Present @ Index "+i+"!!!");
				flag=1;
			}
		}		
		if(flag == 0)
		{
			System.out.println("Element is not found !!!");
		}
	}
}
