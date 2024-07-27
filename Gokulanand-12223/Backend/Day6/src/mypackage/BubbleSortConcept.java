package mypackage;
import java.util.*;
public class BubbleSortConcept
{
	public static void bubbleSort(int[] array)
	{
		int n = array.length;
		int temp = 0;
		for(int i=0 ; i<n ; i++)
		{
			for(int j=1 ; j<(n-i) ; j++)
			{
				if(array[j-1] > array[j])
				{
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args)
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements :");
		n=s.nextInt();
		System.out.println("Enter the elements :");
		int[] array = new int[n];
		for(int i=0; i<n; i++)
		{
			array[i] = s.nextInt();
		}
		
		bubbleSort(array);
		for(int i=0 ; i< n ; i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
