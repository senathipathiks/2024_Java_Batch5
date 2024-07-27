package mypackage;

import java.util.ArrayList;

public class Retrieve 
{
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<>();
		list.add("Red");
		list.add("Orange");
		list.add("Blue");
		list.add("Green");
		list.add("Pink");
		
		System.out.println(list.get(3));	
	}
}
