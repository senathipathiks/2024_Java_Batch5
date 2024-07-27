package mypackage2;
import java.util.*;
import java.util.Map.Entry;
public class CheckValue 
{
	public static void main(String[] args)
	{
		String value;
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1,"Apple");
		hmap.put(2,"Banana");
		hmap.put(3,"Orange");
		hmap.put(4,"Melons");
		
		System.out.println("Enter the value that if it is present or not ?");
		value = sc.nextLine();
		
		System.out.println(hmap.containsValue(value));
				
	}
}
