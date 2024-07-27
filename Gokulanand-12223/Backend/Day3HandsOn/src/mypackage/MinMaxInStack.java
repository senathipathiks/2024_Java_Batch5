package mypackage;
import java.util.*;
public class MinMaxInStack
{
	public static void main(String[] args)
	{
		Stack<Integer> element = new Stack<>();
		element.push(6);
		element.push(1);
		element.push(3);
		element.push(4);
		element.push(5);
		element.push(2);
		
		System.out.println("Elements are :"+element);
		
		System.out.println("Maximum element from the stack is :"+Collections.max(element));
		
		System.out.println("Minimum element from the stack is :"+Collections.min(element));

	}

}
