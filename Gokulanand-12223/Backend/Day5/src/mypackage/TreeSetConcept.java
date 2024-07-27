package mypackage;
import java.util.*;
public class TreeSetConcept 
{
	public static void main(String[] args)
	{
		TreeSet<String> tree= new TreeSet<>();
		tree.add("Apple");
		tree.add("Banana");
		tree.add("Orange");
		tree.add("Melons");
		tree.add("Dragon Fruit");

		System.out.println(tree);
		
		System.out.println("------------------------------");
		
		System.out.println(tree.remove("Apple"));
		System.out.println(tree.remove("Cat"));
		
		System.out.println("------------------------------");

		for(String obj :tree)
		{
			System.out.println(tree);
			break;
		}
		
		System.out.println("------------------------------");

		Iterator<String> it= tree.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("------------------------------");

		System.out.println(tree.headSet("Apple"));
		System.out.println(tree.tailSet("Apple"));

	}

}
