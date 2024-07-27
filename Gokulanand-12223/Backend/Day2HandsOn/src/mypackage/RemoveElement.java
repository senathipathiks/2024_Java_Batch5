package mypackage;

import java.util.ArrayList;

public class RemoveElement 
{
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<>();
		list.add("Red");
		list.add("Orange");
		list.add("Blue");
		list.add("Green");
		list.add("Pink");
		
		System.out.println(list);
		
		System.out.println("------------------------------");
		
		list.remove(2);
		System.out.println(list);	
	}
}
