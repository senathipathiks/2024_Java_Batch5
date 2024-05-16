package employee;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;

public class EmployeeManagement {
	HashMap<Integer, Employee> map = new HashMap<>();

	public boolean addEmployee(Employee emp) {
		map.put(emp.getEid(), emp);
		return true;
	}

	public boolean UpdateEmployee(Employee emp) {
		
		if(map.containsKey(emp.getEid()))
		{
			map.put(emp.getEid(),emp);
			return true;
		}
		else
		{
			return false;
		}

	}

	public boolean deleteEmployee(int id) {

		if(map.remove(id)!= null)
			return true;
		else
			return false;	
	}

	public Employee findEmployee(int id) {
		return map.get(id);
	}

	public void viewAllEmployee() {
		Set<Integer> keys = map.keySet();
		for(Integer key : keys)
		{
			map.get(key).display();
		}

	}

}
