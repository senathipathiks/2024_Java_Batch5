package com.velan.JunitTesting1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class DatabaseConnectionsTest {

	private static DatabaseConnections dbConnection;
	 
    @BeforeAll
    public static void init() {
        dbConnection = new DatabaseConnections(); 
        dbConnection.connect(); 
    }
 
    @AfterAll
    public static void cleanUp() {
        dbConnection.disconnect(); 
    }
 
    @Test
    public void testConnectionEstablished() {
        assertTrue(dbConnection.isConnected(), "Database should be connected.");
    }
 
    @Test
    public void testAnotherDatabaseFunction() {
        assertTrue(dbConnection.isConnected(), "Database should still be connected.");
    }


}
