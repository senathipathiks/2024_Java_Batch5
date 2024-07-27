package mypackage;
import java.util.*;
public class QueueConcept 
{	
	public static void main(String[] args)
	{
		int n,elements=0;
		Queue<Integer> queue= new LinkedList<>();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the no. of elements to be stored :");
		n=sc.nextInt();
		
		System.out.println("Enter the elements :");
		for(int i=0;i<n;i++)
		{
		elements=sc.nextInt();
		queue.add(elements);
		}		
		
		System.out.println("Elements are :"+" "+queue);		
	}
}

