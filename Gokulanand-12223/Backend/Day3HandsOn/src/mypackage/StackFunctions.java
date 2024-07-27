package mypackage;
import java.util.*;
public class StackFunctions
{
	public static void main(String[] args)
	{
		Stack<Integer> elements= new Stack<>();
		elements.push(10);
		elements.push(20);
		elements.push(30);
		elements.push(40);
		elements.push(50);
		
		System.out.println("Elements are :"+""+elements);
		
		System.out.println("Popped Element is :"+""+elements.pop());
		
		System.out.println("Peek Element is :"+" "+elements.peek());
		
		System.out.println("Is Stack is Empty ?"+""+elements.isEmpty());
	}

}
