package mypackage;
import java.util.*;
public class BinarySearchConcept
{
	static int binarySearch(int array[],int target, int start, int end)
	{
		while(start<=end)
		{
			int mid =(start+end)/2;
			
			if(array[mid]==target)
				return mid;
			
			if(target>array[mid])
				start=mid+1;
			
			else
				end=mid-1;
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int n,target,start,end;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements :");
		n = sc.nextInt();
		System.out.println("Enter the elements :");
		int[] array = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the targeted element :");
		target = sc.nextInt();
	    System.out.println(Arrays.binarySearch(array, 0));
		int result = binarySearch(array,target,0,n-1);
		
		if(result!=-1)
		{
			System.out.println("The element "+ target + " is found at the index of " +result);
		}
		else
		{
			System.out.println("Element Not Found");
		}
		
		
		
	}

}
