package guru.springframework.bridge.abstraction;

import guru.springframework.bridge.implementation.MessageSender;

public class EmailMessage extends Message {

	public EmailMessage(MessageSender messageSender) {
		super(messageSender);
	
	}

	@Override
	public void send() {
		messageSender.sendMessage();

	}

}
