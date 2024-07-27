package mypackage;
import java.util.*;
import java.util.Map.Entry;
public class MapConcept
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
		
		//Way - 1 for Traversing in separate
		
		Set<Integer> set = hashMap.keySet();
		System.out.println(set);
		for(Integer i : set)
		{
			System.out.println(i+ " : "+hashMap.get(i));
		}
		
		//Way - 2 for Traversing in separate using Entry
		
		Set<Entry<Integer, String>> entry = hashMap.entrySet();
		System.out.println(entry);
		for(Entry<Integer, String > i : entry)
		{
			System.out.println(i);
		}
	}
}
