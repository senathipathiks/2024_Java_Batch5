package com.nandha.withbridge;


//Abstraction: Message class
abstract class Message {
	
 MessageSender messageSender;

 Message(MessageSender messageSender) {
   this.messageSender = messageSender;
}

public abstract void send(String recipient);

}

//Refined Abstraction 1: UrgentMessage
class UrgentMessage extends Message {
	
public UrgentMessage(MessageSender messageSender) {
   super(messageSender);
}

@Override
public void send(String recipient) {
   messageSender.sendMessage("urgent", recipient);
}
}



//Refined Abstraction 2: NormalMessage
class NormalMessage extends Message {
public NormalMessage(MessageSender messageSender) {
   super(messageSender);
}

@Override
public void send(String recipient) {
   messageSender.sendMessage("normal", recipient);
}
}









