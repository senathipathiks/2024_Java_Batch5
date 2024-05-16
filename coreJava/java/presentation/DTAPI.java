package com.java.presentation;
 import java.time.LocalDate;
 import java.time.LocalTime;
 import java.time.LocalDateTime;
 import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
 
public class DTAPI {

	public static void main(String[] args) {
	
		LocalDate localDate = LocalDate.now();
		System.out.println("Today : "+localDate);
		
		
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		System.out.println("Tomorrow :"+tomorrow);

		// working with time 
		
		LocalTime now = LocalTime.now();
		System.out.println("time now "+now);
	
		// working with LocalDateTime
		
		LocalDateTime x= LocalDateTime.now();
		System.out.println("date & Time "+x );
		
		//working with ZoneID
		
		   ZonedDateTime currentDateTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
	       System.out.println("Current Date and Time in Asia/Kolkata: " + currentDateTime);
	       // Get the date and time for a specific time zone
	       ZoneId newYorkZone = ZoneId.of("America/New_York");
	       ZonedDateTime newYorkDateTime = ZonedDateTime.now(newYorkZone);
	       System.out.println("Current Date and Time in America/New_York: " + newYorkDateTime);

	}
}
