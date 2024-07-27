package mypackage;
import java.util.*;
public class Poll 
{
	public static void main(String[] args)
	{
		Queue<Integer> element = new LinkedList<>();
		element.offer(100);
		element.offer(200);
		element.offer(300);
		element.offer(400);
		element.offer(500);
				
		System.out.println("Elements are :"+element);
		
		element.poll();
		System.out.println("Now Elements are :"+element);
	}
}
