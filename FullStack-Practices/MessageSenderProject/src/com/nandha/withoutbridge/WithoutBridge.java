package com.nandha.withoutbridge;


//Without Bridge Pattern

//Message1 class directly coupled with platform-specific logic
class Message1 {
	
 public void sendUrgent(String recipient) {
     // Specific logic for sending urgent message via Android
     System.out.println("Sending urgent message to " + recipient + " via Android");
 }
 
 public void sendNormal(String recipient) {
     // Specific logic for sending normal message via iOS
     System.out.println("Sending normal message to " + recipient + " via iOS");
 }
}
	
//Message2 class directly coupled with platform-specific logic
class Message2 {
 public void sendNormal(String recipient) {
     // Specific logic for sending normal message via Android
     System.out.println("Sending normal message to " + recipient + " via Android");
 }
 
 public void sendUrgent(String recipient) {
     // Specific logic for sending urgent message via iOS
     System.out.println("Sending urgent message to " + recipient + " via iOS");
 }
}

public class WithoutBridge {
 public static void main(String[] args) {
     Message1 message1 = new Message1();
     Message2 message2 = new Message2();
     
     // Sending urgent and normal messages directly
     message1.sendUrgent("Nandha");
     message1.sendNormal("Ponraj");
     
     message2.sendUrgent("Nandha");    
     message2.sendNormal("Ponraj");

 }
}
