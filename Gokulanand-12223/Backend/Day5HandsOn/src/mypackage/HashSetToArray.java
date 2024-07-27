package mypackage;
import java.util.*;
public class HashSetToArray 
{
	public static void main(String[] args)
	{
		HashSet<Integer> hset = new HashSet<>();
		hset.add(10);
		hset.add(20);
		hset.add(30);
		hset.add(40);
		
		ArrayList<Integer> arrlist=new ArrayList<>(hset);
	    
	    System.out.println(arrlist);
	}
}
