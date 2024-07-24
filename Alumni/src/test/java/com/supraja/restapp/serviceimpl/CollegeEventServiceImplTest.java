package com.supraja.restapp.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.supraja.restapp.model.Alumni;
import com.supraja.restapp.model.CollegeEvent;

@SpringBootTest
class CollegeEventServiceImplTest {

	@Autowired
	private CollegeEventServiceImpl collegeeventService;
	
	@Test
	public void testAddCollegeEvent() {
		Alumni alumni =new Alumni(0, "uygh", "iyg", "ojinoi", "iuyg");
		CollegeEvent obj=new CollegeEvent(14,"Sam","4000",alumni);
		assertEquals("success",collegeeventService.addCollegeEvent(obj));	
	}

	@Test
	public void testAddCollegeEvent1() {
		CollegeEvent obj=null;
		assertEquals("Fail to add",collegeeventService.addCollegeEvent(obj));	
	}
	
	@Test
	public void testUpdateCollegeEvent() {
		CollegeEvent obj=new CollegeEvent(12,"Sikii","8000", null);
		assertEquals("updated",collegeeventService.updateCollegeEvent(obj));	
	}

	@Test
	public void testUpdateCollegeEvent2() {
		CollegeEvent obj=null;
		assertEquals("Not updated",collegeeventService.updateCollegeEvent(obj));	
	}

	@Test
	public void testgetAllCollegeEvent() {
		
		assertNotNull(collegeeventService.getAllCollegeEvent());	
	}
	
	@Test
	void testDelete() {
		assertEquals("Success", collegeeventService.deleteCollegeEvent(8));
	}
	
	@Test
	void testDelete2() {
		assertEquals("Fail to Delete", collegeeventService.deleteCollegeEvent(100));
	}
	
	@Test
	public void testgetCollegeEvent() {
		
		assertNotNull(collegeeventService.getCollegeEvent(8));	
	}
	
	@Test
	public void testgetCollegeEvent2() {
		
		assertNull(collegeeventService.getCollegeEvent(98));	
	}

}
