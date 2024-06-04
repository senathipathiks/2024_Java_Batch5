package com.assessment;

import java.util.ArrayList;
import java.util.Iterator;

public class DoctorManagement {
	ArrayList<Doctor> list = new ArrayList<>();

	public boolean addDoctor(Doctor d) {
		// TODO Auto-generated method stub
		return list.add(d);
	}

	public Doctor findDoctor(int a) {
		Doctor dc = null;
		for (Doctor i : list) {
			if (i.getDoctorId() == a) {
				dc = i;
				break;
			}
		}
		return dc;

	}

	public boolean updateDoctor(Doctor d1) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Iterator<Doctor> it = list.iterator();
		while (it.hasNext()) {
			if (it.next().getDoctorId() == d1.getDoctorId()) {
				it.remove();
				list.add(d1);
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean deleteDoctor(int number) {
		// TODO Auto-generated method stub
		boolean flag = true;
		Iterator<Doctor> it = list.iterator();
		while (it.hasNext()) {
			if (it.next().getDoctorId() == number) {
				it.remove();
				flag = true;
				break;
			}
		}
		return flag;
	}

	public void viewDoctors() {
		// TODO Auto-generated method stub
		for (Doctor d5 : list) {
			d5.display();
		}
	}

}
