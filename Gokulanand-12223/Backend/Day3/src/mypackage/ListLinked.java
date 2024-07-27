package mypackage;

import java.util.LinkedList;

public class ListLinked
{

	public static void main(String[] args) 
	{

		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		
		list.add(2,25);
		System.out.println(list);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}

	}

}
