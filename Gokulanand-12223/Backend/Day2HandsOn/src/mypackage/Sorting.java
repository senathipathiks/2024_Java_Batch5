package mypackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sorting 
{
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<>();
		list.add("5");
		list.add("100");
		list.add("654");
		list.add("1");
		list.add("60");
		
		System.out.println(list);
		
		System.out.println("------------------------------");
		
		Collections.sort(list);
		System.out.println(list);
}
}