package mypackage;
import java.util.*;
public class RemoveDuplicates
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
		element.push(10);
		
		System.out.println("Elements are :"+" "+element);
		
		Set<Integer> set = new LinkedHashSet<>(element);
		element.removeAll(element);
		element.addAll(set);
		
		System.out.println("After Removing Duplicates :"+" "+element);
	}
}
	


