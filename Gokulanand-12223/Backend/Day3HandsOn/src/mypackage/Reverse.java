package mypackage;
import java.util.*;
public class Reverse 
{
	public static void main(String[] args)
	{
		Stack<Integer> element= new Stack<>();
		element.push(6);
		element.push(1);
		element.push(3);
		element.push(4);
		element.push(5);
		element.push(2);
		
		System.out.println("Elements are :"+element);
		
		System.out.println("After Reversing :");
		for(int i=element.size()-1;i>=0;i--)
		{
			System.out.println(element.get(i));
		}
	}
}
