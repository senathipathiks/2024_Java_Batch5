//package com.emp;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class EmployeeManagement {
//
//	ArrayList<Employee> list = new ArrayList<>();
//	
//	public boolean addEmployee(Employee emp) {
//		return list.add(emp);
//	}
//	
//	public boolean updateEmployee(Employee emp) {
//		boolean flag = false ;
//		Iterator<Employee> it = list.iterator();
//		while(it.hasNext()) {
//			if(it.next().getEid() == emp.getEid()) {
//				it.remove();
//				list.add(emp);
//				flag = true;
//				break;
//			}
//		}
//		
//		return flag;
//	}
//	
//	public boolean deleteEmployee(int id) {
//		boolean flag = false ;
//		Iterator<Employee> it = list.iterator();
//		while(it.hasNext()) {
//			if(it.next().getEid() == id) {
//				it.remove();
//				flag = true;
//				break;
//			}
//		}
//		
//		return flag;
//	}
//	
//	public Employee findEmployee(int id) {
//		Employee emp = null;
//		for(Employee e : list) {
//			if ( e.getEid() == id ) {
//				emp =e;
//				break;
//			}
//		}
//		return emp;
//	}
//	
//	public void viewAllEmployee() {
//		for(Employee e : list) {
//			e.display();
//		}
//	}
//}
