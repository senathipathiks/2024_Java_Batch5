package mypackage;

import java.util.ArrayList;
import java.util.Scanner;
public class Searching 
{
	public static void main(String[] args)
	{
		String element;
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<>();
		list.add("Red");
		list.add("Orange");
		list.add("Blue");
		list.add("Green");
		list.add("Pink");
		
		System.out.println("Enter the element to be searched :");
		element=sc.nextLine();
		
		int flag=0;
		for(int i=0;i<list.size();i++)
		{
			if(element.equals(list.get(i)))
			{
				flag=1;
			}			
		}
		if(flag==1)
		{
			System.out.println("Yes !!! There is !!!");
		}
		else
		{
			System.out.println("No !!! There is Not !!!");
		}
	}
}
