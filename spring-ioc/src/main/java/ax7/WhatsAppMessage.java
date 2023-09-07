package ax7;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("whatsApp")
@Lazy
public class WhatsAppMessage implements Message {

	public WhatsAppMessage() {
		// TODO Auto-generated constructor 
		System.out.println("whatsapp constructor");
	}
	@Override
	public void send(String to, String msg) {
		System.out.println("WhatsApp message send to " + to + " as " + msg);

	}

}
