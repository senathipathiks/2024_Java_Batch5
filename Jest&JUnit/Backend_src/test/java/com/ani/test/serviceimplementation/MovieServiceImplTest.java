package com.ani.test.serviceimplementation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ani.test.model.Customer;
import com.ani.test.model.Movie;
@SpringBootTest
class MovieServiceImplTest {

	@Autowired
	MovieServiceImpl movieServiceImpl;
	

	@Test
	void testAddMovie() {
		Movie objMovie = new Movie(110,"mahe","horror","4pm-6pm");
		assertEquals("success",movieServiceImpl.addMovie(objMovie) );
	}
	@Test
	void testAddMovie1() {
		Movie objMovie = new Movie();
		assertEquals("success",movieServiceImpl.addMovie(objMovie) );
	}
	@Test
	void testAddMovie2() {
		Movie objMovie = null;
		assertEquals("failure",movieServiceImpl.addMovie(objMovie) );
	}
	@Test
	void testGetMovie() {
		int id=611;
		assertEquals(null,movieServiceImpl.getMovie(id) );
	}
	@Test
	void testGetMovie2() {
		int id=25;
		assertNotNull(id);
	}
	
	@Test
	void testGetMovie3() {
		assertNotNull(movieServiceImpl.getMovie(1));
	}

	@Test
	void testGetAllMovies() {
		assertNotNull(movieServiceImpl.getAllMovies());
	}

	@Test
	void testUpdateMovie() {
		Movie objMovie = new Movie(110,"mahesh","horror","4pm-6pm");
		assertEquals("success",movieServiceImpl.updateMovie(objMovie) );
	}
	@Test
	void testUpdateMovie2() {
		Movie objMovie = new Movie();
		assertEquals("success",movieServiceImpl.updateMovie(objMovie) );
	}
	@Test
	void testUpdateMovie3() {
		Movie objMovie = null;
		assertEquals("failure",movieServiceImpl.updateMovie(objMovie) );
	}
	@Test
	void testDeleteMovie() {
		assertEquals("success", movieServiceImpl.deleteMovie(16));
	}
	@Test
	void testDeleteMovie2() {
		assertEquals("failure", movieServiceImpl.deleteMovie(100));
	}

}
