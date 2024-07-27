package mypackage;
import java.util.*;
public class StackCountEvenorOdd
{
	public static void main(String[] args)
	{
		int even=0,odd=0;
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(25);
		stack.push(31);
		stack.push(30);
		stack.push(49);
		

		System.out.println(stack);
		
		for(int i=0;i<stack.size();i++)
		{
			if(stack.get(i)%2==0)
			{
				even++;
			}	
			else
			{
				odd++;
			}
		}
		for(int i=0;i<stack.size();i++)
		{
			if(stack.get(i)%2==0)
			{
			System.out.println(stack.get(i)+" "+" is Even");
			}
			else
			{
			System.out.println(stack.get(i)+" "+" is Odd");
			}
		}
	}
}