package mypackage;
import java.util.*;
public class CountNoOfElements
{
	public static void main(String[] args)
	{
		HashSet<Integer> hset = new HashSet<>();
		hset.add(10);
		hset.add(20);
		hset.add(30);
		hset.add(40);
		
		System.out.println("Elements are :"+hset);
		
		System.out.println("No of Elements are :"+hset.size());
	}

}
