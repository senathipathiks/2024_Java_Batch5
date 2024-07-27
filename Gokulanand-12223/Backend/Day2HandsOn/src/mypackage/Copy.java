package mypackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Copy 
{
	public static void main(String[] args)
	{
		ArrayList<String> list1=new ArrayList<>();
		list1.add("5");
		list1.add("100");
		list1.add("654");
		list1.add("1");
		list1.add("60");
		
		System.out.println("List 1 is :"+" "+list1);
		
		ArrayList<String> list2=new ArrayList<>(list1);
		System.out.println("List 2 is :"+" "+list2);

}
}