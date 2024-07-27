package mypackage;
import java.util.*;
public class DequeArray
{
	public static void main(String[] args)
	{
		Deque<Integer> element = new LinkedList<>();
		element.offer(100);
		element.offer(200);
		element.offer(300);
		element.offer(400);
		element.offer(500);
		
		System.out.println(element);
		
		element.offerFirst(50);
		element.offerLast(550);
		
		System.out.println(element);
	}

}
