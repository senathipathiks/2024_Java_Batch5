package mypackage;
import java.util.*;
public class Insertion 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list= new ArrayList<>();
		list.add(5);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		
		System.out.println(list);
		
		list.add(1,10);
		System.out.println(list);
		}

}

