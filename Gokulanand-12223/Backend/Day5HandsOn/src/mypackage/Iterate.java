package mypackage;
import java.util.*;
public class Iterate 
{
	public static void main(String[] args)
	{
		HashSet<Integer> hset = new HashSet<>();
		hset.add(10);
		hset.add(20);
		hset.add(30);
		hset.add(40);
		
		for(Integer i : hset)
		{
			System.out.println(i);
		}
	}
}
