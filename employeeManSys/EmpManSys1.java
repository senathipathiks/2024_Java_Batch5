package employeeManSys;

import java.util.*;

public class EmpManSys1 {
	
	HashMap<Integer,employee> map = new HashMap<>();
	
	public boolean addemployee(employee emp) {
		map.put(emp.getEid(), emp);
		return true;
		
	}
	
	public boolean updateemployee(employee emp) {
		if(map.containsKey(emp.getEid())) {
			map.put(emp.getEid(),emp);
			return true;
		} else {
			return false;
		}
	}
	

	public boolean deleteemployee(int id) {
		if(map.remove(id) != null)
			return true;
		else
			return false;
	}
	
	public employee findemployee(int id) {
		return map.get(id);
	}
	
	public void viewAllemployee() {
		Set<Integer> keys = map.keySet();
		for (Integer key : keys )
			map.get(key).display();
			
	}
}
