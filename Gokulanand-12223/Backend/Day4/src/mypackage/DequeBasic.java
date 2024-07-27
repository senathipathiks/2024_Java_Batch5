package mypackage;
import java.util.*;
public class DequeBasic
{
	public static void main(String[] args)
	{
		Deque<Integer> deque=new LinkedList<>();
		deque.offer(10);
		deque.offer(20);
		deque.offer(30);
		deque.offer(40);
		
		System.out.println(deque);
		
		System.out.println("-------------------------------------");
		
		deque.offerFirst(5);
		deque.offerLast(50);
		System.out.println(deque);
		
		System.out.println("-------------------------------------");
		
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());
		
		System.out.println("-------------------------------------");
		
		System.out.println(deque.pollFirst());
		System.out.println(deque.pollLast());
		System.out.println(deque);
	}
}
