package mypackage;
import java.util.*;
import java.util.Map;
import java.util.*;
import java.util.Map.Entry;
public class TreeMapConcept
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> treeMap = new TreeMap<>();
		treeMap.put(1,"Apple");
		treeMap.put(2,"Banana");
		treeMap.put(3,"Melons");
		treeMap.put(4,"Dragon Fruit");
		treeMap.put(5,"Orange");
		
		System.out.println(treeMap);
	}
}