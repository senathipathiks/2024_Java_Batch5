package mypackage;
import java.util.*;
public class CheckEmptyOrNot 
{
	public static void main(String[] args)
	{
		Queue<Integer> element = new LinkedList<>();
		element.offer(100);
		element.offer(200);
		element.offer(300);
		element.offer(400);
		element.offer(500);			
		
		System.out.println(element);
		
		int flag=0;
		for(int i=0;i<element.size();i++)
		{
			if(!element.isEmpty())
				flag=1;
		}
		if(flag!=1)
			System.out.println("No Elements is there !!!");
		else
			System.out.println("Yes !!! There are some Elements");
	}
}
