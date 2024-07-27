package mypackage;

import java.util.Arrays;

public class SortingArray 
{
	public static void main(String[] args)
	{
		int arr[]= {7,8,1,6,3,9};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Sorted Array is :"+arr[i]);
		}
	}
}
