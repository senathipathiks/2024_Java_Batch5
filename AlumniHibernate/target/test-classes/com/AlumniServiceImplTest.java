package com.supraja.restapp.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.supraja.restapp.model.Student;

@SpringBootTest
class AlumniServiceImplTest {

	@Autowired
	private AlumniServiceImpl alumniService;
	
	@Test
	public void testAddAlumni() {
		Alumni obj=new Alumni(13,"Samaira","IT","2023","developer");
		assertEquals("success",alumniService.addAlumni(obj));	
	}

//	@Test
//	public void testAddAlumni1() {
//		Alumni obj=null;
//		assertEquals("Fail to Add",alumniService.addAlumni(obj));	
//	}
//	
//	@Test
//	public void testUpdateAlumni() {
//		Alumni obj=new Alumni(12,"Sasiii","Ece","2020","UI");
//		assertEquals("updated",alumniService.updateAlumni(obj));	
//	}
//
//	@Test
//	public void testUpdateAlumni2() {
//		Alumni obj=null;
//		assertEquals("Not updated",alumniService.updateAlumni(obj));	
//	}
//
//	@Test
//	public void testgetAllAlumni() {
//		
//		assertNotNull(alumniService.getAllAlumni());	
//	}
//	
//	@Test
//	void testDelete() {
//		assertEquals("Deleted", alumniService.deleteAlumni(10));
//	}
//	
//	@Test
//	void testDelete2() {
//		assertEquals("Failed to delete", alumniService.deleteAlumni(10));
//	}
//	
//	@Test
//	public void testgetAlumni() {
//		
//		assertNotNull(alumniService.getAlumni(8));	
//	}
//	
//	@Test
//	public void testgetAlumni2() {
//		
//		assertNull(alumniService.getAlumni(13));	
//	}
}
