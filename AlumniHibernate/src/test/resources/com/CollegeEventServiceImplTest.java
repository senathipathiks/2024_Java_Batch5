package com.supraja.restapp.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CollegeEventServiceImplTest {

	@Autowired
	private CollegeEventServiceImpl collegeeventService;
	
	@Test
	public void testAddCollegeEvent() {
		CollegeEvent obj=new CollegeEvent(14,"Sam","4000");
		assertEquals("success",collegeeventService.addCollegeEvent(obj));	
	}

	@Test
	public void testAddCollegeEvent1() {
		CollegeEvent obj=null;
		assertEquals("Fail to Add",collegeeventService.addCollegeEvent(obj));	
	}
	
	@Test
	public void testUpdateCollegeEvent() {
		CollegeEvent obj=new CollegeEvent(12,"Sikii","8000");
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
		assertEquals("Deleted", collegeeventService.deleteCollegeEvent(10));
	}
	
	@Test
	void testDelete2() {
		assertEquals("Failed to delete", collegeeventService.deleteCollegeEvent(10));
	}
	
	@Test
	public void testgetCollegeEvent() {
		
		assertNotNull(collegeeventService.getCollegeEvent(8));	
	}
	
	@Test
	public void testgetCollegeEvent2() {
		
		assertNull(collegeeventService.getCollegeEvent(13));	
	}

}
