package mypackage;
import java.util.*;
public class LinkedHashSetConcept 
{
	public static void main(String[] args)
	{
		LinkedHashSet<Integer> hash = new LinkedHashSet<>();
		hash.add(10);
		hash.add(20);
		hash.add(30);
		hash.add(40);
		hash.add(50);
		hash.add(10);

		System.out.println(hash);
	}

}


//Linked HashSet does not take the duplicate elements. 
//And also Traverse the elements in given order. 