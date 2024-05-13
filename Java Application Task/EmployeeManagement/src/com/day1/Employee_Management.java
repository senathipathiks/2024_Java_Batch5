package com.day1;
import java.util.HashMap;
import java.util.Set;
public class Employee_Management {
	 
	HashMap<Integer,Employee> map = new HashMap<>();
	
	public boolean addemployee(Employee emp) {
		map.put(emp.getEmp_id(), emp);
		return true;
		
	}

	public boolean updateemployee(Employee emp) {
		map.put(emp.getEmp_id(), emp);
		return true;
	}

	public boolean deleteemployee(int id) {
		if(map.remove(id)!=null){
		return true;
		}
		else {
		return false;
		}
	}
	public Employee findemployee(int id) {
		return map.get(id);
	}

	public void viewallemployee() {
		Set<Integer> keys = map.keySet();
		for(Integer key:keys) {
			map.get(key).display();
		}
	}

}
