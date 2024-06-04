package com.day8;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeManagement {

	ArrayList<JavaBean> list = new ArrayList<>();
	
	public boolean addJavaBean(JavaBean emp) {
		return list.add(emp);
	}
	public boolean updateJavaBean(JavaBean emp) {
		boolean flag = false;
		Iterator<JavaBean> it = list.iterator();
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
	public boolean deleteJavaBean(int id) {
		boolean flag = false;
		Iterator<JavaBean> it = list.iterator();
		while(it.hasNext()) {
			if(it.next().getEid() == id) {
				it.remove();
				flag = true;
				break;
			}
		}
		return flag;
	}
	public JavaBean findJavaBean(int id) {
		JavaBean emp = null;
		for(JavaBean e : list) {
			if(e.getEid() == id) {
				emp = e;
				break;
			}
		}
		return emp;
}
	public void viewAllJavaBean() {
		for(JavaBean e : list)
			e.display();
}
	public static void main(String[] args) {
		

	}

}
