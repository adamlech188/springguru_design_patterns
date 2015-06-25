package guru.springframework.test;

import guru.springframework.bridge.abstraction.EmailMessage;
import guru.springframework.bridge.abstraction.Message;
import guru.springframework.bridge.abstraction.TextMessage;
import guru.springframework.bridge.implementation.EmailMessageSender;
import guru.springframework.bridge.implementation.MessageSender;
import guru.springframework.bridge.implementation.TextMessageSender;

import org.junit.Test;



public class MessageTest {

	@Test
	public void testSend() {
		
		MessageSender textMessageSender = new TextMessageSender(); 
		Message textMessage = new TextMessage(textMessageSender); 
		
		textMessage.send(); 
		
		MessageSender emailMessageSender = new EmailMessageSender();
	
		Message emailMessage = new EmailMessage(emailMessageSender); 
		
		emailMessage.send(); 
			
	}
}
