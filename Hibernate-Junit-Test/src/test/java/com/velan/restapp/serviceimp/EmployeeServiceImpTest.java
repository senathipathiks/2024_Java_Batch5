package com.velan.restapp.serviceimp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.velan.restapp.model.Employee;
import com.velan.restapp.model.Payroll;
import com.velan.restapp.service.EmployeeService;
import com.velan.restapp.service.PayrollService;

 
@SpringBootTest
class EmployeeServiceImpTest {
	
	@Autowired
	private EmployeeService service;
	
	@Test
	void testAddEmployee() {
		Payroll pay=new Payroll(1,300000,1000,1000,3000,2000,30000);
		Employee emp =new Employee(1,"Vijay","Actor","Movie",pay);
		assertEquals("success",service.addEmployee(emp) );
	}
	
	
	@Test
	void testAddEmployee1() {
		Employee emp = null;
		assertEquals("failure",service.addEmployee(emp) );
	}
	
	@Test
	void testGetEmployee() {
		assertNotNull(service.getEmployee(2));
	}
	
	@Test
	void testGetEmployee1() {
		assertNull(service.getEmployee(200));
	}
 
	@Test
	void testGetAllEmployee() {
		assertNotNull(service.getAllEmployee());
	}
 
	@Test
	void testUpdateEmployee() {
		Employee emp = new Employee(5,"Aravind","Intern","L&D",null);
		assertEquals("success", service.updateEmployee(emp));
	}
 
	@Test
	void testUpdateEmployee1() {
		Employee emp = null;
		assertEquals("failure", service.updateEmployee(emp));
	}
 
	
	@Test
	void testDeleteEmployee() {
		assertEquals("failure",  service.deleteEmployee(10));
	}
	
	@Test
	void testDeleteEmployee1() {
		assertEquals("success",  service.deleteEmployee(10));
	}

}
 
