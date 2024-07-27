package mypackage;
import java.util.*;
public class Insertion
{
	public static void main(String[] args)
	{

		ArrayList<String> list=new ArrayList<>();
		list.add("Red");
		list.add("Purple");
		list.add("Violet");
		list.add("Yellow");
		

		list.add(1,"Orange");
		System.out.println(list);
	}
}
