package mypackage;
import java.util.*;
public class CountStackElements 
{
	public static void main(String[] args)
	{
		int count=0;
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
		
		for(int i=0;i<element.size();i++)
		{
			count++;
		}
		System.out.println("Total no. of elements is :"+ " "+count);

	}

}
