package mypackage;
import java.util.*;
public class LinearSearchConcept 
{

	public static int LinearSearch(int[] array, int target)
	{
		for(int i=0; i<array.length; i++)
		{
			if(array[i]==target)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int n ,target,result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements :");
		n=sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements :");
		for(int i=0;i<n; i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Enter the targeted element :");
		target =sc.nextInt();
		
		result=LinearSearch(array, target);
		if(result !=-1)
		{
			System.out.println("Element" + target + "found at index" + result);
		}
		else
		{
			System.out.println("Element" + target + "Not Found in the array");
		}
	}
}
