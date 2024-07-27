package mypackage;
import java.util.*;
public class StackOddEvenCount
{
	public static void main(String[] args)
	{
		int count=0,peek1;
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(25);
		stack.push(31);
		stack.push(49);

		System.out.println(stack.peek());
		peek1 = stack.peek();
		while(peek1>1)
		{
			if(peek1%2==0)
			{
				peek1=peek1/2;
			}
			else
			{
				peek1=peek1-1;
			}
		}
		System.out.println(peek1);
		}
	}

