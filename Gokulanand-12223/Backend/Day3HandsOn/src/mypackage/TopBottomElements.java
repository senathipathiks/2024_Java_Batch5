package mypackage;
import java.util.*;
public class TopBottomElements
{
	public static void main(String[] args)
	{
		Stack<Integer> element= new Stack<>();
		element.push(10);
		element.push(20);
		element.push(30);
		element.push(40);
		element.push(50);
		element.push(60);
		element.push(70);
		element.push(80);
		element.push(90);
		element.push(100);
		
		System.out.println("Elements are :"+element);
		
		System.out.println("Top Element is :"+element.lastElement());
		
		System.out.println("Bottom Element is :"+element.firstElement());
	}

}
