package mypackage;
import java.util.*;
public class Compare
{
	public static void main(String[] args)
	{
		Queue<Integer> element1 = new LinkedList<>();
		element1.offer(100);
		element1.offer(200);
		element1.offer(300);
		element1.offer(400);
		element1.offer(500);
		
		Queue<Integer> element2 = new LinkedList<>();
		element2.offer(100);
		element2.offer(200);
		element2.offer(300);
		element2.offer(400);
		element2.offer(500);
		
		if(element1.containsAll(element2))
		{
			System.out.println("Elements are Same");
		}
		else
		{
			System.out.println("Elements are Different");
		}
	}
}

