package mypackage;
import java.util.*;
public class QueueBasic
{
	public static void main(String[] args) 
	{
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(45);
		
		System.out.println(queue);
		
		System.out.println("-------------------------------------------");

		
		System.out.println("First element of queue is :"+queue.peek());
		
		System.out.println("-------------------------------------------");

		queue.poll();
		System.out.println(queue);
		
		System.out.println("-------------------------------------------");
		
		System.out.println("Wheteher there is any elements ?" + (!queue.isEmpty()));
		
		System.out.println("-------------------------------------------");
		
		Iterator<Integer> it = queue.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("-------------------------------------------");
		
		queue.stream().forEach(x -> System.out.println(x));
		
		System.out.println("-------------------------------------------");

		for(;!queue.isEmpty();)
		{
			System.out.println(queue.poll());
		}
	}
}
