package mypackage2;
import java.util.*;
import java.util.HashMap;
public class CountNoOfKeysInHashMap
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1,"T");
		hmap.put(2,"M");
		hmap.put(3,"G");
		hmap.put(4,"A");
		
		System.out.println("Total No. of Keys are :"+hmap.size());
	}

}
