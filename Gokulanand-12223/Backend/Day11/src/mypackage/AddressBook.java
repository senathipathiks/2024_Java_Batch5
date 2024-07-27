package mypackage;
import java.util.Set;
import java.util.TreeMap;

public class AddressBook {
	TreeMap<String, Contact> map = new TreeMap<>();
	public boolean add(Contact con)
	{
		map.put(con.getFname(), con);
		return true;
	}
	
	public boolean updtae(Contact con)
	{
		map.remove(con.getFname(),con);
		map.put(con.getFname(), con);
		return true;
	}
	public boolean update(Contact con)
	{
		map.remove(con.getFname(), con);
		map.put(con.getFname(), con);
		return true;
	}
	public boolean delete(String fn)
	{
		if(map.remove(fn)!=null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public Contact find(String fna)
	{
		return map.get(fna);
	}
	public void view()
	{
		Set<String> set = map.keySet();
		for(String key : set)
			map.get(key).display();
	}
}
