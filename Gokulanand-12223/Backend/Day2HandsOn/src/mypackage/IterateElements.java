package mypackage;
import java.util.*;
public class IterateElements
{
	public static void main(String[] args)
	{

		ArrayList<String> list=new ArrayList<>();
		list.add("Red");
		list.add("Purple");
		list.add("Violet");
		list.add("Yellow");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}

	}
	


}
