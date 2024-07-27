package mypackage;
import java.util.*;
public class CheckElement
{
	public static void main(String[] args) 
	{
		int value,flag=0;
		Scanner sc = new Scanner(System.in);
		Stack<Integer> element= new Stack<>();
		element.push(10);
		element.push(20);
		element.push(30);
		element.push(40);
		element.push(50);
		element.push(60);
		element.push(70);
		element.push(80);
		element.push(90);
		element.push(100);
		
		System.out.println("Enter the element to be searched :");
		value=sc.nextInt();
		
		for(int i=0;i<element.size();i++)
		{
			if(value==element.get(i))
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("Yes !!! The given element is Present");
		}
		else
		{
			System.out.println("No !!! The given element is Not Present");
		}
		
	}

}
