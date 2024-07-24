package com.supraja.restapp.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AlumniServiceImplTest2 {

	@Autowired
	private AlumniServiceImpl alumniService;
	
	@Test
	public void testAddAlumni() {
		Alumni obj=new Alumni(13,"Samaira","IT","2023","developer");
		assertEquals("success",alumniService.addAlumni(obj));	
	}


}
