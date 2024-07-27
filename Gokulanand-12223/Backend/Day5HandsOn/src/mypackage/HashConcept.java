package mypackage;
import java.util.*;
public class HashConcept 
{
	public static void main(String[] args)
	{
		HashSet<Integer> hash= new HashSet<>();
		hash.add(10);
		hash.add(20);
		hash.add(30);
		hash.add(40);
		hash.add(50);

		System.out.println(hash);
	}

}

//Linked HashSet does not take the duplicate elements. 
//And also Traverse the elements in Unordered type.