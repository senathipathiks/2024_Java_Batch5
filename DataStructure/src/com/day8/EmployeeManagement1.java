package com.day8;

import java.util.HashMap;
import java.util.Set;

public class EmployeeManagement1 {

	HashMap<Integer,JavaBean> map = new HashMap<>();
	
	
	public boolean addJavaBean(JavaBean emp) {
		map.put(emp.getEid(), emp);
		return true;
	}
	
	public boolean updateJavaBean(JavaBean emp) {
		if(map.containsKey(emp.getEid())) {
		map.put(emp.getEid(), emp);
		return true;
	}else {
		return false;
	}
}
	
	public boolean deleteJavaBean(int id) {
		if(map.remove(id) != null)
			return true;
		else
			return false;
	}
	
	public JavaBean findJavaBean(int id) {
		return map.get(id);
	}
	
	public void viewAllJavaBean() {
		Set<Integer> keys = map.keySet();
		for(Integer key : keys)
			map.get(key).display();
	}
	
	public static void main(String[] args) {
		

	}

}
