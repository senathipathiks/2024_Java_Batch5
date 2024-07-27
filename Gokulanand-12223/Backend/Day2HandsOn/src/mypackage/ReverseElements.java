
package mypackage;
import java.util.*;
public class ReverseElements
{
	public static void main(String[] args)
	{

		ArrayList<String> list=new ArrayList<>();
		list.add("Red");
		list.add("Purple");
		list.add("Violet");
		list.add("Yellow");
		list.add("Green");
		
		System.out.println("Before Reversing :");
		System.out.println(list);
		System.out.println("After Reversing :");	
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.println(list.get(i));
		}
	}
}



//Alterative method :
/*
package mypackage;
import java.util.*;
public class ReverseElements
{
	public static void main(String[] args)
	{

		ArrayList<String> list=new ArrayList<>();
		list.add("Red");
		list.add("Purple");
		list.add("Violet");
		list.add("Yellow");
		list.add("Green");
		
		System.out.println("Before Reversing :");
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println("After Reversing :");	
		System.out.println(list);
}
}
*/