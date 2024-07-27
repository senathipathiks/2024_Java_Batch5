package mypackage;
import java.util.HashSet;
public class Clone
{
	public static void main(String[] args)
	{
		HashSet<Integer> hset = new HashSet<>();
		hset.add(10);
		hset.add(20);
		hset.add(30);
		hset.add(40);
		
		System.out.println("Hash Set Elements are :");
		System.out.println(hset);
		
		HashSet<Integer> hset2 = new HashSet<>(hset);
		System.out.println("Cloned Hash Set  Elements are :");
		System.out.println(hset2);
		
	}
}
