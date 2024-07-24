package com.vickee.restapp.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vickee.restapp.model.Employee;
import com.vickee.restapp.model.Payroll;

@SpringBootTest
class EmployServiceImplTest {
	
	@Autowired
	EmployServiceImpl service;
	
	
	@Test
	void testAddEmployee() {
		Payroll pay = new Payroll(40000, 500, 500, 500, 500, 42000);
		Employee emp = new Employee(15, "Velan", "Intern", "R2D", pay);
		assertEquals("success", service.addEmployee(emp));
	}
	
	@Test
	void testAddEmployee1() {
		Payroll pay = new Payroll(50000, 500, 500, 500, 500, 52000);
		Employee emp = new Employee(13, "Vidhusha", "Intern", "R2D", pay);
		assertEquals("success", service.addEmployee(emp));
	}
	
	@Test
	void testAddEmployee2() {
		Payroll pay = new Payroll(90000, 500, 500, 500, 500, 92000);
		Employee emp = new Employee(17, "Ani", "Intern", "R2D", pay);
		assertEquals("success", service.addEmployee(emp));
	}
	
	@Test
	void testGetEmployee() {
		assertNotNull(service.getEmployee(11));
	}
	
	@Test
	void testGetEmployee1() {
		assertNotNull(service.getEmployee(12));
	}
	
	@Test
	void testGetEmployee2() {
		int id=13;
		assertNotNull(service.getEmployee(id));
	}
	
	@Test
	void testGetAllEmployees() {
		assertNotNull(service.getAllEmployees());
	}

	@Test
	void testUpdateEmployee() {
		Employee emp = new Employee(12, "Jayanthan","Executive","L&D", null);
		assertEquals("success",service.updateEmployee(emp));
	}
	
	@Test
	void testUpdateEmployee1() {
		Employee emp = new Employee(15, "Velan","Executive","L&D", null);
		assertEquals("success",service.updateEmployee(emp));
	}
	
	@Test
	void testDeleteEmployee() {
		assertEquals("success",service.deleteEmployee(4));
	}
	
	@Test
	void testDeleteEmployee1() {
		int id = 9;
		assertEquals("success",service.deleteEmployee(id));
	}
	
	@Test
	void testDeleteEmployee2() {
		int id =10;
		assertEquals("success",service.deleteEmployee(id));
	}
}
