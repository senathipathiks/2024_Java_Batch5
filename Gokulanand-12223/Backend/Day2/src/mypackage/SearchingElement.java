package mypackage;
import java.util.ArrayList;
import java.util.Scanner;
public class SearchingElement 
{

	public static void main(String[] args) 
	{
		int element;
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("Enter the element :");
		element=sc.nextInt();
		for(int i=0;i<list.size();i++)
		{
			if(element==list.get(i))
			{
				System.out.println("Yes!!!It is Present!!!");
				System.out.println("Index Position is :"+i);
			}
		}
	}
	

}
