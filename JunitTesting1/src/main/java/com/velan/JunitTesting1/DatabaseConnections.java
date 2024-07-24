package com.velan.JunitTesting1;

public class DatabaseConnections {
	
	 private boolean connected;
	 
	    public void connect() {
	        connected = true;
	        System.out.println("Connected to the database.");
	    }
	 
	    public void disconnect() {
	        connected = false;
	        System.out.println("Disconnected from the database.");
	    }
	 
	    public boolean isConnected() {
	        return connected;
	    }

}
