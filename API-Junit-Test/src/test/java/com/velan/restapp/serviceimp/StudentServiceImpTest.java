package com.velan.restapp.serviceimp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.velan.restapp.model.Student;
import com.velan.restapp.service.StudentService;

@SpringBootTest
class StudentServiceImpTest {

	@Autowired
	private StudentService service;
	
	@Test
	@Disabled
	@Order(1)
	public void testAddStudent() {
		Student stud=null;
		assertEquals("Failure",service.addStudent(stud));
		
	}
	
	@Test
	@Disabled
	@Order(2)
	public void testAddStudent1() {
		Student stud=new Student(1,"Velan",9876543,"Nilakkottai",12345);
		assertEquals("Success",service.addStudent(stud));
	}
	
	@Test
	@Order(3)
	public void testGetStudent() {	
        Student student = service.getStudent(20);
        assertNotNull(student);
        assertEquals(20, student.getId());
	}
	
	@Test
	@Order(4)
	public void testGetStudent1() {
        Student student = service.getStudent(1);
        assertNull(student);
	}

	@Test
	@Disabled
	@Order(5)
	void testUpdateStudent() {
		Student stud=null;
		assertEquals("Failure",service.updateStudent(stud));
	}
	
	@Test
	@Disabled
	@Order(6)
	public void testUpdateStudent1() {
		Student stud=new Student(14,"Ani",987654321,"Valliore",65423);
		assertEquals("Success",service.updateStudent(stud));
	}

	@Test
	@Disabled
	@Order(7)
	public void testDeleteStudent() {	
	    assertEquals("Failure",service.deleteStudent(1));
	}
	
	@Test
	@Disabled
	@Order(8)
	public void testDeleteStudent1() {
	    assertEquals("Success",service.deleteStudent(17));
	}
	
	@Test
	@Order(9)
	public void testGetAllStudents() {	
        List<Student> student = service.getAllStudents();
        assertNotNull(student);
	}
	
}
