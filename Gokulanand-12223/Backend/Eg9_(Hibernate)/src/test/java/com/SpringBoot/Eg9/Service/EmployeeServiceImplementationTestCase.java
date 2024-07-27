package com.SpringBoot.Eg9.Service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.SpringBoot.Eg9.Model.Employee;
import com.SpringBoot.Eg9.Repo.EmployeeRepo;
@SpringBootTest
class EmployeeServiceImplementationTestCase {

	@Autowired
	private EmployeeService service;
	
	@MockBean
	private EmployeeRepo repo;
	

	@Test
	void testAddEmployee() 
	{
		Employee employee = new Employee(11,"Nagarjun");
		assertEquals("AddSuccess", service.addEmployee(employee));
	}

	@Test
	void testGetAllEmployees() 
	{
		when(repo.findAllEmployees()).thenReturn(Stream.of(new Employee(11,"Gokul"),new Employee(12,"Anand")).collect(Collectors.toList()));
		assertEquals(2, service.getAllEmployees().size());
	}

	@Test
	void testUpdateEmployee() 
	{
		Employee employee = new Employee(11, "Nagarjun");
		assertEquals("UpdateSuccess", service.updateEmployee(employee));
	}

//	@Test
//	void testGetEmployee() 
//	{
//		when(repo.findById(0)).thenReturn((Employee) Stream.of(new Employee(0,"Gokul")).collect(Collectors.toList()));
//		assertEquals(1, service.getEmployee(0));
//	}

	
	@Test
	void testDeleteEmployee() 
	{
		Employee employee = new Employee(15, "TMGA");
		assertEquals("DeleteSuccess", service.deleteEmployee(15));
	}
}
