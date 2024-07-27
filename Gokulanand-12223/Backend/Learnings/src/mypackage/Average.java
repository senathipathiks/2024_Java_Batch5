package mypackage;
import java.util.*;
public class Average 
{
	public static void main(String[] args)
	{
		int number,elements;
		int arr[]=new int[55];
		System.out.println("Enter the number of elements :");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		System.out.println("Enter the elements :");
		for(int i=0;i<=number;i++)
		{
		arr[i]=s.nextInt();
		}
		int sum=0,avg=0;
		for(int i=0;i<=number;i++)
		{
			sum=sum+arr[i];
			avg=sum/number;
		}
		System.out.println("The average of all the elements present in the array is :"+avg);
	}
}
