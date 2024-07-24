package com.supraja.restapp.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.supraja.restapp.model.Student;
import com.supraja.restapp.service.StudentService;


@SpringBootTest
class StudentServiceTest {

	@Autowired
	private StudentServiceImpl studentService;
	
	@Test
	public void testAddStudent() {
		Student obj=new Student(12,"Supraja","456784567","Madurai","678976");
		assertEquals("success",studentService.addStudent(obj));	
	}

	@Test
	public void testAddStudent1() {
		Student obj=null;
		assertEquals("Fail to Add",studentService.addStudent(obj));	
	}
	
	@Test
	public void testUpdateStudent() {
		Student obj=new Student(12,"Siiisiii","456784567","Cbe","678976");
		assertEquals("updated",studentService.updateStudent(obj));	
	}

	@Test
	public void testUpdateStudent2() {
		Student obj=null;
		assertEquals("Not updated",studentService.updateStudent(obj));	
	}
	
	@Test
	public void testgetAllStudent() {
		
		assertNotNull(studentService.getAllStudent());	
	}
	
	@Test
	void testDelete() {
		assertEquals("Deleted", studentService.deleteStudent(10));
	}
	
	@Test
	void testDelete2() {
		assertEquals("Failed to delete", studentService.deleteStudent(10));
	}
	
	@Test
	public void testgetStudent() {
		
		assertNotNull(studentService.getStudent(8));	
	}
	
	@Test
	public void testgetStudent2() {
		
		assertNull(studentService.getStudent(13));	
	}
}
