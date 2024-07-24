package com.nandha.withbridge;

//Implementor interface defining the operations
interface MessageSender {
	
void sendMessage(String messageType, String recipient);

}



//Concrete Implementor 1: AndroidSender
class AndroidSender implements MessageSender {
@Override
public void sendMessage(String messageType, String recipient) {
   // Android specific implementation
   System.out.println("Sending " + messageType + " message to " + recipient + " via Android");
}
}



//Concrete Implementor 2: iOSSender
class iOSSender implements MessageSender {
@Override
public void sendMessage(String messageType, String recipient) {
   // iOS specific implementation
   System.out.println("Sending " + messageType + " message to " + recipient + " via iOS");
}
}



