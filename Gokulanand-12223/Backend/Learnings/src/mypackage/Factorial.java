package mypackage;
import java.util.*;
public class Factorial
{
	public static void main(String[] args)
	{
		int fact=1;
		int number;
		System.out.println("Enter the number of elements :");
		Scanner sc= new Scanner(System.in);
		number=sc.nextInt();
		int arr[]=new int[number];
		System.out.println("Enter the elements :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
			System.out.println("Factorial  of" +i+"is"+fact);
		}

	}
}
