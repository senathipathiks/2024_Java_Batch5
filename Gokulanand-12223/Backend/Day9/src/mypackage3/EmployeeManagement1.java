package mypackage3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class EmployeeManagement1
{
	HashMap<Integer, Employee> map = new HashMap<>();
	
	public boolean addEmployee(Employee emp)
	{
		map.put(emp.getEid(), emp);
		return true;
	}

	public boolean deleteEmployee(int id1)
	{
		if(map.remove(id1)!=null)
			return true;
		else
			return false;
	}
	
	public Employee findEmployee(int id)
	{
		return map.get(id);
		
	}
	
	public void viewAllEmployee()
	{
		Set<Integer> set = map.keySet();
		for(Integer key : set)
		{
			map.get(key).display();
		}
	}

	public boolean updateEmployee(Employee emp1) {
		map.put(emp1.getEid(), emp1);
		return true;
	}


}

