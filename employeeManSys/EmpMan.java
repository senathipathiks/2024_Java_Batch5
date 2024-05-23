package employeeManSys;

import java.util.ArrayList;
import java.util.Iterator;
public class EmpMan {
	
	ArrayList<employee> list = new ArrayList<>();
	public boolean addemployee(employee emp) {
		return list.add(emp);
		
	}
	
	public boolean updateemployee(employee emp) {
		boolean flag = false;
		Iterator<employee> it = list.iterator();
		while(it.hasNext()) {
			if(it.next().getEid() == emp.getEid());
			it.remove();
			list.add(emp);
			flag = true;
			break;
		}
		return flag;
	}
	

	public int deleteemployee(int id) {

		int index = 0;
		for (employee e : list) {
			if(e.getEid() == id) {
				list.remove(index);
				break;
			}
			index++;
		}
		return index;
		
	}
	
	public employee findemployee(int id) {
		employee emp = null;
		for (employee e : list) {
			if(e.getEid() == id) {
				emp = e;
				break;
			}
		}
		return emp;
	}
	
	public void viewAllemployee() {
		for (employee e : list) {
			e.display();
		}
			
	}
}
