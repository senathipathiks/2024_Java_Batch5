package mypackage;
import java.util.*;
public class Reverse
{
	public static void main(String[] args) 
	{
		Queue<Integer> element = new LinkedList<>();
		element.offer(100);
		element.offer(200);
		element.offer(300);
		element.offer(400);
		element.offer(500);
		
		System.out.println("Before Reversing :"+element);
		
		System.out.println("After Reversing :");
		Stack<Integer> stack = new Stack<>();
		
		while(!element.isEmpty())
		{
			stack.push(element.poll());
		}
		
		while(!stack.isEmpty())
		{
			element.offer(stack.pop());
		}
		System.out.println(element);
	}
}
