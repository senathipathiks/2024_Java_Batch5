package mypackage;
import java.util.*;
public class AscendingStack 
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
		
		System.out.println("Before Ascending : "+" "+element);
		
		Collections.sort(element);
		
		System.out.println("After Ascending :"+" "+element);
	}
}
