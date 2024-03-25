package oops.practice;

import java.util.ArrayList;

class School {
	ArrayList<String> student = new ArrayList<>();
	ArrayList<String> teacher = new ArrayList<>();
	String classes = "";
	
	boolean addStudent(String stu) {
		return student.add(stu);
	}
	boolean addTeacher(String tea) {
		return student.add(tea);
	}
	
	boolean removeStudent(String stu) {
		boolean flag = false;
		for(int i = 0; i < student.size(); i++) {
			if(stu.equalsIgnoreCase(student.get(i))) {
				student.remove(i);
				flag = true;
				break;
			}
		}return flag;
	}
	
	boolean removeTeacher(String tea) {
		boolean flag = false;
		for(int i = 0; i < teacher.size(); i++) {
			if(tea.equalsIgnoreCase(teacher.get(i))) {
				teacher.remove(i);
				flag = true;
				break;
			}
		}return flag;
	}
	
}

public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
