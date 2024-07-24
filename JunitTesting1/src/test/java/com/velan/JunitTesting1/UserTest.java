package com.velan.JunitTesting1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {
	 
	private User user;
	 
	    @BeforeEach
	    public void setUp() {
	        user = new User("John Doe");
	    }
	 
	    @Test
	    public void testUserIsNotNull() {
	        assertNotNull(user, "User should not be null");
	    }
	 
	    @Test
	    public void testUserNameIsNotNull() {
	        assertNotNull(user.getName(), "User name should not be null");
	    }
	 
	    @Test
	    public void testNullUser() {
	        User nullUser = null;
	        assertNull(nullUser, "nullUser should be null");
	    }
	 
	    @Test
	    public void testSameUserReference() {
	        User anotherUserReference = user;
	        assertSame(user, anotherUserReference, "Both references should point to the same object");
	    }

	

}
