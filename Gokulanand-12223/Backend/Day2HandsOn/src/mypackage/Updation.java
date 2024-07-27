package mypackage;

import java.util.ArrayList;

public class Updation 
{
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<>();
		list.add("Red");
		list.add("Orange");
		list.add("Blue");
		list.add("Green");
		list.add("Pink");
		
		list.set(2, "Purple");
		System.out.println(list);	
	}
}
