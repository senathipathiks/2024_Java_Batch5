package mypackage;
import java.util.Scanner;
public class OddOrEvenCount
{
	public static void main(String[] args)
	{
		int arr[]=new int[5];
		int sum=0,evencount=0,oddcount=0;
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
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			sum=sum+arr[i];
		}
		System.out.println("Sum of Array Elements is :"+sum);
		System.out.println("Even Count  of Array Elements is :"+evencount);
		System.out.println("Odd COunt of Array Elements is :"+oddcount);
	}

}
