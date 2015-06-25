package guru.springframework.bridge.abstraction;

import guru.springframework.bridge.implementation.MessageSender;

public class TextMessage extends Message {

	public TextMessage(MessageSender messageSender) {
		super(messageSender);
		
	}

	@Override
	public void send() { 
		messageSender.sendMessage();
	}
}
