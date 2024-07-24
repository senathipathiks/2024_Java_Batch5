package com.nandha.withbridge;


//With Bridge Pattern


//Main
public class WithBridge {
 public static void main(String[] args) {
	// Create instances of different message types with specific message senders
     Message[] messages = new Message[] {
         new UrgentMessage(new AndroidSender()),// Sending urgent messages via Android
         new NormalMessage(new iOSSender()),// Sending normal messages via iOS
//         new UrgentMessage(new iOSSender())

     };

     // Sending messages via different platforms without directly coupling message types to platforms
     for (Message message : messages) {
         message.send("Nandha");

     }
 }
}
