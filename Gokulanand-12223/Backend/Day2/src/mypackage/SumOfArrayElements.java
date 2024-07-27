package mypackage;
import java.util.Scanner;
public class SumOfArrayElements
{
	public static void main(String[] args)
	{
		int arr[]=new int[5];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 5 elements :");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array Elements are :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			sum=sum+arr[i];
		}
		System.out.println("Sum of Array Elements is :"+sum);
	}

}
