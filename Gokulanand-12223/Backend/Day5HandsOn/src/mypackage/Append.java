package mypackage;
import java.util.*;
public class Append 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> hset = new HashSet<>();
		hset.add(10);
		hset.add(20);
		hset.add(30);
		hset.add(40);
		
		System.out.println("Elements are :"+hset);
		
		hset.add(50);
		System.out.println("Elements are :"+hset);
		
	}

}
