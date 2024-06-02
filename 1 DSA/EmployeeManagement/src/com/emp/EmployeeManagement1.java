package com.emp;

import java.util.HashMap;
import java.util.Set;

public class EmployeeManagement1 {

	HashMap< Integer, Employee> map = new HashMap<>();
 	
	public boolean addEmployee(Employee emp) {
		map.put(emp.getEid(), emp);
		return true;
	}
	
	public boolean updateEmployee(Employee emp) {
		if(map.containsKey(emp.getEid())){
			map.put(emp.getEid(), emp);
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean deleteEmployee(int id) {
		if ( map.remove(id) != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Employee findEmployee(int id) {
		return  map.get(id);
	}
	
	public void viewAllEmployee() {
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			map.get(key).display();
		}
		
	}

}
