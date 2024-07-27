package mypackage;
import java.util.*;
public class RetrievingWithoutRemoving 
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
		
		System.out.println("Retrieved Element is :"+element.peek());
	}

}
