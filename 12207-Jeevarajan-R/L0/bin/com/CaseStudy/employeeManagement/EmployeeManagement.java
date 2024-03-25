package CaseStudy.employeeManagement;

import java.util.ArrayList;
import java.util.Iterator;

//this will manage employee details

public class EmployeeManagement {
	ArrayList<Employee> list =  new ArrayList<>();
	
	public boolean addEmp(Employee emp) {
		return list.add(emp); 
	}
	public boolean updateEmp(Employee emp) {
		boolean flag = false;
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			if(it.next().getEid() == emp.getEid()) {
				it.remove();
				list.add(emp);
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean deleteEmp(int id) {
		boolean flag = false;
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			if(it.next().getEid() == id) {
				it.remove();
				flag = true;
				break;
			}
		}
		return flag;
		
	}
	public Employee findEmp(int id) {
		Employee emp = null; 
		for(Employee e : list) {
			if(id == e.getEid()) {
				emp = e;
				break;
			}
		}
		return emp;
	}
	public void viewAllEmp() {
		for(Employee e : list) {
			e.display();
		}
	}

}
