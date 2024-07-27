package mypackage2;
import java.util.*;
public class SpecificKeyValueInHashMap
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hmap= new HashMap<>();
		hmap.put(1,"T");
		hmap.put(2,"M");
		hmap.put(3,"G");
		hmap.put(4,"A");
		
		System.out.println(hmap);
		
		hmap.put(1, "Y");
		System.out.println(hmap);
	}

}
