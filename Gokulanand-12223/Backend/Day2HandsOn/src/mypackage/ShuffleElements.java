package mypackage;
import java.util.*;
public class ShuffleElements
{
	public static void main(String[] args)
	{

		ArrayList<String> list=new ArrayList<>();
		list.add("Red");
		list.add("Purple");
		list.add("Violet");
		list.add("Yellow");
		list.add("Green");
		
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
	}
}