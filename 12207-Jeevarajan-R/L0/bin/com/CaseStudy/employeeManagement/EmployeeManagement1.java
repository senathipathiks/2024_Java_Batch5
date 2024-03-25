package CaseStudy.employeeManagement;

import java.util.HashMap;
import java.util.Iterator;

public class EmployeeManagement1 {
	
	HashMap<Integer, Employee> map = new HashMap<>();
	
	public boolean addEmp(Employee emp) {
		map.put(emp.getEid(), emp);
		return true;
	}
	
	public boolean updateEmp(Employee emp) {
//			boolean flag = false;
		if(map.containsKey(emp.getEid())) {
			map.put(emp.getEid(), emp);
			return true;
		} else return false;
	}
	
	public boolean deleteEmp(int id) {
//		boolean flag = false;
		if(map.remove(id) != null) {
			return true;
		}else return false;
	}
	
	public Employee findEmp(int id) {
		Employee emp = null; 
		if (map.containsKey(id)) {
			emp = map.get(id);			
		}
		return emp;
	}

	public void viewAllEmp() {
//		Set<Integer> s = map.keySet();
//		Iterator <Integer> it = s.iterator();
		Iterator <Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			int key = (int)it.next(); 
			map.get(key).display();
		}
	}
}

