package com.keerthana.demo.ServiceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthana.demo.Model.Employee;
import com.keerthana.demo.Model.Payroll;
import com.keerthana.demo.Repoisatory.EmployeeRepo;
import com.keerthana.demo.Service.EmployeeService;

import jakarta.persistence.EntityManager;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepo emprepo;
	
	@Autowired
	EntityManager eman;

//	public void addEmpl(Employee emp) {
//		
//		Payroll payroll=eman.find(null, emp);
//		
//		emprepo.save(emp);
//		
//	}

	public Employee getEmployee(int id) {
		return emprepo.findById(id).get();
	}

	public List<Employee> getAllEmployee() {
		return emprepo.findAll();
	}

	public String updateEmployee(Employee emp,int eid,int pId) {
		Payroll py=eman.find(Payroll.class, pId);
		Employee em=eman.find(Employee.class, eid);
		if(em!=null) {
			em.setEmployeeName(emp.getEmployeeName());
			em.setDesignation(emp.getDesignation());
			em.setAccountDetails(emp.getAccountDetails());
			em.setLeaveDays(emp.getLeaveDays());
			em.setWorkingDays(emp.getWorkingDays());
			em.setPayroll(py);
			emprepo.save(em);
			return "saved";
		}else {
			return "no";
		}
		
	}

	public void deleteEmployee(int id) {
		emprepo.deleteById(id);
		
	}



	
	@Override
	public String addEmpl(Employee empl, int pId) {
		Payroll py=eman.find(Payroll.class, pId);
		if(py!=null) {
			empl.setPayroll(py);
			emprepo.save(empl);
			return "saved";
			
		}else {
			return "no";
		}

}

	public String updateEmployee(Employee emp, int eid) {
		Employee em=eman.find(Employee.class, eid);
		if(em!=null) {
			em.setEmployeeName(emp.getEmployeeName());
			em.setDesignation(emp.getDesignation());
			em.setAccountDetails(emp.getAccountDetails());
			em.setLeaveDays(emp.getLeaveDays());
			em.setWorkingDays(emp.getWorkingDays());
			
			emprepo.save(em);
			return "saved";
		}else {
			return "no";
		}
		
	}

	
		
		
	
}
