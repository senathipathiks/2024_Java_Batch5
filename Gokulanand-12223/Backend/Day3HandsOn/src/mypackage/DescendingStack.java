package mypackage;
import java.util.*;
public class DescendingStack 
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
		
		System.out.println("Before Descending : "+" "+element);
		
		Collections.sort(element);
		System.out.println("Elements are :"+element);
		
		for(int i=element.size()-1;i>=0;i--)
		{
			System.out.println("After Descending :"+" "+element.get(i));
		}
	}
}
