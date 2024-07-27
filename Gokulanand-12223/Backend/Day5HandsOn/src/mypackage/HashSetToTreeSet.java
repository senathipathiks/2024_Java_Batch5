package mypackage;
import java.util.*;
import java.util.HashSet;
import java.util.TreeSet;
public class HashSetToTreeSet
{
	public static void main(String[] args)
	{
		HashSet<Integer> hset = new HashSet<>();
		hset.add(50);
		hset.add(20);
		hset.add(60);
		hset.add(40);
		
		TreeSet<Integer> tset = new TreeSet<>(hset);
		System.out.println(tset);
			
	}

}
