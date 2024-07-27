package mypackage;
import java.util.*;
public class SelectionSortConcept
{
	public static void selectionSort(int[] array)
	{
		for(int i=0 ; i<array.length-1 ; i++)
		{
			int temp = i;
			for(int j=i+1 ; j<array.length ; j++)
			{
				if(array[j]<array[temp])
				{
					temp = j;
				}
			}
			int MIN = array[temp];
			array[temp] = array[i];
			array[i] = MIN;
		}	
	}
	public static void main(String[] args)
	{
		int n,target;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements :");
		n = sc.nextInt();
		System.out.println("Enter the elements :");
		int array[] = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println("Sorted elements are :");
		
		selectionSort(array);
		System.out.println(Arrays.toString(array));
	
	}

}
