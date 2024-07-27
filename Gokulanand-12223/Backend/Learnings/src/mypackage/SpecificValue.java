package mypackage;
import java.util.*;
public class SpecificValue 
{
	public static void main(String[] args)
	{
		int number,value,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements :");
		number=sc.nextInt();
		int arr[]=new int[number];
		for(int i=0;i<=number;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Specific value to be tested :");
		value=sc.nextInt();
		for(int i=0;i<=number;i++)
		{
			if(value==arr[i])
				flag=1;
		}
		if(flag==1)
		{
		System.out.println("Yes!!!There is!!!");
		}
		else
		{
		System.out.println("No!!!There is Not!!!");
		}
	}

}

