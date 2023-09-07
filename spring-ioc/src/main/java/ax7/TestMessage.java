package ax7;

import org.springframework.stereotype.Component;

@Component("sms")
public class TestMessage implements Message {
	public TestMessage() {
		System.out.println("Text Message constructor");
	}

	@Override
	public void send(String to, String msg) {
		System.out.println("SMS send to, " + to + " as " + msg);
	}

}
