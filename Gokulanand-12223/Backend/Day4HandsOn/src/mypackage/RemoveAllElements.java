package mypackage;
import java.util.*;
public class RemoveAllElements 
{
	public static void main(String[] args)
	{
		Queue<Integer> element = new LinkedList<>();
		element.offer(100);
		element.offer(200);
		element.offer(300);
		element.offer(400);
		element.offer(500);
		
		System.out.println("Before Removing :");
		System.out.println(element);
		
		element.removeAll(element);
		System.out.println("After Removing :");
		System.out.println(element);
	}
}
