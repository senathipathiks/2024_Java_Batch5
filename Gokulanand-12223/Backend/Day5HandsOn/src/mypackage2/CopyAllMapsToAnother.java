package mypackage2;
import java.util.*;
import java.util.HashMap;
public class CopyAllMapsToAnother
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hmap1 = new HashMap<>();
		hmap1.put(1,"Apple");
		hmap1.put(2,"Banana");
		hmap1.put(3,"Melons");
		hmap1.put(4,"Orange");

		System.out.println("HashMap Elements are :"+hmap1);
		
		HashMap<Integer, String> hmap2 = new HashMap<>(hmap1);
		System.out.println("Copied Elements are : "+hmap2);
	}

}
