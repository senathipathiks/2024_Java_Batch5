package mypackage;
import java.util.*;
public class HashSetConcept 
{
	public static void main(String[] args)
	{
		HashSet<String> hash= new HashSet<>();
		hash.add("Apple");
		hash.add("Banana");
		hash.add("Orange");
		hash.add("Melons");
		hash.add("Dragon Fruit");

		System.out.println(hash);
		
		System.out.println("------------------------------");
		
		hash.remove("Apple");
		System.out.println(hash);
		
		System.out.println("------------------------------");

		for(String obj :hash)
		{
			System.out.println(hash);
			break;
		}
		
		System.out.println("------------------------------");

		Iterator<String> it= hash.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("------------------------------");

		
	}

}
