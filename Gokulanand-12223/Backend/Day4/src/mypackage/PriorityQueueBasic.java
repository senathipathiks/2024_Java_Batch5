package mypackage;
import java.util.*;
public class PriorityQueueBasic
{
	public static void main(String[] args) 
	{
		Queue<Integer> queue= new PriorityQueue<>(Collections.reverseOrder());
		queue.offer(5);
		queue.offer(1);
		queue.offer(6);
		queue.offer(8);
		queue.offer(2);
		queue.offer(7);
		queue.offer(3);
		queue.offer(4);
		
		System.out.println(queue);
		
		while(!queue.isEmpty())
		{
		queue.poll();
		System.out.println(queue);
		}
	/*	
		queue.poll();
		System.out.println(queue);	
		
		queue.removeAll(queue);
		System.out.println(queue);*/
	}
}
