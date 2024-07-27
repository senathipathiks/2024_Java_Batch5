package mypackage;
import java.util.*;
public class HashMapConcept
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1,"Apple");
		hashMap.put(2,"Banana");
		hashMap.put(3,"Melons");
		hashMap.put(4,"Dragon Fruit");
		hashMap.put(5,"Orange");
		
		System.out.println(hashMap);
		
		hashMap.put(5,"Banana");
		System.out.println(hashMap);
		
		System.out.println(hashMap.get(1));
		
		hashMap.remove(5);
		System.out.println(hashMap);

	}
}

